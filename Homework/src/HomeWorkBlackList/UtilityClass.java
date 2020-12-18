package HomeWorkBlackList;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class UtilityClass {
    public static void censorCheck(File file, File file2) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2));) {
            String str = null;
            ArrayList <String[]> finalCensoredLinesList = new ArrayList<>();
            ArrayList<String> censoredWordsList = UtilityClass.makeStringArray(file2);
            while ((str = reader.readLine()) != null) {
                String[] array = str.split(" ");
                for (int i = 0; i < array.length; i++) {
                    for(int j = 0; j<censoredWordsList.size();j++) {
                        if (array[i].equals(censoredWordsList.get(j))) {
                            finalCensoredLinesList.add(array);
                        }
                    }
                }
            }
            if(finalCensoredLinesList.isEmpty()) System.out.println("Text doesn't contain censored words");
            else System.out.println("Text contains censored words\nTotal number of censored lines is: "+finalCensoredLinesList.size());
            for(String [] text:finalCensoredLinesList){
                System.out.println(Arrays.toString(text));
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static ArrayList<String> makeStringArray(File file){
        String str = null;
        ArrayList<String>censoredWordsList=new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file));){

            while((str=reader.readLine())!=null){
                censoredWordsList.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return censoredWordsList;
    }
}
