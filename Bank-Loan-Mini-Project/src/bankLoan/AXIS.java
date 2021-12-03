package bankLoan;

public class AXIS implements RBI {
	float p,d;
	void accept()
	{
		System.out.println("\n\nWELCOME to Axis BANK");
		System.out.println("*********************************AXIS************************************");
		System.out.println("\nEnter Principal amount :");
	p = sc.nextFloat();
	System.out.println("Enter duration");
	d =sc.nextFloat();
	}

@Override
public float calculteintrest() 
{
	accept();
	return (p*d*axis_irate/100);
}
}
