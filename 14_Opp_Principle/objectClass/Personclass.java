
public class Personclass {
  private String name;
  private int age;
  private String id;

  public Personclass(String name, int age, String id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Personclass)) {
      return false;
    }
    Personclass per = (Personclass) obj;
    return this.name.equals(per.name) && this.age == per.age && this.id.equals(per.id);
  }

  @Override
  public int hashCode() {
    return Object.hash(name, age, id);

  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Personclass{");
    sb.append("name='").append(name).append('\'');
    sb.append(", age=").append(age);
    sb.append(", id='").append(id).append('\'');
    sb.append('}');
    return sb.toString();
  }

}
