// Code to demonstrate the use of getters and setters in Java

class Employee {
    private int id1;
    private String name;

    public static Employee createEmployee(int id1, String name) {
        Employee emp = new Employee();
        emp.setId(id1);
        emp.setName(name);
        return emp;
    }

    public int getId() {
        return id1;
    }

    public void setId(int id1) {
        this.id1 = id1;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class GettersSetters {
    public static void main(String[] args) {
        Employee emp = Employee.createEmployee(1, "Mayur");
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}
