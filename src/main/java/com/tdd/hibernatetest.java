package com.tdd;



import com.tdd.hibernate.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by TDD on 2017/3/19.
 */
public class hibernatetest {
    public static void main(String args[]){
        Student student = new Student();
        student.setName("测试中文1");
        student.setAge(2);
        Configuration cfg = new Configuration();
        SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}