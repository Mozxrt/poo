public class Departamento {
    
    
    private int codigo;
    private Setor setor;

        public Departamento(int codigo, Setor setor) {
        this.codigo = codigo;
        this.setor = setor;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}