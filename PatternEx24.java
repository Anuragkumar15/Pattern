
public class PatternEx24 {
public static void main(String[] args) {
	int a = 9,b = 1,c=4;
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=c;j++) {
			System.out.print(" ");
		}
		if(i ==1 || i ==9) {
			for(int j=1;j<=b;j++) {
				System.out.print("*");
			}
		}else {
			for(int j=1;j<=b;j++) {
				if(j == 1 || j ==b) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		}
		
		System.out.println();
		if(i>a/2) {
			b--;
			c++;
		}
		else {
			b++;
			c--;
		}
	}
}
}