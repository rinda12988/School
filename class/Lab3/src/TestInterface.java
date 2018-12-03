class TestInterface{  
	public static void main(String[] args){  
		Scotia s = new Scotia(); // Creating Scotia class constructor instance to apply Scotia class method.
		TDBank t = new TDBank(); // Creating TDBank class constructor instance to apply TDBank class method.
		System.out.println("Scotia Bank's ROI: "+s.rateOfInterest()); 
		System.out.println("TD Bank's ROI: "+t.rateOfInterest());  
	}
}  