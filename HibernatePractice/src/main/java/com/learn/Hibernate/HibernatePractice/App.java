package com.learn.Hibernate.HibernatePractice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        //Configuring the hibernate
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	
    	SessionFactory sf=cfg.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Transaction tr=session.beginTransaction();
    	
    	//creating the objects
    	Student s1=new Student();
    	s1.setsId(111);
    	s1.setsName("Biswajit");
    	
    	Student s2=new Student();
    	s2.setsId(222);
    	s2.setsName("Abhilas");
    	
    	Student s3=new Student();
    	s3.setsId(333);
    	s3.setsName("Pulak");
    	
    	Student s4=new Student();
    	s4.setsId(444);
    	s4.setsName("Rajesh");
    	
    	
    	Technology t1=new Technology();
    	t1.setTechId(121);
    	t1.setTechName("Java");
    	
    	Technology t2=new Technology();
    	t2.setTechId(122);
    	t2.setTechName("Python");
    	
    	Technology t3=new Technology();
    	t3.setTechId(123);
    	t3.setTechName("SQL");
    	
    	Technology t4=new Technology();
    	t4.setTechId(124);
    	t4.setTechName("AWS");
    	
    	//creating the lists
    	List<Technology> tList1=new ArrayList<Technology>();
    	tList1.add(t1);
    	tList1.add(t2);
    	tList1.add(t3);
    	tList1.add(t4);
    	
    	List<Student> slist1=new ArrayList<Student>();
    	slist1.add(s1);
    	slist1.add(s2);
    	slist1.add(s3);
    	slist1.add(s4);
    	
    	
    	s1.setTechnology(tList1);
    	s2.setTechnology(tList1);
    	s3.setTechnology(tList1);
    	s4.setTechnology(tList1);
    	
    	
    	t1.setStudent(slist1);
    	t2.setStudent(slist1);
    	t3.setStudent(slist1);
    	t4.setStudent(slist1);
    	
    	//session save
    	session.save(s1);
    	session.save(s2);
    	session.save(s3);
    	session.save(s4);
    	
    	session.save(t1);
    	session.save(t2);
    	session.save(t3);
    	session.save(t4);
    	
    	//commit transaction
    	tr.commit();
    	
    	
    	System.out.println("done");
    }
    
}
