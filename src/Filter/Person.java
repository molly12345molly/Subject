package Filter;

public class Person {
    private String name;
    private String gender;
    private String maritalStatus;
//构造的意思是：构造方法是用来初始化的,这句勉强没错,可构造方法是用来创建对象的,这句就错了,
// 实际上,在构造方法执行之前,类的内存空间已经开辟完成了,意思就是说对象已经创建了,这步是由new关键字来完成的,而构造方法的作用是给类中的变量进行初始化赋值
    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
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

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
