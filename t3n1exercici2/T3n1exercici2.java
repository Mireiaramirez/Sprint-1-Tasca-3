package t3n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class T3n1exercici2 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();

		int a = 8;
		int b = 7;
		int c = 6;
		int d = 5;

		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);

		List<Integer> lista2 = new ArrayList<Integer>();

		int e = 1;
		int f = 2;
		int g = 3;
		int h = 4;

		lista2.add(e);
		lista2.add(f);
		lista2.add(g);
		lista2.add(h);

		ListIterator<Integer> iterador = lista.listIterator(lista.size());

		while (iterador.hasPrevious()) {

			int j = iterador.previous();

			lista2.add(j);

		}
		System.out.println(lista2);

	}

}


