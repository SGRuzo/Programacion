package Boletin11_2;

// Clase principal para representar una fecha (día, mes, año)
class Data {
    private int dia;
    private int mes;
    private int ano;

    // Constructor que recibe el día, mes y año. Valida tudo desde el principio.
    public Data(int dia, int mes, int ano) throws FormatoDataErroneo {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    // Metodo para establecer el año con validación.
    public void setAno(int ano) throws FormatoDataErroneo {
        if (ano < 1970 || ano > 2999) {
            throw new FormatoDataErroneo("Ano non válido. Debe estar entre 1970 e 2999.");
        }
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    // Metodo para establecer el mes con validación.
    public void setMes(int mes) throws FormatoDataErroneo {
        if (mes < 1 || mes > 12) {
            throw new FormatoDataErroneo("Mes non válido. Debe estar entre 1 e 12.");
        }
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    // Metodo para establecer el día con validación según mes y año (comprobando si es bisiesto)
    public void setDia(int dia) throws FormatoDataErroneo {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Si es bisiesto, febrero tiene 29 días
        if (eBisiesto()) {
            diasPorMes[1] = 29;
        }

        // Comprobamos si el día está dentro del rango válido para el mes actual
        if (dia < 1 || dia > diasPorMes[this.mes - 1]) {
            throw new FormatoDataErroneo("Día non válido para o mes e ano introducidos.");
        }

        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    // Metodo que comprueba si el año actual es bisiesto
    public boolean eBisiesto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Metodo para incrementar el día en 1, ajustando mes y año si es necesario.
    public void incrementarDia() throws FormatoDataErroneo {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (eBisiesto()) {
            diasPorMes[1] = 29;
        }

        dia++;
        if (dia > diasPorMes[mes - 1]) {
            dia = 1;
            incrementarMes();
        }
    }

    // Metodo para incrementar el mes en 1, ajustando año si es necesario.
    public void incrementarMes() throws FormatoDataErroneo {
        mes++;
        if (mes > 12) {
            mes = 1;
            incrementarAno();
        }
    }

    // Metodo para incrementar el año en 1 (siempre que esté dentro del rango permitido).
    public void incrementarAno() throws FormatoDataErroneo {
        if (ano + 1 > 2999) {
            throw new FormatoDataErroneo("Non se pode incrementar o ano máis aló do 2999.");
        }
        ano++;
    }

    // Metodo para comprobar si dos fechas son iguales
    public boolean dataIgual(Data outraData) {
        return this.dia == outraData.dia &&
                this.mes == outraData.mes &&
                this.ano == outraData.ano;
    }

    // Muestra la fecha en formato legible (ex: 19/05/2025)
    public void mostrarData() {
        System.out.printf("%02d/%02d/%d\n", dia, mes, ano);
    }
}