package com.digital_hack_up.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.digital_hack_up.bean.CreditCard;
import com.digital_hack_up.dto.CreditCardDTO;

public class CreditCardRowMapper implements RowMapper<CreditCardDTO>{

	@Override
	public CreditCardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CreditCardDTO card=new CreditCardDTO();
		card.setEducation(rs.getString("education"));
		card.setLimit_Balance(Integer.parseInt(rs.getString("bal")));
		return card;
	}

}
