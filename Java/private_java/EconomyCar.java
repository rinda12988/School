class EconomyCar extends Car{

    
    public void drive(int gas){
        this.gas -= gas;
        System.out.println("The car ran"+ gas * 20 + "km.");
    }
}