package com.hp.hp.studentdatabasedesigns;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class StudentHomeActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    SectionPagerAdapter mSectionPagerAdapter;
    private TabLayout mTabLayout;
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);

//add toolbar
        mToolbar=findViewById(R.id.mainpagetoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("   Monisha L");//set title to toolbar
        //getSupportActionBar().setElevation(100);
//tabs
        mViewPager=findViewById(R.id.tabpager);
        //adapter class created
        mSectionPagerAdapter=new SectionPagerAdapter(getSupportFragmentManager());
        //set adapter
        mViewPager.setAdapter(mSectionPagerAdapter);
        //animate view pager
        mViewPager.setPageTransformer(true, new ZoomOutPageTransformer());

        mTabLayout=findViewById(R.id.maintabs);
        //set viewpager to tabs
        mTabLayout.setupWithViewPager(mViewPager);


    }
}
