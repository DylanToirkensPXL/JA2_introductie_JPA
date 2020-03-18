package be.pxl.ja2.jpa;

import be.pxl.ja2.jpa.model.Message;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Opdracht1SaveMessage {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try (Scanner scanner = new Scanner(System.in)) {
            entityManagerFactory = Persistence.createEntityManagerFactory("musicdb_pu");
            entityManager = entityManagerFactory.createEntityManager();
			System.out.println("Type een bericht dat je wilt opslaan: ");
			String text = scanner.nextLine();
            Message message = new Message();
            message.setText(text);
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(message);
			tx.commit();
		} finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
    }

}
