package BasicOops;

public class childClassDemo extends parentClassDemo{
    public void engine(){
        System.out.println("Engine code is implemented");
    }

    public void colour(){
        System.out.println(color);
    }
    public static void main(String[] args) {
        childClassDemo cd = new childClassDemo();
        cd.colour();
        cd.gear();
    }
}
