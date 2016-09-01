package com.stfalcon.socialauthhelper.gplus.model;

/**
 * Created by Anton Bevza on 6/16/16.
 */
public class GooglePlusProfile {
    private String name;
    private String token;
    private String avatar;
    private String email;
    private String id;

    public GooglePlusProfile(String name, String token, String avatar, String email, String id) {
        this.name = name;
        this.token = token;
        this.avatar = avatar;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAvatar() {
        if (avatar != null) {
            return avatar.replace("s96-c", "s512-c");
        } else {
            return null;
        }
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GooglePlusProfile{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}