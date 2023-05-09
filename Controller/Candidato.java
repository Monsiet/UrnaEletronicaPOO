package Controller;


public abstract class Candidato {
    protected String nome;
    protected int votos;
    protected String batata = "batata";

    protected Candidato(String nome){
        this.nome = nome;
        this.votos = 0;
    }
    protected Candidato(){
    }

    public String getNome() {
        return nome;
    }
   
    public int getVotos() {
        return votos;
        
    }

    // public void adicionarVoto(){
    //     this.votos = this.votos + 1;
    // } teste

    @Override
	public String toString() {
		return "nome: " + nome + ", votos: " + votos;
	}
}
