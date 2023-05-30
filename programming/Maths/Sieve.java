package programming.Maths;

public class Sieve {
	public static void main(String[] args) {
		int n=40;
		boolean[] primes = new boolean[n+1];

		isPrime(n,primes);
	}
	public static void isPrime(int n, boolean[] arr){
		// false indicates number is prime
		for(int i=2;i*i<=n;i++){
             if(!arr[i]){
				 for(int j=i*2;j<=n;j+=i){
                    arr[j]=true;
				 }
             }
		}
		for(int i=2;i<arr.length;i++){
			if(!arr[i]){
				System.out.println(i+" "+arr[i]);
			}
		}
	}
}
