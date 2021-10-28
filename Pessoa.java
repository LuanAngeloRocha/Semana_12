public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;



    // Fazer os metodos de acesso publico 
    //Get e Set
    public void setNome(String nome){
        this.nome=nome;

        
    }
    //get
    public String getNome(){
        return this.nome;
        
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;

        
    }
    //get
    public String getTelefone(){
        return this.telefone;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;

        
    }
    //get
    public String setEndereco(){
        return this.endereco;
    }
    //Contrutor padrão, tem o nome da classe e sem instancia 
    
    //parametros
    public Pessoa(){

    }

//Construtor com um parametro 
    public Pessoa(String nome ){
        this.nome=nome;

    }
//Constrututor com dois parametros 

    public Pessoa(String nome, String telefone){
        this.nome=nome;
        this.telefone=telefone;

    }




    
}