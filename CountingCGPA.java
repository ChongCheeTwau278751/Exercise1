import java.util.*;
public class CountingCGPA {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		printName();
		printAge();
		printGrade();
		printGrades();
		printGpa();
		printHandPhone();
		printWorkExperiences();
		printLanguage();
		printSkill();
		printAward();

	}
	
	public static void printName() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your name:");	
		String name = in.next();	
		System.out.println("name " + name);
	}
	
	public static void printAge() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your age:");
		int age = in.nextInt();
		System.out.println("age " + age);
	}
	public static void printGrades() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade:");
		
		int n = scan.nextInt();
		
		if(n >= 90 && n <= 100) {
			System.out.println("A");
		}else if(n >=80 && n < 90) {
			System.out.println("B");
		}else if(n >=70 && n < 80) {
			System.out.println("C");
		}else if(n >=60 && n < 70) {
			System.out.println("D");
		}else if(n >=0 && n < 60) {
			System.out.println("F");
		}else {
			System.out.println("Not in the range");
		
		}
	}
		
	public static void printGrade() {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Grade STPM:");
		String str= in.next();
		char grade = str.charAt(1);
		System.out.println("Grade " + grade);
	}
	
	public static void printGpa() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter GPA Semester 1:");
		double a = in.nextDouble();
		if(a >= 90 && a <= 100) {
			System.out.println("A");
		}else if(a >=80 && a < 90) {
			System.out.println("B");
		}else if(a >=70 && a < 80) {
			System.out.println("C");
		}else if(a >=60 && a < 70) {
			System.out.println("D");
		}else if(a >=0 && a < 60) {
			System.out.println("F");
		}else {
			System.out.println("Not in the range");
		
		}
		
		System.out.print("Enter GPA Semester 2:");
		double b = in.nextDouble();
		if(b >= 90 && b <= 100) {
			System.out.println("A");
		}else if(b >=80 && b < 90) {
			System.out.println("B");
		}else if(b >=70 && b < 80) {
			System.out.println("C");
		}else if(b >=60 && b < 70) {
			System.out.println("D");
		}else if(b >=0 && b < 60) {
			System.out.println("F");
		}else {
			System.out.println("Not in the range");
		
		}
		
		System.out.print("Enter GPA Semester 3:");
		double c = in.nextDouble();
		if(c >= 90 && c <= 100) {
			System.out.println("A");
		}else if(c >=80 && c < 90) {
			System.out.println("B");
		}else if(c >=70 && c < 80) {
			System.out.println("C");
		}else if(c >=60 && c < 70) {
			System.out.println("D");
		}else if(c >=0 && c < 60) {
			System.out.println("F");
		}else {
			System.out.println("Not in the range");
		
		}
		
		
		double sum = a+b+c;
		double totalgpa = sum/3;
		System.out.println("CGPA for current semester is " + totalgpa);
		
	}
	
	public static void printHandPhone() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your HP:");
		String hp = in.next();
		System.out.println("hp:"+hp);
		
	}
	
	public static void printWorkExperiences() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your Work Experience: 1.");
		String WorkExperiences1 = in.nextLine();
		System.out.print("Enter your Work Experience: 2.");
		String WorkExperiences2 = in.nextLine();
		System.out.println("Work Experience:1."+WorkExperiences1+"\n\t\t"+"2."+WorkExperiences2);
	}
	
	public static void printLanguage() {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter your Work Language: 1.");
		String Language1 = in.nextLine();
		System.out.println("Enter your Work Language: 2.");
		String Language2 = in.nextLine();
		System.out.println("Enter your Work Language: 3.");
		String Language3 = in.nextLine();
		System.out.println("Language:1."+Language1+"\n\t"+" "+"2."+Language2+"\n\t"+" "+"3."+Language3);
	}
	
	public static void printSkill() {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter your Skill: 1.");
		String skill1 = in.nextLine();
		System.out.println("Enter your Skill: 2.");
		String skill2 = in.nextLine();
		System.out.println("skill:1."+skill1+"\n"+"	  "+"2."+skill2);
	}
	
	public static void printAward() {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter your award: ");
		String award = in.nextLine();
		System.out.println("award:"+award);
	}
}