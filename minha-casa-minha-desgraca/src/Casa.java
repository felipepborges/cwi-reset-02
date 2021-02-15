public class Casa extends Imovel{

    private boolean patio;

    public Casa(String logradouro, int numero, String complemento, String bairro, String cidade, UnidadeFederativa estado, double valor, boolean patio) {
        super(logradouro, numero, complemento, bairro, cidade, estado, valor);
        this.patio = patio;
    }
    public String apresentacao(){
        return "Tipo do imóvel : Casa" +
                "\nCasa com pátio: " + respostaPatio(this.patio) + "\n" +
                super.apresentacao();
    }

    private String respostaPatio(boolean patio){
        if(patio == true){
            return "Sim";
        }else{
            return "Não";
        }
    }
}
