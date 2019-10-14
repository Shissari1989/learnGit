
public class child extends AbstractClass{
	
	
	child()
	{
		super("Sachin");
	}
	public static void main(String[] args)
	{
	
		AbstractClass obj = new child();
		
		
		
		AbstractClass obj1= (AbstractClass)obj;
		obj1.sum();
		obj.sum();
		
		
		
		System.out.println(obj);
		System.out.println(obj1);
		obj1.sum();
		obj1.add();
		System.out.println(obj1.name);
		
		System.out.println("Run this program");
	}

	@Override
	void sum() {
		System.out.println("overridding abstract method");		
	}

	
	
	
}
