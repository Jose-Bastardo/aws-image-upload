package com.frapzap.awsimageupload.datastore;

import com.frapzap.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("7d3342ab-c465-4f15-919e-a5187253810e"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("236a803a-52b8-4e2c-9e53-08b236be47e4"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
