package CollectionFramework;

public class Student {
    
    private String name;
	private int rollNumber;
 
        public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getRollNumber() {
		return rollNumber;
	}
 
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
        
    public String toString()
    {
        return "[Student:" + name + ", Roll Number:" + rollNumber + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        Student other = (Student) obj;
        if (rollNumber != other.rollNumber)
            return false;
        return true;
    }

    public int hashCode() {
        return rollNumber+name.hashCode();
    }

}
