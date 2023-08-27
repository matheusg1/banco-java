public class Conta {
    String nomeCliente;
    int numero;
    String agencia;
    Double saldo;
    
    public Conta(String nomeCliente, int numero, String agencia, Double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldoInicial;        
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public void depositar(Double saldo){
        this.saldo += saldo;
    }

    public void sacar(Double saldo){
        if(this.saldo <= saldo)
            this.saldo -= saldo;
    }

    @Override
    public String toString() {
        return "Olá, "+ getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência " + getAgencia() + ", conta " + getNumero() + " e seu saldo  " + getSaldo() + " já está disponível para saque.";
    }
}
