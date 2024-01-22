package br.com.auxiliadordecorrida.view;

import java.util.Map;

import br.com.auxiliadordecorrida.models.CalculadorPressao;
import br.com.auxiliadordecorrida.models.Setup;

public class Principal {

	public static void main(String[] args) {

		CalculadorPressao cP = new CalculadorPressao();
		
		Map<String, Setup> tabela = cP.calculaPressao("IURI");
				
	}

}
