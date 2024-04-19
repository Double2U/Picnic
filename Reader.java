import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private String PATH;

    public Reader (String filePath){
        this.PATH = filePath;
    }

    public String[] getWords(){
        String line = null;
        try(FileReader fr = new FileReader(PATH); BufferedReader bf = new BufferedReader(fr)) {
            line  = bf.readLine().replaceAll("   ", " ").replaceAll("  ", " ").toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] words = line.split(" ");
        return words;
    } 
    
    
}
