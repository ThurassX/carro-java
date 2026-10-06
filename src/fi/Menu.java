package fi;

import java.util.Scanner;

public class Menu {
    
    

    Scanner sc=new Scanner(System.in);
    void start(){
        while(true){
        System.out.println("\nBem vindo: \n1-criar uma personagem\n2-sair");
        int op=lerInt("opcao: ");
        switch(op){
            case 1:
                menuInterno(criarPessoa());break;
            case 2:
                System.out.println("a sair...");return;
            default:
                System.out.println("opcao invalida");
        }
        }
    }
    
    private Pessoa criarPessoa(){
    
        System.out.println("nome da personagem");
        String nome=sc.nextLine().trim();
        int idade=lerInt("Idade de "+nome+": ");
        boolean carta=lerSimNao("tem carta de conducao? (sim/nao): ");
        return new Pessoa(nome, idade, carta);
    }
    public void menuInterno(Pessoa pessoa){
      //  Accoes ac=new Accoes();
        //Scanner sc=new Scanner(System.in);
        //int op;
        while(true){
        System.out.println("\n"+pessoa.getNome()+" esta "+ (pessoa.isEstouNoCarro()?"dentro":"fora")+" do carro.");
            System.out.println("1-entrar no carro\n2-sair do carro\n3-voltar");
        int op=lerInt("opcao: ");
        if(op==1){
            entrar(pessoa);
            }else if(op==2){
                sair(pessoa);
                }else if(op==3){
                    return;
                }else{
                    System.out.println("opcao invalida");
        }
        }
    }
    private void entrar(Pessoa pessoa){
        if(pessoa.isEstouNoCarro()){
            System.out.println("ja estas dentro do carro");
        }else if(!pessoa.podeEntrarNoCarro()){
            System.out.println("noa tens idade suficiente ou nao tens carta");
        }else{
            pessoa.entrarNoCarro();
            System.out.println("entrou no carro");
        }
    }
    
    private void sair(Pessoa pessoa){
        if(pessoa.sairDoCarro()){
            System.out.println("saiu do carro");
        }else{
            System.out.println("ja estas fora do carro");
        }
    }
    
    private int lerInt(String mensagem){
        while(true){
            System.out.println(mensagem);
            try{
                return Integer.parseInt(sc.nextLine().trim());
            }catch(NumberFormatException e){
                System.out.println("isso nao é um numero, tente novamente");
            }
        }
    }
    
    private boolean lerSimNao(String mensagem){
        while(true){
            System.out.println(mensagem);
        String r =sc.nextLine().trim().toLowerCase();
        if(r.equals("sim")||r.equals("s")){
            return true;
        }if(r.equals("nao")||r.equals("não")||r.equals("n")){
        return false;
        }
            System.out.println("responde sim ou nao");
        }
    }
    
    
    
}
