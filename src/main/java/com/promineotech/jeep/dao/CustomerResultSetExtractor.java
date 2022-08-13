package com.promineotech.jeep.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.promineotech.jeep.entity.Customer;

public class CustomerResultSetExtractor implements ResultSetExtractor<Customer> {
	@Override
		public Customer extractData(ResultSet rs)
			throws SQLException, DataAccessException {
		 rs.next();
		 // @formatter:off
		 return Customer.builder()
				 .customerId(rs.getString("customer_id"))
				 .customerPK(rs.getLong("customer_pk"))
				 .firstName(rs.getString("first_name"))
				 .lastName(rs.getString("last_name"))
				 .phone(rs.getString("phone"))
				 .build();
		 // @formatter:on
	}
}