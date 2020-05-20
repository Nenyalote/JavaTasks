import java.lang.Math;

public class Task7 {

  public static void main (String [] args){
    System.out.println(isKaprekar(3));
    System.out.println(isKaprekar(5));
    System.out.println(isKaprekar(297));

  }

  public static boolean isKaprekar(int num){
    boolean res = false;
    int numKol = 0;
    int dif;
    int step;
    int step10;
    int Right;
    int Left;

    int numxnum = num*num; //возводим число в квадрат
    int num1 = numxnum;

    while (num1>0){  //считаем количество цифр в квадрате числа
      dif = (num1%10);
      num1 = (num1-dif)/10;
      numKol=numKol+1;
    }

    if ((numKol%2==0)&&(numKol>1)){  //если количество цифр - четное
      step = numKol/2;  //делим количество цифр пополам
      step10=(int)Math.pow(10,step);  //в получившуюся степень возводим 10
      Right = numxnum%(step10);  //получаем для правой части остаток от деления на 10 в степени
      Left = (numxnum-Right)/step10; //левую часть выделяем, вычитая из квадрата числа правую часть и делим разность на степень 10
      if ((Left+Right)==num){ //если сумма правой и левой частей равна изначальному числу
        res = true;  //результат - истина
      }
    }

    if ((numKol%2!=0)||(numKol==1)){ //в случае, если количество нечетно, добавляем к нему 1 и повторяем алгоритм
      step = (numKol+1)/2;
      step10 = (int)Math.pow(10,step);
      Right = numxnum%(step10);
      Left = (numxnum-Right)/step10;
      if ((Left+Right)==num){
        res = true;
      }
    }

    return res;
  }

}
