public class Manager implements IManager{

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }

    @Override
    public void hire() {
        System.out.println("Getting hire...");
    }

    @Override
    public void train() {
        System.out.println("Getting train...");
    }

    @Override
    public void addBonus() {
        System.out.println("Getting the bonus at the end of the year...");
    }
    
}
