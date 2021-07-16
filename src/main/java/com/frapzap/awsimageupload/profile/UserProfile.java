package com.frapzap.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {

    private final UUID userProfileId;
    private final String username;
    private String userProfileImgLink; // S3 key


    public UserProfile(UUID userProfileId, String username, String userProfileImgLink) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.userProfileImgLink = userProfileImgLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public Optional<String> getUserProfileImgLink() {
        return Optional.ofNullable(userProfileImgLink);
    }

    public void setUserProfileImgLink(String userProfileImgLink) {
        this.userProfileImgLink = userProfileImgLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId, that.userProfileId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(userProfileImgLink, that.userProfileImgLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, username, userProfileImgLink);
    }
}
