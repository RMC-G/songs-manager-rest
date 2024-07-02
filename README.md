# REST api demo
Semplice REST Api che simula un gestore di canzoni, scritto in Java utilizzando Spring Boot, e MySQL 8 per la persistenza dei dati.

## Requisiti
* [Java 21](https://www.oracle.com/java/technologies/downloads/?er=221886#java21), [istruzioni installazione](https://docs.oracle.com/en/java/javase/21/install/overview-jdk-installation.html)
* [Maven](https://maven.apache.org/download.cgi) necessario per buildare il progetto. [istruzioni installazione](https://maven.apache.org/install.html)
* [MySQL 8](https://dev.mysql.com/downloads/mysql/)

## Istruzioni
Dopo aver scaricato il progetto, all'interno di `src/main/resources` si troveranno due file:
* `data.sql`, script da eseguire per creare database e tabelle necessarie.
* `application.properties`, file di configurazione con i dati di connessione al db.

Aprire con un editor di testo `application.properties` ed inserire `username` e `password` per accesso al DB. Se necessario, modificare le porte relative al Db ed al server (default rispettivamente 3306 e 8080).

Installati i requisiti ed effettuate le operazioni iniziali, aprire un terminale e spostarsi nella directory `songs-manager`, dove è presente il file `pom.xml`.
Una volta all'interno, eseguire il comando `mvn spring-boot:run` per avviare l'applicazione.

## Utilizzo
L'applicazione ha 5 endpoint:
* `GET /songs` restituisce una lista di tutte le canzoni presenti
* `GET /songs/:id` restituisce i dettagli di una singola canzone
* `POST /songs` aggiunge una nuova canzone
* `PUT /songs/:id` modifica i dettagli di una canzone specifica
* `DELETE /songs/:id` rimuove una canzone
