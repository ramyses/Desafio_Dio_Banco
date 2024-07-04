
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 001;
	private static int SEQUENCIAL = 0;
	
	//atributos
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	
	
	public Conta( Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
}
	
	
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}

	@Override
	public void tranferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	//get

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Cliente: %s", cliente.getNome()));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Conta: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}



	



	
	
}
