package com.averyduffin.spaceexplorer.box2d;

import com.averyduffin.spaceexplorer.enums.UserDataType;

public class GroundUserData extends UserData {

	public GroundUserData(float width, float height) {
        super(width, height);
        userDataType = UserDataType.GROUND;
    }
}
