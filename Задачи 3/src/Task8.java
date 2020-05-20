public class Task8 {

  public static void main (String[] args){
    System.out.println(longestZero("01100001011000"));
    System.out.println(longestZero("100100100"));
    System.out.println(longestZero("11111"));

  }

  public static String longestZero(String str){
    int zeroCount = 0;
    int maxCount = 0;

    for (int i=0; i<str.length(); i++){ //идем по строке
      if (str.charAt(i)=='0'){  //если символ - 0, добавляем 1 к числу нулей
        zeroCount=zeroCount+1;
      } else {  //если нет, сравниваем число нулей с максимальным, и если текущее больше, записываем его в максимальное
        if (zeroCount>maxCount){
          maxCount=zeroCount;
        }
        zeroCount=0; //обнуляем число нулей
      }
    }
    if (zeroCount>maxCount){ //если строка закончена 0, последняя проверка может не выполниться, поэтому проверяем еще раз
      maxCount=zeroCount;
    }

    String res =""; //добавляем к пустой строке результата максимальное найденное число нулей
    for(int i=0; i<maxCount; i++){
      res = res+"0";
    }
    return res;
  }

}
