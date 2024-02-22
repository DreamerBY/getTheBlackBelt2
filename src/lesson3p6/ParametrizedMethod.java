package Comparation.lesson3p6;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();



        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a= GenMethod.getSecondElement(al1);// 4.30 пункт 6 У Заура GenMethod

        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("abc");
        al2.add("def");
        al2.add("ghi");
        String s = GenMethod.getSecondElement(al2);// 4.30 пункт 6 У Заура GenMethod

        System.out.println(s);
    }


}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
