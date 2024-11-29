package sg.edu.nus.iss.vttp5_ssf_day17l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.vttp5_ssf_day17l.model.Carpark;
import sg.edu.nus.iss.vttp5_ssf_day17l.service.CarparkRestService;

@Controller
@RequestMapping("/carpark")
public class CarparkController {
    
    @Autowired
    CarparkRestService carparkRestService;

    @GetMapping("")
    public String getCarparkTable(Model model){
        List<Carpark> carparkList = carparkRestService.getCarparkList();

        model.addAttribute("carparkList", carparkList);
        return "carparktable";
    }
}
