package entities;

public class Bicicleta {
	public int ritmo; //public: pode ser acessado de qualquer lugar
	private int velocidade; //private: Apenas acessivel a propria classe
	protected int catraca; //protected: Apenas acessivel a propria classe e as subclasses
	
	String nome; //default: apenas acessivel ao pacote
	
	public Bicicleta() {
		ritmo = 10;
		velocidade = 50;
		catraca = 1;
	}
	
	public Bicicleta(int ritmo, int velocidade, int catraca, String nome) {
		super();
		this.ritmo = ritmo;
		this.velocidade = velocidade;
		this.catraca = catraca;
		this.nome = nome;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void aumentarVelocidade(int quantidade) {
		this.velocidade += quantidade;
	}
	
	public void diminuirVelocidade(int quantidade) {
		this.velocidade += quantidade;
	}
	@Override
	public String toString() {
        return "catraca: " + catraca +
                " ritmo: " + ritmo +
                " velocidade: " + velocidade +
                " nome: " + nome;
	}
}
