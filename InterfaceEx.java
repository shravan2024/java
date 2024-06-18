package inheritance;

interface ICalculation
{
	int ROI=12;
	default void SI(int p,int n)
	{
		int res=(p*n*ROI)/100;
		System.out.println(res);
	}
	static void si(int p,int n)
	{
		int res=(p*n*ROI)/100;
		System.out.println(res);
	}
	void call();

}
interface ICalculator
{
    void call();
}
class Sample implements ICalculation,ICalculator
{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("from interface");
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {

Sample s=new Sample();
s.call();
s.SI(10000,2);
ICalculation.si(200000, 3);
	}

}