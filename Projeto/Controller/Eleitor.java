package Controller;


public class Eleitor {

    protected String id;
    protected Boolean voto;
    
    public Eleitor(String id) {
        this.id = id;
        this.voto = true;
    }

    public String getId(){
        return this.id;
    }
    
    public Boolean getVoto() {
        return voto;
    }

    public void voto() {
        this.voto = false;
    }
    
    
}
