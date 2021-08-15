package com.innovativetech.socialmedia.Model_Classes;

import android.widget.TextView;

public class Post_modelClass {
    int postProfile,postImage,postSave;
   String postUsername,postAbout,like,comment,share;

    public Post_modelClass(int postProfile, int postImage, int postSave, String postUsername, String postAbout, String like, String comment, String share) {
        this.postProfile = postProfile;
        this.postImage = postImage;
        this.postSave = postSave;
        this.postUsername = postUsername;
        this.postAbout = postAbout;
        this.like = like;
        this.comment = comment;
        this.share = share;
    }

    public int getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(int postProfile) {
        this.postProfile = postProfile;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }

    public int getPostSave() {
        return postSave;
    }

    public void setPostSave(int postSave) {
        this.postSave = postSave;
    }

    public String getPostUsername() {
        return postUsername;
    }

    public void setPostUsername(String postUsername) {
        this.postUsername = postUsername;
    }

    public String getPostAbout() {
        return postAbout;
    }

    public void setPostAbout(String postAbout) {
        this.postAbout = postAbout;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }
}
