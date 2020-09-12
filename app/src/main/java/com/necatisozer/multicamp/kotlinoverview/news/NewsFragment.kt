package com.necatisozer.multicamp.kotlinoverview.news

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.necatisozer.multicamp.kotlinoverview.R
import com.necatisozer.multicamp.kotlinoverview.data.RetrofitProvider
import kotlinx.android.synthetic.main.fragment_news.*
import kotlinx.coroutines.launch


class NewsFragment : Fragment(R.layout.fragment_news) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            val response =
                RetrofitProvider.newsApi.getTopHeadlines("tr", "04291d3c8a7442f18277c4d28f30b295")

            recyclerViewArticles.adapter =
                ArticlesAdapter(response.articles.orEmpty().toMutableList()) {
                    val direction = NewsFragmentDirections.actionNewsFragmentToArticleFragment(it)
                    findNavController().navigate(direction)
                }
        }
    }
}