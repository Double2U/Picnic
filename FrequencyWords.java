import java.util.HashMap;

public class FrequencyWords {
    private HashMap<String, Integer> map;

    public FrequencyWords(){
        this.map = new HashMap<>();
    }

    public HashMap<String, Integer> getCountOfUniqueWord(String[] words){
        int count = 1;
        for(String word : words){
            map.put(word, count);
             if(map.containsKey(word)){
                count++;
             }
        }
        return map;
    }


}
