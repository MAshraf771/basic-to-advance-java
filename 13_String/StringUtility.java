
public class StringUtility {
  String name;
  int age;
  int id;
  long role_no;

  StringUtility(String name, int age, int id, long role_no) {

    this.name = name;
    this.age = age;
    this.id = id;
    this.role_no = role_no;

  }

  @Override
  public String toString() {
    return "name:" + name + ", age:" + age;
  }

}
