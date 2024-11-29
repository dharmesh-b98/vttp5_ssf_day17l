package sg.edu.nus.iss.vttp5_ssf_day17l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemoController {

    @GetMapping("/date")
    public String displayDataTime(Model model) throws ParseException{
        String strDate = "2004-08-09 15:30:33";
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date testDate = sdf.parse(strDate);
        model.addAttribute("date", testDate);


        //sample to convert between epoch and Date //IMPT
        Long epochMillisecondsDate = testDate.getTime();
        Date testDate2 = new Date(epochMillisecondsDate);

        return "demo";
    }
}
