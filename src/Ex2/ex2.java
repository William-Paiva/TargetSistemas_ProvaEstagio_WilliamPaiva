package Ex2;

public class ex2 {

	public static void main(String[] args) {
		
		int n = 34;
		int count = 0;
		
		for (int i = 0; i < 30; i++) {
           
            int termo = FibonacciRecursivo(i);
            
            if(FibonacciRecursivo(i) > n) {
            	continue;
            }
            
            if(termo == n) {
            	count = 1;
            }     
        }
		
		
		if(count == 1) {
			System.out.print("O termo pertence a sequência de Fibonacci");
		}else {
			System.out.print("O termo não pertence a sequência de Fibonacci");
		}
	}
	
	public static int FibonacciRecursivo (int numero) {
	
		if (numero < 2) {
            return numero;
        } else {
            return FibonacciRecursivo(numero - 1) + FibonacciRecursivo(numero - 2);
        }
		
	}

}
