package it.polito.tdp.toto;

import java.util.List;

public class TestPronostico {

	public static void main(String[] args) {
		//lista in cui si aggiungono delle previsioni che può essere 1 risultato, 2 o 3
		Pronostico p = new Pronostico(5) ;
		p.add(new Previsione(Risultato.DUE, Risultato.UNO));
		p.add(new Previsione(Risultato.UNO, Risultato.ICS)) ;
		p.add(new Previsione(Risultato.UNO, Risultato.ICS, Risultato.DUE));
		p.add(new Previsione(Risultato.ICS));
		p.add(new Previsione(Risultato.UNO, Risultato.DUE)) ;
		
		System.out.println(p) ;
		//creo una espansione delle previsioni
		Espandi e = new Espandi();
		List<Schedina> soluzioni = e.espandiPronostico(p);
		System.out.println(soluzioni);
		
		
		
	}

}
