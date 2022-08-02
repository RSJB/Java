package practise;

public class Immutable {
//String Constant pool(SCP)--we can't to create the duplicate in the memory 
	
//String Builder , String Buffer 2 class in java its Mutable	
//String in java is Immutable	
	public static void main(String[] args) {
		  
		String x ="asd";
		System.out.println("X Memory :"+x.hashCode()+"\n");
		String y= "asd";
		System.out.println("Y Memory :"+y.hashCode()+"\n");
		
//Immutable	String	
/**
*	String is immutable .we Can't store a data in already(x path) allocated Heap memory/memory.		 * 
**/
		x.concat(y);
		System.out.println("After Concat without mention variable :"+x.hashCode());
		System.out.println("X values :"+x+"\n");

/**
 * allocate the memory (X)
 */
		x = x.concat(y);
		System.out.println("After Concat Same Memory :"+x.hashCode());
		System.out.println("X values :"+x+"\n");
		
		
//muted String		
		String concat = x.concat(y);// if we need to mutate mean's we need a new memory to allocate
		System.out.println("After Concat created new Memory :"+concat.hashCode());
		System.out.println("Muted String:"+concat);
			
	}
	
}
