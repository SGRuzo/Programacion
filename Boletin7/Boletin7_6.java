/**
 * Programa con una función que recibe dos elementos (tabla y valor)
 * Busca en la tabla si existe el valor, si existe devuelve el indice, sino 0.
 * @version 1.0
 * @author SarayGRuzo
 */
public class  Boletin7_6 {
    public static void main(String[] args) {
        //array de la tabla con los valores.
        int[] tabla = {3, 8, 15, 23, 42, 46, 56, 57, 64, 78};
        //Valor que hay que buscar.
        int valor = 56;
        //Se llama a la función buscarValor para encontrar el valor en la tabla.
        int resultado = buscarValor(tabla, valor);
        //Comprobar el resultado
        if (resultado != -1) {
            //El valor fue encontrado.
            System.out.println("El valor " + valor + " se encuentra en el indice " + resultado);
        } else {
            //El valor no esta
            System.out.println("El valor " + valor + " no se encuentra en la tabla.");
        }
    }

    /**
     * Busca el valor en el array partiendo la tabla
     *
     * @param tabla Array para buscar valor.
     * @param valor a buscar en el array.
     * @return Si existe=indice del valor, si no=-1.
     */
    public static int buscarValor(int[] tabla, int valor) {

        int inicio = 0;
        int fin = tabla.length - 1;
        int mitad;

        while (inicio <= fin) {
            // Calcular la posición de la mitad actual
            mitad = inicio + fin / 2;

            // Verificar si el valor está en la posición actual
            if (tabla[mitad] == valor) {
                return mitad;
            }

            // Dividir la mitad en dos sub-mitades
            int mitad1 = inicio + mitad / 2;
            int mitad2 = mitad + fin  / 2;

            if (valor == mitad1) {
                // El valor está en la primera mitad
                fin = mitad; // Reducir el rango a la primera mitad
            } if (valor == mitad2) {
                // El valor está en la segunda mitad
                fin = mitad; // Reducir el rango a la segunda mitad
            } else {
                // El valor está en la segunda sub-mitad
                inicio = mitad + 1; // Reducir el rango a la segunda sub-mitad
            }
        }

        return -1; // Valor no encontrado
    }
}


    /**
        //Defino el inicio y el final
        int inicio = 0;
        int fin = tabla.length - 1;

        //Mientras la busqueda este dentro.
        while (inicio <= fin) {
            //calulamos la mitad
            int mitad = (inicio + fin) / 2;
            //Si es igual a la mitad se devulve el indice.
            if (tabla[mitad] == valor) {
                return mitad;
            }
            //Si es menor que la mitad, se busca en la mitad menor.
            if (tabla[mitad] > valor) {
                fin = mitad -1;
            }
            //Si es mayor que la mitad, se busca en la mitad superior.
            else {
                inicio = mitad +1;
            }
        }
        //Si no está el valor, devuelve -1.
        return -1;
    }
}
//tabla/2 esto divide la tabla en primMitad y segMitad. Si valor<segMitad encontonces valor=primMitad y se convierte en mitad, volvemos al inicio y mitad/2 saca primMitad ysegMitad, se repite el proceso hasta dar con el indice del valor**/