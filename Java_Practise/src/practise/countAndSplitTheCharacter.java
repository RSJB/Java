package practise;


public class countAndSplitTheCharacter {

	public static void main(String[] args) {

		//Counter variable to store the count of vowels and consonant    
        int vCount = 0,Alphabets=0,num=0,space=0,Special=0;    
            
        //Declare a string    
        String str = "This is a really simple sentensasf#@q343t4251	436,ce";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z'){ //Ceck Alphabets
                Alphabets++;
            }
            else if(str.charAt(i)>='0' && str.charAt(i)<='9'){ //Check  numeric characters
                num++;
            }
            else if(str.charAt(i) ==' '){ //Check space
                space++;
            }
            else{ //find special characters
                Special++;
            }
            i++;
		while(i<str.length());
              
	}
        System.out.println("\nAlphabet letters: "+Alphabets);
        System.out.println("Number: "+num);
        System.out.println("Space: "+space);
        System.out.println("Special characters: "+Special);
        System.out.println("Number of vowels: " + vCount); 
}
}