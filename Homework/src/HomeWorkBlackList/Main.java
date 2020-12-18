package HomeWorkBlackList;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File textForCheck = new File("C:\\Programming\\teachMeSkills\\Новый текстовый документ для цензуры.txt");
        File censoredWordsList = new File("C:\\Programming\\teachMeSkills\\список нецензурных слов.txt");
        UtilityClass.censorCheck(textForCheck, censoredWordsList);

    }
}
