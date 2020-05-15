public class Task5 {

  public static void main (String [] args){
    String a1 = operation(24,15,9);
    String a2 = operation(24,26,2);
    String a3 = operation(15,11,11);
    String a4 = operation(12,3,4);
    String a5 = operation(3,15,5);

    System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5);
  }

  public static String operation(int n, int a, int b) {
    String res = "none";
    if(a*b==n){
      res = "multiplied";
    }

    if((a/b==n)||(b/a==n)){
      res = "divided";
    }

    if(a+b==n){
      res = "added";
    }

    if((a-b==n)||(b-a==n)){
      res = "subtracted";
    }

    return res;
  }

}
