import java.util.HashMap;

public class FrequencyWords {
    private HashMap<String, Integer> map;

    public FrequencyWords(){
        this.map = new HashMap<>();
    }

    public HashMap<String, Integer> getCountOfUniqueWord(){
        int count = 1;
        Reader reader = new Reader("input.txt");
        String[] words = reader.getWords();
        for(String word : words){
            map.put(word, count);
             if(map.containsKey(word)){
                count++;
             }
        }
        return map;
    }


}
