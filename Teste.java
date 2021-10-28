public class Teste{
    public static void main (String args[]){
        //criando o objeto empregado 
        Empregado empregado = new Empregado();
        empregado.setCodigoSetor(1);
        empregado.setsalarioBase(1000);
        empregado.setimposto(100);
        empregado.setNome("Luan");
        empregado.setEndereco("Pompeia - ");
        empregado.setTelefone("140987585748");
        //Os metodos setnome, setendereco, settelefone são herdados da classe pessoa
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        //Apresentando o salario liquido 
        System.out.println(empregado.calculaSalario());
    }
}