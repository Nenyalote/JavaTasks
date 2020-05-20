import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {

  public static void main (String [] args){
    int [] a1 = {1, 3, 4, 4, 4};
    int [] a2 = {2, 5, 7};
    int [] a3 = {9, 8, 7, 6};
    int [] a4 = {4, 4, 3, 1};
    int [] a5 = {2};
    int [] a6 = {3, 3, 3, 3, 3};

    System.out.println(same(a1,a2));
    System.out.println(same(a3, a4));
    System.out.println(same(a5, a6));

  }

  public static boolean same (int [] array1, int [] array2){
    boolean sameNum = true;
    boolean res = false;
    Arrays.sort(array1); //сортируем массивы по возрастанию
    Arrays.sort(array2);

    ArrayList<Integer> list1 = new ArrayList<>(); // записываем массивы в списки, чтобы удалять элементы
    ArrayList<Integer> list2 = new ArrayList<>();

    for (int i=0; i<array1.length; i++){  //заполняем списки
      list1.add(array1[i]);
    }

    for (int i=0; i<array2.length; i++){
      list2.add(array2[i]);
    }

    for (int i=0; i<list1.size()-1; i++){
      if (list1.get(i)==list1.get(i+1)){
        sameNum = false;
      }
    }

    while (sameNum == false){
      for (int i=0; i<list1.size()-1; i++){
        if (list1.get(i).equals(list1.get(i+1))){
          list1.remove(list1.get(i));
        }
      }
      sameNum = true;
      for (int i=0; i<list1.size()-1; i++){
        if (list1.get(i)==list1.get(i+1)){
          sameNum = false;
        }
      }
    }

    sameNum=true;
    for (int i=0; i<list2.size()-1; i++){
      if (list2.get(i)==list2.get(i+1)){
        sameNum = false;
      }
    }

    while (sameNum == false){
      for (int i=0; i<list2.size()-1; i++){
        if (list2.get(i).equals(list2.get(i+1))){
          list2.remove(list2.get(i));
        }
      }
      sameNum = true;
      for (int i=0; i<list2.size()-1; i++){
        if (list2.get(i)==list2.get(i+1)){
          sameNum = false;
        }
      }
    }

    if (list1.size()==list2.size()){ //если размеры списков совпадают
      res=true;
    }

    return res;
  }

}
