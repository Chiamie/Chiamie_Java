package data.repositories;

import data.models.Officer;

import java.util.List;

public interface OfficerRepository {
    Officer findById(int id);
    void save(Officer officer);
    void delete(Officer officer);
    List<Officer> findAll();
    void deleteAll();
    void deleteById(int id);
    long count();
}
