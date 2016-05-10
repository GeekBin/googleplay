package com.jiabin.googleplay;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.astuetz.PagerSlidingTabStrip;
import com.jiabin.googleplay.factory.FragmentFactory;
import com.jiabin.googleplay.utils.UIUtils;

public class MainActivity extends AppCompatActivity {

    private ActionBar mActionBar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private PagerSlidingTabStrip mPagerSlidingTabStrip;
    private ViewPager mViewPager;
    private String[] mMainTitleArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initActionBar();
        initView();
        initdatas();
    }


    private void initActionBar() {
        mActionBar = getSupportActionBar();
        mActionBar.setTitle("GooglePlay");//设置标题
        mActionBar.setDisplayHomeAsUpEnabled(true);//设置返回按钮
    }

    private void initView() {

        mDrawerLayout = (DrawerLayout) findViewById(R.id.main_drawer_layout);

        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mPagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.main_tabs);
        mViewPager = (ViewPager) findViewById(R.id.main_viewpager);

        //1.同步状态
        mToggle.syncState();

        //2.对mDrawerLayout设置监听
        mDrawerLayout.setDrawerListener(mToggle);

    }

    private void initdatas() {
        //模拟数据集datas
        mMainTitleArr = UIUtils.getStringArr(R.array.main_titles);

        //给ViewPager设置Adapter
        //mViewPager.setAdapter(new MainFragmentPagerAdapter(getSupportFragmentManager()));
        mViewPager.setAdapter(new MainFragmentStatePagerAdapter(getSupportFragmentManager()));

        mPagerSlidingTabStrip.setViewPager(mViewPager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //期望打开或者关闭DrawerLayout
                mToggle.onOptionsItemSelected(item);
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * PagerAdapter-->view
     * FragmentStatePagerAdapter-->fragment
     * FragmentPagerAdapter-->fragment
     */
    class MainFragmentPagerAdapter extends FragmentPagerAdapter {

        public MainFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            if (mMainTitleArr != null) {
                return mMainTitleArr.length;
            }
            return 0;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = FragmentFactory.createFragment(position);
            return fragment;
        }

        /**
         * 必须要复写getPageTitle方法
         * @param position
         * @return
         */
        public CharSequence getPageTitle(int position) {
            return mMainTitleArr[position];
        }
    }

    class MainFragmentStatePagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter{

        public MainFragmentStatePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            if (mMainTitleArr != null) {
                return mMainTitleArr.length;
            }
            return 0;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = FragmentFactory.createFragment(position);
            return fragment;
        }

        /**
         * 必须要复写getPageTitle方法
         * @param position
         * @return
         */
        public CharSequence getPageTitle(int position) {
            return mMainTitleArr[position];
        }
    }
}
