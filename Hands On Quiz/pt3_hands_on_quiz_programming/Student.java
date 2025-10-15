
import java.util.Scanner;

public class Student {
	
	//attributes for student
	private String name;
	private String section;
	private int writtenTask;
	private int performanceTask;
	private int exam;
	private double grade;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getWrittenTask() {
		return writtenTask;
	}

	public void setWrittenTask(int writtenTask) {
		this.writtenTask = writtenTask;
	}

	public int getPerformanceTask() {
		return performanceTask;
	}

	public void setPerformanceTask(int performanceTask) {
		this.performanceTask = performanceTask;
	}

	public int getExam() {
		return exam;
	}

	public void setExam(int exam) {
		this.exam = exam;
	}
	
	public void inputStudentInfo(Scanner scanner) {
		System.out.print("Enter student name: ");
		name = scanner.nextLine();
		
		System.out.print("Enter student section: ");
		section = scanner.nextLine();
		
		System.out.print("Enter written task score: ");
		writtenTask = scanner.nextInt();
		
		System.out.print("Enter performance task score: ");
		performanceTask = scanner.nextInt();
		
		System.out.print("Enter exam score: ");
		exam = scanner.nextInt();
	}
	
	
	//compute method
	public void computeGrade(int option) {
		if(option == 1) {
			 grade = writtenTask*.25 + performanceTask*.50 + exam*.25;
		}else if(option == 2) {
			 grade = writtenTask*.20 + performanceTask*.60 + exam*.20;
		}else if(option == 3) {
			 grade = writtenTask*.25 + performanceTask*.45 + exam*.30;
	}
	}
		@Override
		public String toString() {
			return "Name: " + name + "\n" + "Section: " + section + "\n" +
		"Written Task: " + writtenTask + "\n" + 
		"Performance Task: " + performanceTask + "\n" +
		"Exam: " + exam + "\n" +
		"Grade: " + grade;
		}
	}
