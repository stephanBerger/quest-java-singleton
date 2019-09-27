public class Singleton {

    private static Singleton instance;

    // TODO 1 : fix singleton bad implementation
    public static Singleton getInstance() {
    	if (instance == null) {
            // Si aucune instance existe on en crée une
            instance = new Singleton();
        }
        // Si une instance existe deja on la retourne.
        return instance;
       
    }

    private Bank bank;

    public void openAccount(int value) {
        bank = new Bank(value);
    }

    public void deposit(int value) {
        bank.setTotal(bank.getTotal() + value);
    }

    public void withdraw(int value) {
        bank.setTotal(bank.getTotal() - value);
    }

    public Bank getBank() {
        return bank;
    }
}