package t3n1exercici1;

import java.util.ArrayList;

import java.util.Iterator;

public class T3n1exercici1 {

	public static void main(String[] args) {

		ArrayList<Month> mesos = new ArrayList<Month>();

		Month enero = new Month("Enero");
		Month febrero = new Month("Febrero");
		Month marzo = new Month("Marzo");
		Month abril = new Month("Abril");
		Month mayo = new Month("Mayo");
		Month junio = new Month("Junio");
		Month julio = new Month("Julio");
		Month septiembre = new Month("Septiembre");
		Month octubre = new Month("Octubre");
		Month noviembre = new Month("Noviembre");
		Month diciembre = new Month("Diciembre");

		mesos.add(enero);
		mesos.add(febrero);
		mesos.add(marzo);
		mesos.add(abril);
		mesos.add(mayo);
		mesos.add(junio);
		mesos.add(julio);
		mesos.add(septiembre);
		mesos.add(octubre);
		mesos.add(noviembre);
		mesos.add(diciembre);

		
		// Bucles for e iterador

		
	
		Month agosto = new Month("Agosto");

		mesos.add(7, agosto);
		
		System.out.println("ArrayList con Agosto insertado\n \nBucle for: \n");
		
		for (int i = 0; i < 11; i++) {

			System.out.println(mesos.get(i).getName());

		}
		
		System.out.println("\nBucle for-each: \n");

		for (Month month : mesos) {
			System.out.println(month.getName());
		}

		
		Iterator<Month> iterador = mesos.iterator();

		System.out.println("\nBucle while con iterador \n");

		while (iterador.hasNext()) {

			String nombreMes = iterador.next().getName();

			System.out.println(nombreMes);
		}
		
	}
}
