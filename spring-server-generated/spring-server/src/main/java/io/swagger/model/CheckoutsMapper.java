/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author stefan.tomasik
 */
public class CheckoutsMapper implements RowMapper<Checkouts> {

 
 
    @Override
    public Checkouts mapRow(ResultSet rs, int rowNum) throws SQLException {
        Checkouts checkout =new Checkouts();
        checkout.setId(rs.getInt("id"));
        checkout.setIdbook(rs.getInt("idbook"));
        checkout.setDateoftake(rs.getString(3));
        checkout.setDateofretrieve(rs.getString(4));
        //checkout=new Checkouts(rs.getInt("id"), rs.getInt("idbook"),rs.getString(3),rs.getString(4)       );
        return checkout;
    }
    
}
