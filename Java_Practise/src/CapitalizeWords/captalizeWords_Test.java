package CapitalizeWords;


public class captalizeWords_Test {
	
	public static void captalizeWords(String str) {
	
		String word[] = str.split("\\s");//Split on the basis of Space
		String result1="";
		String result2="";
		
		for (String w : word) {
			
			String first = w.substring(0, 1).toUpperCase();//1 - 10 means its capture 1-9 only, exclude 10.here its capture 0(p)convert to 'N' 
		String restString = w.substring(1);//lease
		result1 =result1 + first + restString;//Please
		result2 =result2 + first + restString+ " ";
		}
		System.out.println(result1);
		System.out.println(result2);
		String result3 = result2.trim();//Please -->remove last space
		System.out.println(result3);
	}
	
	
	public static void main(String[] args) {
		captalizeWords("please keep silence");
	}
}
