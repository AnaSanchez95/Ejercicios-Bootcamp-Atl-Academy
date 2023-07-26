package sanchez.ana.newsketters;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling

public class EmailJob {
    @Scheduled(cron = "0 0 0 * * ?") // Nos permite programar una función
    public void generateBackUpDeLaBaseDeDatos(){

    }
}
