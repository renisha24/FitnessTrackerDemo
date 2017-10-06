package com.fit.track.model;

import org.springframework.stereotype.Component;

@Component
public class LeaderBean {
private String Name;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getScore() {
	return Score;
}
public void setScore(int score) {
	Score = score;
}
private int Score;
}
