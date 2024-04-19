
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class LongWord {
    private int length;
    private List<String> list;
    private HashSet<String> set;

    public LongWord(){
        this.length = 0;
        this.list = null;
        this.set = null;
    }

    public String getLongWord() {
        Reader reader = new Reader("input.txt");
        String[] words = reader.getWords();
        list = Arrays.asList(words);
        set = new HashSet<>(list);
        String longWord = null;
        for (String word : set){
            if (length < word.length()){
                longWord = word;
                length = word.length();
            }         
        }
        return longWord;
    }


}
