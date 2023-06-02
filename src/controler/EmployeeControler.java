package controler;

import model.entity.Employee;
import model.service.EmployeeService;
import model.service.InterfaceService;

public class EmployeeControler {
    InterfaceService interfaceService = new EmployeeService();

    public void sendDataToServiceForSave(Employee employee) {
        interfaceService.sendDataToDAOForSave(employee);
    }

    public Employee sendDataToServiceForSearch(long id) {
        return interfaceService.sendDataToDAOForSearch(id);
    }

    public boolean sendDataToServiceForDelete(long id) {
        return interfaceService.sendDataToDAOForDelete(id);
    }

    public void sendDAtaToServiceForUpdate(Employee employee) {
        interfaceService.sendDataToDAOForUpdate(employee);
    }

    public void showAllData() {
        interfaceService.showAllData();
    }
}
