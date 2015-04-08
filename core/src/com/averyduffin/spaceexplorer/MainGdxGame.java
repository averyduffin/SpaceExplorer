package com.averyduffin.spaceexplorer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/*
 * This website was amazing at teaching how to build
 * a game using libgdx and box2d
 * http://williammora.com/a-running-game-with-libgdx-part-1/
 */
public class MainGdxGame extends Game {
	@Override
	public void create () {
        setScreen(new GameScreen());
	}
}
