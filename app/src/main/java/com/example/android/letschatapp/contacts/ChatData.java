package com.example.android.letschatapp.contacts;

import com.sendbird.android.BaseMessage;
import com.sendbird.android.Member;
import com.sendbird.android.User;

import java.util.List;

/**
 * Created by ig097 on 3/26/2018.
 */

public class ChatData {
    private String mChatID;
    private String mChatNickname;
    private String mChatProfileUrl;
    private BaseMessage mLastMassage;
    private int mMemberCount;
    private List<Member> mUsersList;

    public ChatData(){

        mChatID = "";
        mChatNickname = "";
        mChatProfileUrl = "";
        mLastMassage = null;
        mMemberCount = -1;
        mUsersList = null;
    }

    public ChatData(String chatID, String chatNickname, String chatProfileUrl, BaseMessage lastMessage,
                    int memberCount, List<Member> list){
        mChatID = chatID;
        mChatNickname = chatNickname;
        mChatProfileUrl = chatProfileUrl;
        mLastMassage = lastMessage;
        mMemberCount = memberCount;
        mUsersList = list;
    }

    public String getContactChatID(){
        return this.mChatID;
    }

    public String getChatNickname(){
        return this.mChatNickname;
    }

    public String getContactsProfileUrl(){
        return this.mChatProfileUrl;
    }

    public BaseMessage getLastMessage(){
        return this.mLastMassage;
    }

    public String getLastMessageString(){
        return null;
    }

    public int getMemberCount(){
        return this.mMemberCount;
    }

    public List<Member> getUsersList(){
        return this.mUsersList;
    }

    public void setChatNickname(String chatNickname){
        this.mChatNickname = chatNickname;
    }

    public void setContactsProfileUrl(String contactsProfileUrl){
        this.mChatProfileUrl = contactsProfileUrl;
    }

    public void setLastMessage(BaseMessage lastMessage){
        this.mLastMassage = lastMessage;
    }
}
