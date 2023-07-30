package t3n1exercici3;

import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;

public class T3n1exercici3 {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\Mireia\\eclipse-workspace\\T3n1exercici3\\src\\t3n1exercici3\\countries.txt";

		HashMap<String, String> lista = crearMapa(filePath);
		String resultado = obtenerResultado(lista);
		escribirResultado(resultado, filePath);

	}

	public static HashMap<String, String> crearMapa(String filePath) {

		HashMap<String, String> lista = new HashMap<String, String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));

			String line;
			while ((line = reader.readLine()) != null) {

				String[] parts = line.split(" ", 2);

				String value = parts[0];
				String key = parts[1];

				if (parts.length == 2) {
					value = parts[0].replace("_", " ");
					key = parts[1].replace("_", " ");

					lista.put(key, value);
				} else {
					System.out.println("Invalid line format: " + line);

				}
			}

		} catch (IOException e) {

			System.out.println("No se encontró el archivo " + filePath);
		}
		return lista;

	}

	public static String obtenerResultado(HashMap<String, String> lista) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es tu nombre?");
		String nombre = sc.nextLine();

		List<String> listaPaises = new ArrayList<String>(lista.values());
		List<String> listaCapitales = new ArrayList<String>(lista.keySet());
		int puntos = 0;
		for (int i = 0; i < 10; i++) {

			int n = listaPaises.size();
			int random = (int) (Math.random() * n);
			String pais = listaPaises.get(random);
			System.out.println("Dime la capital de " + pais + "(en inglés):");
			String capitalUsuario = sc.nextLine();
			String capital = listaCapitales.get(random);

			if (capitalUsuario.equalsIgnoreCase(capital)) {

				puntos += 1;

			}

		}
		String resultado = "El usuario " + nombre + " tiene " + puntos + " puntos";

		return resultado;

	}

	public static void escribirResultado(String resultado, String filePath) {

		try {
			String filePath2 = "C:\\Users\\Mireia\\eclipse-workspace\\T3n1exercici3\\src\\t3n1exercici3\\classificacio.txt";
			FileWriter writer = new FileWriter(filePath2);
			writer.write(resultado);
			System.out.println(resultado);
			writer.close();
		} catch (IOException e) {
			System.out.println("No se encontró el archivo " + filePath);
		}

	}
}
