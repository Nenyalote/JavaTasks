public class Task3 {

  public static void main (String [] args){
    System.out.println(isPerfect(6));
    System.out.println(isPerfect(28));
    System.out.println(isPerfect(496));
    System.out.println(isPerfect(12));
    System.out.println(isPerfect(97));
  }

  public static boolean isPerfect (int n){
    boolean res = false;
    int i = n;  //делители
    int sum=0;
    while (n>1){  //пока число больше 1
      i=i-1;
      if (i==0){ //прерываем цикл при отсчете делителей равном 0
        break;
      }
      if (n%i==0){ //если число делится на делитель
        sum=sum+i; //добавляем делитель к сумме
      }
    }
    if (sum==n){  //сравниваем сумму и число
      res=true;
    }
    return res;
  }
}
