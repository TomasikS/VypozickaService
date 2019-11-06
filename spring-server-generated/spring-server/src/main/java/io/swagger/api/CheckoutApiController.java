package io.swagger.api;

import io.swagger.model.Checkouts;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
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
import io.swagger.model.CheckoutService;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-05T07:51:45.550Z")

@RestController
public class CheckoutApiController implements CheckoutApi {

    private static final Logger log = LoggerFactory.getLogger(CheckoutApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private CheckoutService repository;

    @org.springframework.beans.factory.annotation.Autowired
    public CheckoutApiController(ObjectMapper objectMapper, HttpServletRequest request, CheckoutService checkoutRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.repository =checkoutRepository;
    }

    @Override
    public ResponseEntity<Void> addCheckout(@ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Checkouts body) {
        String accept = request.getHeader("Accept");
        repository.addCheckout(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCheckout(@ApiParam(value = "Pet id to delete", required = true) @PathVariable("petId") Integer petId, @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) String apiKey) {
        String accept = request.getHeader("Accept");
        repository.deleteCheckout(petId);
        return new ResponseEntity<Void>(HttpStatus.OK);
        // return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getCheckoutById(@ApiParam(value = "ID of pet to return", required = true) @PathVariable("petId") Integer petId) {
        String accept = request.getHeader("Accept");
        repository.findCheckoutById(petId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateCheckout(@ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Checkouts body) {
        String accept = request.getHeader("Accept");
        repository.updateCheckout(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

     public ResponseEntity<Void> updateCheckoutWithForm(@ApiParam(value = "ID of Checkout that needs to be updated",required=true) @PathVariable("petId") int petId,@ApiParam(value = "Updated dateoftake of checkout") @RequestParam(value="dateoftake", required=false)  String dateoftake,@ApiParam(value = "Updated dateofretrieve of checkout") @RequestParam(value="dateofretrieve", required=false)  String dateofretrieve){
        String accept = request.getHeader("Accept");
         repository.addCheckout(new Checkouts(petId,dateoftake,dateofretrieve ));
        return new ResponseEntity<Void>(HttpStatus.OK);
    }



}
