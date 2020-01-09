package br.com.gft.model;

public class Veiculo {
	private String Marca, Modelo, Placa, Cor;
	private float Km;
	private boolean isLigado;
	private int LitrosCombustivel, Velocidade;
	private double Preco;
	
	//construtor
	public Veiculo(String marca, String modelo, String placa, String cor, boolean isligado, int combustivel, int velocidade, double preco){
		this.Marca=marca;
		this.Modelo=modelo;
		this.Placa=placa;
		this.Cor=cor;
		this.isLigado=isligado;
		this.LitrosCombustivel=combustivel;
		this.Velocidade=velocidade;
		this.Preco=preco;
	}
	//métodos
	public void acelerar() {
		if(this.isLigado==true) {
			this.LitrosCombustivel--;
			this.Velocidade+=20;
		}
	}
	public void abastecer(int qtdLitros) {
		if(this.LitrosCombustivel<100) {
			this.LitrosCombustivel+=qtdLitros;
			if(this.LitrosCombustivel<0) {
				this.LitrosCombustivel=0;	
			}
			if(this.LitrosCombustivel>100) {
				this.LitrosCombustivel=100;
			}
		}
	}
	public void frear() {
		if(this.isLigado==true) {
			if(this.Velocidade>0) {
				this.Velocidade-=10;
			}
		}
	}
	public void pintar(String cor) {
		this.Cor=cor;
	}
	public void ligar() {
		if(this.isLigado==false) {
			this.isLigado=true;
		}
	}
	public void desligar() {
		if(this.isLigado==true) {
			this.isLigado=false;
			this.Velocidade=0;
		}
	}
	
	//get e set
	public String getCor() {
		return this.Cor;
	}
	public boolean getisLigado() {
		return this.isLigado;
	}
	public int getLitrosCombustivel() {
		return this.LitrosCombustivel;
	}
	public int getVelocidade() {
		return this.Velocidade;
	}
}
