package com.specialist;

import com.specialist.DAO.Course;
import com.specialist.DAO.CourseDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CourseDAO courseDAO = context.getBean(CourseDAO.class);

        System.out.println(courseDAO.findById(5));

        for (Course c : courseDAO.findAll()) {
            System.out.println(c);
        }

        context.close();
    }
}
