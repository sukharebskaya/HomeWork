package HomeWorkInputOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Programming\\teachMeSkills\\Новый текстовый документ с палиндромами.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Programming\\teachMeSkills\\TextFormaterResult.txt"));)
        {String text;
        //записываем строки, состоящие из 3-5 слов
        while((text = reader.readLine())!=null){
            int wordsNumber = TextFormater.countWords(text);
            if(wordsNumber>=3 && wordsNumber<=5){
            writer.write(text+"\n");}
        }

        //записываем строки с палиндромами, независимо от кол-ва слов
        while((text = reader.readLine())!=null){
            if (TextFormater.checkPalindrome(text) == true){
                writer.write(text);
            }
        }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
