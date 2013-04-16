package it.uniroma2;

import it.uniroma2.siwa.beans.FirstBean;
import it.uniroma2.siwa.beans.ThirdBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main( String[] args ) {
    	
    	ApplicationContext context = 
    	    	 new ClassPathXmlApplicationContext(new String[] {"BeanExamples.xml"});
    	
    	// Provate a vedere cosa succede modificando lo scope del Bean in BeanExamples.xml
    	FirstBean firstBeanA = (FirstBean) context.getBean("firstBean");
    	firstBeanA.setMessage("HelloWorld");
    	System.out.println("Message: " + firstBeanA.getMessage());
    	
    	// Commentate la riga che chiama il metodo setMessage e decommentate la property di FirstBean in BeanExamples.xml
    	FirstBean firstBeanB = (FirstBean) context.getBean("firstBean");
    	System.out.println("Message: " + firstBeanB.getMessage());
    	
    	ThirdBean thirdBean = firstBeanB.getThirdBean();
    	thirdBean.setY(3);
    	System.out.println("Sum: " + thirdBean.getSum());

    }
}
