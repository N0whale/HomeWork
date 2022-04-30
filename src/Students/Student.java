package Students;

public class Student {
    private int number;
    private String name;
    private int age;
    private double grade;
    private boolean isOlymic;

    public Student(){
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isOlymic() {
        return isOlymic;
    }

    public void setOlymic(boolean olymic) {
        isOlymic = olymic;
    }
    @Override
    public String toString(){
        return "number = " + number +
                ", name= " + name +
                ", age= " + age +
                ", grade= " + grade +
                ", isOlympic= " + isOlymic;
    }

}
