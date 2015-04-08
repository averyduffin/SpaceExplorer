package com.averyduffin.spaceexplorer.box2d;

import com.averyduffin.spaceexplorer.enums.UserDataType;

public abstract class UserData {
	protected UserDataType userDataType;
	
	public UserData(){
		
	}
	public UserDataType getUserDataType(){
		return userDataType;
	}
}
