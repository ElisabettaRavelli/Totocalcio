package it.polito.tdp.toto;

public enum Risultato { //classe di tipo numerazione che raggruppa un insieme di costanti 
						//con dei metodo per gestire queste costanti 

	UNO, DUE, ICS;

	public String toString() {
		switch(this) {
		case UNO:
			return "1";
		case DUE:
			return "2";
		case ICS:
			return "X";
		default:
			return null;
		}
	}

}
