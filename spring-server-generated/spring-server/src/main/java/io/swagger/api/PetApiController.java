package io.swagger.api;

import io.swagger.model.Pet;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.TakeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-05T07:51:45.550Z")

@RestController
public class PetApiController implements PetApi {

    private static final Logger log = LoggerFactory.getLogger(PetApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private TakeService repository;

    @org.springframework.beans.factory.annotation.Autowired
    public PetApiController(ObjectMapper objectMapper, HttpServletRequest request, TakeService contactRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.repository = contactRepository;
    }

    @Override
    public ResponseEntity<Void> addPet(@ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Pet body) {
        String accept = request.getHeader("Accept");
        repository.addBook(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete", required = true) @PathVariable("petId") Integer petId, @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) String apiKey) {
        String accept = request.getHeader("Accept");
        repository.deleteBook(petId);
        return new ResponseEntity<Void>(HttpStatus.OK);
        // return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getPetById(@ApiParam(value = "ID of pet to return", required = true) @PathVariable("petId") Integer petId) {
        String accept = request.getHeader("Accept");
        repository.findBookById(petId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updatePet(@ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Pet body) {
        String accept = request.getHeader("Accept");
        repository.updateBook(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated", required = true) @PathVariable("petId") Integer petId, @ApiParam(value = "Updated name of the pet") @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Updated status of the pet") @RequestParam(value = "status", required = false) String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }



}
