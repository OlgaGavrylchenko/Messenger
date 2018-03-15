package com.example.android.letschatapp.main;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.android.letschatapp.R;

import java.util.Date;

/**
 * Created by ig097 on 3/14/2018.
 */

public class ContactsActivity extends AppCompatActivity {
/*
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);



        //create intent to pick up a contact
        final Intent pickContact = new Intent(Intent.ACTION_PICK,
                ContactsContract.Contacts.CONTENT_URI);
        //get suspect button and assign an intent
        mSuspectButton = (Button) view.findViewById(R.id.crime_suspect);
        mSuspectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(pickContact, REQUEST_CONTACT);
            }
        });


        if(mCrime.getSuspect() != null){
            mSuspectButton.setText(mCrime.getSuspect());
        }

        //prevent app crash if no contact find
        PackageManager packagerManager = getActivity().getPackageManager();
        if(packagerManager.resolveActivity(pickContact,
                PackageManager.MATCH_DEFAULT_ONLY) == null){
            mSuspectButton.setEnabled(false);
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode != Activity.RESULT_OK){
            return;
        }

        if(requestCode == REQUEST_DATE){
            //get date object
            Date date = (Date) data.getSerializableExtra(DatePickerFragment.EXTRA_DATE);
            //set date to crime instance
            mCrime.setDate(date);
            updateCrime();
            //set text of new date to a button
            updateDate();
        }
        else if(requestCode == REQUEST_CONTACT && data != null){
            //locator that points at the single contact
            Uri contactUri = data.getData();

            //specify which fields you want your query to return
            String[] queryFields = new String[]{ContactsContract.Contacts.DISPLAY_NAME};

            //perform your query - the contactUri
            Cursor cursor = getActivity().getContentResolver().query(contactUri,
                    queryFields, null, null, null);

            try{
                //double chheck a result
                if(cursor.getCount() == 0){
                    return;
                }

                //start from a first column
                cursor.moveToFirst();
                String suspect = cursor.getString(0);
                mCrime.setSuspect(suspect);
                updateCrime();
                mSuspectButton.setText(suspect);
            }finally{
                cursor.close();
            }
        }
        else if (requestCode == REQUEST_PHOTO) {
            Uri uri = FileProvider.getUriForFile(getActivity(),
                    "com.example.android.criminalintent.fileprovider",
                    mPhotoFile);

            getActivity().revokeUriPermission(uri,
                    Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
            updateCrime();
            updatePhotoView();
        }
    }//onActivityResult
*/
}
