public class Task1 {

  public static void main (String[] args){
    int a1 = remainder(1,3);
    int a2 = remainder(3,4);
    int a3 = remainder(-9,45);
    int a4 = remainder(5,5);

    System.out.println(a1+" "+a2+" "+a3+" "+a4);
  }

  public static int remainder(int a, int b){
    int res = a%b;
    return res;
  }
}
