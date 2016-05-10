package com.jiabin.googleplay.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jiabin.googleplay.utils.UIUtils;

/**
 * @author Administrator
 * @version $Rev$
 * @time 2016/5/10 16:31
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Data$
 * @updateDes ${TODO}$
 */
public class AppFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView=new TextView(UIUtils.getContext());
        textView.setGravity(Gravity.CENTER);
        textView.setText(this.getClass().getSimpleName());
        return textView;
    }
}
