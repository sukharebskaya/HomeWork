package HomeWorkInputOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class TextFormater {
    public static int countWords(String str){
        String [] array = str.split(" ");
        return array.length;
    }

    public static boolean checkPalindrome(String str){
        int palindromeCount=0;
        ArrayList<String> lineArray = makeArrayList(str);
        StringBuilder builder = new StringBuilder(str);
        String reverseLine = new String (builder.reverse());
        ArrayList<String>lineToCompare = makeArrayList(reverseLine.toLowerCase());
        for (int i = 0; i<lineArray.size(); i++){
            if(lineToCompare.get(i).equals(lineArray.get(i)))
                palindromeCount++;
        }

        if(palindromeCount>0) return true;
        else return false;
    }

    public static ArrayList<String> makeArrayList (String str){
        String[]stringArray = str.split(" ");
        ArrayList <String> list = new ArrayList<>();
        list.addAll(Arrays.asList(stringArray));

        return list;
    }
}
