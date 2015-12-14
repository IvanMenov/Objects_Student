
public class College {
	StudentGroup[] groups = new StudentGroup[3];
	
	void addGroups(StudentGroup a){
		for (int i = 0; i < groups.length; i++) {
			if(groups[i]!=null){
				groups[i]=a;
			}
		}
	}
	
	String highestGrage(StudentGroup[] group){
		double best=group[0].students[0].grade;
		int indexGroup=0;
		int indexStudent=0;
		for (int i = 0; i < group.length; i++) {
			for (int j = 0; j < group[i].students.length; j++) {
				if(group[i].students[j].grade>best){
					best=group[i].students[j].grade;
					indexGroup=i;
					indexStudent=j;
				}
			}
		}
		return group[indexGroup].students[indexStudent].name;
	}
	
	public static void main(String[] args) {
		Student ivan= new Student("Ivan", "bulgarski ezik", 25, 5, 1, 20);
		Student petar= new Student("Petar", "math", 15, 3.0, 3, 5000);
		Student gosho= new Student("Gosho", "bulgarski ezik", 20, 4.9999, 2, 100);
		Student todor= new Student("Todor", "math", 22, 2, 5, 30);
		Student vanq= new Student("Vanq", "fizika", 21, 5.25, 1, 125);
		Student angel= new Student("Angel", "Fizika", 23, 4.65, 1, 225);
		
		todor.upYear();
		System.out.println(todor.yearInCollege);

		StudentGroup grupa3= new StudentGroup("fizika");
		grupa3.addStudent(angel);
		angel.recieveScholarship(4, 100);
		grupa3.addStudent(vanq);
		vanq.upYear();
		grupa3.printStudent();
		System.out.println(grupa3.thebestStudent());
		
		StudentGroup grupa2= new StudentGroup("math");
		grupa2.addStudent(todor);
		grupa2.addStudent(petar);
		grupa2.printStudent();
		
		StudentGroup grupa1= new StudentGroup("bulgarski ezik");
		grupa1.addStudent(ivan);
		grupa1.addStudent(gosho);
		grupa1.printStudent();
		
		College kolej= new College();
		kolej.groups[0]=grupa1;
		kolej.groups[1]=grupa2;
		kolej.groups[2]=grupa3;
		System.out.println(kolej.highestGrage(kolej.groups));
		
//		grupa1.printStudent();
//		System.out.println(grupa1.thebestStudent());
//		System.out.println(ivan.recieveScholarship(5, 200));

	}

}
