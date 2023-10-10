
public class Empregado implements Calculos {

    private String nome;
    private double salarioBruto;

    public Empregado(String nome, double salarioBruto, Departamento departamento) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        Departamento = departamento;
    }

    private Departamento Departamento;

    public Empregado(Departamento departamento) {
        Departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Departamento getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.Departamento = departamento;
    }

   

    public double calculoInss() {
        
         double salarioBruto = getSalarioBruto() + 100;

        if (salarioBruto <= 1751.81) {
            return salarioBruto * 0.08;
        } else if (salarioBruto <= 2919.72) {
            return salarioBruto * 0.09;
        } else if (salarioBruto <= 5839.45) {
            return salarioBruto * 0.11;
        } else {
            return 5839.45 * 0.11;
        }
    }

    public double calculoValeTransporte() {
        
         double salarioBruto = getSalarioBruto() + 100;

        return salarioBruto * 0.06;
    }

    public double calculoImpostoDeRenda() {
       
         double salarioBruto = getSalarioBruto() + 100;

        if (salarioBruto > 4000) {
            return salarioBruto * 0.15;
        } else if (salarioBruto > 1500) {
            return salarioBruto * 0.075;
        } else {
            return 0;
        }

    }

    @Override
    public double abonoSalario() 
        {
        double salarioBruto = getSalarioBruto() + 100;

        return salarioBruto;

    }
    }
