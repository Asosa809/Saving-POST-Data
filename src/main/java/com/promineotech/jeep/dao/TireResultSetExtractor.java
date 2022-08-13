package com.promineotech.jeep.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.ResultSetExtractor;

import com.promineotech.jeep.entity.Tire;

public class TireResultSetExtractor implements ResultSetExtractor<Tire>{

	@Override
	public Tire extractData(ResultSet rs)
		throws SQLException {
	 rs.next();
	 // @formatter:off
	 return Tire.builder()
			 .manufacturer(rs.getString("manufacturer"))
			 .price(rs.getBigDecimal("price"))
			 .tireId(rs.getString("tire_id"))
			 .tirePK(rs.getLong("tire_pk"))
			 .tireSize(rs.getString("tire_size"))
			 .warrantyMiles(rs.getInt("warranty_miles"))
			 .build();
	 // @formatter:on
}
	
}
