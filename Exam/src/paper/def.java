package paper;
public class def {
	 public static void main(String[] args) {
	        String input = "  I Love India  ";
	        String output = removeLeadingAndTrailingSpaces(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	    }

	    public static String removeLeadingAndTrailingSpaces(String input) {
	        int startIndex = 0;
	        int endIndex = input.length() - 1;

	        
	        while (startIndex < input.length() && input.charAt(startIndex) == ' ') 
	{
	            startIndex++;
	        }


	        
	        while (endIndex >= 0 && input.charAt(endIndex) == ' ') {
	            endIndex--;
	        }

	        
	        return input.substring(startIndex, endIndex + 1);
	    }
	}
	


