package Controller;

import Model.Usuario;

public class Eleitor extends Usuario{
    protected Boolean voto;
    
    public Eleitor(String identidade) {
        this.identidade = identidade;
        this.voto = true;
    }

    public String getId(){
        return this.identidade;
    }
    
    public Boolean getVoto() {
        return voto;
    }

    public void voto() {
        this.voto = false;
    }
    
    
}
