package BasicOops;

public class Encapsulation {
    private int a;
    private String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setA(100);
        e.setB("Prem");
        System.out.println("Get integer value " +e.getA());
        System.out.println("Get String value " +e.getB());
    }

}
