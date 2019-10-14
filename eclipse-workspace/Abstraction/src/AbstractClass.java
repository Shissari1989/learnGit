
abstract class AbstractClass {
	
	
	public AbstractClass() {
		System.out.println("in abstract clss constructor");
	}
	
	
	String name;
	
	AbstractClass(String name)
	{
		name="sachin";
		this.name= name;
		System.out.println(this.name);
		
	}
	
	public void add() {
		
		System.out.println("Concrete add method");
	}
	
	static void test()
	{
		
	}
	
	abstract void sum();
	

}
