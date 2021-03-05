package com.cs.personal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenshuo
 */
@SpringBootApplication
@MapperScan({"com.cs.personal.mapper"})
public class PersonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalApplication.class, args);
	}

}
