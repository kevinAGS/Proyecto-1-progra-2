package FuncionEquipos;

import FuncionEquipos.Ginete;
import FuncionEquipos.Animal;

public class Caballo extends Animal {

    private String color;
    private Ginete jinete;

    public Caballo() {

        super();

        this.color = "No definido";
        this.jinete = new Ginete();
    }

    public Caballo(String color, Ginete jinete) {

        this.color = color;
        this.jinete = jinete;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the jinete
     */
    public Ginete getJinete() {
        return jinete;
    }

    /**
     * @param jinete the jinete to set
     */
    public void setJinete(Ginete jinete) {
        this.jinete = jinete;
    }

}
