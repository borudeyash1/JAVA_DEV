import java.math.*;
class Packages
{

public static void main(String[] args)
	{
		int a, b;
		double c, d, e, f, g;
		int[] z = {1,2,3,4,5,6};
		a=10;					
		b=3;

				//Power function: 10^3
        c = Math.pow(10, 3);
        System.out.println("10 raised to the power of 3: " + c);

        //Square root of 10
        e = Math.sqrt(10);
        System.out.println("Square root of 10: " + e);

        //Absolute value of -10
        d = Math.abs(-200);
        System.out.println("Absolute value of -200: " + d);

        //Maximum of two numbers
        f = Math.max(a, b);
        System.out.println("Maximum of " + a + " and " + b + ": " + f);

        //Minimum of two numbers
        g = Math.min(a, b);
        System.out.println("Minimum of " + a + " and " + b + ": " + g);
        
        //Trigonometry
        
        double angle = Math.toRadians(45);                // Converting  degrees to radians
        
        double sinValue = Math.sin(angle);
        double cosValue = Math.cos(angle);
        double tanValue = Math.tan(angle);
        System.out.println("Sin(45°): " + sinValue);
        System.out.println("Cos(45°): " + cosValue);
        System.out.println("Tan(45°): " + tanValue);
        
        
        //Exponentiation using Math.exp (e^x)
        double expValue = Math.exp(1); // e^1
        System.out.println("Exponent of 1 (e^1): " + expValue);
        
        //Logarithmic function (natural log of x)
        double logValue = Math.log(10); // Natural log (ln) of 10
        System.out.println("Natural log of 10: " + logValue);
        
        //Base 10 logarithm
        double log10Value = Math.log10(10); // Log base 10 of 1000
        System.out.println("Log base 10 of 10: " + log10Value);
        
        //square of a number
        double square = Math.pow(5, 2);
        System.out.println("Square of 5: " + square);

        //cube root
        double cubeRoot = Math.cbrt(125);
        System.out.println("Cube root of 27: " + cubeRoot);

      }
}
