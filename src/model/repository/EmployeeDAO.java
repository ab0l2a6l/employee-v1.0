package model.repository;

import model.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements InterfaceDAO {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public Employee search(long id) {
        for (Employee eachEmployee : employeeList) {
            if (id == eachEmployee.getId()) {
                return eachEmployee;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        Employee employee = search(id);
        if (employee != null) {
            employeeList.remove(employee);
            return true;
        }
        return false;
    }

    @Override
    public void update(Employee employee) {
        Employee employeeUpdate = search(employee.getId());
        employeeUpdate.setId(employee.getId());
        employeeUpdate.setEmployeeName(employee.getEmployeeName());
    }

    @Override
    public void showAll() {
         employeeList.stream().forEach(item ->
                 {
                     System.out.print ("employee name: " + item.getEmployeeName());
                     System.out.println(" , employee id: " + item.getId());
                 });
    }

//    @Override
//    public String toString(){
//        return
//    }

}
