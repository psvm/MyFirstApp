package com.example.myfirstapp;

import android.support.v4.app.Fragment;

public class AuthActivity extends SindleFragmentActivity{
    @Override
    protected Fragment getFragment() {
        return AuthFragment.newInstance();
    }
}
