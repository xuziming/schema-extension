package com.simon.credit.schema.ext;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class ExtNamespaceHandler extends NamespaceHandlerSupport {
	
	public void init() {
		registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
	}
	
}