package objects;

/**
 * Esta clase almacenará el nombre de una cuenta y el estado que tiene
 * @author Daniel Mauricio Naranjo Benavides
 */
public class BankAccount {
    /***
     Propiedad en donde se almacenará el nombre de la cuenta bancaria
     */
    private int accountNumber;
    /***
     Esta propiedad es para validar el estado de la cuenta
     */
    protected boolean activated;

    /***
     * Método para obtener el estado de la cuenta
     * @return retorna true en caso de que la cuenta este activa, de lo contrario un false
     */
    public boolean getActivated() {
        return activated;
    }

    /***
     * Método para modificar el estado de la cuenta
     * @param activated Estado de la cuenta
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
