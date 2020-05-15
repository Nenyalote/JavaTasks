public class Task10 {

  public static void main (String [] args){
    boolean a1 = abcmath(42,5,10);
    boolean a2 = abcmath(5,2,1);
    boolean a3 = abcmath(1,2,3);

    System.out.println(a1+" "+a2+" "+a3);
  }

  public static boolean abcmath (int a, int b, int c) {
    int sum = a;
    for (int i=0; i<b; i++){
      sum = sum+sum;
    }
    boolean res = false;
    if (sum%c==0)
      res = true;
    return res;
  }

}
