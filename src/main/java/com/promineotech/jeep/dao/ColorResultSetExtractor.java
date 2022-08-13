package com.promineotech.jeep.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.ResultSetExtractor;

import com.promineotech.jeep.entity.Color;


public class ColorResultSetExtractor implements ResultSetExtractor<Color> {
	@Override
		public Color extractData(ResultSet rs)
			throws SQLException {
		 rs.next();
		 // @formatter:off
		 return Color.builder()
				 .colorId(rs.getString("color_id"))
				 .colorPK(rs.getLong("color_pk"))
				 .color(rs.getString("color"))
				 .price(rs.getBigDecimal("price"))
				 .isExterior(rs.getBoolean("is_exterior"))
				 .build();
		 // @formatter:on
	}
}