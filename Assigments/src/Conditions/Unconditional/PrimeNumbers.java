package Conditions.Unconditional;

public class PrimeNumbers {
	public static boolean isPrime(int n){
		if(n<2){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		for(int i=2;i<=30;i++){
			if (isPrime(i)) {
                System.out.print(i + " ");
            }
		}
	}
}
