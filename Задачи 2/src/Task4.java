public class Task4 {
  public static void main(String[] args){

    int[] array1 = {1,2,3};
    int[] array2 = {1,-2,3};
    int[] array3 = {3,3,-2,408,3,3};

    for (int i=0; i<array1.length; i++){
      System.out.print(cumulativeSum(array1)[i]+" ");
    }
    System.out.println();

    for (int i=0; i<array2.length; i++){
      System.out.print(cumulativeSum(array2)[i]+" ");
    }
    System.out.println();

    for (int i=0; i<array3.length; i++){
      System.out.print(cumulativeSum(array3)[i]+" ");
    }
    System.out.println();

  }

  public static int[] cumulativeSum (int [] array){
    int sum = 0;
    int[] arrayNew = new int[array.length]; //создаем новый массив
    for (int i=0; i<array.length; i++){
      sum = sum+array[i];
      arrayNew[i] = sum;  //добавляем элементы, значения которых совпадают с текущими суммами изначального массива
    }
    return arrayNew;
  }


}
