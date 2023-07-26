package sanchez.ana.newsketters.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sanchez.ana.newsketters.models.Subscriptor;
import sanchez.ana.newsketters.repository.EmailRepository;
import sanchez.ana.newsketters.validators.EmailValidator;

@RestController
public class newsletterController {
    @Autowired
    EmailRepository repositorioDeEmails;

    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Subscriptor subscriptor){

        String email = subscriptor.getEmail();

        EmailValidator emailValidator = new EmailValidator();
        if (!emailValidator.esValido(email)) {
            return "El email no es válido";
        }

        //Guardar email
        repositorioDeEmails.guardarEmail(email);
        return "email guardado con exito";
    }
    @DeleteMapping("/api/newsletter/unsuscribe")
    public String eliminar(@RequestBody Subscriptor subscriptor){

        String email = subscriptor.getEmail();
        repositorioDeEmails.eliminarEmail(email);

        return "email eliminado con exito";
    }

}
