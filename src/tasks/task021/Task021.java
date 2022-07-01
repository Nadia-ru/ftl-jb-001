package tasks.task021;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task021 {

    public static String readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        String response = "";
        while (scanner.hasNextLine()){
            response += scanner.nextLine();
        }

        fileReader.close();
        return response;
    }
    public static void numberOfWords(String s){
        // \\W+ -регул€рное выражение, где разделителем €вл€етс€ всЄ, кроме слова
        s = s.toLowerCase();
        String[] words = s.split("\\W+");
        Map< String,Integer> map = new HashMap<>();
        for(String word: words){
            if (!map.containsKey(word)){
                map.put(word, 1);
            }else{
                map.put(word, map.get(word)+1);
            }
        }
        for (Map.Entry entry: map.entrySet()) {

            System.out.println(entry);

        }
    }
    public static void run() throws IOException{

        String s =readFile("text.txt");
        numberOfWords(s);
    }
}
