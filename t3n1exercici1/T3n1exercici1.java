package t3n1exercici1;

import java.util.ArrayList;

import java.util.Iterator;

<<<<<<< HEAD
=======
import java.util.HashSet;

>>>>>>> 16ed582c6df6d88b097f3cea9b4df107c41da78d
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

<<<<<<< HEAD
		
		// Bucles for e iterador

		
	
		Month agosto = new Month("Agosto");

		mesos.add(7, agosto);
		
		System.out.println("ArrayList con Agosto insertado\n \nBucle for: \n");
		
=======
		// Inserción de agosto:

		Month agosto = new Month("Agosto");

		mesos.add(7, agosto);

		// Demostración de que la inserción está en la posición correcta y de que el
		// ArrayList queda en el orden correcto:

		System.out.println("ArrayList con Agosto insertado\n \nBucle for: \n");

>>>>>>> 16ed582c6df6d88b097f3cea9b4df107c41da78d
		for (int i = 0; i < 11; i++) {

			System.out.println(mesos.get(i).getName());

		}
<<<<<<< HEAD
		
		System.out.println("\nBucle for-each: \n");
=======

		System.out.println("\nBucle for-each con Agosto insertado: \n");
>>>>>>> 16ed582c6df6d88b097f3cea9b4df107c41da78d

		for (Month month : mesos) {
			System.out.println(month.getName());
		}

<<<<<<< HEAD
		
		Iterator<Month> iterador = mesos.iterator();

		System.out.println("\nBucle while con iterador \n");
=======
		Iterator<Month> iterador = mesos.iterator();

		System.out.println("\nBucle while con iterador con Agosto insertado \n");
>>>>>>> 16ed582c6df6d88b097f3cea9b4df107c41da78d

		while (iterador.hasNext()) {

			String nombreMes = iterador.next().getName();

			System.out.println(nombreMes);
		}
<<<<<<< HEAD
		
=======

		// Creamos un HashSet y un iterador:
		// DUDAS: ¿Es necesario especificar que el tipo de elementos almacenados en el
		// ArrayList es Month al crear el HashSet?

		System.out.println("\nIteración de los meses dentro del HashSet: \n");

		HashSet<ArrayList<Month>> set = new HashSet<ArrayList<Month>>();

		// Añado la misma ArrayList dos veces para demostrar que el HashSet no permite
		// duplicados.

		set.add(mesos);
		set.add(mesos);

		Iterator<ArrayList<Month>> iterador2 = set.iterator();

		while (iterador2.hasNext()) {

			ArrayList<Month> list = iterador2.next();

			for (Month mes : list) {

				String name = mes.getName();

				System.out.println(name);

			}
		}

>>>>>>> 16ed582c6df6d88b097f3cea9b4df107c41da78d
	}
}
