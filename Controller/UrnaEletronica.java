package Projeto;

public class UrnaEletronica {
    Candidato vitor = new Candidato("Vitor");
    Candidato benevides = new Candidato("Benevides");
        
    public void votar(String id) {
        switch (id) {
            case "vitor":
                vitor.adicionarVoto();
            case "benevides":
                benevides.adicionarVoto();
            default:
                System.out.println("Erro");
        }
    }
    public int votos(String id) {
        int v;
        switch (id) {
            case "vitor":
                v = vitor.getVotos();
            case "benevides":
                v = benevides.getVotos();
            default:
                v = 0;
        }
        return v;
    }
}
