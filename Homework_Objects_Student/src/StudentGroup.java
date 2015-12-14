
public class StudentGroup {
	String subjectGroup;
	Student[] students;
	int freePlaces;

	void printStudent(){
		System.out.println(this.subjectGroup);
		for (int i = 0; i < students.length; i++) {
			if(students[i]!=null){
				System.out.print("Name: "+students[i].name);	
				System.out.println();
				System.out.print("Age: "+students[i].age);
				System.out.println();
				System.out.print("Grade: "+students[i].grade);
				System.out.println();
				System.out.print("Year in college: "+students[i].yearInCollege);
				System.out.println();
				System.out.print("Money: "+students[i].moneyfromScolarship);
				System.out.println();
				System.out.println();
			}
			if(students[i]==null){
				break;
			}
		}
	}
	
	String thebestStudent(){
		double best=students[0].grade;
		int index=0;
		for (int i = 0; i < students.length; i++) {
			if(students[i]!=null){
				if(students[i].grade>best){
					best=students[i].grade;
					index=i;
				}
			}
		}
		System.out.print("The student with the highest grade is ");
		return students[index].name;
	}
	
	void emptyGroup(){
		this.freePlaces=5;
		for (int i = 0; i < students.length; i++) {
			students[i]=null;
		}
	}
	
	void addStudent(Student a){
		if(this.subjectGroup.equalsIgnoreCase(a.subject) && this.freePlaces>0 ){
			for (int i = 0; i < students.length; i++) {
				if(students[i]==null){
					students[i]=a;
					break;
				}
			}
			this.freePlaces--;
		}else{
			if(this.freePlaces==0){
				System.out.println("No more free places.");
			}
			if(!this.subjectGroup.equalsIgnoreCase(a.subject)){
				System.out.println("Subject mismatch.");
			}
		}
	}

	StudentGroup() {
		this.freePlaces = 5;
		this.students = new Student[5];
	}

	StudentGroup(String subject) {
		this();
		if (subject != null) {
			this.subjectGroup = subject;
		}
		else {
			this.subjectGroup = "bulgarski ezik";
		}
	}

}
