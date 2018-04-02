package com.example.android.letschatapp.contacts;

/**
 * Created by ig097 on 3/17/2018.
 */

public class ContactData {

    private String mUserID;
    private String mContactNickname;
    private String mContactsProfileUrl;
    private String mContactStatus;

    public ContactData(){

        mUserID = "";
        mContactNickname = "";
        mContactsProfileUrl = "";
        mContactStatus = "";
    }

    public ContactData(String userID, String contactNickname, String contactProfileUrl, String contactStatus){
        mUserID = userID;
        mContactNickname = contactNickname;
        mContactsProfileUrl = contactProfileUrl;
        mContactStatus = contactStatus;
    }

    public String getContactUserID(){
        return this.mUserID;
    }

    public String getContactNickname(){
        return this.mContactNickname;
    }

    public String getContactsProfileUrl(){
        return this.mContactsProfileUrl;
    }

    public String getContactStatus(){
        return this.mContactStatus;
    }

    public void setContactNickname(String contactNickname){
        this.mContactNickname = contactNickname;
    }

    public void setContactsProfileUrl(String contactsProfileUrl){
        this.mContactsProfileUrl = contactsProfileUrl;
    }

    public void setContactStatus(String contactStatus){
        this.mContactStatus = contactStatus;
    }
}
