package com.example.myapplication;
import android.content.Intent;
import android.util.Log;
import com.example.myapplication.models.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;



import static android.content.ContentValues.TAG;
public class Push_Notification_Android extends FirebaseMessagingService {
    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
    public Push_Notification_Android() {}
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if(remoteMessage != null)
            database.child("message").push().setValue(remoteMessage.getData().toString());


    }
}



