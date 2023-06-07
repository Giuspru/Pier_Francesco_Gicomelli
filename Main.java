public class Main {
    public static void main(String[] args){
        AccountBancario conto1 = new AccountBancario("123456789" , 1000);
        conto1.mostraSaldo();
        conto1.effettuaTransazione(500, "Prelievo");
        conto1.effettuaTransazione(200, "Deposito");
        conto1.mostraSaldo();
    }
}