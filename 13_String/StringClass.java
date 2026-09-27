
public class StringClass {

  public static void main(String[] args) {
    StringUtility k = new StringUtility("asharf", 17, 23, 1122036);
    System.out.println(k);

    String str1 = "abc";
    String str2 = "abc";
    String a = "A";
    String b = a + "J";
    String name = "ashraf";
    String name1 = "ashraf";
    System.out.println(name.substring(0, 3));
    System.out.println(name.replace("a", "j"));
    System.out.println(name.indexOf("s"));
    System.out.println(name.contains("a"));
    System.out.println(name.equals(name1));
    // ************************************************************
    // System.out.println(b);
    // System.out.println(str1.toUpperCase());
    String stdname = "ashraf";
    int marks = 98;
    System.out.printf("my name is %s and i get %d ", stdname, marks);

  }
}
