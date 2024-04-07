import other.A;

class Launch
{
	A obj=new A();
	System.out.println(obj.marks);
}









 class B
{
//	private int marks;
	int marks;
	
}




class C extends A
{
	public void abc()
	{
		System.out.println(marks);
	}
}

public class AccessModifier{
	public static void main(String[] args) {
   
	A obj=new A();
    // The field A.marks is not visible
	// System.out.println(obj.marks);
	obj.show();
	
	B obj1=new B();
    // The field A.marks is not visible
	// System.out.println(obj.marks);
	
	}
}