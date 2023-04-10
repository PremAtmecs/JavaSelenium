package BasicOops;

public class constructDemo {
    public constructDemo(){
        System.out.println("I am in constructor");
    }
    public constructDemo(int a, int b){
        System.out.println(a+","+b);
    }
    public void getData(){
        System.out.println("Getting data");
    }
    public static void main(String[] args) {
        constructDemo cd = new constructDemo();
        constructDemo c = new constructDemo(2,4);
    }
}
