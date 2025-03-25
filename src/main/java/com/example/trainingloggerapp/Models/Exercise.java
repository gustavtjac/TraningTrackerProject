package com.example.trainingloggerapp.Models;

import java.util.List;

public class Exercise {
    int id;
    private List<Set> setList;

    public Exercise() {
    }

    public List<Set> getSetList() {
        return setList;
    }

    public void setSetList(List<Set> setList) {
        this.setList = setList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
