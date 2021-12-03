package bankLoan;

import java.util.Scanner;

public interface RBI 
{
	static Scanner sc =new Scanner (System.in);

	float sbi_irate  = 6.7f;
	float axis_irate = 6.2f;
	float pnb_irate  = 5.9f;
	
	float calculteintrest();
	
}
