public class Student  extends Person{
    private String Student_Id;
    private  double CGPA;

    public String getStudent_Id() {
        return Student_Id;
    }

    public void setStudent_Id(String student_Id) {
        Student_Id = student_Id;
    }
    Student(String name,String Phone_Number,String DOB,String Student_Id,double CGPA)
    {
        this.name = name;
        this.phone_Number = Phone_Number;
        this.DOB = DOB;
        this.Student_Id = Student_Id;
        this.CGPA= CGPA;

    }
    @Override
    public void showinfo() {
        System.out.println("Student name: "+name);
        System.out.println("Phone_Number: "+phone_Number);
        System.out.println("D of Birth: "+DOB);
        System.out.println("Student_ID: "+Student_Id);
        System.out.println("CGPA:  "+CGPA);
        System.out.println("__________________________________________");
    }

    {

    }

}
