package com.example.Sales_App;

import com.example.Sales_App.Model.SalesRep;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesRepMapper implements RowMapper<SalesRep> {

    @Override
    public SalesRep mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        SalesRep salesRep=new SalesRep();
        salesRep.setId(resultSet.getInt("Id"));
        salesRep.setName(resultSet.getString("Name"));
        salesRep.setCountry(resultSet.getString("Country"));
        salesRep.setCity(resultSet.getString("City"));
        salesRep.setZipCode(resultSet.getInt("Zipcode"));
        salesRep.setGender(resultSet.getString("Gender"));
        return salesRep;
    }
}
