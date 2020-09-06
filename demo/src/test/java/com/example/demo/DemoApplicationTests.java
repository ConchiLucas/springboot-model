package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Test
	void contextLoads() {
		List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from N_WF_FLOW limit 1");
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}

	}

}
