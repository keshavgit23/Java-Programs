public class Employee {
    // Instance variables (non-static)
    private String name;
    private float salary;

    // Constructor
    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    // getters method
    public String getName() { return name; }
    public float getSalary() { return salary; }

    // setters method
    public void setName(String name) { this.name = name; }
    public void setSalary(float salary) { this.salary = salary; }

    // Instance method
    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Python", 10000);
      emp.setName("Java");//Update Name
      emp.setSalary(10000);//Update Salary
        emp.displayDetails();
   //Employee: Java
   // Salary: 10000.0
    }
}
