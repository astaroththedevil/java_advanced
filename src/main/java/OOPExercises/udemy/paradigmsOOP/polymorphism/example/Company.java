package OOPExercises.udemy.paradigmsOOP.polymorphism.example;

class Employee {
    private String name;
    private String job;
    private int salary;

    public Employee(){
        name = "unknown";
        job = "unknown";
        salary = 4000;
    }

    public Employee(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public void doWork(){
        System.out.println("work");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println("Employee: " + name);
    }
}

class Manager extends Employee{
    private String department;

    public Manager() {
        department = "unknown";
    }

    public Manager(String name, String job, int salary, String department) {
        super(name, job, salary);
        this.department = department;
    }

    public void hire(){
        System.out.println("hire");
    }

    public void giveRise(Employee employee){
        System.out.println("rise");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printInfo(){
        System.out.println("Manager: " + getName());
    }
}

class Ceo extends Manager{
    private int shares;

    public Ceo() {
        shares = 100;
    }

    public Ceo(String name, String job, int salary, String department, int shares) {
        super(name, job, salary, department);
        this.shares = shares;
    }

    public void signContract(){
        System.out.println("sign");
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public void printInfo(){
        System.out.println("Ceo: " + getName());
    }
}

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", "Programmer", 10000);
        Manager manager = new Manager("Lily", "Team Lider", 10000, "R&D");
        Ceo ceo = new Ceo("Jimm", "president", 20000, "Board", 100);

        Employee worker = ceo;
        worker.doWork();
        worker.printInfo();//Ceo: Jimm from class Ceo - dynamic binding
        ceo.signContract();
        ceo.printInfo();
        Manager person = ceo;//Ceo: Jimm from class Ceo - dynamic binding
        person.hire();
        person.printInfo();//Ceo: Jimm from class Ceo - dynamic binding
    }
}
