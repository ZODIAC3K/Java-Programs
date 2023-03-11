// 29.	Write a java Program for all the String class methods with example.

public class string_methods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        // length method
        int length = str.length();
        System.out.println("Length of the string is: " + length);

        // charAt method
        char character = str.charAt(7);
        System.out.println("Character at index 7 is: " + character);

        // indexOf method
        int index = str.indexOf("World");
        System.out.println("Index of the substring 'World' is: " + index);

        // substring method
        String subString = str.substring(7);
        System.out.println("Substring after index 7 is: " + subString);

        // toLowerCase method
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase string is: " + lowerCase);

        // toUpperCase method
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase string is: " + upperCase);

        // trim method
        String strWithSpaces = "   Hello, World!   ";
        String trimmed = strWithSpaces.trim();
        System.out.println("Trimmed string is: " + trimmed);

        // equals method
        String str1 = "Hello";
        String str2 = "World";
        boolean areEqual = str1.equals(str2);
        System.out.println("Are the two strings equal? " + areEqual);

        // replace method
        String replacedString = str.replace("World", "Java");
        System.out.println("Replaced string is: " + replacedString);

        // split method
        String sentence = "Hello, how are you?";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence are:");
        for(String word : words) {
            System.out.println(word);
        }
    }
}
