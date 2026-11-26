package com.spring.ai.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bio {
    private String fullName;
    private String birthDate;
    private String odiDebut;
    private String testDebut;
    private int halfCenturies;
    private int centuries;
    private int catches;
    private int wickets;
    private String firstWicketNameInInternationMatch;
    private String odiDebutMatchAgainst;
    private String testDebutMatchAgainst;
    private String odiDebutScoreInBalls;
    private String testDebutScoreInBalls;
    private List<String>centuriesScoredAgainstNations;
}
