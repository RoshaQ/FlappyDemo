package com.roshaq.flappy.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by mikol on 19.04.2016.
 */
public class GameStateManager {

    private Stack<State> states;

    public GameStateManager() {
        states = new Stack<State>();
    }

    // wrzucamy nasz stan do kolejki push - umieszczenie nowego elementu na końcu kolejki;
    public void push(State state){
        states.push(state);

    }
    //pop - usunięcie istniejącego elementu z początku kolejki;
    public void pop(){
        states.pop();
    }
    public void set(State state){
        states.pop();
        states.push(state);
    }
    // peek() funkcja Zwraca ostatni element
    public void update(float dt){
        states.peek().update(dt);
    }
    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
