package lesson4p15_arraylist_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);
//        list1.add(100);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);




//        System.out.println("Array list = " + arrayList1);
//        Object [] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[2]);
//            for(String s:array2){ // выводит массив поэлементно
//                System.out.println(s);
//            }






//        List<String> myList = arrayList1.subList(1, 4);
//        System.out.println("Sub List = " + myList);
//        myList.add("Fedor");
//        System.out.println("Sub List = " + myList);
//        System.out.println("Array list = " + arrayList1);
//        arrayList1.add("Sveta");
//        System.out.println("Array list = " + arrayList1);
//        System.out.println("Sub List = " + myList);


//        ArrayList<String> arrayList2=new ArrayList<>();
//        arrayList2.add("Ivan");
//        arrayList2.add("Mariya");
//        arrayList2.add("Igor");
//        arrayList1.removeAll(arrayList2);
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);
//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);


    }
}
