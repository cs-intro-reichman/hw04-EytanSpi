public class StringOps {
   
    public static void main(String[] args) {

    }

    // Input: String
    // Output: same string but capitalizes all vowels and makes all consonants lowercase.
    public static String capVowelsLowRest (String string) {
        String result = "";
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < string.length(); i++) {
            char currentLetter = string.charAt(i);
            if(vowels.indexOf(currentLetter) == -1) {   // currentLetter isn't a vowel
                result += toLowercase(currentLetter);
            } else {                                    // currentLetter is a vowel
                result += capitalize(currentLetter);
            }
        }
        return result;
    }

    // Input: string
    // Output: 1) lowercase the first letter of first word
    //         2) first letters of all other words will be capitalized
    //         3) all other letters will be lowercase
    //         4) all spaces are removed
    public static String camelCase (String string) {
        if (string.length() == 0) {
            return ("");
        }
        String result = "";
        boolean capitalizeNext = false;     // so that first letter will be lowercase
        for (int i = 0; i < string.length(); i++) {
            char currentLetter = string.charAt(i);
            if (currentLetter == ' ') {     // capitalize after spaces and don't add to result
                capitalizeNext = true;
            } else {                        // else add to result and next letter should be lowercase
                if(capitalizeNext) {
                    result += capitalize(currentLetter); 
                } else {         
                    result += toLowercase(currentLetter); 
                }
                capitalizeNext = false;
            }
        }
        return result;
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;     //counts needed length for future array (result)
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                counter ++;
            }
        }
        int[] result = new int[counter];
        int placement = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                result[placement++] = i;
            }
        }
        return result;
    }
    
    // Input: char
    // Output: capital form of the letter
    //         does not change other chars
    public static char capitalize(char c) {
        if ('a' <= c && c <= 'z') {
            // turn lowercase letters to capital
            int letterIndex = (c - 'a');
            return ((char) ('A' + letterIndex));
        }
        return c; // needed for compilation
    }

    // Input: char
    // Output: lower case form of the letter
    //         does not change other chars
     public static char toLowercase(char c) {
        if ('A' <= c && c <= 'Z') {
            // turn capital letters to lowercase
            int letterIndex = (c - 'A');
            return ((char) ('a' + letterIndex));
        }
        return c; // needed for compilation
    }

    public static void printArray (int[] array) {
        System.out.print("{"); 
        if (array.length > 0) {
            System.out.print(array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
        }
        System.out.println("}");
    }
    
}
