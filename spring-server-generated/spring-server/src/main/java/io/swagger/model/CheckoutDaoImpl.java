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
public class CheckoutDaoImpl implements CheckoutDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Checkouts> getAllCheckouts() {
        String query = " SELECT a.id, a.dateoftake,a.dateofretrieve, b.id, "
                + "b.nazov  \n" + "FROM vypozicka\n"
                + "INNER JOIN book ON vypozicka.idbook=book.id;";
        RowMapper<Checkouts> rowMapper = new CheckoutsMapper();
        List<Checkouts> list = jdbcTemplate.query(query, rowMapper);
        return list;
    }

    @Override
    public void addCheckout(Checkouts pet) {
        String query = "insert into vypozicka(dateoftake,dateofretrieve) values (?,?)";
        jdbcTemplate.update(query, pet.getDateoftake(), pet.getDateofretrieve());
    }

    @Override
    public void updateCheckout(Checkouts pet) {
        String query = "UPDATE vypozicka SET dateofretrieve=?  WHERE id=?";
        jdbcTemplate.update(query, pet.getDateofretrieve());

    }

    @Override
    public void deleteCheckout(int id) {
        String query = "DELETE FROM vypozicka WHERE id=?";
        jdbcTemplate.update(query, id);
    }

    @Override
    public Checkouts findCheckoutsById(int id) {
        String query = "SELECT * from vypozicka WHERE id = ?";
        RowMapper<Checkouts> rowMapper = new BeanPropertyRowMapper<>(Checkouts.class);
        Checkouts pet = jdbcTemplate.queryForObject(query, rowMapper, id);

        return pet;
    }

}
