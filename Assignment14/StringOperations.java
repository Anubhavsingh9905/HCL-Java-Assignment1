
import java.util.Arrays;

public class StringOperations {

    public static void main(String[] args) {

        String str = "Hello Java World";
        String another = "Hello Java World";
        String text = "  Java Programming  ";

        // String, StringBuffer and StringBuilder
        String immutable = "Hello";
        StringBuffer buffer = new StringBuffer("Hello");
        StringBuilder builder = new StringBuilder("Hello");

        System.out.println("String: " + immutable);
        System.out.println("StringBuffer: " + buffer.append(" World"));
        System.out.println("StringBuilder: " + builder.append(" World"));

        // length()
        System.out.println("\nLength: " + str.length());

        // isEmpty()
        System.out.println("Is empty: " + "".isEmpty());

        // charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // toString()
        System.out.println("String representation: " + buffer.toString());

        // equals()
        System.out.println("Equals: " + str.equals(another));

        // compareTo()
        System.out.println("CompareTo: " + "Apple".compareTo("Banana"));

        // contains()
        System.out.println("Contains Java: " + str.contains("Java"));

        // indexOf()
        System.out.println("Index of Java: " + str.indexOf("Java"));

        // lastIndexOf()
        System.out.println("Last index of a: " + str.lastIndexOf('a'));

        // startsWith()
        System.out.println("Starts with Hello: " + str.startsWith("Hello"));

        // endsWith()
        System.out.println("Ends with World: " + str.endsWith("World"));

        // matches()
        System.out.println("Matches letters only: "
                + "Java".matches("[A-Za-z]+"));

        // substring()
        System.out.println("Substring: " + str.substring(6, 10));

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // trim()
        System.out.println("Trimmed: '" + text.trim() + "'");

        // replace()
        System.out.println("Replace: " + str.replace("Java", "Python"));

        // split()
        String[] words = str.split(" ");
        System.out.println("Split: " + Arrays.toString(words));

        // join()
        System.out.println("Join: " + String.join("-", words));

        // valueOf()
        int number = 123;
        String numberString = String.valueOf(number);
        System.out.println("ValueOf: " + numberString);

        // Additional examples
        System.out.println("\nAdditional Examples:");

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Equals ignoring case: "
                + "java".equalsIgnoreCase("JAVA"));

        StringBuilder example = new StringBuilder("Java");
        example.insert(4, " Programming");
        System.out.println("After insert: " + example);

        example.delete(4, example.length());
        System.out.println("After delete: " + example);
    }
}