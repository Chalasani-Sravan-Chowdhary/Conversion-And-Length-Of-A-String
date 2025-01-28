public class lengthandConversionOfString {
    public static void main(String[] args) {
        System.out.println("Conversion of String from lowercase to Uppercase");
        String lowercase = "hello";
        String uppercase = lowercase.toUpperCase();
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Uppercase: " + uppercase);

        System.out.println("------------------------------------------------");

        System.out.println("Finding the length of the String");
        String str = "Hello, World!";
        int length = findStringLength(str); // Corrected method call
        System.out.println("Original String: " + str);
        System.out.println("Length of the String: " + length);
    }

    // Corrected method declaration
    public static int findStringLength(String str) {
        return str.length();
    }
}
