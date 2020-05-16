package simplecode.ua;

import java.util.List;

public class Operations {

    // For search matches
    public static int found(List<String> arr, String obj){
        int count = 0;
        for(String o : arr){
            if(o.contains(obj)){
                count++;
            }
        }

        return count;
    }
}
