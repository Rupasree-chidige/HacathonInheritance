public  class Car extends Vehicle{

    protected int milage;

    public int getGear() {
        return gear;
    }

    protected int gear;
    protected String fuelType;

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMilage() {
        return milage;
    }
    public String getFuelType() {
        return fuelType;
    }


    public void changeGear(int changegear)
    {
        if(this.gear<changegear) {
            this.gear=changegear;
            increaseSpeed();
        }
        else{
            this.gear=changegear;
            decreaseSpeed();
        }

    }

    private void decreaseSpeed() {
        System.out.println("Decrease Speed");
    }

    public void handSteering()
    {
        System.out.println("Steering a car");
    }
    public void increaseSpeed()
    {
        System.out.println("Car speed increased");
    }


}
