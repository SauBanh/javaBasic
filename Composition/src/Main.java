public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nguyen Tuan Anh");
        student.setDateOfBirth("05/06/2001");
        student.setHasStudentHousing(true);
        student.course = new Course();
        student.getCourse().setTitle("Java Course");
        student.getCourse().setLevel("Beginer");
        student.getCourse().setStartDate("08/11/2023");

        Course c = student.getCourse();// 
        c.setTitle("Java Course");// using this like: student.getCourse().setTitle("Java Course");
        c.setLevel("Beginer");//using this like: student.getCourse().setLevel("Beginer");
        c.setStartDate("08/11/2023");//using this like: student.getCourse().setStartDate("08/11/2023");

        System.out.println("Name: " + student.getName());
        System.out.println("Dob: " + student.getDateOfBirth());
        System.out.println("Housing: " + (student.isHasStudentHousing() ? "YES" : "NO"));
        System.out.println("The student " + student.getName() + " Is enrolled on the " + student.getCourse().getTitle() + "course due to start on " + student.getCourse().getStartDate());
    }
}