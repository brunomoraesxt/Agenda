package model;

import javax.persistence.*;
import org.hibernate.HibernateError;
import java.util.List;

public class CRUD {

    public static void inserir(Contato c1) {
        try {
            EntityManager entityManager = DAO.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(c1);
            entityManager.getTransaction().commit();
            entityManager.close();
            System.out.println("conectado Salvo!");
        } catch (HibernateError ex) {
            ex.printStackTrace();
        }
    }
}
