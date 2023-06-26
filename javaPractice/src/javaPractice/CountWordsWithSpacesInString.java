package javaPractice;

public class CountWordsWithSpacesInString {
	
	    public static void main(String[] args) {

	        String sentence = "This is a sample sentence";

	        String[] words=sentence.split(" ");
	        
	        int wordlength=words.length;
	        
	        System.out.println("Length of words ="+wordlength);
	    }
	}



