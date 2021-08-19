/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ns.assignment.adapters

import android.icu.number.NumberFormatter.with
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.ns.assignment.R


@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: AppCompatImageView, imageUrl: String?) {
    Log.e("testurl", imageUrl!!)
    if (!imageUrl.isNullOrEmpty()) {
        Log.e("testurl success", imageUrl)
        Glide.with(view.context).load(imageUrl)
            .thumbnail(0.5f)
            .placeholder(R.drawable.placeholder)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(view);
    }
}

