package com.rednovo.ace.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.rednovo.ace.data.events.BaseEvent;

import de.greenrobot.event.EventBus;

/**
 * Created by lizhen on 16/3/15.
 */
public class HotTimerReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        EventBus.getDefault().post(new BaseEvent(Globle.KEY_ALARM_REFRESH_HALL));
    }
}
