class Car{
    int gas = 60; //ガソリン

    // The car runs with gas
    public void drive(int gas){
        this.gas -= gas;
        System.out.println("the car run" + gas * 10 + "km");
    }

    // refuel　gas
    public void putGas(int gas){
        this.gas += gas;
        System.out.println("I refueled " + gas + "L");
    }

    // output gas of value
    public void checkGas(){
        System.out.println("The gus" + this.gas + "left");
    }
}