
public class PatternEx12 {
public static void main(String[] args) {
	int a = 5,b = 5,c=1;
	for(int i=1;i<=a;i++) {
		if(i>=2) {
			for(int j=1;j<=c;j++) {
				System.out.print(" ");
			}
			c++;
		}
		for(int j=1;j<=b;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}
}
