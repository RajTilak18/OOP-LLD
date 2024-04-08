package DesingPatters.Builder;

public class Student {
    String name;
    int age;
    String batchName;
    double psp;
    String univName;
    int gradYear;
    String phoneNo;
    public Student(studentBuilder studentBuilder){
        if (studentBuilder.getGradYear() > 2022){
            throw new IllegalArgumentException("GradYear should be less that 2022");
        }
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.gradYear = studentBuilder.gradYear;
        this.batchName = studentBuilder.batchName;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
