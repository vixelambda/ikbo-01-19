package pr6;

public class Student {
    private String name;
    private int iDNumber;
    private int mark;

    public Student(String name, int iDNumber, int mark) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public int getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", iDNumber=" + iDNumber +
                ", mark=" + mark +
                '}';
    }
}
