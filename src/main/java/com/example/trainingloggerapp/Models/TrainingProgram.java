package com.example.trainingloggerapp.Models;

import java.util.Date;
import java.util.List;

public class TrainingProgram {
    private int id;
    private List<Exercise> exerciseList;

    public TrainingProgram() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }
}
