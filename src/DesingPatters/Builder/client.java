package DesingPatters.Builder;

public class client {
    public static void main(String[] args) {
        studentBuilder studentBuilder = new studentBuilder();
        studentBuilder.setName("Romeo");
        studentBuilder.setAge(18);
        studentBuilder.setBatchName("Morning");
        studentBuilder.setPsp(98.9);
        studentBuilder.setGradYear(2021);

        Student student = new Student(studentBuilder);
        System.out.println("Debug");

    }
}
