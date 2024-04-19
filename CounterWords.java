public class CounterWords {
    private int count;

    public CounterWords(){
        this.count = 0;
    }

    public int getCount() {
        Reader reader = new Reader("input.txt");
        return count = reader.getWords().length;
    }
}
