package multiplication1;

public class MultiplicationDisplay {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		
		int a;
		for(int j= 1; j<=10;j++)
		{
			a= i*j;
		System.out.println(i +"*"+ j +"="+a);
		}
		

	}

}
