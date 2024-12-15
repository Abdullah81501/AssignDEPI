package medium;

public class By3and5 {

	public static void main(String[] args) {
		for(int i = 1; i <= 50; i++) {
			if (i%3==0) {
				if (i%5==0) {
					System.out.println(i+" is devisible by 3 and 5");
				}
			}
		}
	}

}
