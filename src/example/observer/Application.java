package example.observer;

public class Application {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(new Observer());
        subject.attach(new Observer());

        subject.notify_data();
    }
}
