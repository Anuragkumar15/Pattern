
public class PatternEx15 {
public static void main(String[] args) {
	

	int a = 9,b = 5,c=0;
	for(int i=1;i<=a;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(" ");
			}
		
		for(int j=1;j<=b;j++) {
			System.out.print("* ");
		}
		System.out.println();
		if(i>a/2) {
			b++;
			c--;
		}else {
			b--;
			c++;
		}
		
	}
}
}