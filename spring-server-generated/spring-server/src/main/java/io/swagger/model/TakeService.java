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
public interface TakeService {
 public List<Pet> getAllBooks();
 
 public Pet findBookById(int id);
 
 public void addBook(Pet book);
 
 public void updateBook(Pet book);
 
 public void deleteBook(int id);
}
