package Collections;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Prem");
        a.add("Java");
        a.add("Collections");
        System.out.println(a);
        System.out.println(a.get(1));
        a.remove(1);
        System.out.println(a);
        System.out.println(a.indexOf("Collections"));
        System.out.println(a.contains("Collections"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        a.add(0,"Selenium");
        System.out.println(a);
    }
}
