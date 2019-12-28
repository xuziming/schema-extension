package com.simon.credit.schema.ext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/application.xml");
		People p = ctx.getBean(People.class);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		ctx.destroy();
		ctx.close();
	}

}
