package collectons;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//    Collection coll= Collections.synchronizedList(new ArrayList<String>());
//        ArrayList<String > l=new ArrayList<>();
//     for(int i=0;i<5;i++){
//     l.add(String.valueOf((Math.random()*100+10)));
//     l.get(i);
//     }
//     MyArrayList<Integer> a=new MyArrayList();
        LinkedList<String> ls=new LinkedList<>();
        ls.add("ilkin");
        ls.add("kerim");
        ls.add("samir");
//     System.out.println(ls.size());
   System.out.println(ls.remove());
//        System.out.println(ls.remove());
//        System.out.println(ls.size());
System.out.println(ls.get(1));
    }
}