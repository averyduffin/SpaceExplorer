package com.averyduffin.spaceexplorer.box2d;

import com.averyduffin.spaceexplorer.enums.UserDataType;

public class GroundUserData extends UserData {

	public GroundUserData(){
		super();
		userDataType = UserDataType.GROUND;
	}
}
