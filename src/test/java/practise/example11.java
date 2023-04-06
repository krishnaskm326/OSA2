package practise;


public class example11 {
	
	public static void main(String args[])   
	{  
	String str;  
	int i, len;  
	int count[] = new int[256];  
	str ="krishnamoorthi";
	len = str.length();  
	for (i = 0; i < len; i++)   
	{  
	count[(int) str.charAt(i)]++;  
	}  

	for (i = 0; i < 256; i++)   
	{  
	if (count[i] != 0)   
	{  
	System.out.println((char) i + " --> " + count[i]);  
	}  
	
	}  
	}  
	}  
	