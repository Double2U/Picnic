public class Presenter {
    private Controller controller;
    
    public Presenter(){
        this.controller = new Controller();
    }

    public void run(){

        System.out.printf("Количество слов: %s\n", controller.getCountWords());
        System.out.printf("Cамое длинное слово: %s\n", controller.getLongWord());
        System.out.printf("Частота слов: %s", controller.getFrequencyWord().toString());
        
    }


}
