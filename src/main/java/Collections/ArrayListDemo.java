package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("prem");
        al.add("a");
        al.add("java");
        al.add("learning");
        al.add("X");
        System.out.println("print added valuev" +al);
        System.out.println("print the index " +al.size());

        //get list value using for loop
        System.out.println("Reading element using for loop");
        for (int i=0;i< al.size();i++){
            System.out.println( al.get(i));
        }

        //get list value using for each
        System.out.println("Reading element using for each ");
        for (Object e:al) {
            System.out.println( e);
        }

        //Readin element using Iterator
        Iterator it = al.iterator();
        System.out.println("Reading element using Iterator concept");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Sorting in ascending order
        Collections.sort(al);
        System.out.println("After sorting" +al);

        //Sorting in descending order
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Elements sorting in reverse order" +al);

        //shuffle order
        Collections.shuffle(al);
        System.out.println("Shuffling order" +al);

        //converting array to arrayList
        String[] name= {"a", "b", "c", "d"};
        for (int j=0; j<name.length; j++){
            System.out.println(name[j]);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(name));
        System.out.println(arrayList);
    }
}
