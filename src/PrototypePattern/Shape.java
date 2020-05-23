package PrototypePattern;
//用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
public abstract class Shape implements Cloneable {
//    1.（抽象类或者接口）实现 java.lang.Cloneable 接口
    private String id;
    protected String type;
    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    // 2.定义复制现有实例来生成新实例的方法
    public  Object clone(){
        Object clone=null;
        try {
            clone=super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  clone;
    }


}
