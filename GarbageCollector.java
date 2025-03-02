/*GarbageCollector in java*/
class GarbageCollector
{
	public static void main(String args[])
	{
		GarbageCollector o1=new GarbageCollector();
		GarbageCollector o2=new GarbageCollector();
		o1=null;
		System.gc();
		o2=null;
		Runtime.getRuntime().gc();
	}
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collector called");
		System.out.println("Object Garbage"+this);
	}
}
/*
output:
Garbage collector called
*/