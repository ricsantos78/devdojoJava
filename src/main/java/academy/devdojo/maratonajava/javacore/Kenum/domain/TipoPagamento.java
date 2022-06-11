package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento {
    DEBITO(2){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO(1){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    private final int tipoPagamento;

    TipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double calcularDesconto(double valor){
        return 0;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }
}