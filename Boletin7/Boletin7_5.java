/**
 * Programa con una función que recibe dos elementos (tabla y valor)
 * Busca en la tabla si existe el valor, si existe devuelve el indice, sino -1.
 * @version 1.0
 * @author SarayGRuzo
 */
public class  Boletin7_5{
    public static void main(String [] args){
        //array de la tabla con los valores.
        int[] tabla= {3, 8, 15, 23, 42};
        //Valor que hay que buscar.
        int valor = 15;
        //Se llama a la función buscarValor para encontrar el valor en la tabla.
        int resultado = buscarValor (tabla, valor);
        //Comprobar el resultado
        if (resultado != -1) {
            //El valor fue encontrado.
            System.out.println("El valor " + valor + "se encuentra en el indice " + resultado);
        } else {
            //El valor no esta
            System.out.println("El valor " + valor + "no se encuentra en la tabla.");
        }
    }

    /**
     * Busca el valor en el array
     * @param tabla Array para buscar valor.
     * @param valor a buscar en el array.
     * @return Si existe=indice del valor, si no=0.
     */
    public static int buscarValor (int[] tabla, int valor){
        for (int i = 0; i <tabla.length; i++){
            if (tabla[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
