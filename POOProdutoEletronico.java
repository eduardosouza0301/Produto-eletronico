public class POOProdutoEletronico {

    public static void main(String[] args) {

        // Instanciação correta do objeto
        ProdutoEletronico microondas = new ProdutoEletronico("Microondas", 500.0, 12);

        microondas.aplicarDesconto(15);
        microondas.exibirInfo();
    }
}
