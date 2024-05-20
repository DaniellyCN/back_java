import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // essa linha exibe a mensagem na tela
        /*System.out.println("Hello world!");
        double num_decimal = 20.90;
        String palavra = "texto";
        Date date = new Date();

        byte theByte = -128;
        short theShort = 123;
        int theInt = 456;
        long theLong = 123456789L;
        float theFloat = 3.14f;
        double theDouble = 3.14;
        boolean sexoMasculino = true;
        char caractere = 'n';
        String nome = new String("Primeiro nome");
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());

        Pessoa alex = new Pessoa("alex");
        Pessoa mariana = alex;

        // antes de mudar o nome de alex
        System.out.println("Antes de mudar o nome de alex");
        System.out.println(alex.nome);
        System.out.println(mariana.nome);

        alex.nome = "Bia";

        // depois de mudar o nome de alex
        System.out.println("Depois de mudar o nome de alex");
        System.out.println(alex.nome);
        System.out.println(mariana.nome);

        //depois de mudar o nome de mariana
        mariana.nome = "Gisele";
        System.out.println("Depois de mudar o nome de mariana");
        System.out.println(alex.nome);
        System.out.println(mariana.nome);
        System.out.println(8 + (3 * 2) -2);
        System.out.println(Math.abs(-8));
        System.out.println((int) Math.pow(5,2));
        System.out.println(2 > 5 || 2==6);

        int idade = 18;
        if(idade > 18){
            System.out.println("maior de idade");
        }else if(idade == 18) {
            System.out.println("idade igual a 18");
        }else{
            System.out.println("menor de idade");
        }

        String messagem = idade >= 18 ? "meior de idade"
                : "menor de idade";
        System.out.println(messagem);

        String genero = "Masculino";
        if(genero.equals("Masculino")){
            System.out.println("masculino");
        } else if(genero.equals("Feminino")){
            System.out.println("feminimo");
        }else {
            System.out.println("prefere não indicar");
        }

        switch (genero) {
            case "Masculino":
                System.out.println("masculino");
                break;
            case "Feminino":
                System.out.println("feminino");
                break;
            case "Prefere_nao_indicar":
                System.out.println("prefere não indicar");
                break;
            default:
                break;
        }
        //arrays

        int [] numeros = new int[3];
        numeros[0] = 1;
        int [] numeros_sec = {10, 70, 2, -90};
        System.out.println(Arrays.toString(numeros_sec));

        // loops
        for(int i = 0; i < numeros.length; i ++) {
            System.out.println(numeros[i]);
        }
        for(int numero : numeros) {
            System.out.println(numeros[numero]);
        }
        Arrays.stream(numeros).forEach(System.out::println);
        int count = 0;
        do {
            System.out.println(count);
            count ++;
        } while ( count > 1);

        Scanner e = new Scanner(System.in);
        System.out.println("Qual seu nome");
        String nome2 = e.nextLine();
        System.out.println("Olá, " + nome2);
*/
        // metodos
        char[] letras = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        char letraP = 'A';
        int count2 = ocorrenciasLetras(letras, letraP);
        System.out.println(count2);

        Lente lente1 = new Lente("Sony", "85mm", true);
        Lente lente2 = new Lente("Canon", "35mm", false);

    }

    static class Lente {
        String marca;
        String tamanhoFoco;
        boolean premium;

        public Lente(String marca, String tamanhoFoco, boolean premium) {
            this.marca = marca;
            this.tamanhoFoco = tamanhoFoco;
            this.premium = premium;
        }
    }

    public static int ocorrenciasLetras(char [] letras, char letraProcurada){
        int count = 0;
        for (char letra : letras) {
            if (letra == letraProcurada)
                count ++;
        }
        return count;
    };
    static class Pessoa {
        String nome;
        Pessoa(String primeiroNome) {
            this.nome = primeiroNome;
        }
    }
}