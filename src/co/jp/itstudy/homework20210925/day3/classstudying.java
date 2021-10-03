package co.jp.itstudy.homework20210925.day3;



public class classstudying {

	public static void main(String[] args) {
		/*for(int j = 1 ; j < 10;j++) {
			for(int i = 1; i <= j; i++) {
				//System.out.print("#\t");//tab等于4个空格  \t=4个空格
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
				 * 没有if之直接sum =sum+i  i=i+2
				 */
				if(i %2 == 1) {
					sum +=i;
					
				}
				i++;
			}while(i<100);
			System.out.println(sum);
		}
		
	}

