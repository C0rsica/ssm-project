package create.prototype;

/**
 * @author corsica
 * @date 2018/4/9
 * @time 下午12:16
 */
public class Resume implements Cloneable {


  private String name;
  private String gender;
  private int age;

  private String content;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Resume(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public static void main(String[] args) throws CloneNotSupportedException {
    Resume lucy = new Resume("lucy");
    lucy.setAge(12);
    lucy.setContent("lucy 's lonng");

    Resume lily = (Resume) lucy.clone();//new Resume("lily");
    lily.setAge(11);
    lily.setContent("lily 's lonng");

    Resume tom = (Resume) lily.clone();// new Resume("tom");
    tom.setContent("tom 's lonng");
    tom.setAge(10);

    System.out.println(lucy);
    System.out.println(lily);
    System.out.println(tom);
  }


  @Override
  public String toString() {
    return "Resume{" +
        "name='" + name + '\'' +
        ", gender='" + gender + '\'' +
        ", age=" + age +
        ", content='" + content + '\'' +
        '}';
  }
}
