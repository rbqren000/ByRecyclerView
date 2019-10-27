package me.jingbin.byrecyclerview.adapter;

import java.util.List;

import me.jingbin.byrecyclerview.R;
import me.jingbin.byrecyclerview.base.BaseBindingAdapter;
import me.jingbin.byrecyclerview.bean.DataItemBean;
import me.jingbin.byrecyclerview.databinding.ItemHomeBinding;

/**
 * @author jingbin
 */
public class DataAdapter extends BaseBindingAdapter<DataItemBean, ItemHomeBinding> {

    public DataAdapter() {
        super(R.layout.item_home);
    }

    public DataAdapter(List<DataItemBean> data) {
        super(R.layout.item_home, data);
    }

//    @Override
//    protected void onBindView(BaseByViewHolder holder, DataItemBean bean, int position) {
//
//    }

    @Override
    protected void bindView(DataItemBean bean, ItemHomeBinding binding, int position) {
        binding.tvText.setText(bean.getTitle() + ": " + position);
    }

}
