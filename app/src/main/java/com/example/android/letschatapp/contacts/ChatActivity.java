package com.example.android.letschatapp.contacts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.android.letschatapp.R;
import com.sendbird.android.GroupChannel;
import com.sendbird.android.SendBirdException;

import java.util.ArrayList;
import java.util.List;

import static com.example.android.letschatapp.main.TabFragmentOne.EXTRA_USER_ID;
import static com.example.android.letschatapp.main.TabFragmentOne.EXTRA_USER_NICKNAME;

/**
 * Created by ig097 on 3/26/2018.
 */

public class ChatActivity extends AppCompatActivity {

    public static final boolean IS_DISTINCT = true;
    public static final String EXTRA_NEW_CHANNEL_URL = "EXTRA_NEW_CHANNEL_URL";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chat);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main_chat);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_left_white_24_dp);
        }



      /*  if (savedInstanceState == null) {
            // Load list of Group Channels
            Fragment fragment = GroupChannelListFragment.newInstance();

            FragmentManager manager = getSupportFragmentManager();
            manager.popBackStack();

            manager.beginTransaction()
                    .replace(R.id.container_main_chat, fragment)
                    .commit();
        }

        /*String channelUrl = getIntent().getStringExtra("groupChannelUrl");
        if(channelUrl != null) {
            // If started from notification
            Fragment fragment = GroupChatFragment.newInstance(channelUrl);
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.container_group_channel, fragment)
                    .addToBackStack(null)
                    .commit();
        }*/

      String user_id = getIntent().getStringExtra(EXTRA_USER_ID);
      String chatName = getIntent().getStringExtra(EXTRA_USER_NICKNAME);
      List<String> userIDList = new ArrayList<String>();
      userIDList.add(user_id);


    //  createGroupChannel(userIDList, IS_DISTINCT);

     /* String channelUrl = getIntent().getStringExtra(EXTRA_NEW_CHANNEL_URL);
        if(channelUrl != null) {
            // If started from notification
            Fragment fragment = ChatFragment.newInstance(channelUrl);
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.container_main_chat, fragment)
                    .addToBackStack(null)
                    .commit();
        }
*/


     GroupChannel.createChannelWithUserIds(userIDList, IS_DISTINCT, new GroupChannel.GroupChannelCreateHandler() {
          @Override
          public void onResult(GroupChannel groupChannel, SendBirdException e) {
              if (e != null) {
                  // Error.
                  return;
              }

              String channelUrl = groupChannel.getUrl();
              if (channelUrl != null) {
                  // If started from notification
                  Fragment fragment = ChatFragment.newInstance(channelUrl);
                  FragmentManager manager = getSupportFragmentManager();
                  manager.beginTransaction()
                          .replace(R.id.container_main_chat, fragment)
                          //.addToBackStack(null) //do not this!!!
                          .commit();
              }
          }
        });



    }//onCreate



    private void createGroupChannel(List<String> userIds, boolean distinct) {
        GroupChannel.createChannelWithUserIds(userIds, distinct, new GroupChannel.GroupChannelCreateHandler() {
            @Override
            public void onResult(GroupChannel groupChannel, SendBirdException e) {
                if (e != null) {
                    // Error!
                    return;
                }

                Intent intent = new Intent();
                intent.putExtra(EXTRA_NEW_CHANNEL_URL, groupChannel.getUrl());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    interface onBackPressedListener {
        boolean onBack();
    }
    private onBackPressedListener mOnBackPressedListener;

    public void setOnBackPressedListener(onBackPressedListener listener) {
        mOnBackPressedListener = listener;
    }

    @Override
    public void onBackPressed() {
        if (mOnBackPressedListener != null && mOnBackPressedListener.onBack()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

}
