/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stefan.tomasik
 */
@Transactional
@Component
public class TakeDaoImpl implements TakeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Pet> getAllPets() {
        String query = " SELECT a.id, a.dateoftake,a.dateofretrieve, b.id, "
                + "b.nazov  \n" + "FROM vypozicka\n"
                + "INNER JOIN book ON vypozicka.idbook=book.id;";
        RowMapper<Pet> rowMapper = new PetMapper();
        List<Pet> list = jdbcTemplate.query(query, rowMapper);
        return list;
    }

    @Override
    public void addPet(Pet pet) {
        String query = "insert into vypozicka(dateoftake,dateofretrieve) values (?,?)";
        jdbcTemplate.update(query, pet.getDateoftake(), pet.getDateofretrieve());
    }

    @Override
    public void updatePet(Pet pet) {
        String query = "UPDATE vypozicka SET dateofretrieve=?  WHERE id=?";
        jdbcTemplate.update(query, pet.getDateofretrieve());

    }

    @Override
    public void deletePet(int id) {
        String query = "DELETE FROM vypozicka WHERE id=?";
        jdbcTemplate.update(query, id);
    }

    @Override
    public Pet findPetById(int id) {
        String query = "SELECT * from vypozicka WHERE id = ?";
        RowMapper<Pet> rowMapper = new BeanPropertyRowMapper<>(Pet.class);
        Pet pet = jdbcTemplate.queryForObject(query, rowMapper, id);

        return pet;
    }

}
