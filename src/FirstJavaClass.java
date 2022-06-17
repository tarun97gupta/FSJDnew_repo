
public class FirstJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.name="Tarun";
		System.out.println(std1.name);
		std1.attendSession();
		Student std2 = new Student("Aman",20,"FSJD");
		System.out.println(std2.name);
		System.out.println(std2.rollNo);
		System.out.println(std1.sumOfNumber(10,200));

	}

}

class Student{
	String name;
	int rollNo;
	String course;
	
	Student(){
		
	}
	Student(String Name,int rollno,String Course){
		name=Name;
		rollNo=rollno;
		course=Course;
		
	}
	
	int sumOfNumber(int x,int y) {
		return x+y;
	}
	
	void attendSession() {
		System.out.println("First class");
	}
	void leaveSession() {
		System.out.println("First class second method");
	}
}