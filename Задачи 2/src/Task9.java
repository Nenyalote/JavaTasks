public class Task9 {

  public static void main (String [] args){
    System.out.println(isPrefix("automation", "auto-"));
    System.out.println(isSuffix("arachnophobia", "-phobia"));
    System.out.println(isPrefix("retrospect", "sub-"));
    System.out.println(isSuffix("vocation", "-logy"));
  }

  public static boolean isPrefix(String slovo, String prefix){
    boolean res = false;
    String prefixUsable="";
    for (int i=0; i<prefix.length()-1; i++){ //перезаписываем префикс без символа "-"
      prefixUsable=prefixUsable+prefix.charAt(i);
    }

    if (slovo.indexOf(prefixUsable)==0){ //если строка начинается с префикса, результат - истина
      res=true;
    }

    return res;
  }

  public static boolean isSuffix(String slovo, String suffix){
    boolean res = false;
    String suffixUsable="";
    for (int i=1; i<suffix.length(); i++){ //перезаписываем префикс без символа "-"
      suffixUsable=suffixUsable+suffix.charAt(i);
    }

    if (slovo.lastIndexOf(suffixUsable,slovo.indexOf(suffixUsable))+suffixUsable.length()-1==slovo.length()-1){ //если строка заканчивается суффиксом, результат - истина
      res=true;
    }

    return res;
  }

}
