package com.toby.ReadOnly.Activities;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.toby.ReadOnly.R;

public class ActMain extends Activity {

    private SharedPreferences pref;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pref=getSharedPreferences(getString(R.string.pref_file),MODE_PRIVATE);
        setContentView(R.layout.act_main_layout);
        if((!pref.contains("FirstRun"))||(pref.getBoolean("FirstRun",true)))
        {
            //First Run, show wizard.
            //首次运行，转到设置向导

        }
    }
}