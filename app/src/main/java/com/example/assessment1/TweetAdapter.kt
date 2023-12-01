package com.example.assessment1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.assessment1.databinding.ListItemTweetBinding

class TweetAdapter(private val context: Context, private val tweetItems: List<TweetItem>) :
    ArrayAdapter<TweetItem>(context, 0, tweetItems) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        val binding: ListItemTweetBinding

        if (itemView == null) {
            binding = ListItemTweetBinding.inflate(LayoutInflater.from(context), parent, false)
            itemView = binding.root
            itemView.tag = binding
        } else {
            binding = itemView.tag as ListItemTweetBinding
        }

        val currentTweetItem = getItem(position)

        binding.apply {
            usernameTextView.text = currentTweetItem?.username
            tweetTextView.text = currentTweetItem?.tweetText
            // Set other UI components as needed
            avatarImageView.setImageResource(currentTweetItem?.avatarResId ?: R.drawable.girl
            )
        }

        return itemView!!
    }
}
