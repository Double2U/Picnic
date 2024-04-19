public class Presenter {
    private Controller controller;
    
    public Presenter(){
        this.controller = new Controller();
    }

    public void run(){

        System.out.printf("Количество слов: %s", controller.getCountWords());
        System.out.printf("Cамое длинное слово: %s", controller.getLongWord());
        System.out.printf("Частота слов: %s", controller.getFrequencyWord().toString());
        
    }


}
