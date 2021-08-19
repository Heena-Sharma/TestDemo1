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

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

import com.ns.assignment.data.record.Records

import com.ns.assignment.databinding.RecordsListItemBinding

/**
 * Adapter for the [RecyclerView] in [FirstFragment].
 */
class RecordListAdapter : ListAdapter<Records, RecyclerView.ViewHolder>(RecordsDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RecordViewHolder(
            RecordsListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val records = getItem(position)
        (holder as RecordViewHolder).bind(records)

    }

    class RecordViewHolder(
        private val binding: RecordsListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Records) {
            binding.apply {
                records = item
                Log.e("Records==", records.toString())
                executePendingBindings()
//                bindImageFromUrl(binding.image,item.mainImageURL)
            }
        }

    }
}
private class RecordsDiffCallback : DiffUtil.ItemCallback<Records>() {

    override fun areItemsTheSame(oldItem: Records, newItem: Records): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Records, newItem: Records): Boolean {
        return oldItem == newItem
    }
}


