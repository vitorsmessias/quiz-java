import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> correctAnswers = new ArrayList<>(Arrays.asList("a", "a", "b", "b", "d", "a", "c", "b", "c", "d"));
		ArrayList<String> userAnswers = new ArrayList<>();
		User user = new User();
		int score = 0;
		int count = 0;
		
		System.out.println("----------------- QUIZ DO CORINTHIANS -------------------");
		System.out.println("---------------------------------------------------------");
		System.out.println("----- DIFICULDADES: FACIL, INTERMEDIARIO E DIFICIL ------");
		System.out.println("--------- TODAS AS PERGUNTAS TEM O MESMO PESO -----------");
		System.out.println("--- CONSIGA 60 PONTOS PARA SER APROVADO! BOA SORTE =) ---");
		System.out.println("---------------------------------------------------------");
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE SEU NOME: ");
		user.setNome(sc.nextLine());
		System.out.println("---------------------------------------------------------");
		System.out.println("\n\n\n");
		System.out.println("BEM VINDO(A), " + user.getNome());
		
		System.out.println("-----------------FACIL----------------");
		System.out.println("1) QUAL O ANO DE FUNDACAO DO CORINTHIANS?");
		System.out.println("a) 1910");
		System.out.println("b) 2020");
		System.out.println("c) 2002");
		System.out.println("d) 1999");
		userAnswers.add(sc.nextLine());		
		System.out.println("---------------------------------------------------------");
		System.out.println("2) QUAL O NOME DO TECNICO CAMPEAO MUNDIAL PELO CORINTHIANS EM 2012?");
		System.out.println("a) TITE");
		System.out.println("b) FELIPAO");
		System.out.println("c) MAURO CEZAR PEREIRA");
		System.out.println("d) VITOR PEREIRA");
		userAnswers.add(sc.nextLine());		
		System.out.println("---------------------------------------------------------");
		System.out.println("3) QUAL O ANO DO UNICO TITULO DA LIBERTADORES DO CORINTHIANS?");
		System.out.println("a) 1999");
		System.out.println("b) 2012");
		System.out.println("c) 2020");
		System.out.println("d) 2018");
		userAnswers.add(sc.nextLine());		
		System.out.println("---------------------------------------------------------");
		System.out.println("-----------------INTERMEDIARIO----------------");
		System.out.println("4) JOAO ALVES DE ASSIS SILVA, MAIS CONHECIDO COMO 'X', E UM FUTEBOLISTA BRASILEIRO QUE ATUA COMO CENTROAVANTE. ATUALMENTE, JOGA PELO CORINTHIANS.");
		System.out.println("a) X = 'MOSQUITO'");
		System.out.println("b) X = 'JO'");
		System.out.println("c) X = 'GUERRERO'");
		System.out.println("d) X = 'CRAQUE NETO'");
		userAnswers.add(sc.nextLine());		
		System.out.println("---------------------------------------------------------");
		System.out.println("5) QUAL O NOME DO ATACANTE QUE FEZ O UNICO GOL DA PARTIDA NA FINAL DO MUNDIAL CONTRA O CHELSEA, EM TOQUIO?");
		System.out.println("a) ROMARINHO");
		System.out.println("b) DANILO");
		System.out.println("c) CHICAO");
		System.out.println("d) PAOLO GUERRERO");
		userAnswers.add(sc.nextLine());		
		System.out.println("---------------------------------------------------------");
		System.out.println("6) QUEM E O CAMISA 10 DO CORINTHIANS ATUALMENTE?");
		System.out.println("a) WILLIAN");
		System.out.println("b) JO");
		System.out.println("c) RENATO AUGUSTO");
		System.out.println("d) ROGER GUEDES");
		userAnswers.add(sc.nextLine());		
		System.out.println("---------------------------------------------------------");
		System.out.println("7) QUAL O NOME DO ESTADIO EM QUE O CORINTHIANS FOI CAMPEAO DA LIBERTADORES PELA PRIMEIRA VEZ?");
		System.out.println("a) BOMBONERA");
		System.out.println("b) MORUMBI");
		System.out.println("c) PACAEMBU");
		System.out.println("d) NEO QUIMICA ARENA");
		userAnswers.add(sc.nextLine());	
		System.out.println("---------------------------------------------------------");
		System.out.println("-----------------DIFICIL----------------");
		System.out.println("8) QUANTAS VEZES O CORINTHIANS FOI CAMPEAO PAULISTA?");
		System.out.println("a) 25");
		System.out.println("b) 30");
		System.out.println("c) 32");
		System.out.println("d) 14");
		userAnswers.add(sc.nextLine());		
		System.out.println("---------------------------------------------------------");
		System.out.println("9) QUAL O NOME DO SEGUNDO MAIOR ARTILHEIRO DE TODOS OS TEMPOS DA NEO QUIMICA ARENA (ESTADIO DO CORINTHIANS)?");
		System.out.println("a) PAULINHO");
		System.out.println("b) JO");
		System.out.println("c) ROMERO");
		System.out.println("d) ROGER GUEDES");
		userAnswers.add(sc.nextLine());		
		System.out.println("---------------------------------------------------------");
		System.out.println("10) QUEM FOI O ADVERSARIO DO CORINTHIAS NA SEMI-FINAL DA LIBERTADORES DE 2012?");
		System.out.println("a) RIVER PLATE");
		System.out.println("b) PALMEIRAS");
		System.out.println("c) BOCA JUNIORS");
		System.out.println("d) SANTOS");
		userAnswers.add(sc.nextLine());		
		System.out.println("---------------------------------------------------------");
		
		
		sc.close();

		try {
			for(String correctAnswer : correctAnswers) {
				if(correctAnswer.equals(userAnswers.get(count).toLowerCase())){
					score += 10;
					count++;
				}
			}
		} catch(Exception e){
			
		}
		
		System.out.println("\n\n\n");
		System.out.println("--------------------------- RESULTADO ------------------------------");
		System.out.println("PONTUACAO: " + score);
		System.out.println(user.getNome() + ", VOCE FOI: " + user.generateApproval(score));
		
	}
}
