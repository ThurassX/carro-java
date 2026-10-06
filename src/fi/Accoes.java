package fi;
public class Accoes {

   // Pessoa pessoa=new Pessoa("Thurass10",24,false);
    
    public static void entrarNoCarro(Pessoa pessoa){
        if(pessoa.isEstouNoCarro()==false){
            if(pessoa.entrarNoCarro(pessoa)==true){
                pessoa.setEstouNoCarro(true);
                System.out.println("entrou no carro");
        }else
            System.out.println("nao tens idade suficiente ou nao tens carta");    
        }else
            System.out.println("nao pode entrar no carro se voce ja esta dentro dele");
            
    }
    
    
    
    
    public static void sairDoCarro(Pessoa pessoa){
    
        if(pessoa.estouNoCarro(pessoa)==true){
            pessoa.setEstouNoCarro(false);
            System.out.println("saiu do carro");
        }else
            System.out.println("voce ja esta fora seu babaca!");
        
        
        
    }
    
    
    
    
    
}
