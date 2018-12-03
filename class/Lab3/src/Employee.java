class Employee{

    private double payPerHour; //regular hourly wage
    private double overTimePayPerHour; //regular hourly wage * 1.5
    private double basePayHours; //hours worked under regular hourly wage
    private double overTimeHours;//hours worked under overtime pay per hour
    private double totalHours; //adds basePayHours and overTimeHours
    private double totalPay;//base pay + overtime pay



    public void setPayPerHour(double x) //takes parameter 'x' a d sets that equal to this objects payPerHour variable
    {if(x < 8.0) {
    	System.out.println("This is an error because it's lower than $8 per hour. Please pay more.");}
    else {
        this.payPerHour = x;}
    }
    public double getpayPerHour() //returns this variables payPerHour variable
    {
        return this.payPerHour;
    }

    public void setOverTimePayPerHour() //calculates and sets overtime payPerHour rate
    {   
            this.overTimePayPerHour = this.payPerHour * 1.5;    
    }
    public double getOverTimePayPerHour() //returns overTimePayPerHour rate
    {
        return this.overTimePayPerHour;
    }


    public void setHours(int x) //sets hours worked into three of this objects variables, basePayHours, overTimeHours and totalHours
    { 
    	if(x > 60) {
    		System.out.println("This hour should be less than or equal to 60. Let them work less.");
    		this.basePayHours = 40;
    		this.overTimeHours = x - 40;
    	}
    	else if(x > 40){
            this.basePayHours = 40;
            this.overTimeHours = x - 40;
        }
        else{
            this.basePayHours = x;
            this.overTimeHours = 0;
        }
       

        this.totalHours = this.basePayHours + this.overTimeHours;

    }

    public double getBasePayHours()//returns this object's basePayHours value
    {
        return this.basePayHours; 
    }
    public double getOverTimeHours()//returns this object's overTimeHours value
    {
        return this.overTimeHours; 
    }
    public double getTotalHours()  //returns this object's totalHours value
    {
        return this.totalHours;
    }


    public void calculateTotalPay(){ //calculates this Employee objects total pay and sets it's totalPlay variable to that value
        double basePay = this.getBasePayHours() * this.getpayPerHour();  //calculates basePay
        double overTimePay = this.getOverTimeHours() * this.getOverTimePayPerHour(); //calculates overTimePay
        this.totalPay = basePay + overTimePay;//sets value of this object's totalPay to the sum of basePay and overTimePay
    }
    public double getTotalPay()
    {
        return this.totalPay; //returns this object's totalPay value
    }


}