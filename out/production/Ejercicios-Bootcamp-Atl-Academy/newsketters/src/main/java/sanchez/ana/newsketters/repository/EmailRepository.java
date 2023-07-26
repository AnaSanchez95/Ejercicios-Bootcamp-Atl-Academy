package sanchez.ana.newsketters.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class EmailRepository {

    @PersistenceContext // Carga el objeto automaticamente
    EntityManager baseDeDatos;
    @Transactional // Agrupa las consultas a ejecutar dentro de la funcion una vez asegurado que todas son correctas
    public  void guardarEmail(String emailDelUsuario){
        String consultaSql = "INSERT INTO subscriptor (email) VALUES (:email)"; // Se hace con :email para evitar que nos
                                                                                // hackeen con una inyección SQL

        baseDeDatos.createNativeQuery(consultaSql)
                .setParameter("email", emailDelUsuario) // Ejecutamos el código SQL directamente
                .executeUpdate();

        // createQuery trabaja con el objeto, createNativeQuery con la tabla
    }
@Transactional
    public void eliminarEmail(String emailDelUsuario) {
        String consultaSql = "DELETE FROM subscriptor WHERE email = :email";

        baseDeDatos.createNativeQuery(consultaSql)
                .setParameter("email", emailDelUsuario)
                .executeUpdate();
    }
    @Transactional
    public void traerEmails(String[] emailDelUsuario) {
        String consultaSql = "DELETE FROM subscriptor WHERE email = :email";

        baseDeDatos.createNativeQuery(consultaSql)
                .setParameter("email", emailDelUsuario)
                .executeUpdate();
    }
}
