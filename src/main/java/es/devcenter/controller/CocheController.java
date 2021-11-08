package es.devcenter.controller;

import es.devcenter.dto.CocheDto;
import es.devcenter.service.CocheService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Controller
@Path("/coche")
public class CocheController {

    @Inject
    private CocheService cocheService;

    //Encuentra un coche por Id
    @GetMapping("/{id}")
    public ResponseEntity<CocheDto> findById(@PathVariable Long id){
        return new ResponseEntity<CocheDto>(cocheService.findById(id), HttpStatus.OK);
    }

}
