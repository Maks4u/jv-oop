package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer do some work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stop working");
    }
}