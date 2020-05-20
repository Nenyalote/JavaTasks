public class Task10 {

  public static void main(String [] args){
    System.out.println(rightTriangle(3, 4, 5));
    System.out.println(rightTriangle(145, 105, 100));
    System.out.println(rightTriangle(70, 130, 110));

  }

  public static boolean rightTriangle(int a,int b, int c){
    boolean res = false;
    int max=a; //ищем максимальное из полученных значений

    if (b>max){
      max=b;
    }

    if (c>max){
      max=c;
    }

    if ((a==max)&&((b*b+c*c)==a*a)){ //проверяем по теореме Пифагора
      res=true;
    }

    if ((b==max)&&((a*a+c*c)==b*b)){
      res=true;
    }

    if ((c==max)&&((b*b+a*a)==c*c)){
      res=true;
    }

    return res;
  }

}
