package com.createsapp.androidnotificationdemo;

import android.content.Context;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import static com.createsapp.androidnotificationdemo.MainActivity.CHANNEL_ID;

public class NotificationHelper {

    public static void displayNotification(Context context, String title, String body) {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(body)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat mNotificationMgr = NotificationManagerCompat.from(context);

        mNotificationMgr.notify(1, mBuilder.build());


    }
}
