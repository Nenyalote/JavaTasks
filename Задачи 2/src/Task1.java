public class Task1 {

  public static void main (String [] args){
    System.out.println(repeat("mice",5));
    System.out.println(repeat("hello",3));
    System.out.println(repeat("stop",1));
  }

  public static String repeat(String str, int n){
    String res = ""; //обнуляем результат
    for (int i=0; i<str.length(); i++){ //идем по символам строки
      for (int j=0; j<n; j++){
        res = res + str.charAt(i);  //прибавляем текущий символ строки n раз
      }
    }
    return res;
  }

}
