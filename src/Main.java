import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] citys = {"Tóquio", "Noruega", "Rio de Janeiro", "Paris"};
        String[] citysResposta1 = {"teste","teste"};
        String citysResposta2;


        System.out.println("Bem vindo a recomendações de viagens. Digite os numeros correspondente de cada resposta");
        System.out.println("Pergunta 1: Você prefere clima quente ou frio? " + "\n 1. Quente" + "\n 2. Frio" );

        Integer resposta = ler();

        if (resposta != 1 && resposta != 2){
            System.out.println("Erro ao digitar a resposta");
            return;
        }
        else if (resposta == 1){
            citysResposta1[0] = citys[2];
            citysResposta1[1] = citys[0];
        }
        else {
            citysResposta1[0] = citys[1];
            citysResposta1[1] = citys[3];
        }

        System.out.println("Pergunta 2: Você gosta mais de natureza ou cidade? " + "\n 1. Cidade" + "\n 2. Natureza" );

        resposta = ler();

        if (resposta != 1 && resposta != 2){
            System.out.println("Erro ao digitar a resposta");
            return;
        }
        else if (resposta == 1){
            citysResposta2 = citysResposta1[1];
        }
        else {
            citysResposta2 = citysResposta1[0];
        }
        System.out.println(citysResposta2);
    }

    public static Integer ler() {
        Scanner leitor = new Scanner(System.in);
        String str = leitor.nextLine();

        System.out.println(str.matches("[0-9]"));

        if(str.isBlank() || !str.matches("[0-9]") ){
            return 0;
        }

        return Integer.valueOf(str);

    }
}
