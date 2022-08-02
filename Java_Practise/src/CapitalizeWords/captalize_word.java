package CapitalizeWords;

public class captalize_word {
	public static String captalizeWords(String str) {
		
		if (str==null) {
			System.out.println("null value");
			return null;
		}
		
		if (str.length()==1) {
			return str.toUpperCase();
		}
		String word[] = str.split("\\s");//Split on the basis of Space
		String result="";
		
		
		for (String w : word) {
			
			String first = w.substring(0, 1).toUpperCase();//1 - 10 means its capture 1-9 only, exclude 10.here its capture 0(p)convert to 'N' 
		String restString = w.substring(1);//lease
		result =result + first + restString+" ";//Please
		
		}
		return result.trim();//remove space on last word
	}
	
	
	public static void main(String[] args) {
		String Caps= captalizeWords("please keep silence");//Please Keep Silence
	System.out.println(Caps);
	
	 Caps= captalizeWords("please");//Please
	System.out.println(Caps);
	
	 Caps= captalizeWords("p");///P
	System.out.println(Caps);
	
	 Caps= captalizeWords("s j b");// S J B
	System.out.println(Caps);
	
	 Caps= captalizeWords("123");//123
	System.out.println(Caps);
	
	 Caps= captalizeWords("123 hi sj b"); // 123 Hi Sj B
	System.out.println(Caps);
	
	 Caps= captalizeWords(null);// null
		System.out.println(Caps);
	}
}
