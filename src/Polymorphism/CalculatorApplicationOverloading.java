package Assignment2Polymorphism;

class Calculator
{
	int calculate(int a,int b)
	{
		return a+b;
	}
	double calculate(double a, double b)
	{
		return a+b;
	}
	int calculate(int a, int b, int c)
	{
		return a+b+c;
	}
	double calculate(double a, double b, double c)
	{
		return a+b+c;
	}
	int calculate(int a,int b, char op)
	{
		if(op == '-')
		{
			return a-b;
        }
	return 0;
	}
	int calculate(int a,int b, String op )
	{
		if(op =="*")
		{
			return a*b;
		}
		return 0;
	}
	double calculate(double a, double b, String op)
	{
		if(op == "/" && b!=0)
		{
			return a/b;
		}
		return 0;
	}
}
//----------------------------------------------------------
public class CalculatorApplicationOverloading 
{

	public static void main(String[] args) 
	{
		Calculator cal =new Calculator();
		System.out.println("Calculator Application : ");
		System.out.println("Add 2 Integer : " + cal.calculate(7,6));
		
		System.out.println("xxxxxxxxxx");
		System.out.println("Add 2 Double : " + cal.calculate(8.6,7.4));
		
		System.out.println("xxxxxxx");
		System.out.println("Add 3 Integer : " + cal.calculate(12,42,57));
		
		System.out.println("xxxxxx");
		System.out.println("Add 3 Double : " + cal.calculate(7.3,6.3,8.2));
		
		System.out.println("xxxxxxxx");
		System.out.println("Substraction : " + cal.calculate(89,45,'-'));
		
		System.out.println("xxxxxxx");
		System.out.println("Multiplication : " + cal.calculate(65,5,"*"));

		System.out.println("xxxxxx");
		System.out.println("Division : " + cal.calculate(8.7,6.8,"/"));
	}

}
