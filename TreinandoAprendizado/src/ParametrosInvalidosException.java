import java.util.Scanner;

// Classe customizada para a exceção
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}