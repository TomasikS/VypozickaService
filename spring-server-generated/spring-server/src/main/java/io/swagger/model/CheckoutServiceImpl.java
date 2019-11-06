/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stefan.tomasik
 */
@Service
public class CheckoutServiceImpl implements CheckoutService{

    
       @Autowired
    private CheckoutDaoImpl TakeDao;
       
       
    @Override
    public void deleteCheckout(int id) {
        TakeDao.deleteCheckout(id);
    }

    @Override
    public void addCheckout(Checkouts book) {
    TakeDao.addCheckout(book); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCheckout(Checkouts book) {
       TakeDao.updateCheckout(book);
    }

    @Override
    public List<Checkouts> getAllCheckouts() {
     return   TakeDao.getAllCheckouts();
       
    }

    @Override
    public Checkouts findCheckoutById(int id) {
    return   TakeDao.findCheckoutsById(id);
    }
    
}
