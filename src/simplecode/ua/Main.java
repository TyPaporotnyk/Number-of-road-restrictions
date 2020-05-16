package simplecode.ua;

import java.io.File;
import java.util.List;

public class Main{
    // Date
    private final String DATE = "07.05.2020";

    // Your path to file
    private final String PATH = "E:\\Projects\\FoundInFile\\src\\simplecode\\ua\\File\\Данные.csv";

    // Work speed
    private long timeStart, timeEnd;

    private List lines;

    private Main(){
        timeStart = System.currentTimeMillis();

        // Read file
        ReadFile readFile = new ReadFile(new File(PATH));

        // Change string
        List<String> elements = readFile.getLines();

        // Search for matches
        System.out.println("By date: [ " + DATE + " ] -> " + Operations.found(elements, DATE) + " results");
        timeEnd = System.currentTimeMillis();

        System.out.println("Lead time: " + (double)(timeEnd - timeStart)/100 + " seconds");
    }

    public static void main(String[] args){ new Main(); }
}
