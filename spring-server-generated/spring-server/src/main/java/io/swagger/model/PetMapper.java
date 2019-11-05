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
public class PetMapper implements RowMapper<Pet> {

    @Override
    public Pet mapRow(ResultSet rs, int rowNum) throws SQLException {
        Pet pet = new Pet();
        pet.setId(rs.getInt("id"));
        pet.setIdbook(rs.getInt("idbook"));
        pet.setDateoftake(rs.getString(3));
        pet.setDateofretrieve(rs.getString(4));
        return pet;
    }
    
}
