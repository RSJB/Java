package practise;

import java.util.Scanner;

public class jd {
	
	void as() {
		
		//variable declaration
		String str;
		int Alphabets=0,num=0,space=0,Special=0,vCount=0;
		//vriable declaration and initialization
		Scanner scan=new Scanner(System.in); 
		//create a scanner object for input
		String nextLine = scan.nextLine();
		System.out.println("Enter the String  ");
		str=scan.nextLine();
		int i=0; 
		do{
			char ch=str.charAt(i);
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
				//Increments the vowel counter    
				vCount++;    
			} 
			else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){ 
				Alphabets++;
			}
			else if(ch>='0' && ch<='9'){
				num++;
			}
			else if(ch ==' '){ 
				space++;
			}
			else{ 
				Special++;
			}
			i++;
		}
		while(i<str.length()); {
		System.out.println("vowel :"+vCount);
		System.out.println("\nAlphabet letters: "+Alphabets);
		System.out.println("Number: "+num);
		System.out.println("Space: "+space);
		System.out.println("Special characters: "+Special);

	} 
		
	}
	public static void main(String[] args) {

		jd a =new jd();
		a.as();
}
}
