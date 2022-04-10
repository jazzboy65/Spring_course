package hibernate_one_to_one;


import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Alex","Gordeev",
//                    "IT",500);
//            Detail detail = new Detail("Perm","123456789",
//                    "alexgordeff@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg","Smirnov",
//                    "Sales",700);
//            Detail detail = new Detail("Moscow","987654321",
//                    "olejca@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


//            session.beginTransaction();
//            Employee emp = session.get(Employee.class,10);
//            System.out.println(emp.getEmpDetail());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session.beginTransaction();
            Employee emp = session.get(Employee.class,2);
            session.delete(emp);


            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            session.close();
            factory.close();
        }

    }
}
