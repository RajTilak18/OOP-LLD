package DesingPatters.OOPs;

public class Main {
    public static void main(String[] args) {
        Encapsulation enc = new Encapsulation();
        enc.setName("ABC");
        System.out.println("Name of my company is " + enc.getName());
        Abstraction abs = new Abstraction();
        abs.setAge(26);
        abs.setSalary(777777.77);
        abs.setLocation("Washington DC");
        System.out.println("Age is " + abs.getAge());
        System.out.println("Salary is " + abs.getSalary());
        System.out.println("Location is " + abs.getLocation());
    }
}
