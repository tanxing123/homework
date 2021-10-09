package co.jp.itstudy.homework20210925.day3;

import java.util.Scanner;

public class homeworkday5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1，从扫描器中输入一个字符，
		如果在[a-Z]直接就输入该字符，否则就输出“该字符不是字母”*/
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("请输入字符");
		char varC = scanner1.next().charAt(0);
		boolean flag1 = 'a' <= varC && 'z' >= varC;
		boolean flag2 = 'A' <= varC && 'Z' >= varC;
		
		
	/*	
		2，标准体重计算：
		男：身高（cm）- 105 = 标准体重(kg)
		女：身高（cm）- 100 = 标准体重(kg)
		要求，输入性别，身高、体重
		输出：身高xx，体重xx，标准体重xx
		
		System.out.println("輸入性別");
		Scanner scanner = new Scanner(System.in);
		String gender = scanner.next();
		System.out.println("性別:" + gender);
		System.out.println("輸入身高");
		int height = scanner.nextInt();
		System.out.println("身高:" + height);
		System.out.println("輸入体重");
		int weight = scanner.nextInt();
		System.out.println("体重:" + weight);
		if(gender.equals("男")){
			System.out.println("標準体重:" + (height-105));
		}else {
			System.out.println("標準体重:" + (height-100));
		}
		*/
		
		
		
		
	/*	3，在第六题基础上。创建一个以为数组。
		存日本对应的都县。
		当从扫描器里输入一个都。打印出该都的所有区。
		eg：
		输入“东京都”
		输出"千代田区，台东区，新宿区"*/
		
		String[][] cities = {
                {"新宿区", "豊島区", "板橋区"},
                {"川口市", "和光市", "蕨市"},
                {"川崎市", "横浜市"},
                {"大阪市", "此花区"},
                {"上京区", "下京区", "伏見区"},
        };
        String[] prefectures = {"東京都", "埼玉県", "神奈川", "大阪府", "京都府"};

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();//输入都道府县
        //外层循环都道府县，因为要首先确定输入的是哪个都道府县，循环次数设为都道府县数组长度
        for (int i = 0; i < prefectures.length; i++) {
            //内层循环 遍历输出都道府县下的区市，
            // 外层i=0时，内层数组长度为数组cities[0]的长度，
            // 即{"新宿区", "豊島区", "板橋区"}的长度，以此类推
            for (int j = 0; j < cities[i].length; j++) {
                if(input.equals(prefectures[i])){
                    System.out.println(cities[i][j]);
                }

            }

        }
		
		
		
		
		
		
		/*4,创建一个一位数组。存入12生肖。
		输入年
		输出今年的属相
		eg“2021，,牛”*/
        String[] shengxiao = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
        Scanner scanner3 = new Scanner(System.in);
        int year = scanner.nextInt();

        int index = year % 12 - 4;

        System.out.println(shengxiao[index]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
