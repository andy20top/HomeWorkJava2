public class Boat extends Vehicle implements Swimmable {

    int maxSpeed;
    boolean isSailing;
    enum State {
        On, Off;
    }

    private Boat.State state;

    public Boat(String brand, String model, int year, int maxSpeed) {
        super(brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = false;
        this.state = Boat.State.Off;
    }


    @Override
    void displayInfo() {
        System.out.println(String.format(super.getInfo() + " Max high: %d, Flying: %s ",
                getMaxSpeed(), getSailing()));
    }

    @Override
    public void power() {
        if(state == Boat.State.Off) {
            this.startEngine();
            this.state = Boat.State.On;
        }
        else {
            this.stopEngine();
            this.state = Boat.State.Off;
        }
    }

    @Override
    public void startSwimming() {
        this.isSailing = true;
        System.out.println("Начало движения");
    }

    @Override
    public void stopSwimming() {
        this.isSailing = false;
        System.out.println("Остановка движения");
    }

    @Override
    protected void startEngine() {
        System.out.println("Двигатель лодки запущен");
    }

    @Override
    protected void stopEngine() {
        System.out.println("Двигатель лодки остановлен");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getSailing() {
        if(isSailing) {
            return "Осуществляется движение";
        }
        return "Движение не осуществлятся";
    }

}
