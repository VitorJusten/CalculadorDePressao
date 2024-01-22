package br.com.auxiliadordecorrida.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculadorPressao {

	public Map<String, Setup> calculaPressao(String piloto) {

		Map<String, Setup> tabela = new HashMap();
		
		
		tabela.put("IURI", new Setup(26.5, 26, 26, 26.2, 26.2, 12, 12));
		

		if (tabela.containsKey(piloto)) {
			Setup setup = tabela.get(piloto);

			Scanner perguntaPde = new Scanner(System.in);
			System.out.println("DIANTEIRO ESQUERDO: ");
			double dianteiroEsquerdo = perguntaPde.nextDouble();

			Scanner perguntaPdd = new Scanner(System.in);
			System.out.println("DIANTEIRO DIREITO: ");
			double dianteiroDireito = perguntaPdd.nextDouble();

			Scanner perguntaPte = new Scanner(System.in);
			System.out.println("TRASEIRO ESQUERDO: ");
			double traseiroEsquerdo = perguntaPte.nextDouble();

			Scanner perguntaPtd = new Scanner(System.in);
			System.out.println("TRASEIRO DIREITO: ");
			double traseiroDireito = perguntaPtd.nextDouble();
			
			double diferencaDe = setup.getPressaoIdeal() - dianteiroEsquerdo;
			double diferencaDd = setup.getPressaoIdeal() - dianteiroDireito;
			double diferencaTe = setup.getPressaoIdeal() - traseiroEsquerdo;
			double diferencaTd = setup.getPressaoIdeal() - traseiroDireito;

			double pressaoDeCorrigida = setup.getDianteiroEsquerdo() + diferencaDe;
			double pressaoDdCorrigida = setup.getDianteiroDireito() + diferencaDd;
			double pressaoTeCorrigida = setup.getTraseiroEsquerdo() + diferencaTe;	
			double pressaoTdCorrigida = setup.getTraseiroDireito() + diferencaTd;	

			Scanner perguntaTemperaturaAmbiente = new Scanner(System.in);
			System.out.println("TEMPERATURA AMBIENTE: ");
			double temperaturaAmbienteAtual = perguntaTemperaturaAmbiente.nextDouble();

			Scanner perguntaTemperaturaPista = new Scanner(System.in);
			System.out.println("TEMPERATURA NA PISTA: ");
			double temperaturaPistaAtual = perguntaTemperaturaPista.nextDouble();
			
			double mediaTemperaturaAntiga = (setup.getTemperaturaAmbiente() + setup.getTemperaturaPista())/2;
			double mediaTemperaturaAtual = (temperaturaAmbienteAtual + temperaturaPistaAtual)/2;
			
			double diferencaTemperatura = (mediaTemperaturaAtual - mediaTemperaturaAntiga)/10;
			
			pressaoDeCorrigida = pressaoDeCorrigida - diferencaTemperatura;
			pressaoDdCorrigida = pressaoDdCorrigida - diferencaTemperatura;
			pressaoTeCorrigida = pressaoTeCorrigida - diferencaTemperatura;
			pressaoTdCorrigida = pressaoTdCorrigida - diferencaTemperatura;
			
			System.out.println("NOME: " + piloto + "\nTEMPERATURA ATUAL AMBIENTE: " + temperaturaAmbienteAtual + 
					" graus\nTEMPERATURA ATUAL NA PISTA: " + temperaturaPistaAtual + " graus\n\nMÉDIA DAS TEMPERATURAS: "
							+ "\nANTIGA: " + mediaTemperaturaAntiga + " graus\nATUAL: " + mediaTemperaturaAtual 
							+ " graus\n\n" + "SETUP CORRIGIDO: " + "\nDIANTEIRO ESQUERDO: " + pressaoDeCorrigida 
							+ "\nDIANTEIRO DIREITO: " + pressaoDdCorrigida + "\nTRASEIRO ESQUERDO: " + pressaoTeCorrigida
							+ "\nTRASEIRO DIREITO: " + pressaoTdCorrigida);
		} else {
			System.out.println("Seu banana");
		}
		return tabela;
	}
}
