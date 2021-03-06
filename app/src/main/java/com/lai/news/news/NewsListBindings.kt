/*
 * Copyright 2017, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lai.news.news

import android.databinding.BindingAdapter
import android.widget.ListView

import com.lai.news.data.Article

/**
 * Contains [BindingAdapter]s for the [Task] list.
 */
object NewsListBindings {

    @BindingAdapter("app:items")
    @JvmStatic fun setItems(listView: ListView, items: List<Article>) {
        with(listView.adapter as NewsAdapter) {
            //should be whole list here
            println("setItems...size:" + items.size)
            replaceData(items)
        }
    }
}
