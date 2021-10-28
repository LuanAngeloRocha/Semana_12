public class Administrador extends Empregado {
    
    private double ajudaCusto;

// polimorfismo, mesmo meetodo com comportmento diferente
    @Override
    public double calculaSalario(){

        return super.calculaSalario()+ajudaCusto;
        //super = ela responde a sua classe superior no caso (Administrador)
    }
}
