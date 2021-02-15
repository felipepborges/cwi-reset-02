import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MinhaCasaMinhaDesgraca {

    public static void main(String[] args) throws Exception {

        System.out.println("\n ### Olá, seja bem vindo ao magnífico programa Minha Casa - Minha Desgraça ###\n");

        ImoveisParaFinanciamento opcoesParaFinanciamento = new ImoveisParaFinanciamento();

        /**
         * INÍCIO
         *
         * NÃO MODIFICAR ESTA CLASSE ANTES DESTA LINHA.
         */

        Imovel imovel1 = new Casa("Rua da Praia", 200, "", "Centro", "Porto Alegre", UnidadeFederativa.RIO_GRANDE_DO_SUL, 250000, true);

        Imovel imovel2 = new Apartamento("Rua Fortaleza", 550, "AP 405", "Centro", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO, 550000, 4);

        Imovel imovel3 = new Apartamento("Rua 20 de Setembro", 700, "AP 303", "Bela Vista", "São Paulo", UnidadeFederativa.SAO_PAULO, 400000, 3);

        Imovel imovel4 = new Casa("Rua 15 de Novembro", 330, "", "Bela Vista", "São Paulo", UnidadeFederativa.SAO_PAULO, 1250000, true);

        Imovel imovel5 = new Apartamento("Rua São Leopoldo", 110, "AP 510", "Centro", "São Leopoldo", UnidadeFederativa.RIO_GRANDE_DO_SUL, 120000, 5);

        Imovel imovel6 = new Casa("Rua Boa Vista", 330, "", "Boa Vista", "Portão", UnidadeFederativa.RIO_GRANDE_DO_SUL, 45000, false);

        Imovel imovel7 = new Casa("Rua Floripa", 330, "", "Centro", "Florianópolis", UnidadeFederativa.SANTA_CATARINA, 150000, false);


        opcoesParaFinanciamento.registrarImovel(imovel1);
        opcoesParaFinanciamento.registrarImovel(imovel2);
        opcoesParaFinanciamento.registrarImovel(imovel3);
        opcoesParaFinanciamento.registrarImovel(imovel4);
        opcoesParaFinanciamento.registrarImovel(imovel5);
        opcoesParaFinanciamento.registrarImovel(imovel6);
        opcoesParaFinanciamento.registrarImovel(imovel7);


        /**
         * FIM
         *
         * NÃO MODIFICAR ESTA CLASSE APÓS ESTA LINHA.
         */



        List<Imovel> todasAsOpcoes = opcoesParaFinanciamento.buscarOpcoes(Double.MAX_VALUE);
        if (todasAsOpcoes == null || todasAsOpcoes.isEmpty()) {
            throw new RuntimeException("\n\nAtenção! Você precisa registrar opções de financiamento antes de começar a usar o programa.\n"
                    + "Use o método 'registrarImovel', do objeto 'opcoesParaFinanciamento', para incluir algumas opções.\n");
        }

        System.out.println("\nVamos lá, preciso de algumas respostas...\n");
        Thread.sleep(1000);

        System.out.println(" Qual é o teu nome?");
        String nomeBeneficiario = new Scanner(System.in).next();
        Thread.sleep(500);

        System.out.println(" Agora eu preciso saber sobre a mascada, "+ nomeBeneficiario +". Qual é o teu salário?");
        double salarioBeneficiario = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        Beneficiario beneficiario = new Beneficiario(nomeBeneficiario, salarioBeneficiario);

        System.out.println(" Hummmm, tá grandão hein. E qual é o limite do valor de imóveis que você procura?");
        double valorParaPesquisa = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        System.out.println("\nTá, deixa eu ver aqui o que eu tenho de opções até "+ DecimalFormat.getCurrencyInstance().format(valorParaPesquisa) +"...");
        Thread.sleep(new Random().nextInt(4000) + 1000);

        List<Imovel> opcoesViaveis = opcoesParaFinanciamento.buscarOpcoes(valorParaPesquisa);
        if (opcoesViaveis == null || opcoesViaveis.isEmpty()) {
            throw new RuntimeException("\n\nPQP! Essa desgraça de programa não tem casas neste valor! Comece uma nova simulação.");
        }

        System.out.println("\nCerto! Encontrei "+ opcoesViaveis.size() + " opções aqui. Dá uma olhada:");
        int index = 0;
        for (Imovel imovel : opcoesViaveis) {
            System.out.printf(" [%d] %s\n", ++index, imovel.apresentacao());
            Thread.sleep(250);
        }

        Imovel imovelEscolhido = null;
        while (imovelEscolhido == null) {

            Thread.sleep(250);

            System.out.println("\nQual a opção que mais te agrada? (Me diz apenas o número.)");
            int opcaoEscolhida = new Scanner(System.in).nextInt();

            Thread.sleep(250);

            if (opcaoEscolhida < 1 || opcaoEscolhida > opcoesViaveis.size()) {
                System.out.println(" > Opção inválida!");
            } else {
                imovelEscolhido = opcoesViaveis.get(opcaoEscolhida - 1);
            }
        }

        System.out.println("\nShow de bola! Agora me diz em quantos meses você quer pagar essa tranqueira:");
        int mesesParaPagamento = new Scanner(System.in).nextInt();

        System.out.printf("\nHumm, certo %s. Você ganha %s e quer financiar um imóvel de %s, no estado %s, pagando em %d meses. Deixa eu ver se é possível...\n\n",
                beneficiario.getNome(),
                DecimalFormat.getCurrencyInstance().format(beneficiario.getSalario()),
                DecimalFormat.getCurrencyInstance().format(imovelEscolhido.getValor()),
                imovelEscolhido.getEndereco().getEstado().getNome(), // só adicionei o getNome() pra sair o nome formatado
                mesesParaPagamento);
        Thread.sleep(new Random().nextInt(4000) + 1000);

        PropostaFinanciamento financiamento = new PropostaFinanciamento(beneficiario, imovelEscolhido, mesesParaPagamento);
        financiamento.validarProposta();
    }
}
