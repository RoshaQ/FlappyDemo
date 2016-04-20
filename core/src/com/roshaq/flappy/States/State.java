package com.roshaq.flappy.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by mikol on 19.04.2016.
 */
public abstract class State {
    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;// menadżer stanów PopUpy itp.

    protected State(GameStateManager gsm){
        this.gsm=gsm;
        cam=new OrthographicCamera();
        mouse = new Vector3();

    }

    protected abstract void handleInput();
    public abstract void update(float dt); // Delta Time do ramek
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();
}
