package com.example.Sales_App.DAO;

import com.example.Sales_App.Model.SalesRep;
import com.example.Sales_App.Model.SalesRepPerformance;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesRepPerformanceMapper implements RowMapper<SalesRepPerformance> {
    @Override
    public SalesRepPerformance mapRow(ResultSet resultSet, int rowNo) throws SQLException {

        SalesRepPerformance salesRepPerformance = new SalesRepPerformance();
        salesRepPerformance.setSalesRepName(resultSet.getString("salesrep_name"));
        salesRepPerformance.setSales(resultSet.getInt("price"));
        return salesRepPerformance;
    }
}
