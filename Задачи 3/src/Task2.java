public class Task2 {

  public static void main (String [] args){
    System.out.println(findZip("all zip files are zipped"));
    System.out.println(findZip("all zip files are compressed"));
  }

  public static int findZip (String s){
    int firstZip = s.indexOf("zip");
    int secondZip = s.indexOf("zip", firstZip+3);
    return secondZip;
  }

}
