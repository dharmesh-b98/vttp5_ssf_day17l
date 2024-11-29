package sg.edu.nus.iss.vttp5_ssf_day17l.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.vttp5_ssf_day17l.model.Carpark;
import sg.edu.nus.iss.vttp5_ssf_day17l.service.CarparkRestService;

@RestController
@RequestMapping("/api/carpark")
public class CarparkRestController {
    
    @Autowired
    CarparkRestService carparkRestService;

    @GetMapping({"","/get"})
    public ResponseEntity<List<Carpark>> getCarparkList(){
        List<Carpark> carparkList = carparkRestService.getCarparkList();
        return ResponseEntity.ok().body(carparkList);
    }
}
