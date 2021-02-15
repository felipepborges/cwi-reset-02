public class PropostaFinanciamento {
    /*
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */

    private Beneficiario beneficiario;
    private Imovel imovelEscolhido;
    private int mesesParaPagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovelEscolhido, int mesesParaPagamento) {
        this.beneficiario = beneficiario;
        this.imovelEscolhido = imovelEscolhido;
        this.mesesParaPagamento = mesesParaPagamento;
    }

    public void validarProposta() {

        double relacaoValorImovelSalario = (imovelEscolhido.getValor()/(beneficiario.getSalario()*mesesParaPagamento));

        if (imovelEscolhido.getEndereco().getEstado() == UnidadeFederativa.SAO_PAULO && relacaoValorImovelSalario <= 0.65){
            imprimirPropostaAprovada();

        } else if(imovelEscolhido.getEndereco().getEstado() == UnidadeFederativa.RIO_DE_JANEIRO && relacaoValorImovelSalario <= 0.6) {
            imprimirPropostaAprovada();

        }else if(imovelEscolhido.getEndereco().getEstado() != UnidadeFederativa.RIO_DE_JANEIRO &&
                imovelEscolhido.getEndereco().getEstado() != UnidadeFederativa.SAO_PAULO &&
                relacaoValorImovelSalario <= 0.5){
            imprimirPropostaAprovada();

        }else{
            imprimirPropostaNegada();
        }


    }
    private void imprimirPropostaAprovada(){
        System.out.println("Beneficiário: " + beneficiario.getNome());
        System.out.println("Imóvel escolhido: " + imovelEscolhido.apresentacao() + "\n");
        System.out.println("Prazo para pagamento: " + mesesParaPagamento);
        System.out.println("Parabéns! Sua proposta foi aceita!");
    }

    private void imprimirPropostaNegada(){
        System.out.println("Beneficiário: " + beneficiario.getNome());
        System.out.println("Imóvel escolhido: " + imovelEscolhido.apresentacao() + "\n");
        System.out.println("Prazo para pagamento: " + mesesParaPagamento);
        System.out.println("Não foi dessa vez! Proposta negada!");
    }


}
