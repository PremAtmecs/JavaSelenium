package BasicOops;

public class functionOverloading {

    public void getData(int a){
        System.out.println(a);
    }

    public void getData(String a){
        System.out.println(a);
    }

    public void getData(int a, int b){
        System.out.println( b);
    }

    public static void main(String[] args) {
        functionOverloading fo = new functionOverloading();
        fo.getData(2);
        fo.getData("Hello");
    }
}
