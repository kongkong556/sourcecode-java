
public class DemoError {
	public static void main(String[] args) throws ClassNotFoundException {
		DemoError e = new DemoError();
		e.processProactive(0);
		e.processReactive(0);
	}
	double processReactive(int input) {
		try {
			return 10/input;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	double processProactive(int input){
		//fail fast
		if(input == 0) {
			return -1;
		}
		return 10/input;
	}
}
