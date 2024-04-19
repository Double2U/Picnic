import java.util.HashMap;

public class FrequencyWords {
    private HashMap<String, Integer> map;

    public FrequencyWords(){
        this.map = new HashMap<>();
    }

    public HashMap<String, Integer> getCountOfUniqueWord(){
        Reader reader = new Reader("input.txt");
        String[] words = reader.getWords();
        Integer count = 1;
        for(String word : words){    
            if(map.containsKey(word)){
                count = map.get(word);
                count++;
                map.put(word, count);
            } else{
                map.put(word, 1);
            }
           
        }
        return map;
    }


}
