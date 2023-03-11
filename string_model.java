import java.util.Arrays;

public class string_model {
    public static void main(String[] args) {
        String str = "Hello World";
        
        // length()
        int length = str.length();
        System.out.println("Length: " + length);
        
        // charAt()
        char ch = str.charAt(0);
        System.out.println("First character: " + ch);
        
        // substring()
        String sub = str.substring(0, 5);
        System.out.println("Substring: " + sub);
        
        // indexOf()
        int index = str.indexOf("o");
        System.out.println("Index of 'o': " + index);
        
        // lastIndexOf()
        int lastIndex = str.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndex);
        
        // toLowerCase()
        String lowerCase = str.toLowerCase();
        System.out.println("Lower case: " + lowerCase);
        
        // toUpperCase()
        String upperCase = str.toUpperCase();
        System.out.println("Upper case: " + upperCase);
        
        // trim()
        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);
        
        // replace()
        String replaced = str.replace("o", "*");
        System.out.println("Replaced: " + replaced);
        
        // split()
        String[] words = str.split(" ");
        System.out.println("Split: " + Arrays.toString(words));
      }
}