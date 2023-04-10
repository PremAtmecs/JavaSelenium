package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("INDIA");
        hs.add("INDIA");  //In Hashset, it doesn't store the duplicate values
        System.out.println(hs);
        //System.out.println(hs.remove("INDIA"));
        System.out.println(hs.contains("UK"));
        System.out.println(hs.isEmpty());
        hs.add("CANADA");
        System.out.println(hs);
        Iterator<String> i = hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }



    }
}
