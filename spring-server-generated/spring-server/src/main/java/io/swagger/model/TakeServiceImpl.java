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
public class TakeServiceImpl implements TakeService{

    
       @Autowired
    private TakeDaoImpl TakeDao;
       
       
    @Override
    public void deleteBook(int id) {
        TakeDao.deletePet(id);
    }

    @Override
    public void addBook(Pet book) {
    TakeDao.addPet(book); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBook(Pet book) {
       TakeDao.updatePet(book);
    }

    @Override
    public List<Pet> getAllBooks() {
     return   TakeDao.getAllPets();
       
    }

    @Override
    public Pet findBookById(int id) {
    return   TakeDao.findPetById(id);
    }
    
}
