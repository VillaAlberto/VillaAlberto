package it.polito.tdp.crimes.model;

public class TestModel {

	public static void main(String[] args) {
		
		Model model= new Model();
		model.prendiDati(12);
		model.doRicorsione(false, false, true);
		model.avviaSimulazione(3, 0.5, 0.5, 9, 4, 5, 5, false);
	}

}
