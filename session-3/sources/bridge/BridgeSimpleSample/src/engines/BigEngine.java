package engines;

public class BigEngine implements Engine {

    @Override
    public int getHorsePower() {
        return 350;
    }

    @Override
    public void go() {
        System.out.println("The big engine is running");
    }
}
