package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uber.cadence.worker.Worker;


public class CadenceTutorialApplication {

	public static void main(String[] args) {
		System.out.println("Hloo");
		
		Worker.Factory f = new Worker.Factory("samples-domain");
		Worker w = f.newWorker("hello");
        w.registerWorkflowImplementationTypes(HelloWorkflowImp.class);
        f.start();
	}

}
