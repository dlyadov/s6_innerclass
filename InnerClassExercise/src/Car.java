/**
 * A Car class is defined as follows:
 public abstract class Car {
 private String make;
 public abstract void start();
 public void setMake(String make) { this.make = make; }
 public String getMake() { return make ;}
 }
 Complete the assignment statement below so we can define a hybrid car object that has an
 instance variable representing battery power. In addition, the object will be associated with
 a start() method that decreases the battery power by 100 units. The initial battery power is
 3000 units. You must use an anonymous inner class.
 public static void main(String[] args) {
 Car Hybrid = // COMPLETE THIS ASSIGNMENT
 }
 */

public abstract class Car {
    private String make;
    public abstract void start();
    public void setMake(String make) { this.make = make; }
    public String getMake() { return make; }

    public static void main(String[] args)
    {
        Car hybrid = new Car() {
            int batteryPower = 3000;
            @Override
            public void start()
            {
                batteryPower -= 100;
            }
        };
    }
}


