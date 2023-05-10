package Projeto.Model;

public abstract class Chapa {
    protected String  id;
    protected String  presidente;
    protected String  vice;
    protected String  secretarioGeral;
    

    public String getId() {
        return this.id;
    }
    public String getPresidente() {
        return this.presidente;
    }
    public String getVice() {
        return this.vice;
    }
    public String getSecretario() {
        return this.secretarioGeral;
    }

}
