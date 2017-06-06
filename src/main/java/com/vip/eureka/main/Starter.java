/**
 * 
 */
package com.vip.eureka.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fang08.li
 *
 */

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		SpringApplication.run(Starter.class, args);
	}
	
	
	@RequestMapping("/hello")
	
	public String hello(){
		
		System.out.println("hi");
		
		return "hi";
	}
	
	
	@RequestMapping("/hello2")
	
	public String hello2(){
		
		System.out.println("hi2");
		
		return "hi2";
	}

}
