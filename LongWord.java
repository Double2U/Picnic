
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class LongWord {
    private int length;
    private List<String> list;
    private HashSet<String> set;

    public LongWord(String[] words){
        this.length = 0;
        this.list = Arrays.asList(words);
        this.set = new HashSet<>(this.list);
    }

    public int getLength() {
        for (String word : set){
            if (length < word.length()){
                length = word.length();
            }         
        }
        return length;
    }


}
