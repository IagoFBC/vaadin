package com.example;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class MybatisSpringVaadinApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringVaadinApplication.class, args);
	}

	@Service
	public static class MyService {

		public String sayHi() {
			return "Hello Spring Initializr!";
		}

	}

	/* Vaadin UI class.
     * Specify the theme and URI path for the
     * web application.
     */
	@Theme("valo")
	@SpringUI(path = "")
	public static class VaadinUI extends UI {

		// You can easily autowire the services to you
		// Vaadin applications
		@Autowired
		MyService myService;

		@Override
		protected void init(VaadinRequest request) {
			setContent(new Label(myService.sayHi() + " Iago bobo"));
		}



	}
}
