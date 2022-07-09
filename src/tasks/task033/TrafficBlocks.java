package tasks.task033;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TrafficBlocks {
    public static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        List<String> res = new ArrayList<>();

        while (scanner.hasNextLine()){
            res.add(scanner.nextLine());
        }
        fileReader.close();
        return res;
    }

    public static Map<Date, Integer> getRecords(List<String> lines) {
        Map<Date, Integer> res = new HashMap<>();
        SimpleDateFormat sfg = new SimpleDateFormat("dd-MM-yyyy");
        for (String line: lines) {
//            System.out.println(line);
            String[] splitted = line.split(",");
            try {
            Date date = sfg.parse(splitted[0]);
            res.put(date, Integer.valueOf(splitted[1]));
            }
            catch (ParseException e) {
                e.printStackTrace();
             }
        }
        return res;
    }

    public static Integer poiskDate(Map<Date, Integer> map, Date date){
        return map.get(date);
    }

    public static void main(String[] args) throws IOException, ParseException {
        List<String> argss = List.of(args);
        String strDate = argss.get(1);
        SimpleDateFormat sfg = new SimpleDateFormat("dd.MM.yyyy");
        Date date = sfg.parse(strDate);
        Map<Date, Integer> records = getRecords(readFile(argss.get(0)));
        Integer trafficBlocks = poiskDate(records, date);
        System.out.println(trafficBlocks);

    }
}
