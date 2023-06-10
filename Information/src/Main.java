public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("ABCSEF","01786256","1999-08-21","213-35-777",3.60);
        s1.showinfo();
        Teacher t1 = new Teacher("Joy","015263526","1987-02-6",12345,63000,"Good Student");
        t1.showinfo();
        t1.Counseling();
    }
}
