package CollectionFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Student implements Serializable
{
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private Date dateOfAdmission;
	
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        Integer id = scanner.nextInt();
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student fees: ");
        Double fees = scanner.nextDouble();
        System.out.print("Enter date of admission (YYYY-MM-DD): ");
        String dateString = scanner.next();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Student(id, name, fees, date);
    }

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}	
}

public class StoreObject 
{
	public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            students.add(Student.getStudentObject());
        }
        try {
            FileOutputStream fileOut = new FileOutputStream("Student.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(students);
            objectOut.close();
            fileOut.close();
            System.out.println("Student objects are stored in Student.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


class RetrieveObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("Student.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ArrayList<Student> students = (ArrayList<Student>) objectIn.readObject();
            objectIn.close();
            fileIn.close();

            System.out.println("Retrieved Student objects:");
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}