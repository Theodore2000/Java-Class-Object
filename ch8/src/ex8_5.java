public class ex8_5 {
	public static void main(String[] args) {
		for (int i=0;i<10;i++){
            System.out.print(fibonacci(i)+"  ");
        }
	}
	public  static int fibonacci(int n){
        if(n==1 || n==2)
            return 1;
        else if(n==0)
        	return 0;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}