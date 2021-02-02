package com.example.Sales_App.DAO;

import com.example.Sales_App.Model.SalesRep;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesRepMapper implements RowMapper<SalesRep> {

    @Override
    public SalesRep mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        SalesRep salesRep = new SalesRep();
        salesRep.setSalesRepId(resultSet.getInt("salesrep_id"));
        salesRep.setSalesRepName(resultSet.getString("salesrep_name"));
        salesRep.setCountry(resultSet.getString("country"));
        salesRep.setCity(resultSet.getString("city"));
        salesRep.setPinCode(resultSet.getInt("pincode"));
        salesRep.setGender(resultSet.getString("gender"));
        return salesRep;
    }
}
