package Observers;

public class ObserverPatternDemo {
    public static void main(String[] args){
        Subject subject=new Subject();

        new HexaOberver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("first state changes 15");
        subject.setState(15);
        System.out.println("second state change:10");
        subject.setState(10);

    }
}
