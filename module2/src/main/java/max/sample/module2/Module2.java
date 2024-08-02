package max.sample.module2;

public class Module2 implements Runnable {

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName());
    }
}
