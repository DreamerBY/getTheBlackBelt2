package lesson4p14_array_list_2;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Ivan");
        System.out.println(arrayList1);
//
//        ArrayList<String> arrayList2=new ArrayList<>();
//        arrayList2.add("!!!");
//        arrayList2.add("???");
//        arrayList1.addAll(1,arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.clear();
//        System.out.println(arrayList1.indexOf("Ivan"));
//        System.out.println(arrayList1.lastIndexOf("Ivan"));
//        System.out.println(arrayList1.size());
//        arrayList1.clear();
        System.out.println(arrayList1.isEmpty());

        System.out.println(arrayList1.contains("Kilya"));
        System.out.println(arrayList1.contains("Mariya"));

    }
}
