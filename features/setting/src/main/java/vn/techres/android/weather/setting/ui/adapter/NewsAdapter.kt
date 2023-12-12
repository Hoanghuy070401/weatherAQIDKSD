package vn.techres.android.weather.setting.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import vn.techres.android.weather.app.AppAdapter
import vn.techres.android.weather.setting.databinding.ItemsNewsBinding
import vn.techres.android.weather.model.entity.modelNews.NewsModel
import vn.techres.android.weather.setting.model.interfaces.ItemClickView
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.AppUtils.hide
import vn.techres.android.weather.utils.AppUtils.show
import vn.techres.android.weather.utils.PhotoShowUtils

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/11/2023.
 */
class NewsAdapter(context: Context):AppAdapter<NewsModel>(context) {
    private val clickItem : ItemClickView? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemsNewsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    inner class ViewHolder(private val binding: ItemsNewsBinding):AppViewHolder(binding.root)
    {
        override fun onBindView(position: Int) {
            val data = getItem(position)
            binding.tvTitle.text = data.title
            if (data.date==""){
                binding.tvDate.hide()
            }else{
                binding.tvDate.show()
                binding.tvDate.text = AppUtils.getDateFormat(data.date,true).toString()
            }
            PhotoShowUtils.loadImage(data.linkPhotoLogo,binding.imvPhotoNewsLogo)
            PhotoShowUtils.loadFoodImage(data.linkPhoto,binding.imvPhotoNews)
            binding.root.clickWithDebounce(500){
                clickItem?.itemClick(position)
            }
        }

    }
}