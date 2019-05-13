package com.oaec.ha.dao.Impl;

import com.oaec.ha.entity.Course;
import com.oaec.ha.entity.Order;
import com.oaec.ha.entity.OrderLine;
import com.oaec.ha.test.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class one {
    private Session session;
    @Before
    public void getSession(){
        session = HibernateUtil.getSession();
        session.beginTransaction();//开启事务
    }

    //在执行Test方法后，调用此方法
    @After
    public void closeSession(){
        session.getTransaction().commit();
        HibernateUtil.closeSession(session);
    }


   @Test
public  void  update(){
       Session session = HibernateUtil.getSession();
       session.beginTransaction();
       Course course2 = session.get(Course.class, 3L);
       course2.setName("football");
       session.update(course2);
       session.getTransaction().commit();
       session.close();
       System.out.println("执行完成22222222222222");
   }
}
