import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        Users users = new Users();
        users.setName("Abhishek");
        users.setAge(22);
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("orm");
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(users);
            transaction.commit();
        }catch (Exception e) {
            System.out.println(e);
            transaction.rollback();
        }
    }
}
