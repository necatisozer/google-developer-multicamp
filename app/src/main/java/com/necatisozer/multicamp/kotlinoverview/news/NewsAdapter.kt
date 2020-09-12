package com.necatisozer.multicamp.kotlinoverview.news

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.necatisozer.multicamp.kotlinoverview.R
import com.necatisozer.multicamp.kotlinoverview.data.model.Article
import com.necatisozer.multicamp.kotlinoverview.notes.inflate
import kotlinx.android.synthetic.main.item_article.view.*

class ArticlesAdapter(
    private val articleList: MutableList<Article>,
    private val onClick: (Article) -> Unit
) :
    RecyclerView.Adapter<ArticleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        return ArticleViewHolder(parent.inflate(R.layout.item_article))
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val note = articleList[position]
        holder.bind(note, onClick)
    }

    override fun getItemCount(): Int = articleList.size
}

class ArticleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(article: Article, onClick: (Article) -> Unit) {
        itemView.imageViewArticleImage.load(article.urlToImage)
        itemView.textViewArticleTitle.text = article.title

        itemView.setOnClickListener {
            onClick(article)
        }
    }
}

