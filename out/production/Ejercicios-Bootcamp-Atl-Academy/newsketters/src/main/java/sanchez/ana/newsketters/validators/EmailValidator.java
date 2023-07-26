package sanchez.ana.newsketters.validators;

public class EmailValidator {
    public boolean esValido(String email){
        // Chequear que el email tiene una arroba
        if (!email.contains("@")){
            return false;
        }
        if (!email.contains(".")){
            return false;
        }
        if (email.endsWith("@")){
            return false;
        }
        if (email.contains(" ")){
            return false;
        }
        if (email.length() > 255){
            return false;
        }
        if (email.length() < 8){
            return false;
        }
        if (email.equals("@")){
            return false;
        }
        return true;
    }
}
