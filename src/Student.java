import java.util.Date;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private Date birthday;
    private Boolean sex;
    private Double dTB;

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public Student(int id, String name, Date birthday, Boolean sex, Double dTB) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.dTB = dTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Double getdTB() {
        return dTB;
    }

    public void setdTB(Double dTB) {
        this.dTB = dTB;
    }
}
