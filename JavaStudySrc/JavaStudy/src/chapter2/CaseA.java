package chapter2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.regex.Pattern;
import java.io.Console;

public class CaseA 	{

	private final static int STR_COUNT = 1;
	private final static String sDeveloper = "S.Yevochko";
	private final static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");

	public class StrLenComparator implements Comparator<String>	{
		public int compare(String s1, String s2)	{
			if (s1==null && s2==null)
				return 0;
			else if (s1==null)
				return -1;
			else if (s2==null)
				return 1;
			else
				return s1.length()-s2.length();
		}
	}

	public static void main(String args[]) throws ParseException	{
		CaseA ca = new CaseA();


		String[] res = getConsoleStrings(STR_COUNT);

		ca.a5(res);

		//		ca.a4(res);
		//		ca.a1(res);
		//		System.out.println("=======================================================================");
		//		ca.a2(res);
		//		System.out.println("=======================================================================");
		//		ca.a3(res);
		//		System.out.println("=======================================================================");

		System.out.println("Developer is " + sDeveloper);
		System.out.println("Begin at " + sdf.format(sdf.parse("04.01.2015 15:25:00")) );
		System.out.println("End at " + sdf.format(new Date()) );
	}

	private static String[] getConsoleStrings(int n)	{
		String[] ret = new String[n];

		Console con = System.console();
		if (con==null)	{
			System.err.println("can't get console!!!");
			return null;
		}

		System.out.println("Введите " + n + " строк:");
		for(int i = 0; i<n; i++)	{
			String s = con.readLine();
			ret[i] = s;
		}

		return ret;
	}

	private void printStrArray(String[] arrs)	{
		for(String s : arrs)	{
			System.out.println(s.length() + " - " + s);			
		}
	}

	/*
	 * Ввести  n  слов  с  консоли.  Среди  слов,  состоящих  только  из  цифр, 
найти слово-палиндром. Если таких слов больше одного, найти вто-
рое из них.
	 */
	private void a5(String[] args)		{
		String[] words = args[0].trim().split(" ");
		String[] palindroms = new String[2];

		for(String s : words)	{
			if (Pattern.matches("[\\d]+", s)) {
				System.out.println("number: "+ s + ", is palindrom? " + isPalindrom(s) );
			}
		}
	}

	private boolean isPalindrom(String in)		{
		if (in.length()<=1)
			return false;

		boolean result = true;
		System.out.print(in);
		System.out.println(in.length()/2);
		for(int i=0; i<=(in.length()/2); i++)	{
			if( in.charAt(i)!=in.charAt(in.length()-1-i) )	{
				result = false;
				break;
			}
		}
		
		return result;
	}

	/*
	 * Ввести n слов с консоли. Найти слово,  состоящее только из различных 
символов. Если таких слов несколько, найти первое из них. 
	 */
	private void a4(String[] res)	{
		String[] arrStr = res[0].trim().split(" ");
		for(String s : arrStr)	{
			boolean isUniqueChar = true;
			for(int i=0; i<s.length(); i++)	{
				if (s.indexOf( s.charAt(i), i+1)!=-1) {
					isUniqueChar = false;
					break;
				}
			}
			if (isUniqueChar)	{
				System.out.println( "unique symb: [" + s + "]");
				break;
			} else	{
				System.out.println( "no unique symb: [" + s + "]");
			}
		}
	}

	private void a3(String[] res)	{
		int nLen = 0;
		for(String s : res)	{
			nLen += s.length();
		}

		nLen /= res.length;
		System.out.println("Average len = " + nLen);
		for(String s : res)	{
			if(s.length()>=nLen)	{
				System.out.println(s.length() + " - " + s);
			}
		}
	}

	private void a2(String res[])	{
		Arrays.sort(res,  new StrLenComparator());
		printStrArray(res);
	}

	private void a1(String[] res)	{
		String sMax = "";
		String sMin = null;

		if (res!=null)	{
			for(String s : res)		{
				if (sMin==null || sMin.length()>=s.length())	{
					sMin = s;
				}

				if (sMax.length()<=s.length())	{
					sMax = s;
				}

				System.out.println(s.length() + " - " + s);
			}

			System.out.println("Min size string: " + sMin);
			System.out.println("Max size string: " + sMax);
		} else	{
			System.out.println("Данные не введены!");			
		}
	}

}
