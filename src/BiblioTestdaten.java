import java.util.ArrayList;
import java.util.List;

public class BiblioTestdaten {
	private Bibliotheksverzeichnis biblio = new Bibliotheksverzeichnis();

	public Bibliotheksverzeichnis getBiblio() {
		return biblio;
	}

	public void erzeugeTestdaten() {
		biblio.addBuch(anlegenEins());
		biblio.addBuch(anlegenZwei());
		biblio.addBuch(anlegenDrei());
		biblio.addBuch(anlegenVier());
		biblio.addBuch(anlegenFuenf());
	}

	private Buch anlegenEins() {
		return new Buch("Theoretisches Testen gibt es nicht", "Mandy Sult", "2016");
	}

	private Buch anlegenZwei() {
		return new Buch("Java mal ganz anders", "Ronald Dump, Mandy Sult", "2010");
	}

	private Buch anlegenDrei() {
		return new Buch("Theoretisch gesagt, praktisch gemacht", "Ronald Dump", "2015");
	}

	private Buch anlegenVier() {
		return new Buch("Grundlagen theoretischer Physik", "Anette Neumann", "2007");
	}

	private Buch anlegenFuenf() {
		return new Buch("Grundlagen der Programmierung mit Java", "Thomas Ulm", "2016");
	}
}
