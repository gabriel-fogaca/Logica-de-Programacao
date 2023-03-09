package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Integer payDay;
    private Address address;
    List<Employee> employees = new ArrayList<>();

    public Department(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setPayDay(Integer payDay) {
        this.payDay = payDay;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
    public double payroll(){
        double sum = 0.0;
        for (Employee employee: employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nFOLHA DE PAGAMENTO:\n");
        sb.append("Departamento Vendas = R$ ");
        sb.append(String.format("%.2f", payroll()) + "\n");
        sb.append("Pagamento realizado no dia ");
        sb.append(payDay + "\n");
        sb.append("Funcionários: "+ "\n");
        for (Employee emp : employees) {
            sb.append(emp.getName() + "\n");
        }
        sb.append("Para dúvidas favor entrar em contato: ");
        sb.append(address.getEmail());

        return sb.toString();
    }
}
