package pjAula13;

import java.util.Vector;

public class Vectores {
	public static void main(String[] args) {
		Vector vetor = new Vector();
		//int vetor[] = new int[10];
		
		vetor.add(1000);
		vetor.add(2000);
		vetor.add(1001);
		vetor.add(2002);//3
		vetor.add(1003);
		vetor.add(2004);
		vetor.add(1005);
		vetor.add(2006);
		vetor.add(1007);
		vetor.add(2008);
		vetor.add(1009);
			
		
		System.out.println(vetor.capacity() + " " + vetor.size());
		System.out.println(vetor);
		
		vetor.remove(3);
		vetor.remove(2);
		vetor.remove(0);
		
		System.out.println(vetor.capacity() + " " + vetor.size());
		System.out.println(vetor);
		System.out.println(vetor.get(7));
	}
}
