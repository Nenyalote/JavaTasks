public class Task3 {

  public static void main(String[] args){
    int[] array1 = {1,3};
    int[] array2 = {1,2,3,4};
    int[] array3 = {1,5,6};
    int[] array4 = {1,1,1};
    int[] array5 = {9,2,2,5};

    System.out.println(isAvgWhole(array1));
    System.out.println(isAvgWhole(array2));
    System.out.println(isAvgWhole(array3));
    System.out.println(isAvgWhole(array4));
    System.out.println(isAvgWhole(array5));
  }

  public static boolean isAvgWhole(int [] array){
    boolean res = false;
    double sum = 0;
    for (int i=0; i<array.length; i++){ //находим сумму элементов массива
      sum = sum + array[i];
    }

    double avg = sum/array.length; //находим среднее значение элементов массива

    if (avg-(int)avg==0){   //если число целое
      res = true;           // результат - правда
    }
    return res;
  }

}
