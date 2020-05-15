public class Task6 {
  public static void main (String [] args){
    int a1 = ctoa('A');
    int a2 = ctoa('m');
    int a3 = ctoa('[');
    int a4 = ctoa('/');

    System.out.println(a1+" "+a2+" "+a3+" "+a4);
  }

  public static int ctoa(char a) {
    int res = (char) a;
    return res;
  }
}
