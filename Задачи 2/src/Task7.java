public class Task7 {

  public static void main (String [] args){
    System.out.println(isValid("59001"));
    System.out.println(isValid("853a7"));
    System.out.println(isValid("732 32"));
    System.out.println(isValid("393939"));
  }

  public static boolean isValid(String index){
    String numbers = "0123456789"; //строка чисел
    boolean res = true;  //результат - истина

    for (int i=0; i<index.length(); i++){
      if (numbers.indexOf(index.charAt(i))==-1){ //если символ не содержится в строке чисел (если символ - не число)
        res = false;                             //результат - ложь
      }
    }

    if (index.length()!=5){  //если длина индекса не 5, результат - ложь
      res = false;
    }

    return res;
  }

}
