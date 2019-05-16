package com.skindrila.spring.library.utils;

import java.util.HashMap;
import java.util.List;

import com.skindrila.spring.library.entity.Role;
import com.skindrila.spring.library.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserUtilsImpl implements UserUtils {

	@Override
	public HashMap<String, String> userRolesInString(List<User> userList) {
		
		HashMap<String, String> userRoles = new HashMap<String, String>();
		
		for (User user : userList){
			
			String strRoles = "";
			
			for (Role role : user.getRoles()){
				strRoles += ", " + role.getName();
			}
			
			userRoles.put(user.getUsername(), strRoles);
		}
		
		return null;
	}

}
