package br.dio.bootcamp;

public class Teste {
    public static void main(String[] args) {

        int i;
        //int i; variavel repetida
        int I;
        //int 1a; nao pode comecar com numero
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15; nao pode alterar o valor de uma variavel constante
        int asrn24678md;
        //int asrn246 78md; nao pode haver espacos
        int asrn2$4678_md = 10;
        //int asrn2$46%78_md =10; nao pode haver caracteres especiais

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; nao utiliza a notacao camelo
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTENTATIVAS = 5; nao se usa notacao camelo para variavel constante
        int QUANTIDADE_OPCOES = 25;
        //int qtdProd; falha na expressividade, nao e possivel entender do que trata

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}
