package bankLoan;

public class PNB implements RBI
{
	float p,d;
	void accept()
	{
		System.out.println("\n\nWELCOME to Punjab National BANK , stay connected..");
		System.out.println("**********************************PNB***********************************");
		System.out.println("Enter Principal amount :");
	p = sc.nextFloat();
	System.out.println("Enter duration");
	d =sc.nextFloat();
	}

@Override
public float calculteintrest() 
{
	accept();
	return (p*d*pnb_irate/100);
}
}
