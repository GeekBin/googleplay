package com.jiabin.googleplay.factory;

import android.support.v4.app.Fragment;

import com.jiabin.googleplay.fragment.AppFragment;
import com.jiabin.googleplay.fragment.CategoryFragment;
import com.jiabin.googleplay.fragment.GameFragment;
import com.jiabin.googleplay.fragment.HomeFragment;
import com.jiabin.googleplay.fragment.HotFragment;
import com.jiabin.googleplay.fragment.RecommendFragment;
import com.jiabin.googleplay.fragment.SubjectFragment;

/**
 * @author Administrator
 * @version $Rev$
 * @time 2016/5/10 16:19
 * @des 生产Fragment的工厂
 * @updateAuthor $Author$
 * @updateDate $Data$
 * @updateDes ${TODO}$
 */
public class FragmentFactory extends Fragment {
    //模拟数据
    public static final int FRAGMENT_HOME = 0;//首页
    public static final int FRAGMENT_APP = 1;//应用
    public static final int FRAGMENT_GAME = 2;//游戏
    public static final int FRAGMENT_SUBJECT = 3;//专题
    public static final int FRAGMENT_RECOMMEND = 4;//推荐
    public static final int FRAGMENT_CATEGORY = 5;//分类
    public static final int FRAGMENT_HOT = 6;//排行


    public static Fragment createFragment(int position) {
        Fragment fragment=null;
        switch (position)
        {
            case FRAGMENT_HOME:
                fragment=new HomeFragment();
                break;
            case FRAGMENT_APP:
                fragment=new AppFragment();
                break;
            case FRAGMENT_GAME:
                fragment=new GameFragment();
                break;
            case FRAGMENT_SUBJECT:
                fragment=new SubjectFragment();
                break;
            case FRAGMENT_RECOMMEND:
                fragment=new RecommendFragment();
                break;
            case FRAGMENT_CATEGORY:
                fragment=new CategoryFragment();
                break;
            case FRAGMENT_HOT:
                fragment=new HotFragment();
                break;
            default:
                break;
        }
        return fragment;
    }
}
