import java.lang.Math;

public class Task1 {

  public static void main (String [] args){
    System.out.println(solutions(1,0,-1));
    System.out.println(solutions(1,0,0));
    System.out.println(solutions(1,0,1));
  }

  public static int solutions(int a, int b, int c){

    int num=0;
    double dis = b*b-4*a*c; //ищем дискриминант

    if (dis>0){ //определяем дискриминант по количеству корней
      num=2;

    }

    if (dis<0){
      num=0;
    }

    if (dis==0){
      num=1;
    }

    return num;
  }

}
