public class Task8 {

  public static void main (String [] args){
    int a1 = nextEdge(8,10);
    int a2 = nextEdge(5,7);
    int a3 = nextEdge(9,2);

    System.out.println(a1+" "+a2+" "+a3);
  }

  public static int nextEdge(int a,int b) {
    int c = a+b-1;
    return c;
  }

}
