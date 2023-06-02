package model.repository;

import model.entity.Employee;

public interface InterfaceDAO {
    void save(Employee employee);

    Employee search(long id);

    boolean delete(long id);

    void update(Employee employee);

    void showAll();

}

