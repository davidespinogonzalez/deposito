/**
 * Clase que representa una cuenta bancaria
 * con operaciones básicas como ingresar y retirar dinero.
 */
public class CCuenta {

    /** Nombre del titular */
    private String nombre;

    /** Número de cuenta */
    private String cuenta;

    /** Saldo actual */
    private double saldo;

    /** Tipo de interés */
    private double tipoInteres;

    /**
     * Constructor por defecto
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    /**
     * Devuelve el saldo actual
     * @return saldo
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa dinero en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Retira dinero de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception si no hay saldo suficiente o cantidad inválida
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo -= cantidad;
    }

    // 🔹 GETTERS Y SETTERS (encapsulación completa)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}