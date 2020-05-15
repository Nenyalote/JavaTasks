public class Task7 {

  public static void main (String [] args){
    int a1 = addUpTo(3);
    int a2 = addUpTo(10);
    int a3 = addUpTo(7);

    System.out.println(a1+" "+a2+" "+a3);
  }

  public static int addUpTo(int n) {
    int sum = 0;
    for (int i=1; i<=n; i++){
      sum = sum+i;
    }
    return sum;
  }

}
