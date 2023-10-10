public class TestaEmpregado {
    public static void main(String[] args) {

        Departamento departamento1 = new Departamento(1, Setor.RH);
        Departamento departamento2 = new Departamento(2, Setor.CPD);

        Gerente gerente = new Gerente("Antônio", 3000, departamento2, "Administrativo");
        String nome = gerente.getNome();
        
        
        double salarioBruto = gerente.abonoSalario();
        double impostoDeRenda = gerente.calculoImpostoDeRenda();
        double inss = gerente.calculoInss();
        double valeTransporte =  gerente.calculoValeTransporte();
        double totalDescontos = impostoDeRenda + inss + valeTransporte - salarioBruto;

        
        System.out.println("Nome: " + nome ); 
        System.out.println("Salário Bruto com Abono: " + salarioBruto );
        System.out.println("IR: " +  impostoDeRenda  );
        System.out.println("INSS: " + inss );
        System.out.println("VT: " + valeTransporte);
        System.out.println("Descontos IP/INSS/VT: " + totalDescontos );
    }

}    
    





