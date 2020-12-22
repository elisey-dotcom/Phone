import javax.sound.midi.SysexMessage;

public class Phone {

    static String number = "";
    private String model = "";
    private int weight = 0;

    Phone(){}

    Phone(String _number, String _model, int _weight){
        number = _number;
        model = _model;
        weight = _weight;

    }

    Phone(String _number, String _model){
        number = _number;
        model = _model;
    }

    public void print(){
        System.out.println(number+ "\n" + model + "\n" + weight);

    }

    public static void getNumber(Phone A){ // метод класса
        System.out.println(A.number);
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + " с номера: " + number);
    }
}
