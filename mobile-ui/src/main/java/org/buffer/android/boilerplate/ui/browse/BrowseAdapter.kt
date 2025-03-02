package org.buffer.android.boilerplate.ui.browse

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.buffer.android.boilerplate.ui.R
import org.buffer.android.boilerplate.ui.databinding.ItemBufferooBinding
import org.buffer.android.boilerplate.ui.model.BufferooViewModel
import javax.inject.Inject

class BrowseAdapter @Inject constructor(): RecyclerView.Adapter<BrowseAdapter.ViewHolder>() {

   var bufferoos: List<BufferooViewModel> = arrayListOf()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val bufferoo = bufferoos[position]
//        holder.nameText.text = bufferoo.name
//        holder.titleText.text = bufferoo.title
//
//        Glide.with(holder.itemView.context)
//                .load(bufferoo.avatar)
//                .apply(RequestOptions.circleCropTransform())
//                .into(holder.avatarImage)

        with(holder){
            with(bufferoos[position]){
                binding.textName.text = login

                Glide.with(holder.itemView.context).load(avatar_url).into(binding.imageAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val itemView = LayoutInflater
//                .from(parent.context)
//                .inflate(R.layout.item_bufferoo, parent, false)
//        return ViewHolder(itemView)

        val binding = ItemBufferooBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return bufferoos.size
    }

    inner class ViewHolder(val binding: ItemBufferooBinding) : RecyclerView.ViewHolder(binding.root) {
        var avatarImage: ImageView
        var nameText: TextView
        var titleText: TextView

        init {
            avatarImage = binding.imageAvatar
            nameText = binding.textName
            titleText = binding.textTitle
//            avatarImage = view.findViewById(R.id.image_avatar)
//            nameText = view.findViewById(R.id.text_name)
//            titleText = view.findViewById(R.id.text_title)
        }
    }

}