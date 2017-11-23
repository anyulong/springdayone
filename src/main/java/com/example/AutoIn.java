package com.example;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AutoIn {
	@Autowired
	DataSource dataSource;
	@Autowired
	BasicDataSource basicDataSource;
	@Override
	public String toString() {
		return "AutoIn [dataSource=" + dataSource + ", basicDataSource=" + basicDataSource + "]";
	}

	
}
