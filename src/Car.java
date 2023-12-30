public class Car extends Vehicle{
    private int fuelCapacity;
    private int currentFuelLevel;

    enum State {
        On, Off;
    }

    private State state;


    public Car(String brand, String model, int year, int fuelCapacity) {
        super(brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = 10;
        this.state = State.Off;
    }

    public void power() {
        if(state == State.Off) {
            this.startEngine();
            this.state = State.On;
        }
        else {
            this.stopEngine();
            this.state = State.Off;
        }
    }

    @Override
    protected void startEngine() {
        System.out.println("Двигатель автомобиля запущен");
    }

    @Override
    protected void stopEngine() {
        System.out.println("Двигатель автомобиля остановлен");
    }


    @Override
    public void brake() {
        currentSpeed = 0;
        System.out.println("Движение автомобиля прекращено");
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    @Override
    public void refuel(int liters) {
        if (getCurrentFuelLevel() + liters <= getFuelCapacity()) {
            this.currentFuelLevel = getCurrentFuelLevel() + liters;
            System.out.println("Уровень топлива увеличен до: " + getCurrentFuelLevel());
        } else {
            System.out.println("Бак полон. Уровень топлива увеличен на: " + (getFuelCapacity() - getCurrentFuelLevel()));
        }
    }
    @Override
    void displayInfo() {
        System.out.println(String.format(super.getInfo() + " Fuel capacity: %d,  Current fuel: %d ", getFuelCapacity(),
                getCurrentFuelLevel()));
    }
}
