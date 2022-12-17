
public class employee1 {
	
	int id;
	String name;                  // class variable
	String designation;
	
	public static void main(String[] args)
	{
		employee1 e1=new employee1(); // object creation
		e1.id = 1;
		e1.name="Ritu";
		e1.designation="trainee";
		 System.out.println(e1.id+"="+" "+e1.name+" "+e1.designation+" ");
		 
		
		 employee1 e2=new employee1();
		 e2.id=2;
		 e2.name="neha";
		 e2.designation="assistant manager";
		 System.out.println(e2.id+"="+" "+e2.name+" "+e2.designation+" ");
		 
		 employee1 e3=new employee1();
		 e3.id=3;
		 e3.name="isha";
		 e3.designation="account manager";
		 System.out.println(e3.id+"="+" "+e3.name+" "+e3.designation+" ");
		 
		 employee1 e4=new employee1();
		 e4.id=4;
		 e4.name="rohan";
		 e4.designation="chief marketing officer";
		 System.out.println(e4.id+"="+" "+e4.name+" "+e4.designation+" ");
		 
		 employee1 e5=new employee1();
		 e5.id=5;
		 e5.name="shyam";
		 e5.designation="director";
		 System.out.println(e5.id+"="+" "+e5.name+" "+e5.designation+" ");
		
	}

}
