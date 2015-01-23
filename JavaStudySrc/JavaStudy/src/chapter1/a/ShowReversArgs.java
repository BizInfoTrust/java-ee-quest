package chapter1.a;

public class ShowReversArgs {

	public static void main(String[] args) {
		if (args==null || args.length==0)	{
			System.err.println("args[] not defined!");
		}
		
		for(int i = args.length-1; i >= 0; i--)	{
			System.out.println(args[i]);
		}
		
	}

}
