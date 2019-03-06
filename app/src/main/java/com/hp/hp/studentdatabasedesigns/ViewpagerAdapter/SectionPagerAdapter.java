package com.hp.hp.studentdatabasedesigns.ViewpagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hp.hp.studentdatabasedesigns.Fragments.Student.StudViewAttendance;
import com.hp.hp.studentdatabasedesigns.Fragments.Student.StudViewResult;

//implement methods and constructor
public class SectionPagerAdapter extends FragmentPagerAdapter {
    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                StudViewResult studViewResult=new StudViewResult();
                return studViewResult;

            case 1:
                StudViewAttendance viewAttendance=new StudViewAttendance();
                return  viewAttendance;


            default: return null;
        }

        //return null;
    }

    @Override
    public int getCount() {
        //no of tabs
        return 2;
    }
    //set tab title
    public CharSequence getPageTitle(int position){

        switch (position)
        {
            case 0 :
                return "View Result";
            case 1:
                return "View Attendance";

            default:
                return null;
        }

    }
}
