package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;
/**
 * 
 * Klasa VulkanizerskaRadnja sadrzi listu guma i metode za ubacivanje
 * i pronalazenje odgovarajuce gume
 * @author Andjelija Skobelev
 * @version 1.0
 *
 */

public class VulkanizerskaRadnja {
	
/**
 * atribut koji predstavlja listu dostupnih guma u radnji
 */
	LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
/**
* metoda za dodavanje nove gume na pocetak liste
* @param a kojim se prosledjuje nova guma koja se dodaje u listu
* @throws java.lang.NullPointerException ako je guma null
* @throws java.lang.RuntimeException ako uneta guma vec postoji u listi
*/

	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	
/**
 * metoda koja pronalazi gumu na osnovu unetog modela
 * @param markaModel prosledjuje se marka, odnosno model gume koju trazimo
 * @return null ukoliko posaljemo null vrednost kao parametar
 * @return novaLista lista guma koje odgovaraju upitu
 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		if(novaLista.isEmpty())
			return null;
		else
		return novaLista;
	}

}
