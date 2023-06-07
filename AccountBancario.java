public class AccountBancario {
    private String numeroConto;
    private double saldo;

    public AccountBancario(String numeroConto, double saldo) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(String numeroConto) {
        this.numeroConto = numeroConto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double importo) {
        saldo += importo;
    }

    public void preleva(double importo) {
        if(importo > saldo) {
            System.out.println("Non posso prelevare");
        } else {
            saldo -= importo;
        }
    }

    public void effettuaTransazione(double importo, String tipoTransazione) {
        if(tipoTransazione == "Prelievo") {
            preleva(importo);
        } else if(tipoTransazione == "Deposito") {
            deposita(importo);
        } else {
            System.out.println("Tipo transazione non riconosciuto");
        }
    }
    public void mostraSaldo() {
        System.out.println(this.saldo);
    }
}
