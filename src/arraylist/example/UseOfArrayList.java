package arraylist.example;

import java.util.ArrayList;
import java.util.List;

public class UseOfArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(29);
        /* list.add(0,10);
           list.add(1,15);
           list.add(2,25);

           System.out.println(list.get(0));
           System.out.println(list.get(1));
           System.out.println(list.get(2));*/

       for (Integer number:list){ //for each loop
           System.out.println(number);
       }

    }
}
