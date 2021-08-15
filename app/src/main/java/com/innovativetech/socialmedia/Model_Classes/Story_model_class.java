package com.innovativetech.socialmedia.Model_Classes;

public class Story_model_class {

    int roundedImage,profileImage,storyType;
    String userName;

    public int getRoundedImage() {
        return roundedImage;
    }

    public void setRoundedImage(int roundedImage) {
        this.roundedImage = roundedImage;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public int getStoryType() {
        return storyType;
    }

    public void setStoryType(int storyType) {
        this.storyType = storyType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Story_model_class(int roundedImage, int profileImage, int storyType, String userName) {
        this.roundedImage = roundedImage;
        this.profileImage = profileImage;
        this.storyType = storyType;
        this.userName = userName;


    }
}
