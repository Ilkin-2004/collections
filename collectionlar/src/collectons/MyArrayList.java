package collectons;

import javax.crypto.interfaces.PBEKey;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class MyArrayList<T>  {

private String [] arr=new String [10];

int addelementlen=0;

public  void add (T  element) {
 if (addelementlen== arr.length) {
  String [] arr2 = new String [arr.length + arr.length];

  for (int i = 0; i < arr.length; i++) {
   arr[i] = arr2[i];
  }
  arr = arr2;
  arr[addelementlen++]= (String) element;
 }

}



}
