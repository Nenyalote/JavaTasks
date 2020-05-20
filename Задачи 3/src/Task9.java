public class Task9 {

  public static void main (String [] args){
    System.out.println(nextPrime(12));
    System.out.println(nextPrime(24));
    System.out.println(nextPrime(11));

  }

  public static int nextPrime (int num){

    int delCounter = 0;
    boolean isPrime;

    for (int i=1; i<=num; i++){  //проверяем полученное число. Смотрим делители от 1 до самого числа
      if (num%i==0){  //если число делится на делитель
        delCounter=delCounter+1;  //прибавляем 1 к счетчику делителей
      }
  }
    if (delCounter>2){ //если число делится на более чем 2 делителя (1 и само число)
      isPrime=false; //число не простое
    } else {
      isPrime=true; //иначе, простое
    }

    delCounter=0; //обнуляем счетчик делителей

    while (isPrime==false){ //пока число не простое, прибавляем к нему 1
      num=num+1;
      for (int i=1; i<=num; i++){  //повторяем алгоритм
        if (num%i==0){
          delCounter=delCounter+1;
        }
      }
      isPrime=true;
      if (delCounter>2){
        isPrime=false;
      }
      delCounter=0;
    }

    return num;
  }

}
