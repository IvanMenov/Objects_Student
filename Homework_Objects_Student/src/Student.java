
public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double moneyfromScolarship;
	
	
	double recieveScholarship(double min, double amount){
		if(min>3 && min<=6 && amount>0){
			if(this.grade>=min && this.age<30){
				moneyfromScolarship+=amount;
				//System.out.println("After receiving the scholarship "+this.name+" has "+this.moneyfromScolarship+" lv.");
				return  moneyfromScolarship;
			}else{
				//System.out.println(this.name+" doesn't cover the requirements for a scholarship, so he only has "+this.moneyfromScolarship+" lv.");
				return this.moneyfromScolarship;
			}
		}else{
			//System.out.println("The parameters are incorrect");
			return this.moneyfromScolarship;
		}
	}
	
	void upYear(){
		if(this.isDegree==false && this.yearInCollege<4 ){
			this.yearInCollege++;
			if(this.yearInCollege==4){
				this.isDegree=true;
			}
		}else{
			System.out.println("The student has graduated.");
		}
	}
	
	Student(){
		this.grade=4.0;
		this.yearInCollege=1;
		this.isDegree=false;
		this.moneyfromScolarship=0;
	}
	Student(String name, String subject, int age){
		this();
		if(name!=null){
			this.name=name;
		}else{
			this.name="John";
		}
		if(subject!=null){
			this.subject=subject;
		}
		else{
			this.subject="bulgarski ezik";
		}
		if(age>=16){
			this.age=age;
		}
		else{
			this.age=20;
		}
	
	}
	Student(String name, String subject, int age, double grade, int yearInCollege, double money){
		this(name, subject, age);
		if(grade>=2 && grade <=6){
			this.grade=grade;
		}else{
			this.grade=4.0;
		}
		if(yearInCollege>=1 && yearInCollege<=4){
			this.yearInCollege=yearInCollege;
			if(yearInCollege==4){
				this.isDegree=true;
			}else{
				this.isDegree=false;
			}
		}
		else{		
				this.yearInCollege=1;
				this.isDegree=false;
		}
		if(money>=0){
			this.moneyfromScolarship=money;
		}
		else{
			this.moneyfromScolarship=0;
		}
	}
}
