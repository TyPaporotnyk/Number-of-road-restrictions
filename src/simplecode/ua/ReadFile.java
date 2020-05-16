package simplecode.ua;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    private List lines;

    public ReadFile(File file) {
        lines = readFile(file);
    }

    public List getLines() {
        return lines;
    }

    public List readFile(File file){
        List lines = new ArrayList();
        String line = "";

        try(FileReader fis = new FileReader(file);
            BufferedReader br = new BufferedReader(fis)){

            while((line = br.readLine()) != null){
                lines.add(line);
            }

        }catch(IOException e){
            System.out.println("Can not read File");
        }

        return  lines;
    }
}
