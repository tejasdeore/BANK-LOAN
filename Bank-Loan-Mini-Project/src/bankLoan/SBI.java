package bankLoan;

public class SBI implements RBI 
{
	float p,d;
	void accept()
	{	
		System.out.println("\n\nWELCOME TO SBI, we are happy to help you");
		System.out.println("*******************************SBI**************************************");
		System.out.println("Enter Principal amount :");
		p = sc.nextFloat();
		System.out.println("Enter duration");
		d =sc.nextFloat();
		}

	@Override
	public float calculteintrest() 
	{
		accept();
		return (p*d*sbi_irate/100);
	}

}
