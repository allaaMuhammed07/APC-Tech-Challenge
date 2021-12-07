package ReverseUppercase;

import java.util.Locale;

public class ReverseUppercaseLogic {

    public ReverseUppercaseLogic(){

    }

    public String name_uppercase_reverse(String input){
        int stringLength = input.length();
        char[] inputReversed = new char[stringLength];
        for (int i = 0; i < input.length(); i++) {
            inputReversed[--stringLength] = input.charAt(i);
        }
        return new String(inputReversed).toUpperCase(Locale.ROOT);
    }
}
