package view;

import common.StaticScanner;
import controler.EmployeeControler;
import model.entity.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmployeeControler employeeControler = new EmployeeControler();
        Scanner input = StaticScanner.getData();
        for (; ; ) {
            mainMenu();

            int requsetUserForSwitch = input.nextInt();
            input.nextLine();
            switch (requsetUserForSwitch) {
                case 1 -> {
                    Employee employee = new Employee();

                    System.out.print("insert name: ");
                    employee.setEmployeeName(input.nextLine());

                    System.out.print("insert id: ");
                    employee.setId(input.nextLong());

                    employeeControler.sendDataToServiceForSave(employee);

                } // insert

                case 2 -> {
                    System.out.print("insert id for search: ");
                    Employee employee = employeeControler.sendDataToServiceForSearch(input.nextLong());

                    if (employee != null)
                        System.out.println("found");
                    else
                        System.out.println("not found");

                }// search

                case 3 -> {
                    Employee employee = new Employee();
                    System.out.print("insert id for update data: ");
                    employee.setId(input.nextLong());
                    input.nextLine();
                    employee = employeeControler.sendDataToServiceForSearch(employee.getId());
                    if (employee != null) {
                        System.out.print("insert new employee name: ");
                        employee.setEmployeeName(input.nextLine());

                        System.out.print("insert new id: ");
                        employee.setId(input.nextLong());

                        employeeControler.sendDAtaToServiceForUpdate(employee);
                    } else System.out.println("not found this id");
                }// update

                case 4 -> {
                    System.out.print("insert id for delete: ");
                    if (employeeControler.sendDataToServiceForDelete(input.nextLong()))
                        System.out.println("deleted");
                    else
                        System.out.println("not found");
                }// delete

                case 5 -> {
                    employeeControler.showAllData();
                }// show all data

                case 6 -> {
                    return;
                }
                default -> System.out.println("wrong number");
            }
        }
    }

    private static void mainMenu() {
        System.out.println("1.insert");
        System.out.println("2.search");
        System.out.println("3.update");
        System.out.println("4.delete");
        System.out.println("5.show all ");
        System.out.println("6.exit");
    }
}
