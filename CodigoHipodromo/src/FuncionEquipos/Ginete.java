package FuncionEquipos;

import SuperClase.Persona;

public class Ginete extends Persona {

    private String numero_de_caballo;
    private String peso_jinete;

    public Ginete() {
        this.numero_de_caballo = "No definido";
        this.peso_jinete = "No definido";
    }

    public Ginete(String numero_de_caballo, String peso_jinete) {
        this.numero_de_caballo = numero_de_caballo;
        this.peso_jinete = peso_jinete;
    }

    public Ginete(String numero_de_caballo, String peso_jinete, String Nombre,
            String FechaNacimiento, String ID, String Correo, String Telefono,
            String Password) {
        super(Nombre, FechaNacimiento, ID, Correo, Telefono, Password);
        this.numero_de_caballo = numero_de_caballo;
        this.peso_jinete = peso_jinete;
    }

    /**
     * @return the numero_de_caballo
     */
    public String getNumero_de_caballo() {
        return numero_de_caballo;
    }

    /**
     * @param numero_de_caballo the numero_de_caballo to set
     */
    public void setNumero_de_caballo(String numero_de_caballo) {
        this.numero_de_caballo = numero_de_caballo;
    }

    /**
     * @return the peso_jinete
     */
    public String getPeso_jinete() {
        return peso_jinete;
    }

    /**
     * @param peso_jinete the peso_jinete to set
     */
    public void setPeso_jinete(String peso_jinete) {
        this.peso_jinete = peso_jinete;
    }

}
