package Assignment1;

public class CharacterCount {
	
    public static int countCharacterOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character matches the specified character
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String inputString = "hello world";
        char characterToCount = 'o'; 

        // Call the method and get the count
        int occurrenceCount = countCharacterOccurrences(inputString, characterToCount);

        // Display the result
        System.out.println("The character '" + characterToCount + "' occurs " + occurrenceCount + " times in the string \"" + inputString + "\".");
    }
}