package ro.unibuc.electronicpunchcard;

import ro.unibuc.electronicpunchcard.model.contract;
import ro.unibuc.electronicpunchcard.model.departament;
import ro.unibuc.electronicpunchcard.model.employee;
import ro.unibuc.electronicpunchcard.model.manager;
import ro.unibuc.electronicpunchcard.utils.Service;
import ro.unibuc.electronicpunchcard.utils.WrongIndexException;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws WrongIndexException {

        Scanner scanner = new Scanner(System.in);
        String command;
        Service service = Service.getInstance();
        System.out.println("1.Create new contract");
        System.out.println("2.Create new employee");
        System.out.println("3.Create new department");
        System.out.println("4.Create new manager");
        System.out.println("5.Show all employees");
        System.out.println("6.Show all departments");
        System.out.println("7.Show all contracts");
        System.out.println("8.Close contract");
        System.out.println("9.Fire employee");
        System.out.println("10.Fire manager");
        System.out.println("11.Delete department");
        System.out.println("12.Exit.");


        do {
            System.out.print("\nYou have chosen option: ");
            command = scanner.next();

            switch (command) {
                case "1":
                    System.out.println("Enter contract id: ");
                    String contractId = scanner.next();

                    System.out.print("Enter contract name: ");
                    String contractName = scanner.next();

                    service.addContract(new contract(contractId, contractName));
                    break;

                case "2":
                    System.out.println("Enter employee first name: ");
                    String firstName = scanner.next();

                    System.out.println("Enter employee last name: ");
                    String lastName = scanner.next();

                    System.out.println("Enter employee badge id: ");
                    String badgeId = scanner.next();

                    System.out.println("Enter employee qualification: ");
                    String qualification = scanner.next();

                    System.out.println("Enter employee department: ");
                    String department = scanner.next();

                    service.addEmployee(new employee(firstName, lastName, badgeId, qualification, department));

                    break;

                case "3":
                    System.out.println("Enter department id: ");
                    String departmentId = scanner.next();

                    System.out.println("Enter department name: ");
                    String departmentName = scanner.next();

                    service.addDepartment(new departament(departmentId, departmentName));

                    break;

                case "4":
                    System.out.println("Enter manager first name: ");
                    firstName = scanner.next();

                    System.out.println("Enter manager last name: ");
                    lastName = scanner.next();

                    System.out.println("Enter manager badge id: ");
                    badgeId = scanner.next();

                    System.out.println("Enter manager qualification: ");
                    qualification = scanner.next();

                    System.out.println("Enter manager department: ");
                    department = scanner.next();

                    service.addManager(new manager(firstName, lastName, badgeId, qualification, department));

                    break;

                case "5":
                    System.out.println("Current employees: ");
                    service.showAllEmployees();


                    break;

                case "6":
                    System.out.println("Current departments: ");
                    service.showAllDepartments();
                    break;

                case "7":
                    System.out.println("Current contracts: ");
                    service.showAllContracts();
                    break;

                case "8":
                    System.out.println("Enter contract id: ");
                    contractId = scanner.next();

                    service.closeContract(Integer.parseInt(contractId));

                    break;

                case "9":

                    System.out.println("Enter employee badge id: ");
                    badgeId = scanner.next();

                    service.fireEmployee(Integer.parseInt(badgeId));

                    break;

                case "10":

                    System.out.println("Enter manager badge id: ");
                    badgeId = scanner.next();

                    service.fireManager(badgeId);

                    break;

                case "11":

                    System.out.println("Enter department id: ");
                    departmentId = scanner.next();

                    service.deleteDepartment(departmentId);

                    break;


                case "12":
                    ;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }


        }
        while (command.equals("12") == false) ;

        scanner.close();
    }
}