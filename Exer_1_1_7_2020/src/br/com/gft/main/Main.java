package br.com.gft.main;
import java.util.Scanner;
import br.com.gft.model.Veiculo;

public class Main {

	public static void main(String[] args){
		
		String marca="Hyundai";
		String modelo="HB20";
		String placa="2222";
		String cor="Preto";
		boolean isligado=false;
		int qtdabastecer;
		int combustivel=100;
		int velocidade=0;
		int preco=2;
		
		Scanner sc=new Scanner(System.in);
		while(isligado==false) {
			System.out.println("LIGAR/DESLIGAR(resposta boolean):");
			isligado=sc.nextBoolean();
		}
		while(isligado==true && combustivel>0) {
			boolean contrFrear=false;
			boolean contrPintar=false;
			boolean contrAcelerar=false;
			
			Veiculo meuveiculo = new Veiculo(marca,modelo,placa,cor,isligado,combustivel,velocidade,preco);
			
			System.out.println("Você deseja abastecer quanto?");
			qtdabastecer=sc.nextInt();
			System.out.println("Você que frear?(resposta boolean)");
			contrFrear=sc.nextBoolean();
			System.out.println("Você que pintar seu veículo?(resposta boolean)");
			contrPintar=sc.nextBoolean();
			if(contrPintar==true) {
				System.out.println("Qual cor?");
				cor=sc.next();
			}
			System.out.println("Acelerar?(resposta boolean)");
			contrAcelerar=sc.nextBoolean();
			
			if(contrAcelerar==true) {
				meuveiculo.acelerar();
			}
			meuveiculo.abastecer(qtdabastecer);
			
			if(contrFrear==true) {
				meuveiculo.frear();
			}
			if(contrPintar==true) {
				meuveiculo.pintar(cor);
			}
			meuveiculo.pintar(cor);
			if(isligado==true) {
				meuveiculo.ligar();
			}
			else {
				meuveiculo.desligar();
			}
			
			
			System.out.println("STATUS DO VEÍCULO");
			System.out.println("Marca: "+marca);
			System.out.println("Modelo: "+modelo);
			System.out.println("Placa: "+placa);
			System.out.println("Cor: "+meuveiculo.getCor());
			System.out.print("O veículo está "+meuveiculo.getisLigado());
			System.out.println(" com velocidade de "+meuveiculo.getVelocidade()+"Km/h.");
			System.out.println("Está com "+meuveiculo.getLitrosCombustivel()+" litros de combustivel.");
			System.out.println("_________________________________________________________________________________");
		}
	}
}
