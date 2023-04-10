package BasicOops;

public class exceptionDemo {
    public static void main(String[] args) {
        int a=7, b=0;

        try{
            //int k = a/b;
            int c[]={1,3,4,5};
            int i[]=new int[4];
            //System.out.println(k);
            System.out.println(c[5]);
            System.out.println(i[7]);
        }

//        catch (ArithmeticException arithmeticException){
//            System.out.println("I catched arithmetic exception");
//        }
//
//        catch (IndexOutOfBoundsException boundsException){
//            System.out.println("I catched index bound exception");
//        }
//
//        catch(Exception e){
//            System.out.println("I catched Exception/error");
//        }
        finally {
            System.out.println("delete cookies");
        }
    }
}
