package co.jp.itstudy.homework20210925.day3;



public class classstudying {

	public static void main(String[] args) {
		/*for(int j = 1 ; j < 10;j++) {
			for(int i = 1; i <= j; i++) {
				//System.out.print("#\t");//tab����4���ո�  \t=4���ո�
				System.out.print(j + "*" + i + "="+i*j +" ");
			}
			System.out.println();*/
		/*int i = 1;
		while(i< 6){
			int j = 1;
			while(j <= i) {
			System.out.print("*");
			j++;
			}
		
			System.out.println("");
				i++;
		}*/
			int i = 1;
			int sum = 0;
			do {
				/*
				 * û��ifֱ֮��sum =sum+i  i=i+2
				 */
				if(i %2 == 1) {
					sum +=i;
					
				}
				i++;
			}while(i<100);
			System.out.println(sum);
		}
		
	}

