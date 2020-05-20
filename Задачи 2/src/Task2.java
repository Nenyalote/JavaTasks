public class Task2 {

  public static void main(String[] args){

    int[] array1 = {10, 4, 1, 4, -10, -50, 32, 21};
    int[] array2 = {44, 32, 86, 19};
    System.out.println(differenceMaxMin(array1));
    System.out.println(differenceMaxMin(array2));

  }

  public static int differenceMaxMin(int [] array){
    int max = array[0];
    int min = array[0];

    for (int i=1; i<array.length; i++){ //ищем максимальный и минимальный элементы
      if (array[i]>max){
        max = array[i];
      }
      if (array[i]<min){
        min = array[i];
      }
    }

    int res = max-min;
    return res;
  }

}
