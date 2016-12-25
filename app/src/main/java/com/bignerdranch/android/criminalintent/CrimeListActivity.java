package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jingdi on 2016/12/25.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
