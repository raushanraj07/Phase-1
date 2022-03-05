package oops;

public class Student {
	String name; 
    int age; 
    int std;
    public Student(String name, int age, int std) 
    { 
        this.name = name; 
       
        this.age = age; 
        this.std = std; 
        
        
    }
	public String getName() {
		return name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	
	public int getStd() {
		return std;
	}
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+" \n age and std are " + this.getAge()+ " and "+ this.getStd() + "." );
}
    public static void main(String[] args) 
    { 
Student stud=new Student("Raushan",15,12);
System.out.println(stud.toString()); 
    }
    }