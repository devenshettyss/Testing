package testing;

public class Calculator {
	public int add(int x,int y) {
		return x+y;
	}
	public float add(float x,float y) {
		if (x>2) {
			System.out.println("some message");
		}
		return x+y;
	}
	public float divide(int a, int b) {
		return (float)a/(float)b ;
	}
}
	


