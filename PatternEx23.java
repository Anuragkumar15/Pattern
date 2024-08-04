
public class PatternEx23 {
public static void main(String[] args) {
	int a = 5,b = 5,c=0;
	for(int i=1;i<=a;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(" ");
			}
		if(i==1 || i==a) {
			for(int j=1;j<=b;j++) {
				System.out.print("*");
			}
		}else {
			for(int j=1;j<=b;j++) {
				if(j==1 || j==b) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
		
			}
		}

		System.out.println();
		b--;
		c++;
	}
	}
}

