package Controller;


public class Candidatos {
    private String nome;
    private String id;
    private int votos;

    public Candidatos(String n, String i){
        this.nome = n;
        this.id = i;
        this.votos = 0;
    }
    public Candidatos(){
        
    }

    public String getNome() {
        return nome;
    }
    public String getId() {
        return id;
    }
    public int getVotos() {
        return votos;
    }

    public void adicionarVoto(){
        this.votos = this.votos + 1;
    }

    @Override
	public String toString() {
		return "nome: " + nome + ", id: " + id + ", votos: " + votos;
	}
}
