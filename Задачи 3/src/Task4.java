public class Task4 {

  public static void main (String [] args){
    System.out.println(flipEndChars("Cat, dog, and mouse."));
    System.out.println(flipEndChars("ada"));
    System.out.println(flipEndChars("Ada"));
    System.out.println(flipEndChars("z"));

  }

  public static String flipEndChars (String str){
    char [] strArray = new char[str.length()];
    if ((str.length()>=2)&&(str.charAt(0)!=str.charAt(str.length()-1))){  //если длина 2 и больше и если первый и последний символ не совпадают
      for (int i=0; i<str.length(); i++){ //создаем массив из строки
        strArray[i]=str.charAt(i);
      }
      char firstChar = strArray[0];      //меняем местами первую и последнюю букву
      strArray[0]=strArray[strArray.length-1];
      strArray[strArray.length-1]=firstChar;

      str= new String(strArray);  //снова делаем из массива строку
    }
    if (str.length()<2){  //при длине меньше 2
      str = "Incompatible.";
    }

    if (str.charAt(0)==str.charAt(str.length()-1)){ //при совпадающих первом и последнем символах
      str = "Two's a pair.";
    }

    return str;
  }

}
