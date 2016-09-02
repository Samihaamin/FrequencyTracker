import java.util.Hashtable;
import java.util.Scanner;

public class Count {
	public static void main(String[] args){
		
	System.out.println("Enter text to analyze");
	Scanner input = new Scanner(System.in); //user input of text to analyze
	 
	String text = input.nextLine();
	String[] words = text.split(" "); //divide text into words
	    
	Hashtable<String, Integer> wordlist = new Hashtable<String, Integer>();

	for (int k=0; k<words.length;k++){
	    	
	    if (wordlist.containsKey(words[k])){
	    	wordlist.replace(words[k],wordlist.get(words[k])+1);
	    	}
	    	else wordlist.put(words[k],1);
	    }
	    System.out.println(wordlist.toString());
	    
	    for (int wordlength = 1; wordlength<10; wordlength++){ //printing with increasing word length
	    	for (String wordCheck : wordlist.keySet()){ //iterating through all keys
			 if (wordCheck.length()==wordlength){			 
			 System.out.println(wordlist.get(wordCheck)+" "+wordCheck); }
			}
		}
	}
}
