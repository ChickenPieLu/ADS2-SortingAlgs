import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public static int[] read(String path){
        ArrayList<Integer> data = new ArrayList<Integer>();
        try{
            Scanner sc = new Scanner(new File(path));
            while (sc.hasNextInt()) {
                data.add(sc.nextInt());
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("error: file not found");
            return new int[0];
        }
        
        int len = data.size();
        int[] result = new int[len];
        for(int i=0; i<len; i++){
            result[i] = data.get(i);
        }
        return result;
    }
}
