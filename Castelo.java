public abstract class Castelo {
	
	private int defesa;
	private int pontosVida;
	private String nome;
	
	public Castelo(int defesa, int pontosVida, String nome) {
		super();
		this.defesa = defesa;
		this.pontosVida = pontosVida;
		this.nome = nome;
	}
	
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public int getPontosVida() {
		return pontosVida;
	}
	public void setPontosVida(int pontosVida) {
		this.pontosVida = pontosVida;
	}
	
	public String getNome() {
		return nome;
	}
	/*public void setNome(String nome) {
		this.nome = nome;
	}*/
	
	public String toString() {
		return this.defesa + ", " + this.pontosVida + ", " + this.nome;
	}
	
	public String situacao() {
		return "Informações do Castelo:\n"
				+ "Nome................: " + this.getNome() + "\n"
				+ "Defesa..............: " + this.getDefesa() + "\n"
				+ "Pontos de Vida......: " + this.getPontosVida() + "\n";
	}

	public boolean ataque(double atk) {
		if(this.defesa > 0) {
			double def = this.getDefesa() - atk;
			this.setDefesa((int)def);
			return true;
		}else if(this.pontosVida > 0){
			double pv = this.getPontosVida() - atk;
			this.setPontosVida((int)pv);
			this.setDefesa(3);
			return true;
		}else {
			return false;
		}
	}
	
}
