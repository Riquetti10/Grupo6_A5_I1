
/*
 * UNIDAD EDUCATIVA TÉCNICO SALESIANO 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

public class Modelo {

    private int[] vector;
    private int[] vectorOr;
    private int indice = 0;
    
    
    public void Vector(int tam) {
        vector = new int[tam];
        vectorOr = new int[tam];
        //verifica el tamaño del vector, empieza en cero
        for (int i=0;i<tam;i++){
            vector[i]=i;
            System.out.println(vector[i]);
        }
    }
    public int[] Vector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vectorOr;
    }

    public void setVectorord(int[] vectorOr) {
        this.vectorOr = vectorOr;
    }
    
    public boolean ingresarDatos(int dato) {
        if (!lleno()) { // Si aún hay espacio en el vector
            vector[indice] = dato; // Se agrega el dato en la posición actual\
            vectorOr[indice] = dato;
            System.out.println(vector[indice]);
            indice++; // Se avanza a la siguiente posición
            return true; // Indica que se agregó correctamente
            
        }
        vector[indice] = dato; // Se agrega el dato en la posición actual\
        vectorOr[indice] = dato;
        System.out.println(vector[indice]);
        return false; // Indica que el vector ya está lleno
    }
    public boolean lleno() {
        return indice >= vector.length-1; // Verifica si ya se ingresaron todos los datos
    }
    
    public int Mayor(){
        for (int i=0;i<vectorOr.length-1; i++) {
            for (int j=0;j<vectorOr.length-1-i; j++) {
                if (vectorOr[j]<vectorOr[j + 1]) {
                    int temp=vectorOr[j];
                    vectorOr[j]=vectorOr[j + 1];
                    vectorOr[j+1]=temp;
                }
            }
        }
        return vectorOr[0];
    }
}
