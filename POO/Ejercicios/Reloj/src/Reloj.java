public class Reloj {
    // Atributos de la clase
    private int hora;
    private int minutos;
    private int segundos;

    // Enumeración para el formato de hora: DOCE o VINTECATRO
    enum FormatoHora { DOCE, VINTECATRO };

    // Atributo que guarda el formato de hora actual
    private FormatoHora formato;

    // Constructor de la clase que establece la hora, minutos, segundos y formato
    public Reloj(int hora, int minutos, int segundos, String formato) {
        setFormato(formato);  // Metodo para establecer el formato de hora
        setHora(hora);        // Metodo para establecer la hora
        setMinutos(minutos);  // Metodo para establecer los minutos
        setSegundos(segundos); // Metodo para establecer los segundos
    }

    // Metodo para establecer el formato de hora
    public void setFormato(String formato) {
        // Se compara la cadena de formato en mayúsculas y se asigna el valor adecuado a 'formato'
        if (formato.toUpperCase().equals("DOCE") || formato.toUpperCase().equals("VINTECATRO")) {
            this.formato = FormatoHora.valueOf(formato.toUpperCase()); // Se convierte la cadena a la enumeración
        } else {
            // Si no se recibe "DOCE" ni "VINTECATRO", se establece un valor por defecto
            this.formato = formato.equals("12") ? FormatoHora.DOCE : FormatoHora.VINTECATRO;
        }
    }

    // Métodos getter y setter para la hora
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        // Validación de que la hora esté en el rango válido de 0 a 23
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida. Debe estar entre 0 y 23.");
        }
    }

    // Métodos getter y setter para los minutos
    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        // Validación de que los minutos estén en el rango válido de 0 a 59
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos inválidos. Deben estar entre 0 y 59.");
        }
    }

    // Métodos getter y setter para los segundos
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        // Validación de que los segundos estén en el rango válido de 0 a 59
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos inválidos. Deben estar entre 0 y 59.");
        }
    }

    // Metodo toString para mostrar la hora en formato adecuado
    @Override
    public String toString() {
        // String para almacenar la representación de la hora
        String cadenaHora;

        // Si el formato es 24 horas
        if (formato == FormatoHora.VINTECATRO) {
            cadenaHora = "Tiempo{" +
                    "hora=" + hora +
                    ", minutos=" + minutos +
                    ", segundos=" + segundos +
                    ", formato=" + formato +
                    '}';
        } else {
            // Si el formato es 12 horas, ajustar la hora para mostrar AM/PM
            if (hora > 11) {
                cadenaHora = "Tiempo{" +
                        "hora=" + (hora - 12) +
                        ", minutos=" + minutos +
                        ", segundos=" + segundos +
                        ", formato=" + formato + " PM" +
                        '}';
            } else {
                // Para horas menores o iguales a 11
                cadenaHora = "Tiempo{" +
                        "hora=" + hora +
                        ", minutos=" + minutos +
                        ", segundos=" + segundos +
                        ", formato=" + formato + " AM" +
                        '}';
            }
        }
        return cadenaHora;
    }

    // Metodo adicional para avanzar un segundo en el reloj (mejorar funcionalidad)
    public void avanzarUnSegundo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

    // Metodo adicional para mostrar si la hora es AM o PM
    public String amPm() {
        return hora < 12 ? "AM" : "PM";
    }
}
