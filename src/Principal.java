import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// DECLARACION DE ATRIBUTOS
		String nombre;
		String marca;
		String olor;
		int ml;

		// Reserva de Espacio en Memoria
		Perfumes perfume = null;
		Scanner lectura = null;

		int indice, menuP, subMenu;

		// Instancia de clase
		Implementacion imp = new Implementacion();

		do {
			String entrada;
			do {
				System.out.println("\n--MENU PERFUMES --");
				System.out.println("1.- ALTA");
				System.out.println("2.- BUSCAR POR INDICE");
				System.out.println("3.- EDITAR POR INDICE");
				System.out.println("4.- ELIMINAT POR INDICE");
				System.out.println("5.- MOSTRAR");
				System.out.println("6.- CONTAR");
				System.out.println("7.- BUSCAR POR NOMBRE");
				System.out.println("8.- ELIMINAR POR NOMBRE");
				System.out.println("9.- SALIR");
				lectura = new Scanner(System.in);
				entrada = lectura.nextLine();
			} while (!validarNum(entrada));

			menuP = Integer.parseInt(entrada);
			switch (menuP) {
			case 1:

				try {
					System.out.println("Ingrese el nombre");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					System.out.println("Ingrese el marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("Ingrese el olor");
					lectura = new Scanner(System.in);
					olor = lectura.nextLine();

					System.out.println("Ingrese la cantidad de ml");
					lectura = new Scanner(System.in);
					ml = lectura.nextInt();

					// G U A R D A R
					perfume = new Perfumes(nombre, marca, olor, ml);
					imp.guardar(perfume);
					System.out.println("Se registro correctamente: " + perfume);

				} catch (Exception e) {
					System.out.println("Error al ingresar los datos ");
				}
				break;
			case 2:
				if (imp.validarRegs() > 0) {
					try {
						// Mostrar el indice y el nombre de perfumes
						imp.descripcion();
						System.out.println("\nIngrese el indice a buscar: ");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// B U S C A R
						perfume = imp.buscar(indice);
						System.out.println("Se encontro el perfume: " + perfume.getNombre());
					} catch (Exception e) {

					}
				}
				break;
			case 3:
				imp.descripcion();
				System.out.println("\nIngrese el indice a buscar: ");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// B U S C A R
				perfume = imp.buscar(indice);
				System.out.println("Se encontro el perfume: " + perfume.getNombre());
				try {
					do {
						System.out.println("--MENU DE EDITAR");
						System.out.println("1.-Marca");
						System.out.println("2.-Mililitros");
						System.out.println("3.-Regresar al menu principal");
						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:

							System.out.println("\nIngrese la marca a actualizar: ");
							lectura = new Scanner(System.in);
							marca = lectura.nextLine();

							// A C T U A L I Z A R
							perfume.setMarca(marca);
							imp.editar(indice, perfume);
							System.out.println("Se edito correctamente: " + perfume.getNombre());
							break;

						case 2:
							System.out.println("Ingrese los mililitros a actualizar: ");
							lectura = new Scanner(System.in);
							ml = lectura.nextInt();

							// A C T U A L I Z A R
							perfume.setMl(ml);
							imp.editar(indice, perfume);
							System.out
									.println("Se edito correctamente: " + perfume.getNombre() + " ," + perfume.getMl());
							break;
						case 3:
							break;
						}

					} while (subMenu < 3);
				} catch (Exception e) {
					System.out.println("Ingresar solo numeros");
				}

				break;
			case 4:
				imp.descripcion();
				System.out.println("\nIngrese el indice a eliminar: ");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// B U S C A R
				perfume = imp.buscar(indice);
				System.out.println("Se encontro el perfume: " + perfume.getNombre() + " a eliminar");

				// E L I M I N A R
				imp.eliminar(indice);
				System.out.println("Se elimino correctamente");
				break;
			case 5:
				imp.mostrar();

				break;
			case 6:
				imp.contar();

				break;
			case 7:
				// BUSCAR POP NOMBRE
				System.out.println("Ingrese el nombre del perfume a buscar: ");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				imp.buscarNombre(nombre);
				break;


			case 8:
				// ELIMINAR POP NOMBRE
				System.out.println("Ingrese el nombre del perfume a buscar: ");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				//E L I M I N A R
				imp.eliminarNombre(nombre);

				break;
	

			case 9:
				System.out.println("Regresa pronto");

				break;
				
			

			}

		} while (menuP < 9);

	}// Cierra Main

	public static boolean validarNum(String dato) {
		try {
			int converDato = Integer.parseInt(dato);
			return true;
		} catch (NumberFormatException ex) {
			System.out.println("Ingresar solo numeros");
			return false;
		}
	}// Cierra validarNum

}// Cierra Principal
