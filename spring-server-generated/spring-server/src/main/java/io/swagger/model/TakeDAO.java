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
interface TakeDAO {
 public List<Pet> getAllPets();
 
 public Pet findPetById(int id);
 
 public void addPet(Pet pet);
 
 public void updatePet(Pet pet);
 
 public void deletePet(int id);
}
