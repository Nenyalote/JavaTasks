public class Task2 {

  public static void main (String[] args){
    int a1 = TriArea(3,2);
    int a2 = TriArea(7,4);
    int a3 = TriArea(10,10);

    System.out.println(a1+" "+a2+" "+a3);
  }

  public static int TriArea(int a, int h){
    int res = (h*a)/2;
    return res;
  }
}
