public class Task8 {

  public static void main (String [] args){
    System.out.println(isStrangePair("ratio", "orator"));
    System.out.println(isStrangePair("sparkling", "groups"));
    System.out.println(isStrangePair("bush", "hubris"));
    System.out.println(isStrangePair("", ""));
  }

  public static boolean isStrangePair(String string1, String string2){
    boolean res = false;

    if ((string1.length()==0)||(string2.length()==0)){ //если длины строк 0, сравниваем сами строки
      if (string1.equals(string1)){
        res=true;
      }
    } else { //иначе сравниваем нужные символы
      if ((string1.charAt(0)== string2.charAt(string2.length()-1))&&(string2.charAt(0)== string1.charAt(string1.length()-1))){
        res = true;
      }
    }


    return res;
  }

}
