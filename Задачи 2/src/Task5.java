public class Task5 {

  public static void main(String [] args){
    System.out.println(getDecimalPlaces("43.20"));
    System.out.println(getDecimalPlaces("400"));
    System.out.println(getDecimalPlaces("3.1"));

  }

  public static int getDecimalPlaces(String str){
    int kol = 0;
    int index = str.indexOf("."); //находим индекс точки в строке
    if (index!=-1)  //если точка присутствует в строке
      for (int i=index+1; i<str.length(); i++){ //считаем символы, начиная со следующего после точки
        kol = kol+1;
      }
    return kol;
  }

}
