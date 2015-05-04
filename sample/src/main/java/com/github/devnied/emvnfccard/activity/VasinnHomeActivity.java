package com.github.devnied.emvnfccard.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.github.devnied.emvnfccard.R;

/**
 * Created by Ægir Már Jónsson on 4.5.2015.
 */
@SuppressLint("InlinedApi")
public class VasinnHomeActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
    }
}
