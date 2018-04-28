package com.github.fedka27.racecar.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;


/**
 * Created by ilimturan on 18/01/15.
 */
public class TreeTwo extends Tree {


    public TreeTwo(Vector2 pos, Vector2 direction) {

        super(new Texture(Gdx.files.internal("tree2.png")), pos, direction);
        this.eType = 3;
    }

    @Override
    public void update() {
        pos.add(direction);



    }


}
