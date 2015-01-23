package chapter1.a;

public class IntsAsArgs {

	public static void main(String[] args) {
		if (args==null || args.length==0)	{
			System.err.println("args not defined!");
			return;
		}
		
		int sum = 0;
		int mult = 0;
		
		for (int i = 0; i<args.length; i++)		{
			try	{
				int val = Integer.valueOf(args[i]).intValue();
				if (i==0)
					mult = val;
				else
					mult *= val;
				
				sum += val;	
			} catch(NumberFormatException nfe)	{
				
			}
						
		}
		
		System.out.println("sum: " + sum);
		System.out.println("mult: " + mult);
	}

}
