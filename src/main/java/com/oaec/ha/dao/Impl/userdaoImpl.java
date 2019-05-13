package com.oaec.ha.dao.Impl;
import com.oaec.ha.dao.Userdao;
import com.oaec.ha.entity.USER;
import com.oaec.ha.test.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import static com.oaec.ha.test.HibernateUtil.getSessionFactory;

public class userdaoImpl implements Userdao {


    @Override
    public int create(USER user) {
        //建立连接
      SessionFactory  sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        //开启事务
        session.beginTransaction();
       int row= (int)session.save(user);
        session.getTransaction().commit();
        return row;
    }
    @Override
    public USER finBYusername(String username) {
      //建立连接
        SessionFactory  sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        //开启事务
        session.beginTransaction();

     String hql= "from USER  where username=?1";
       Query<USER> query=session.createQuery(hql,USER.class);
        query.setString(1, username);
       USER user=query.getSingleResult();

        session.getTransaction().commit();
        return user;
    }
}
