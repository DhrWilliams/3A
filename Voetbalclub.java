package practicum2b;

public class Voetbalclub {
	
	private String naam;

	private int aantalGewonnen;
	private int aantalGelijk;
	private int aantalVerloren;
	
	
	public Voetbalclub(String naam) {
		this.naam = naam;
	}

	public void verwerkResultaat(char ch) {
		 if (ch == 'w')
		      aantalGewonnen = aantalGewonnen + 1;
		    if (ch == 'g')
		      aantalGelijk = aantalGelijk + 1;
		    if (ch == 'v')
		      aantalVerloren = aantalVerloren + 1;
	}

	public int aantalPunten() {
		// TODO Auto-generated method stub
		return aantalGewonnen * aantalGewonnen +  aantalGelijk;
	}

	public int aantalGespeeld() {
		// TODO Auto-generated method stub
		return  getAantalGelijk() + getAantalGewonnen() + getAantalVerloren();
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getAantalGewonnen() {
		return aantalGewonnen;
	}

	public int getAantalGelijk() {
		return aantalGelijk;
	}

	public int getAantalVerloren() {
		return aantalVerloren;
	}
	
	
	
	public String toString() {
		return getNaam() + " " +  aantalGespeeld() + " " + getAantalGewonnen() + " " + getAantalGelijk() + " " + getAantalVerloren()  + " " + aantalPunten();
	}

}
