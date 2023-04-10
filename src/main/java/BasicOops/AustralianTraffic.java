package BasicOops;

public class AustralianTraffic implements centralTraffic {
    public static void main(String[] args) {
        centralTraffic a = new AustralianTraffic();
        a.flashYellow();
        a.greenGo();
        a.redStop();
    }

    @Override
    public void greenGo() {
        System.out.println("Green go implementation");
    }

    @Override
    public void redStop() {
        System.out.println("Red stop implementation");
    }

    @Override
    public void flashYellow() {
        System.out.println("Flash yellow implementation");
    }
}
