package BasicOops;

public class arrayDemo {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 12;
        a[1] = 13;
        a[2] = 14;
        a[3] = 15;
        a[4] = 16;
        int b[] = {1,2,3,4,5};
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]);
        }
    }
}
