package sanchez.ana.newsketters.validator;

import org.junit.jupiter.api.Test;
import sanchez.ana.newsketters.validators.EmailValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class EmailValidatorTest {
    @Test
    public void elEmailTieneArroba() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("afsda");
        assertFalse(resultado);
    }
    /* TDD (Test Driven Developmen) (Desarrollo guiado por pruebas) es una forma de trabajo en la que primero creas una prueba,
       y luego generas el código para esta. Primero programamos la prueba, y luego la funcionalidad.
    */
    @Test
    public void elEmailTieneQueTenerPunto() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("afsda@wfe");
        assertFalse(resultado);
    }
    @Test
    public void queElArrobaNoSeaLaUltimaLetra(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("afsdaw.fe@");
        assertFalse(resultado);
    }
    @Test
    public void queNoTengaEspacios(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("afs dawfe@ho.com");
        assertFalse(resultado);
    }
    @Test
    public void noMas255Caracteres(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("asdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñasdfghjklñ@ho.com");
        assertFalse(resultado);
    }
    @Test
    public void noMenosDe7Caracteres(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("s@ho.c");
        assertFalse(resultado);
    }
    @Test
    public void queNoSeaSoloLaArroba(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.esValido("@");
        assertFalse(resultado);
    }
}
