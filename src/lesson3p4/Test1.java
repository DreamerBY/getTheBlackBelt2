package Comparation.lesson3p4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

  class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("Zeus"));
//        list.add(new Car());
        list.add("Privet");
        list.add("Poka");
        list.add("Ok");
        list.add("lola");
//        list.add(new Car());

        for (Object o : list) {
            System.out.println(o + " dlina " + ((String) o).length());
        }

    }
}
class Car{}
