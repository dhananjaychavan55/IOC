package com.controler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Batch;
import com.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
			Student st =(Student) ac.getBean("i");
				System.out.println(st.getSid());
				System.out.println(st.getSname());
				System.out.println(st.getMarks());
				System.out.println(st.getBatch().getBid());
				System.out.println(st.getBatch().getBname());
				System.out.println(st.getBatch().getFaculty().getFid());
				System.out.println(st.getBatch().getFaculty().getFname());
				System.out.println(st.getBatch().getFaculty().getCourse().getCid());
				System.out.println(st.getBatch().getFaculty().getCourse().getCname());
		//System.out.println(st);
				System.out.println("********************");
				Student s=(Student)ac.getBean("i");
				System.out.println(st.hashCode());
				System.out.println(s.hashCode());
				System.out.println(st.getBatch().hashCode());
				System.out.println(s.getBatch().hashCode());
				System.out.println("********************");
				
//				Batch batch =(Batch) ac.getBean("b");
//				Batch b=(Batch)ac.getBean("b");
//				System.out.println(b);
//				System.out.println(batch);
//				System.out.println(batch.hashCode());
//				System.out.println(b.hashCode());
				
	}

}
