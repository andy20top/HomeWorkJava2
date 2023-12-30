public class Aircraft extends Vehicle implements Flyable {

    int maxAltitude;
    boolean isFlying;
    enum State {
        On, Off;
    }

    private State state;

    public Aircraft(String brand, String model, int year, int maxAltitude) {
        super(brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = false;
        this.state = State.Off;
    }


    @Override
    void displayInfo() {
        System.out.println(String.format(super.getInfo() + " Max high: %d, Flying: %s ",
                getMaxAltitude(), getFlying()));
    }

    @Override
    public void power() {
        if(state == Aircraft.State.Off) {
            this.startEngine();
            this.state = Aircraft.State.On;
        }
        else {
            this.stopEngine();
            this.state = Aircraft.State.Off;
        }
    }

    @Override
    public void takeOff() {
        isFlying = true;
        System.out.println("Взлет самолета");
    }

    @Override
    public void land() {
        this.isFlying = false;
        System.out.println("Совершена посадка");
    }


    protected void startEngine() {
        System.out.println("Двигатель самолета запущен");
    }


    protected void stopEngine() {
        System.out.println("Двигатель самолета остановлен");
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public String getFlying() {
        if(isFlying) {
            return "Осуществляется полет";
        }
        return "Взлет не осуществлен";
    }
}
