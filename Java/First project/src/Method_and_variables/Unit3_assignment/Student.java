package Method_and_variables.Unit3_assignment;


public class Student {
    private String name;
    private String id;
    private int age;
    private String grade;

    public Student(String name, String id, int age, String grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name:" + name + ", id:" + id + ", age:" + age + ", grade:" + grade + "]";
    }
}
