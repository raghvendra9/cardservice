package com.express.digital.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;


@WebService
public class AccountDetails {
	
	@Autowired
	@Qualifier("plastic")

	SequenceWorkflow plastic;
	
	@Autowired
    private ApplicationContext applicationContext;
	
	
	
	public long getDPAN(MarketDetails s){
		
		System.out.println(s.marketcode);
		
		//SequenceWorkflow workflow = WorkflowSingleton.getInstance().plastic;
		
		 
		System.out.println("Hi I am currently printing sequence"+plastic);
		
		String[] beanNames = applicationContext.getBeanDefinitionNames();

        for (String beanName : beanNames) {

            System.out.println("Lets Print Bean Name"+beanName + " : " + applicationContext.getBean(beanName).getClass().toString());
        }
		
				long wapas= plastic.execute(s);
		
		return wapas;
		
	}
	
	
	
	/*private static final class WorkflowSingleton extends SpringBeanAutowiringSupport {
		
		private static final WorkflowSingleton plasticsvc = new WorkflowSingleton();
		
		@Autowired
		private SequenceWorkflow plastic ;
		
		private WorkflowSingleton(){
			
		}
		
		public static WorkflowSingleton getInstance(){
			
			return plasticsvc;
		}
		
		
		
	}*/
	
	
	
}

