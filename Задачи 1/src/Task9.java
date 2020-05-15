public class Task9 {

  public static void main (String [] args){
    int [] array1 = {1,5,9};
    int [] array2 = {3,4,5};
    int [] array3 = {2};
    int [] array4 = {};

    int a1 = sumOfCubes(array1);
    int a2 = sumOfCubes(array2);
    int a3 = sumOfCubes(array3);
    int a4 = sumOfCubes(array4);

    System.out.println(a1+" "+a2+" "+a3+" "+a4);
  }

  public static int sumOfCubes (int [] array) {
    int sum = 0;
    for (int i=0; i<array.length; i++){
      sum = sum+((array[i])*(array[i])*(array[i]));
    }
    return sum;
  }

}
