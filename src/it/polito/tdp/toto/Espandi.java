package it.polito.tdp.toto;

import java.util.ArrayList;
import java.util.List;

public class Espandi { //metodo di espansione
	
	private List<Schedina> soluzioni;
	
	//al primo passo c'è bisogno che qualcuno chiami il metodo espandi() passandogli 
	//un pronostico, una schedina vuota e un livello uguale a 0
	//PRIMA CHIAMATA RICORSIVA
	public List<Schedina> espandiPronostico(Pronostico p) {
		Schedina parziale = new Schedina(p.getN());
		this.soluzioni = new ArrayList<Schedina>();
		espandi(p,parziale,0);
		return this.soluzioni;
	}
	
	//livello della risorsione è uguale alla singola partita
	//se il livello=0 significa che ho una schedina con 0 risultati
	//se il livello=1 significa che ho una schedina con 1 risultato ...
	
	private void espandi(Pronostico p, Schedina parziale, int livello){
		//l'oggetto parziale contine già (livello) valori che sono messi nelle posizioni 0...(livello-1)
		//io devo determinare parziale(livello) cioè la livello+1 esima riga
		//sulla base della previsione in pronostico p(livello)
		
		//la ricorsione si fermerà quando il pronostico sarà esaurito
		//quindi finito il pronostico finisce la ricorsione
		//l soluzione parziale è già la soluzione finale perchè si è arrivati al fondo
		//PASSO TERMINALE
		if(livello == p.getN()) {
			//System.out.println(parziale);
			this.soluzioni.add(new Schedina (parziale)); //in questo modo si aggiunge l'oggetto e non il riferimento 
			return;
		}
			
		
		Previsione prev = p.get(livello); 
		
		//prova le varie alternative iterando i risultati ottenuti dalla previsione
		//PASSO GENERALE
		for(Risultato r: prev.getValori()) {
			//provo ad aggiungere r alla soluzione
			parziale.add(r);
			
			espandi(p,parziale,livello+1); //RICORSIONE: il metodo chiama se stesso 
											 
			//backtrack
			parziale.removeLast();
			
		}
		
	}

}
