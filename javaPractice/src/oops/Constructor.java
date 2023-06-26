package oops;

public class Constructor {
	
	    public String name;
	    public int rollNo;

	    Constructor(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    
	    public String toString() {
	        return "Name: " + name + ", Roll No: " + rollNo;
	    }

	    public static void main(String[] args) {
	        Constructor c = new Constructor("vasu", 1);
	        Constructor c1 = new Constructor("srinivas", 2);

	        System.out.println(c);
	        System.out.println(c1);
	    }
	}
