public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    // fazer os metodos de alteração 
    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor= codigoSetor ;

    }
    //metrodo de consulta 
    public int getcodigoSetor (){
        return this.codigoSetor;

    }
     // fazer os metodos de alteração 
     public void setsalarioBase(double salarioBase){
        this.salarioBase= salarioBase ;

    }
    //metrodo de consulta 
    public double getsalarioBase (){
        return this.salarioBase;
        
    }
     // fazer os metodos de alteração 
     public void setimposto(double imposto){
        this.imposto= imposto ;

    }
    //metrodo de consulta 
    public double getimposto (){
        return this.imposto;
        
    }
    public double calculaSalario(){
        double salarioLiquido = 0;
        salarioLiquido = this.salarioBase - this.imposto;
        //calculo do salario liquido
        return salarioLiquido;
    }
    

}
