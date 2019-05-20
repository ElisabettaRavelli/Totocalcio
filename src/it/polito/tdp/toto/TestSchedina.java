package it.polito.tdp.toto;

public class TestSchedina {

	public static void main(String[] args) {
		//creo una nuova scehdina il cui paramentro è il numero di righe della schedina (13)
		Schedina s = new Schedina(13) ; 
		//aggiungo dei risultati alla schedina 
		s.add(Risultato.UNO);
		s.add(Risultato.UNO);
		s.add(Risultato.UNO);
		
		s.add(Risultato.DUE);
		s.add(Risultato.DUE);
		s.add(Risultato.DUE);

		s.add(Risultato.ICS);
		s.add(Risultato.ICS);
		s.add(Risultato.ICS);

		s.add(Risultato.UNO);
		s.add(Risultato.UNO);
		s.add(Risultato.UNO);

		s.add(Risultato.DUE);
		
		System.out.println(s.toString()); //stampo la singola schedina
}

}
