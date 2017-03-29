package com.tdd;


import com.tdd.hibernate.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by TDD on 2017/3/19.
 */
public class Teachertest {
    public static void main(String args[]){
        Teacher teacher = new Teacher();
        teacher.setName("王傻逼");
        teacher.setTitle("中级");
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(teacher);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}