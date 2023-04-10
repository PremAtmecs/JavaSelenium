package BasicOops;

public class loopConcepts {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("print the value" + i);
            i++;
        }

        int j = 20;
        do {
            System.out.println(j);
            j++;
        } while (j < 30);

        int l = 1;

        for (int k = 0; k <4; k++) {

            for (int a = 1; a <=4-1; a++) {
                System.out.print( l);
                System.out.print("\t");
                l++;
            }
            System.out.println("");
        }
    }
}
