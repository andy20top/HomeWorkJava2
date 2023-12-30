public abstract class Vehicle {
    protected static int id;
    protected String brand;
    protected String model;
    protected int year;

    static {
        Vehicle.id = 0;
    }

    protected int currentSpeed = 0;


    public Vehicle(String brand, String model, int year) {
        this.id++;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    protected void startEngine() {
        System.out.println("Двигатель запущен");
    }

    protected void stopEngine() {
        System.out.println("Двигатель остановлен");
    }

    public void accelerate(int speed) {
        currentSpeed += speed;
    }

    public void brake() {
        currentSpeed = 0;
        System.out.println("Движение прекращено");
    }

    public void refuel(int liters) {
        System.out.println("Топливо заправлено");
    }

    abstract void displayInfo();


    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    protected String getInfo() {
        return String.format("id: %d, Brand: %s, Model: %s, Year: %d, Speed: %d,",
                getId(), getBrand(), getModel(), getYear(), currentSpeed);
    }

    public abstract void power();


}
