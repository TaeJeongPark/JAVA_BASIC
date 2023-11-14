package chapter7;

import java.util.Iterator;
import java.util.Vector;

import chapter5.SuperStudent;

public class CollectionEx {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>(15);
		v.add(10);
		v.add(400);
		v.add(5);
		v.add(-14);
		
		printVector(v);
		
		v.add(2, 16);
		v.add(2, -8);
		
		printVector(v);
		
		System.out.println(v.get(5));
		
		v.remove(4);
		
		printVector(v);
		
		System.out.println("Vector의 절대값 합은 : " + sumVector(v));
		System.out.println("Vector의 절대값 합은 : " + sumIterator(v));
		
		Vector<SuperStudent> sv = new Vector<>();
		
		sv.add(new SuperStudent("김서정", 2004, 20231234, "컴퓨터시스템과", 1));
		sv.add(new SuperStudent("박태정", 1999, 20181234, "컴퓨터시스템과", 3));
		
		sv.get(0).printStudent();
		
	}
	
	public static void printVector(Vector<Integer> v) {
		
		System.out.println("Vector의 size : " + v.size());
		System.out.println("Vector의 capacity : " + v.capacity());
		System.out.println(v);
		
	}
	
	public static int sumVector(Vector<Integer> v) {
		
		int sum = 0;
		
		for(int i=0; i<v.size(); i++) {
			sum += Math.abs(v.get(i));
		}
		
		return sum;
		
	}
	
	public static int sumIterator(Vector<Integer> v) {
		
		int sum = 0;
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			sum += Math.abs(it.next());			
		}
		
		return sum;
		
	}

}
