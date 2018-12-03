import java.awt.geom.CubicCurve2D.Double;

public class Salary{
    public static void main(String [] args){
        double E1pay = 7.5;
        double E2pay = 8.2;
        double E3pay = 10.00;
        double E1hour = 35.0;
        double E2hour = 47.0;
        double E3hour = 73.0;

        // double Maxhour = 60.0;
        // double Minwage = 8.0;

		if(E1pay < 8.0 && E1hour < 60){
            System.out.println(E1pay*E1hour);
        }else{
            System.out.println("error");
        }
        if(E2pay < 8.0 && E2hour < 60){
            System.out.println(E2pay*E2hour);
        }else{
            System.out.println("error");
        }
        if(E3pay < 8.0 && E3hour < 60){
            System.out.println(E3pay*E3hour);
        }else{
            System.out.println("error");
        }

    




    }
}