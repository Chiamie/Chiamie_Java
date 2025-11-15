package data.repositories;

import data.models.Officer;

import java.util.ArrayList;
import java.util.List;

public class Officers implements OfficerRepository {
    private int count;
    private static List<Officer> officers =  new ArrayList<Officer>();

    @Override
    public Officer findById(int id) {
        for (Officer officer : officers) {
            if (officer.getId() == id) return officer;
        }
        return null;
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
//        if(!officers.remove(officer))
//            throw new InvalidOfficerException("Officer " + officer + " not found");
        officers.remove(officer);
    }


    @Override
    public List<Officer> findAll() {
        return officers;
    }

    @Override
    public void deleteAll() {
        officers.clear();
    }

    @Override
    public void deleteById(int id) {
        officers.remove(findById(id));
    }

    @Override
    public long count() {
        return officers.size();
    }

    @Override
    public Officer findByEmail(String officerEmail) {
        for (Officer officer : officers)
            if (officer.getOfficerEmail().equals(officerEmail)) return officer;
        return null;
    }
}
