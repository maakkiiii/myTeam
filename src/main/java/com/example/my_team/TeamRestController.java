package com.example.my_team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class TeamRestController {
    private TeamRepository teamRepository;

    @Autowired
    public TeamRestController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/player")
    public List<Player> getPlayers(){
        return StreamSupport.stream(
                        teamRepository
                                .findAll()
                                .spliterator(), false)
                .collect(Collectors.toList());
    }

}
