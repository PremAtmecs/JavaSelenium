package BasicOops;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class foreach {
    public static void main(String[] args) {
        String[] city = {"Bangalore", "Chennai", "Coimbatore", "Apple"};
        for (String str: city) {
            System.out.println("using for each method "+str);
        }
        List<String> al = Arrays.asList(city);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }



}
