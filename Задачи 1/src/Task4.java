public class Task4 {

  public static void main (String[] args){
    boolean a1 = profitableGamble(0.2,50,9);
    boolean a2 = profitableGamble(0.9,1,2);
    boolean a3 = profitableGamble(0.9,3,2);

    System.out.println(a1+" "+a2+" "+a3);
  }

  public static boolean profitableGamble (double prob, double price, double pay){
    boolean res = false;
    if (prob*price>pay){
      res = true;
    }
    return res;
  }

}
