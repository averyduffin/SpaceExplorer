package com.averyduffin.spaceexplorer.actors;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.averyduffin.spaceexplorer.box2d.UserData;
import com.averyduffin.spaceexplorer.utils.Constants;

public abstract class GameActor extends Actor {
	
	protected Body body;
	protected UserData userData;
	protected Rectangle screenRectangle;
	
	public GameActor() {

    }
	public GameActor(Body body){
		this.body = body;
		this.userData = (UserData) body.getUserData();
		screenRectangle = new Rectangle();
	}
	
	@Override
    public void act(float delta) {
        super.act(delta);

        if (body.getUserData() != null) {
            updateRectangle();
        } else {
            // This means the world destroyed the body (enemy or runner went out of bounds)
            remove();
        }

    }
	
	public abstract UserData getUserData();
	
	protected void updateRectangle() {
        /*screenRectangle.x = transformToScreen(body.getPosition().x) - transformToScreen((float)userData.getWidth()/(float)userData.getHeight())/2;
        screenRectangle.y = transformToScreen(body.getPosition().x) - transformToScreen((float)userData.getHeight()/(float)userData.getWidth())/2;
        screenRectangle.width = transformToScreen((float)userData.getWidth()/(float)userData.getHeight());
        screenRectangle.height = transformToScreen((float)userData.getHeight()/(float)userData.getWidth());*/
		screenRectangle.x = transformToScreen(body.getPosition().x - userData.getWidth() / 2);
        screenRectangle.y = transformToScreen(body.getPosition().y - userData.getHeight() / 2);
        screenRectangle.width = transformToScreen(userData.getWidth());
        screenRectangle.height = transformToScreen(userData.getHeight());
    }

    protected float transformToScreen(float n) {
        return Constants.WORLD_TO_SCREEN * n;
    }
}
