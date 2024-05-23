package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    // analisarCandidato(1900.0);
    imprimirSelecionados(); 
  }

  static void imprimirSelecionados(){
    String [] candidatos = {"Phillipe", "Marcos", "Luiz", "Fernando", "Pedro", "Arthur", "Gabriel", "João", "Diniz", "Cardoso"} ;
    System.out.println("Imprimindo a lista de candidatos informando o indece do elemento");
    for(int indice = 0; indice <= candidatos.length; indice++){
      System.out.println("O candidato de numero " + (indice+1) + " é " + candidatos[indice]);
    }
  }

// Função para seleção de candidato 
  static void selecaoCandidato(){
    String [] candidatos = {"Phillipe", "Marcos", "Luiz", "Fernando", "Pedro", "Arthur", "Gabriel", "João", "Diniz", "Cardoso"} ;
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while(candidatosSelecionados < 5){
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
      if(salarioBase >= salarioPretendido && candidatoAtual < candidatos.length){
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        candidatosSelecionados++;
      }else{
        System.out.println("O candidato não foi selecionado.");
      }
      candidatoAtual++;
    }
  }

//Pegar valores aleatorios entre 1800, 2200

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido){
      System.out.println("LIGAR PARA O CONDIDATO");
    }else if(salarioBase == salarioPretendido){
      System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }else{
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    }
  }
}
