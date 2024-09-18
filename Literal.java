import java.lang.*;

class Literal
{
	public static void main(String args[])
	{
		byte b1 = 10; 
		byte b2 = 0b1010;
		byte b3 = 012;
		byte b4 = 0XA;

		System.out.println("Byte b1:" + b1);
		System.out.println("Byte b2:" + b2);
		System.out.println("Byte b3:" + b3);
		System.out.println("Byte b4:" + b4);
	}
}
