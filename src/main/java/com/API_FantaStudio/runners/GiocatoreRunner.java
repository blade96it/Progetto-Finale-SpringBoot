package com.API_FantaStudio.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class GiocatoreRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Run...");

	}

}
