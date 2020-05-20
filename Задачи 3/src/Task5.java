public class Task5 {

  public static void main(String [] args){
    System.out.println(isValidHexCode("#CD5C5C"));
    System.out.println(isValidHexCode("#EAECEE"));
    System.out.println(isValidHexCode("#eaecee"));
    System.out.println(isValidHexCode("#CD5C58C"));
    System.out.println(isValidHexCode("#CD5C5Z"));
    System.out.println(isValidHexCode("#CD5C&C"));
    System.out.println(isValidHexCode("CD5C5C"));

  }
  public static boolean isValidHexCode(String str){
    boolean res = true;  //результат - истина

    String numbers = "1234567890";
    String alphabet = "abcdef";
    String ALPHABET = "ABCDEF";


    for (int i=1; i<str.length();i++){  //проверяем каждый символ строки, если его нет ни среди цифр, ни среди букв(больших или маленьких), то результат - ложь
      if ((numbers.indexOf(str.charAt(i))==-1)&&(alphabet.indexOf(str.charAt(i))==-1)&&(ALPHABET.indexOf(str.charAt(i))==-1)){
        res = false;
      }
    }

    if((str.length()!=7)||(str.indexOf("#")!=0)){  //при длине строки 6, а первом символе = #
     res=false;
    }

    return res;
  }

}
