import java.util.HashMap;

public class Conroller{
    private CounterWords cw;
    private FrequencyWords fw;
    private LongWord lw;

    public Conroller(){
        this.cw = new CounterWords();
        this.fw = new FrequencyWords();
        this.lw = new LongWord();
    }

    public int getCountWords(){
        return cw.getCount();
    }

    public String getLongWord(){
        return lw.getLongWord();
    }

    public HashMap<String, Integer> getFrequencyWord(){
        return fw.getCountOfUniqueWord();
    }

}