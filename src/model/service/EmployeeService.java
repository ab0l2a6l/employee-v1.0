package model.service;

import model.entity.Employee;
import model.repository.EmployeeDAO;
import model.repository.InterfaceDAO;

public class EmployeeService implements InterfaceService {
    InterfaceDAO interfaceDAO = new EmployeeDAO();

    @Override
    public void sendDataToDAOForSave(Employee employee) {
        interfaceDAO.save(employee);
    }

    @Override
    public Employee sendDataToDAOForSearch(long id) {
        return interfaceDAO.search(id);
    }

    @Override
    public boolean sendDataToDAOForDelete(long id) {
        return interfaceDAO.delete(id);
    }

    @Override
    public void sendDataToDAOForUpdate(Employee employee) {
        interfaceDAO.update(employee);
    }

    @Override
    public void showAllData() {
        interfaceDAO.showAll();
    }


}
