package model.service;

import model.entity.Employee;

public interface InterfaceService {
    void sendDataToDAOForSave(Employee employee);

    Employee sendDataToDAOForSearch(long id);

    boolean sendDataToDAOForDelete(long id);

    void sendDataToDAOForUpdate(Employee employee);

    void showAllData();
}
