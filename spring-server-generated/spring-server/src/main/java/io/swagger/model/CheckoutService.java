/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.model;

import java.util.List;

/**
 *
 * @author stefan.tomasik
 */
public interface CheckoutService {
 public List<Checkouts> getAllCheckouts();
 
 public Checkouts findCheckoutById(int id);
 
 public void addCheckout(Checkouts book);
 
 public void updateCheckout(Checkouts book);
 
 public void deleteCheckout(int id);
}
