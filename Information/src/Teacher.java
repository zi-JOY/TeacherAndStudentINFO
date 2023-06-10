public class Teacher extends Person{

    private int Teacher_ID;
    private double salary;
    private String COS;

    public int getTeacher_ID() {
        return Teacher_ID;
    }

    public void setTeacher_ID(int teacher_ID) {
        this.Teacher_ID = Teacher_ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCOS() {
        return COS;
    }

    public void setCOS(String COS) {
        this.COS = COS;
    }

    Teacher(String name, String Phone_Number, String DOB,int Teacher_ID,double salary,String COS)
    {
        this.name = name;
        this.phone_Number = Phone_Number;
        this.DOB = DOB;
        this.Teacher_ID = Teacher_ID;
        this.salary =salary;
        this.COS =COS;

    }
    void  Counseling()
    {
        System.out.println("C O S : "+COS);
    }

    public void showinfo()
    {
        System.out.println("Teacher name: "+name);
        System.out.println("Phone_Number: "+phone_Number);
        System.out.println("D of Birth: "+DOB);
        System.out.println("Student_ID: "+Teacher_ID);
        System.out.println("CGPA:  "+salary);
    }
}
