import java.util.*; 

class Code {



	static String strToBinary(String s) 
	{ 
		int n = s.length();
		String result = " ";

		for (int i = 0; i < n; i++) 
		{ 

			int val = Integer.valueOf(s.charAt(i)); 


			String bin = ""; 
			while (val > 0) 
			{ 
				if (val % 2 == 1) 
				{ 
					bin += '1'; 
				} 
				else
					bin += '0'; 
				val /= 2; 
			} 
			bin = reverse((bin));
			result = result + bin + " ";
		}

		return result;
	} 


	static String reverse(String input) 
	{ 
		char[] a = input.toCharArray(); 
		int l, r = 0; 
		r = a.length - 1; 

		for (l = 0; l < r; l++, r--) 
		{ 

			char temp = a[l]; 
			a[l] = a[r]; 
			a[r] = temp; 
		} 
		return String.valueOf(a); 
	} 


	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String to convert to Binary: ");
		String myString = scan.next(); 
		String myBinary = strToBinary(myString); 
		System.out.println(myBinary);
		scan.close();
	} 
} 
