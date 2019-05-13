package com.oaec.ha.test;

import com.oaec.ha.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class FirstTest {


    public static void add(){
        //获取sessionFactory
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        //获取session对象T
        Session session = sessionFactory.openSession();
        //开启事务
        session.beginTransaction();

        Teacher teacher = new Teacher();
        teacher.setName("卢老师");
        teacher.setSex("男");
        teacher.setAge(40);

        long id = (long)session.save(teacher);

        session.getTransaction().commit();

        System.out.println("id=" + id);
    }

    public static void query(){
        //获取sessionFactory
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        //获取session对象
        Session session = sessionFactory.openSession();
        //开启事务
        session.beginTransaction();

        String hql = "from Teacher where name=?1";

        Query<Teacher> query = session.createQuery(hql, Teacher.class);
        query.setString(1, "满老师");

        Teacher teacher = query.getSingleResult();

        System.out.println(teacher);

        session.getTransaction().commit();
    }

    public static void main(String[] args) {
        query();
    }
}
