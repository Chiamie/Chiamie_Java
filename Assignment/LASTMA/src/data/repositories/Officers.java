package data.repositories;

import data.models.Officer;
import exceptions.InvalidIdException;
import exceptions.InvalidOfficerException;

import java.util.ArrayList;
import java.util.List;

public class Officers implements OfficerRepository {
    private int count;
    private List<Officer> officers =  new ArrayList<Officer>();

    @Override
    public Officer findById(int id) {
        for (Officer officer : officers) {
            if (officer.getId() == id) return officer;
        }
        throw new InvalidIdException("Officer with id " + id + " not found");
    }

    @Override
    public void save(Officer officer) {
        generateId();
        officer.setId(count);
        officers.add(officer);
    }

    private void generateId() {
        count++;
    }

    @Override
    public void delete(Officer officer) {
        if(!officers.remove(officer))
            throw new InvalidOfficerException("Officer " + officer + " not found");
    }

    @Override
    public List<Officer> findAll() {
        return officers;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(int id) {
        officers.remove(findById(id));
    }

    @Override
    public long count() {
        return officers.size();
    }
}
