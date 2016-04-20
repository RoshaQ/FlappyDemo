package com.roshaq.flappy.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by mikol on 19.04.2016.
 */
public class Bird {
    private static final int GRAVITY = -15;
    private static final int MOVEMENT = 100;
    private Vector3 position; // wektor ten przeochowuje pozycje X Y i Z my używamy tylko X i Y
    private Vector3 velocity;
    private Texture bird;
    private Rectangle bounds;

    public Bird(int x,int y){
        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0);
        bird = new Texture("bird.png");
        bounds = new Rectangle(x,y,bird.getWidth(),bird.getHeight());
    }

    public void update(float dt)
    {
        if(position.y > 0){
            velocity.add(0,GRAVITY,0); //dodajemy wartośc tylko do zmiennej Y  (X  Y i Z)
        }
        velocity.scl(dt); // skaluje wektor za pomocą skalara

        position.add(MOVEMENT * dt, velocity.y, 0);
        if(position.y<0) {
            position.y = 0;
        }
        velocity.scl(1/dt);
        bounds.setPosition(position.x, position.y);

    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return bird;
    }
    public void jump(){
        velocity.y=250;
    }
    public Rectangle getBounds(){
        return bounds;
    }
    public void dispose(){
        bird.dispose();

    }
}
