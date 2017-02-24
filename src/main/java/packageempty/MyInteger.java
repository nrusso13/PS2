package packageempty;

public class MyInteger {
	private int iValue;
	public MyInteger(int value){
		setiValue(value);
	}
	public int getiValue() {
		return iValue;
	}
	private void setiValue(int iValue) {
		
		this.iValue = iValue;
	}
	public boolean isEven(){
		if (getiValue()%2 == 0)
			return true;
		else 
			return false;
	}
	public boolean isOdd(){
		if (getiValue()%2 ==1)
			return true;
		else
			return false;
	}
	public boolean isPrime(){
		for (int i=2; i < (getiValue()/2); i++ ){
			if (iValue%i == 0)
				return false;
			
		}
		return true;
	}
	public static boolean isEven(int x){
		if (x%2 == 0)
			return true;
		else 
			return false;
		
		}
	public static boolean isOdd(int x){
		if (x%2 ==1)
			return true;
		else
			return false;
	}
	public static boolean isPrime(int x){
		for (int i=2; i < (x/2); i++ ){
			if (x%i == 0)
				return false;
			
		}
		return true;
		
	}
	public static boolean isEven(MyInteger x){
		return isEven(x.getiValue());
		
	}
	public static boolean isOdd(MyInteger x){
		return isOdd(x.getiValue());
	}
	public static boolean isPrime(MyInteger x){
		return isPrime(x.getiValue());
		
	}
	public boolean equals(int x){
		if (x == iValue )
			return true;
		else
			return false;
		
	}
	public boolean equals(MyInteger x){
		return equals(x.getiValue());
	}
	
	
	
	
}
