package Com.Railworld;

import Com.Railworld.Dao.UserDAO;
import Com.Railworld.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        // Create SessionFactory
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Create UserDAO
        UserDAO userDAO = new UserDAO(sessionFactory);

        // Create and save a new user
        User user = new User();
        user.setName("john_doe");
        user.setPassword("password123");
        user.setEmail("rahul.gmail.com");
        user.setMobile(52255666);
        userDAO.saveUser(user);
        
//     // Retrieve and print user by ID
//        User retrievedUser = userDAO.getUserById(user.getUserId());
//        System.out.println("Retrieved User by ID: " + retrievedUser.getName());
//
//        // Retrieve and print user by username
//        User retrievedUserByUsername = userDAO.getUserByUsername("john_doe");
//        System.out.println("Retrieved User by Username: " + retrievedUserByUsername.getName());

        // Close the SessionFactory
        sessionFactory.close();
    }
}
