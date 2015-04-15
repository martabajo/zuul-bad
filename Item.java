
/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    private String nombreObjeto;
    private float peso;

    public Item(String nombreObjeto, float peso)
    {
        this.nombreObjeto = nombreObjeto;
        this.peso = peso;
    }

    public String getNombreObjeto()
    {
        return nombreObjeto;
    }

    public float getPeso()
    {
        return peso;
    }

    public String objetoToString()    
    {
      return "Hay: " + nombreObjeto + " Que pesa: " + peso;
    }
}
