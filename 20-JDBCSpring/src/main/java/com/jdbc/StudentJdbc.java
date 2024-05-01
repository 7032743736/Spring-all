package com.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;
public class StudentJdbc {
    private JdbcTemplate jdbcTemplate;

    public StudentJdbc() {
        // Default constructor
    }

    public StudentJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

    public void create() {
        jdbcTemplate.execute("CREATE TABLE student (id NUMBER, name VARCHAR2(20), course VARCHAR2(20))");
        System.out.println("Table created");
    }
    public void insert() {
    	int inserted=jdbcTemplate.update("insert into student(id,name,course)values(101,'manu','java')");
    	System.out.println(inserted+" inserted");
    }
    public void delete() {
    	int deleted=jdbcTemplate.update("delete from student where id=101");
    	System.out.println(deleted+" deleted");
    }
    public void updateRecord() {
    	int updated=jdbcTemplate.update("update student set name='kavya' where id=101");
    	System.out.println(updated+" updated");
    }
    
    public void getOneRecord() {
    	List<Map<String,Object>> onerecord = jdbcTemplate.queryForList("select*from student where id=101");
    	Iterator<Map<String, Object>> jdbcTemplate = onerecord.iterator();
    	while(jdbcTemplate.hasNext()) {
    		Object obj =jdbcTemplate.next();
    		
    		System.out.println(obj.toString());
    	}
    }
}
