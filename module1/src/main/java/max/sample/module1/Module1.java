package max.sample.module1;

import max.sample.module2.Module2;

public class Module1 {

    public static void main(String[] args) {
        new Thread(new Module2()).start();
    }
}
