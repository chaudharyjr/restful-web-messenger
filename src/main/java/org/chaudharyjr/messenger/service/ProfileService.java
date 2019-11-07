package org.chaudharyjr.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.chaudharyjr.messenger.database.DatabaseClass;
import org.chaudharyjr.messenger.model.Message;
import org.chaudharyjr.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("shubham", new Profile(1, "shubham", "koushik","huh"));
		profiles.put("ashish", new Profile(2, "ashish", "koushik","haan"));
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values()); 
	}
	
	public Profile getProfile(String profile) {
		return profiles.get(profile);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		System.out.println(profile);
		profiles.put(profile.getProfileName(), profile);
		System.out.println(profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		System.out.println(profile);
		profiles.put(profile.getProfileName(), profile);
		System.out.println(profile);
		return profile;
	}
	
	public Profile removeProfile(String profile) {
		return profiles.remove(profile);
	}

}
