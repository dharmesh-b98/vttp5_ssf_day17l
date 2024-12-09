package sg.edu.nus.iss.vttp5_ssf_day17l.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.vttp5_ssf_day17l.model.Joke;
import sg.edu.nus.iss.vttp5_ssf_day17l.repo.ListRepo;

@Service
public class JokesService {
    
    @Autowired
    ListRepo jokesRepo;


    public List<Joke> getJokes(){
        List<String> jokesListString = jokesRepo.getList("jokesList");
        System.out.println("service level" + jokesListString.size() + "\n\n\n\n\n\n\n\n");
        
        List<Joke> jokesList = new ArrayList<>();

        for(String jokestr : jokesListString){
            Joke jokei = new Joke();
            jokei.setId(Integer.parseInt(jokestr.split(",")[0]));
            jokei.setType(jokestr.split(",")[1]);
            jokei.setSetup(jokestr.split(",")[2]);
            jokei.setPunchline(jokestr.split(",")[3]);

            jokesList.add(jokei);
        }

        return jokesList;
    }


    public Boolean addJoke(Joke joke){

        String jokeString = joke.toString();
        jokesRepo.rightPush("jokesList", jokeString);

        return true;
    }
}
