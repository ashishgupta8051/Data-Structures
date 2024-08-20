package string;

import java.util.Arrays;

public class ChangeStringCharacter {

    public static void main(String[] args) {
        String value = "ashish";
        char newChar = 'k';
        int position = 1;
        StringBuilder stringBuilder = new StringBuilder(value);
        System.out.println(value.charAt(1));
        stringBuilder.setCharAt(1,newChar);
        System.out.println(stringBuilder);

        changeStringCharacter(value, newChar, position);
    }

    private static void changeStringCharacter(String oldValue, char newChar, int position) {
        char[] newValue = new char[oldValue.length()];
        for (int i = 0; i < oldValue.length(); i++){
            if (position == i){
                newValue[i] = newChar;
            }else {
                newValue[i] = oldValue.charAt(i);
            }
        }
        System.out.println("Old Value: "+oldValue);
        System.out.println("New Value: "+ Arrays.toString(newValue).replace("[","")
                .replace(",","").replace("]","").replace(" ",""));
    }
}
