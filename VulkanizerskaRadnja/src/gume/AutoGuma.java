package gume;

/**
 * 
 * Klasa AutoGuma sadrzi atribute gume i odgovorajuce set i get metode
 * @author Andjelija
 * @version 1.0
 *
 */
public class AutoGuma {

	/**
	 * Atribut koji predstavlja
	 * naziv marka auto gume
	 */
	private String markaModel = null;
	/**
	 * Atribut koji oznacava precnik 
	 * auto gume
	 */
	private int precnik = 0;
	/**
	 * Atribut koji oznacava sirinu
	 * auto gume
	 */
	
	private int sirina = 0;
	/**
	 *  Atribut koji oznacava visinu
	 * auto gume
	 */
	private int visina = 0;
	/**
	 * Metoda koja vraca marku gume
	 * @return markaModel 
	 */
	public String getMarkaModel() {
	return markaModel;
	}
	/**
	 * Metoda koja prima parametar koji predstavlja marku gume
	 * i postavlja vrednost atributa na tu vrednost
	 * @param markaModel 
	 * @throws java.lang.RuntimeException ukoliko je atribut null
	 * ili krace od tri karaktera 

	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null || markaModel.length()<3)
	throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	/**
	 * Metoda koja vraca precnik gume
	 * @return precnik atribut koji predstavlja precnik gume
	 */
	public int getPrecnik() {
	return precnik;
	} 
	/**
	 * Metoda koja prima parametar koji predstavlja precnik gume
	 * i postavlja vrednost atributa precnik na tu vrednost
	 * @param precnik 
	 * @throws java.lang.RuntimeException ukoliko je vrednost
	 * atributa precnika manja od 13 i veca od 22
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 || precnik > 22)
	throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	/**
	 * Metoda koja vraca sirinu gumu
	 * @return  sirina atribut koji predstavlja sirinu gume
	 */
	public int getSirina() {
	return sirina;
	}
	/**
	 * Metoda koja prima parametar koji predstavlja sirinu gume i postavlja vrednost 
	 * atributa sirina na tu vrednost
	 * @param sirina 
	 * @throws java.lang.RuntimeException ukoliko je vrednost
	 * atributa precnika manja od 135 i veca od 355
	 */
	public void setSirina(int sirina) {
	if (sirina < 135 || sirina > 355)
	throw new RuntimeException("Sirina van opsega ");
	this.sirina = sirina;
	}
	/**
	 *  Metoda koja vraca visinu gumu
	 * @return  visina atribut koji predstavlja visinu gume
	 */
	public int getVisina() {
	return visina;
	}
	/**
	 * Metoda koja prima parametar koji predstavlja visinu gume i postavlja vrednost 
	 * atributa visina na tu vrednost
	 * @param visina 
	 * @throws java.lang.RuntimeException ukoliko je vrednost
	 * atributa visina manja od 25 i veca od 95
	 */
	public void setVisina(int visina) {
	if (visina < 25 || visina > 95)
	throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}
	/**
	 * generisana metoda toString koja sluzi za ispis svih atributa klase AutoGuma
	 */
	@Override
	public String toString() {
	return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
	", sirina=" + sirina + ", visina=" + visina + "]";
	}
	/**
	 * generisana metora equals koja sluzi za proveri jednakosti dva objekta 
	 */
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
	return false;
	} else if (!markaModel.equals(other.markaModel))
	return false;
	if (precnik != other.precnik)
	return false;
	if (sirina != other.sirina)
	return false;
	if (visina != other.visina)
	return false;
	return true;
	}
	}

