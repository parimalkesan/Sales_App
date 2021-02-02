package com.example.Sales_App.DAO;

import com.example.Sales_App.Model.DrugSales;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DrugSalesMapper implements RowMapper<DrugSales> {
    @Override
    public DrugSales mapRow(ResultSet resultSet, int rowNo) throws SQLException {
        DrugSales drug=new DrugSales();
        drug.setName(resultSet.getString("name"));
        drug.setSales(resultSet.getInt("sales"));
        drug.setCity(resultSet.getString("city"));
        drug.setMonth(resultSet.getString("month"));
        return drug;
    }
}
