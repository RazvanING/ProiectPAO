package ro.unibuc.electronicpunchcard.utils;


import ro.unibuc.electronicpunchcard.model.contract;
import ro.unibuc.electronicpunchcard.model.departament;
import ro.unibuc.electronicpunchcard.model.employee;
import ro.unibuc.electronicpunchcard.model.manager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Service extends ServiceInterface {
        private static Service single_instance = null;
        private List<contract> contract = new ArrayList<>();

        private List<employee> employee = new ArrayList<>();

        private List<departament> departament = new ArrayList<>();

        private List<manager> manager = new ArrayList<>();

        private HashMap<Integer, List<contract>> map = new HashMap<>();

        File file = new File("history.txt");
        PrintWriter writer = null;

        private Service() {
            try {
                writer = new PrintWriter(file);
                writer.flush();
            } catch (IOException e) {
                System.out.println("Error on create history writer!");
            }
        }

        public static synchronized Service getInstance() {
            if (single_instance == null)
                single_instance = new Service();

            return single_instance;
        }

        private void writeInTheArchives(String veryImportantRecord) {
            writer.println(veryImportantRecord);
            writer.flush();
        }

        public void addContract(contract _Contract) {
            contract.add(_Contract);
            writeInTheArchives("Added contract: " + _Contract.toString());
            System.out.println("Contract: " + _Contract + " added!");
            Collections.sort(contract, (o1, o2) -> o1.getContractID() - o2.getContractID());
        }

        public void addEmployee(employee _Employee) {
            employee.add(_Employee);
            writeInTheArchives("Added employee: " + _Employee.toString());
            System.out.println("Employee: " + _Employee + " added!");
            Collections.sort(employee, (o1, o2) -> o1.getEmployeeID() - o2.getEmployeeID());
        }

        public void addDepartament(departament _Departament) {
            departament.add(_Departament);
            writeInTheArchives("Added departament: " + _Departament.toString());
            System.out.println("Departament: " + _Departament + " added!");
        }

        public void addManager(manager _Manager) {
            manager.add(_Manager);
            writeInTheArchives("Added manager: " + _Manager.toString());
            System.out.println("Manager: " + _Manager + " added!");
        }

        public void ShowContract() {
            for (contract _Contract : contract) {
                System.out.println(_Contract);
            }
        }

        public void ShowEmployee() {
            for (employee _Employee : employee) {
                System.out.println(_Employee);
            }
        }

        public void ShowDepartament() {
            for (departament _Departament : departament) {
                System.out.println(_Departament);
            }
        }

        public void closeContract(int _ContractID) throws WrongIndexException {
            for (contract _Contract : contract) {
                if (_Contract.getContractID() == _ContractID) {
                    contract.remove(_Contract);
                    writeInTheArchives("Deleted contract: " + _Contract.toString());
                    System.out.println("Contract: " + _Contract + " deleted!");
                    return;
                }
            }
            throw new WrongIndexException("Contract with ID: " + _ContractID + " not found!");
        }

        public void fireEmployee(int _EmployeeID) throws WrongIndexException {
            for (employee _Employee : employee) {
                if (_Employee.getEmployeeID() == _EmployeeID) {
                    employee.remove(_Employee);
                    writeInTheArchives("Fired employee: " + _Employee.toString());
                    System.out.println("Employee: " + _Employee + " fired!");
                    return;
                }
            }
            throw new WrongIndexException("Employee with ID: " + _EmployeeID + " not found!");
        }


        public void showAllEmployees() {
        }

        public void showAllDepartments() {
        }

        public void showAllContracts() {
        }

        public void fireManager(String badgeId) {
        }

        public void deleteDepartment(String departmentId) {
        }

        public void addDepartment(ro.unibuc.electronicpunchcard.model.departament departament) {
        }
    }
