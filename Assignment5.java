import java.util.Scanner;
public class Assignment5
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner numInput = new Scanner(System.in);
		int num = numInput.nextInt();
		
		System.out.println(Math.sqrt(num));
		
		System.out.println("Enter your full name: ");
		Scanner nameInput = new Scanner(System.in);
		String name = nameInput.nextLine();
		String space = " ";
		String lastname = "";
		int count = 0;
		for(count = 0; count<name.length(); count++)
		{
			if(name.charAt(count) == space.charAt(0))
			{
				lastname = name.substring(count);
			}	
		}
		
		System.out.println("Hello Mr./Mrs. " + lastname);

		System.out.println("Enter a number or character: ");
		Scanner binInput = new Scanner(System.in);
		String numBinStr = binInput.nextLine();
		
		try{
		int numBin = Integer.parseInt(numBinStr);
		int rem;
		String bin = "";
		if(numBin ==0)
		{
			System.out.println("0");
		}
		while(numBin>0)
		{
		
		rem = numBin % 2;
		bin = rem + bin;
		numBin = numBin/2;
		
		
		}
		System.out.println(bin);
		}
		catch(NumberFormatException e){
			charBinary(numBinStr);
			
		}
		
	}

	public static void charBinary(String s)
	{
		for(int i = 0; i<s.length(); i++)
		{
			int charToInt = (int)s.charAt(i);
			
		
			System.out.print(intBinary(charToInt));
		}
	}

	public static String intBinary(int i)
	{
		
		int rem;
		String bin = "";
		if(i ==0)
		{
			System.out.println("0");
		}
		while(i>0)
		{
		
		rem = i % 2;
		bin = rem + bin;
		i = i/2;
		
		
		}
		return bin;
	}
}