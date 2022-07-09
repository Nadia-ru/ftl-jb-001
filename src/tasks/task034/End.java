package tasks.task034;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class End {
    public static String readUrl(String urlString) throws IOException {
        URL url = new URL(urlString);
        URLConnection urlConnection = url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(urlConnection.getInputStream())
        );

        StringBuilder stringBuilder = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine())!= null){
            stringBuilder.append(inputLine);
        }
        in.close();
        return stringBuilder.toString();

    }

    public static void writeFile(String path, String content) throws  IOException{
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(content);
        fileWriter.close();

        System.out.println(file.getAbsolutePath());
    }



    public static void run(String url,String fileName) throws IOException{
        String content = readUrl(url);

        writeFile(fileName,content);

    }
}
