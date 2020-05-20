public class Task6 {

  public static void main(String [] args){
    System.out.println(Fibonacci(3));
    System.out.println(Fibonacci(7));
    System.out.println(Fibonacci(12));
  }

  public static int Fibonacci(int n){
    int sum = 0;
    int prevNum2 = 0;   //число перед предыдущим к текущему
    int prevNum1 = 1;   //число предыдущее текущему
    for (int i=0; i<n; i++){
      sum = prevNum2+prevNum1;  //текущее число
      prevNum2 = prevNum1;  //сдвигаемся по ряду вправо
      prevNum1 = sum;     //добавляем в ряд текущее число
    }
    return sum;
  }
}
