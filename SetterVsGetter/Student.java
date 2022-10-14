package SetterVsGetter;

public class Student {
    private int sid;
    private String sname;
    private String schoolName;
    private double fee;
    private int std;

    public Student() {
        System.out.println("Student.Student()");
    }

    public Student(int sid, String sname, String schoolName, double fee, int std) {
        this.sid = sid;
        this.sname = sname;
        this.schoolName = schoolName;
        this.fee = fee;
        this.std = std;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "Student [fee=" + fee + ", schoolName=" + schoolName + ", sid=" + sid + ", sname=" + sname + ", std="
                + std + "]";
    }
}
