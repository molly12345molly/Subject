package Observers;

public class HexaOberver extends Observer {
    public HexaOberver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(Integer.toHexString(subject.getState()));
    }
}
