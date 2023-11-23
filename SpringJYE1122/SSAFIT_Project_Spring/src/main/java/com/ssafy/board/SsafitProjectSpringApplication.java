package com.ssafy.board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.ssafy.board.model.dao")
public class SsafitProjectSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsafitProjectSpringApplication.class, args);
	}

}
