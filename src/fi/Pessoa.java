package fi;
public class Pessoa {
    
    private static final int IDADE_MINIMA=18;

    private final String nome;
    private final int idade;
    private final boolean cartaConducao;
    private boolean  estouNoCarro;

    public Pessoa(String nome, int idade, boolean cartaConducao) {
        this.nome = nome;
        this.idade = idade;
        this.cartaConducao = cartaConducao;
        this.estouNoCarro=false;
    }

   
    

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public boolean isEstouNoCarro() {
        return estouNoCarro;
    }

    public boolean isCartaConducao() {
        return cartaConducao;
    }
    
    //só consulta, nao altera nada
    public boolean podeEntrarNoCarro(){
        return idade>=IDADE_MINIMA && cartaConducao;
    }
    
    //devolve true se conseguir entrar
    public boolean entrarNoCarro(){
        if(estouNoCarro||!podeEntrarNoCarro()){
            return false;
        }
        estouNoCarro=true;
        return true;
    }    
    
    //devolve true se coseguir sair
    public boolean sairDoCarro(){
        if(!estouNoCarro){
        return false;
        }
        estouNoCarro=false;
        return true;
              
    }

   
}
