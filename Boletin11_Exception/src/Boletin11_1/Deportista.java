package Boletin11_1;

// La clase Deportista hereda de Persoa (usa "extends")
// Eso significa que también tiene nombre, dirección y DNI
public class Deportista extends Persoa {
    private String nomeDeporte;
    private String clube;
    private String licenza;

    // Constructor: recibe datos de Persoa y Deportista
    public Deportista(String nome, String direccion, String dni,
                      String nomeDeporte, String clube, String licenza) throws DniNonValido {
        super(nome, direccion, dni);  // Llama al constructor de la clase Persoa
        this.nomeDeporte = nomeDeporte;
        this.clube = clube;
        setLicenza(licenza); // Llama al metodo para validar y asignar la licencia
    }

    // Setter para el deporte
    public void setDeporte(String deporte) {
        this.nomeDeporte = deporte;
    }

    // Getter para obtener el nombre del deporte
    public String getDeporte() {
        return nomeDeporte;
    }

    // Setter para el club
    public void setClube(String clube) {
        this.clube = clube;
    }

    // Getter para obtener el nombre del club
    public String getClube() {
        return clube;
    }

    // Setter para la licencia con validación
    public void setLicenza(String licenza) {
        // Validamos que la licencia tenga el formato correcto:
        // 4 dígitos del año + 3 letras minúsculas (deporte) + 6 dígitos únicos
        if (!licenza.matches("\\d{4}[a-z]{3}\\d{6}")) {
            throw new IllegalArgumentException(
                    "Licenza non válida. Formato correcto: aaaadddnnnnnn (Ex: 2024fut123456)"
            );
        }

        // Verificamos si el año de la licencia es el año actual
        String anoActual = String.valueOf(java.time.Year.now().getValue());
        if (!licenza.startsWith(anoActual)) {
            throw new IllegalArgumentException(
                    "O ano da licenza non coincide co ano actual: " + anoActual
            );
        }

        // Si pasa todas las validaciones, se asigna
        this.licenza = licenza;
    }

    // Getter para obtener la licencia
    public String getLicenza() {
        return licenza;
    }
}
