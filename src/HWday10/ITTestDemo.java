package hw10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ITTestDemo {

	public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("ITpasspot");
			list.add("aws");
			list.add("�����鱨");
			list.add("java��֤��");
			list.add("�����鱨");
			List<String> ku = new ArrayList<>();
			ku.add("���ݿ⿼֤");
			
			list.addAll(2,ku);
			for(String si : list) {
				System.out.println(si);
			}
			
			
			System.out.println("---------2--------------");
			Object[] aryobj = list.toArray();
			for (Object oi : aryobj) {
				System.out.println(oi);
			}
			
			
			System.out.println("---------3---------------");
			Iterator<String> iterator = list.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
			
			System.out.println("-------4---------------");
			for(int i = 0;i < list.size();i++) {
				System.out.println(list.get(i));
			}
			
			
			System.out.println("----------5-----------");
			ListIterator<String> listIterator = list.listIterator();
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next());
			}
			
			System.out.println("-----------------");
			
			
			list.remove("�����鱨");
			System.out.println(list.toString());
			
			try {
				list.remove(7);
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Ԫ�ز�����");
			}
			
			
			
			
	}

}
