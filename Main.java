public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("+71292451651", "10S", 110);
        Phone p2 = new Phone("+70000000000", "10S", 110);
//        p1.receiveCall("Коллектор и КГБ");
        p1.getNumber(p1);
        p1.getNumber(p2);
//        p1.receiveCall(" Псевдо Harlamenkov","+79991112233");
//        Phone.getNumber();
    }
}