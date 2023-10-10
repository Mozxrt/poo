public class Gerente extends Empregado {
    
    private String tipo;


    public Gerente(String nome, double salarioBruto, Departamento departamento, String tipo) {
        super(nome, salarioBruto, departamento);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

