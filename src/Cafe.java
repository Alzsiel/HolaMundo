public class Cafe {
    //Atributos
    private String cafe;
    private String tamano;
    private double precio;
    //Constructor
    public Cafe (String cafe, String tamano, double precio){
        this.cafe = cafe;
        this.tamano = tamano;
        this.precio = precio;
    }
    public String MostrarTicket(){
        return "Café: " + cafe +
                "\nTamaño: " + tamano +
                "\nPrecio: $" + precio;
    }

}