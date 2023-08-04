import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Implementacion implements MetodProced {

	// Declarar lista
	List<Perfumes> listaPerfum = new ArrayList<Perfumes>();

	@Override
	public void guardar(Perfumes perfume) {
		listaPerfum.add(perfume);
	}

	@Override
	public void editar(int indice, Perfumes perfume) {
		listaPerfum.set(indice, perfume);

	}

	@Override
	public void eliminar(int indice) {
		listaPerfum.remove(indice);

	}

	@Override
	public Perfumes buscar(int indice) {
		return listaPerfum.get(indice);
	}

	@Override
	public void mostrar() {
		System.out.println(listaPerfum);

	}

	// M E T O D O S P E R S O N A L I Z A D O S
	public void contar() {
		System.out.println("El total de perfumes es: " + listaPerfum.size());
	}

	public void descripcion() {

		for (int i = 0; i < listaPerfum.size(); i++) {
			System.out.printf("\n[%d]" + listaPerfum.get(i).getNombre(), i);
		}
	}

	public int validarRegs() {
		int tamLista = 0;
		if (listaPerfum.size() > 0) {
			tamLista = listaPerfum.size();

		} else {
			System.out.println("No existen registros");
		}
		return tamLista;
	}

	public Perfumes buscarNombre(String nombre) {
		Perfumes perfume = null;

		for (Perfumes p : listaPerfum) {
			if (p.getNombre().equals(nombre)) { // contInd realiza la busqueda por 0
				perfume = p;
				System.out.println("Se encontro la bebida: " + perfume);
			}

		} // cierra ForEach
		return perfume;
	}// cierra buscarNom

	public void eliminarNombre(String nombre) {
		Perfumes perfume = null;
		int index = 0; //
		try {
			for (Perfumes p : listaPerfum) {
				if (p.getNombre().equals(nombre)) {
					perfume = p;
					System.out.println("Se elimino la bebida: " + perfume.getNombre());
					listaPerfum.remove(index);
				}
				index++;
			}
		} catch (Exception e) {

		}

	}// cierra eliminarNom

}// Cierra Implementacion
