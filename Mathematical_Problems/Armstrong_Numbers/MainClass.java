
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int inpParam = 371;
		
		MainClass mainClass = new MainClass();
		int n = mainClass.order(inpParam);
		
		int temp = inpParam, sum = 0;
		
		while(temp != 0)	{		
			sum = sum +  mainClass.power(temp%10,  n);
			temp = temp/10;
		}
		System.out.println(sum);
	}
	
	int order(int x) {
		
		int n = 0;
		while(x != 0) {
			n++;
			x = x/10;
		}
		return n;
	}
	
	int power(int x, int y) {
		if(y==0) {
			return 1;
		} else if(y == 1) {
			return x;
		}
		return x * power(x, y-1);
	}
	
	

}
