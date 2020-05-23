package com.example.playtime.Cards;

public class cards {
    private String userId;
    private String name;
    private String profileImageUrl;
    private String sportsPlayed;
    private String accountType;
    public cards (String userId, String name, String profileImageUrl,String sportsPlayed, String accountType){
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
        this.sportsPlayed=sportsPlayed;
        this.accountType=accountType;
    }

    public String getUserId(){
        return userId;
    }
    public void setUserID(String userID){
        this.userId = userId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getProfileImageUrl(){
        return profileImageUrl;
    }
    public void setProfileImageUrl(String profileImageUrl){
        this.profileImageUrl = profileImageUrl;
    }
    public String getSportsPlayed(){
        return sportsPlayed;
    }
    public String getAccountType(){
        return accountType;
    }
}