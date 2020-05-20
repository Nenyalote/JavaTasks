public class Task10 {

  public static void main(String [] args){
    System.out.println(boxSeq(0));
    System.out.println(boxSeq(1));
    System.out.println(boxSeq(2));

  }

  public static int boxSeq(int num){

    int [] procedure = new int [num+1]; //массив со значениями последовательности, нулевой элемент - 0
    procedure[0]=0;
    for (int i=1; i<procedure.length; i++){ //заполняем массив с первого элемента.
      if ((i%2!=0)||(i==1)){     //Если итерация (шаг) нечетный, к предыдущему элементу массива добавляем 3 и записываем в текущий элемент
        procedure[i]=procedure[i-1]+3;
      } else {          //Если итерация (шаг) четный, из предыдущего элемента массива вычитаем 1 и записываем в текущий элемент
        procedure[i]=procedure[i-1]-1;
      }
    }

    return(procedure[num]);
  }

}
