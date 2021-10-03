package co.jp.itstudy.homework20210925.day3;

public class classDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i = 1;
		while(i <101) {
			if(i%3 == 0) {
				System.out.println(i);
			}
			i++;
		}*/
		/*
		int i =1;
		do {
			if(i%3 ==0) {
				System.out.println(i);
			}
			i++;
		}while(i<101);*/
		
		int sum = 0;
		int i = 1;
		do {
			sum += i;	
			i++;
		}while(i<101);
		System.out.println(sum);
		
		
	}

}
