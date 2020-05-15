public class Task3 {

  public static void main (String[] args){
    int a1 = animals(2,3,5);
    int a2 = animals(1,2,3);
    int a3 = animals(5,2,8);

    System.out.println(a1+" "+a2+" "+a3);
  }

  public static int animals(int ch, int c, int p){
    int res = (ch*2)+((c+p)*4);
    return res;
  }
}
