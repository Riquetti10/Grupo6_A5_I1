
/*
 * UNIDAD EDUCATIVA TÉCNICO
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

public class Modelo 
{
  private int vector[];
  private int tamaño;

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
  public void crearVector() {
        // Se valida que el tamaño sea mayor a cero antes de crear el vector
        if(tamaño > 0) {
            vector = new int[tamaño];
        } else {
            throw new IllegalArgumentException("El tamaño debe ser mayor a 0.");
        }
    }
}
