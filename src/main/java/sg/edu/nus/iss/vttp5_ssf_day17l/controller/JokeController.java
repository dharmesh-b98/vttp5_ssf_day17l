package sg.edu.nus.iss.vttp5_ssf_day17l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.vttp5_ssf_day17l.model.Joke;
import sg.edu.nus.iss.vttp5_ssf_day17l.service.JokesService;

@Controller
@RequestMapping(path="/jokes")
public class JokeController {
    
    @Autowired
    JokesService jokesService;
    
    @GetMapping("")
    public String createJokePage(){
        return "jokecreate";
    }

    @PostMapping("")
    //@ResponseBody
    public String handleCreateJoke(@RequestBody MultiValueMap<String, String> formEntity, Model model){
        Integer id = Integer.parseInt(formEntity.getFirst("id"));
        String type = formEntity.getFirst("type");
        String setup = formEntity.getFirst("setup");
        String punchline = formEntity.getFirst("punchline");

        Joke j = new Joke(id,type,setup,punchline);
        
        //model.addAttribute("joke", j);

        jokesService.addJoke(j);

        return "redirect:/jokes";
    }

    @GetMapping("/list")
    public String getJokesList(Model model){
        List<Joke> jokesList = jokesService.getJokes();
        System.out.println("controller level" + jokesList.size() + "\n\n\n\n\n\n\n\n");
        model.addAttribute("jokesList", jokesList);

        return "jokedisplay";
    }

}
