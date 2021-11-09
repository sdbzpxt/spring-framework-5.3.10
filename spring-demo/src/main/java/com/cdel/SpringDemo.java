package com.cdel;

import com.cdel.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengxt
 * @version 1.0
 * @date 2021/11/4 20:25
 */
public class SpringDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("bean.xml");
		//String[] names = context.getBeanDefinitionNames();
		System.out.println("(*^▽^*)******************");
		User user = context.getBean("user",User.class);
		System.out.println(user.toString());
		System.out.println("♈♉♊♋♌♎♏♐♑♓♒♍~~~~~~~~~~~~~~~~~~*");
	}
}
