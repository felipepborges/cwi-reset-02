public abstract class Imovel {

    private double valor;
    private Endereco endereco;

    public Imovel(String logradouro, int numero, String complemento, String bairro, String cidade, UnidadeFederativa estado, double valor) {
       endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, estado);
        this.valor = valor;
    }
    public String apresentacao(){
        return  "Imóvel localizado no seguinte endereço: \n" +
                "Logradouro: " + endereco.getLogradouro() +
                "\nNúmero: " + endereco.getNumero() +
                "\nComplemento: " + endereco.getComplemento() +
                "\nBairro: " + endereco.getBairro() +
                "\nCidade: " + endereco.getCidade() +
                "\nEstado: " + endereco.getEstado().getNome() +
                "\nValor do imóvel: R$ " + this.valor + "\n";
    }

    public double getValor() {
        return valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
