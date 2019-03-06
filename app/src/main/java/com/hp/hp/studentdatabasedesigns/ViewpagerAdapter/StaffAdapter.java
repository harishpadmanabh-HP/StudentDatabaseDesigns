package com.hp.hp.studentdatabasedesigns.ViewpagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hp.hp.studentdatabasedesigns.Fragments.Staff.StaffUpdateMarksFragment;
import com.hp.hp.studentdatabasedesigns.Fragments.Staff.StaffUpdateattendanceFragment;
import com.hp.hp.studentdatabasedesigns.Fragments.Staff.StaffViewAttendanceFragment;
import com.hp.hp.studentdatabasedesigns.Fragments.Staff.StaffViewMarksFragment;
import com.hp.hp.studentdatabasedesigns.Fragments.Student.StudViewAttendance;
import com.hp.hp.studentdatabasedesigns.Fragments.Student.StudViewResult;

public class StaffAdapter extends FragmentPagerAdapter {
    public StaffAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                StaffUpdateattendanceFragment staffUpdateattendanceFragment = new StaffUpdateattendanceFragment();
                return staffUpdateattendanceFragment;

            case 1:
                StaffUpdateMarksFragment staffUpdateMarksFragment = new StaffUpdateMarksFragment();
                return staffUpdateMarksFragment;

            case 2:
                StaffViewAttendanceFragment staffViewAttendanceFragment = new StaffViewAttendanceFragment();
                return staffViewAttendanceFragment;

            case 3:
                StaffViewMarksFragment staffViewMarksFragment = new StaffViewMarksFragment();
                return staffViewMarksFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
    public CharSequence getPageTitle(int position){

        switch (position)
        {
            case 0 :
                return "Update Attendance";
            case 1:
                return "Update Marks";
            case 2:
                return "View Attendance";
            case 3:
                return "View Marks";

            default:
                return null;
        }

    }
}
