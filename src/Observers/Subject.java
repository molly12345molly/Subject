package Observers;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    //new一个新的集合里面，放满了观察者
    private List<Observer> observers=new ArrayList<Observer>();
    //封装一个状态
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
//添加进list之中 元素
//    public void attach(Observer observer){
//        observers.add(observer);
//    }
    public void  attach(Observer observer){
        observers.add(observer);
    }
//    接口中的方法observers
    public  void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
