package FuncionEquipos;

import SuperClase.Persona;

public class Propietario extends Persona {

    private String equipo;
    private Caballo caballo;
    private double ganancia;

    public Propietario() {

        this.equipo = "No definido";
        this.caballo = new Caballo();
        this.ganancia = 0.0;
    }

    public Propietario(String equipo, Caballo caballo, double ganancia) {
        this.equipo = equipo;
        this.caballo = caballo;
        this.ganancia = ganancia;
    }

    public Propietario(String equipo, Caballo caballo, double ganancia, String Nombre, String FechaNacimiento, String ID, String Correo, String Telefono, String Password) {
        super(Nombre, FechaNacimiento, ID, Correo, Telefono, Password);
        this.equipo = equipo;
        this.caballo = caballo;
        this.ganancia = ganancia;
    }

    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the caballo
     */
    public Caballo getCaballo() {
        return caballo;
    }

    /**
     * @param caballo the caballo to set
     */
    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }

    /**
     * @return the ganancia
     */
    public double getGanancia() {
        return ganancia;
    }

    /**
     * @param ganancia the ganancia to set
     */
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    
}
