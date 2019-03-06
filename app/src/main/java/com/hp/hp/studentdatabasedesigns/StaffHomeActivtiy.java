package com.hp.hp.studentdatabasedesigns;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.hp.hp.studentdatabasedesigns.ViewPagerAnimations.ZoomOutPageTransformer;
import com.hp.hp.studentdatabasedesigns.ViewpagerAdapter.SectionPagerAdapter;
import com.hp.hp.studentdatabasedesigns.ViewpagerAdapter.StaffAdapter;

public class StaffHomeActivtiy extends AppCompatActivity {
    private ViewPager mViewPager;
    StaffAdapter mSectionPagerAdapter;

    private TabLayout mTabLayout;
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_home_activtiy);

//add toolbar
        mToolbar=findViewById(R.id.mainpagetoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Staff");//set title to toolbar
        //getSupportActionBar().setElevation(100);
//tabs
        mViewPager=findViewById(R.id.tabpager);
        //adapter class created
        mSectionPagerAdapter=new StaffAdapter(getSupportFragmentManager());
        //set adapter
        mViewPager.setAdapter(mSectionPagerAdapter);
        //animate view pager
        mViewPager.setPageTransformer(true, new ZoomOutPageTransformer());

        mTabLayout=findViewById(R.id.maintabs);
        //set viewpager to tabs
        mTabLayout.setupWithViewPager(mViewPager);


    }
}
