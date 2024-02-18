package Comparation.lesson3p9;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
//        List<Number> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<String>();
        //  list.add("hello");
        // bounded wildcards

        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Number>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Privet");
        list2.add("Poka");
        list2.add("ok");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(5);
        ali.add(6);
        System.out.println(summ(ali));

        ArrayList<String> als = new ArrayList<>();
        //System.out.println(summ(als));

    }

    static void showListInfo(List<?> list) {
        System.out.println("Moy list soderjit sleduushit elementu: " + list);
    }

    public static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;

    }

}
