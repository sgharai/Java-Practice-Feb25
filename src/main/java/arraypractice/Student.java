package arraypractice;

public class Student extends Person{

    public Student(String name, String major, int id) {
        super(name);
        this.major = major;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    String major;
    int id;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
