package engines;


public class SmallEngine implements Engine {

    @Override
    public int getHorsePower() {
        return 100;
    }

    @Override
    public void go() {
        System.out.println("The small engine is running");
    }

}
