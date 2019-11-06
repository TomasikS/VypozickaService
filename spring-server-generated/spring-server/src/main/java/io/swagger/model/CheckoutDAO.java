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
interface CheckoutDAO {
 public List<Checkouts> getAllCheckouts();
 
 public Checkouts findCheckoutsById(int id);
 
 public void addCheckout(Checkouts checkout);
 
 public void updateCheckout(Checkouts checkout);
 
 public void deleteCheckout(int id);
}
