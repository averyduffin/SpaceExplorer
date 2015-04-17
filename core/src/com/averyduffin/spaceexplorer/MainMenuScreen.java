package com.averyduffin.spaceexplorer;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.averyduffin.spaceexplorer.utils.Constants;

public class MainMenuScreen {
	final MainGdxGame game;
	OrthographicCamera camera;
	
	
	public MainMenuScreen(final MainGdxGame gam){
		game = gam;
		camera = new OrthographicCamera();
        camera.setToOrtho(false, Constants.APP_WIDTH, Constants.APP_HEIGHT);
	}
    public void render(float delta) {
    	//Clear the screen
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        /*camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "Welcome to Drop!!! ", 100, 150);
        game.font.draw(game.batch, "Tap anywhere to begin!", 100, 100);
        game.batch.end();

        if (Gdx.input.isTouched()) {
            game.setScreen(new GameScreen(game));
            dispose();
        }*/
    }
}
