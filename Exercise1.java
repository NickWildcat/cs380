package cs380e1;

public class Exercise1 {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println(num+" in reverse is "+reverse(num)+".");
	}
	
	public static int reverse(int num) {
		int reverse = 0;
		while (num != 0) {
		int digit = num % 10;
		reverse = reverse * 10 + digit;
		num /= 10;
		}
		return reverse;
	}
}
