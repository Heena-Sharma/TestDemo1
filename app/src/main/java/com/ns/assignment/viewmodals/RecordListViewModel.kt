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

package com.ns.assignment.viewmodals

import android.content.Context
import android.util.Log
import androidx.lifecycle.*

import com.ns.assignment.data.record.RecordRepository
import com.ns.assignment.data.record.Records
import com.ns.assignment.data.record.RecordsBase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.IOException
import java.io.InputStream
import javax.inject.Inject
import org.json.JSONException

import org.json.JSONObject

import org.json.JSONArray




/**
 * The ViewModel for [RecordListFragment].
 */
@HiltViewModel
class RecordListViewModel @Inject internal constructor(
    recordRepository: RecordRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    var records = MutableLiveData<List<Records>>()

//    val records: MutableLiveData<List<Records>> =  MutableLiveData()
    init {
        viewModelScope.launch {
           val record=recordRepository.getRecords()
           records.postValue(record!!.data.Records)
            Log.e("d=", records.toString())
        }
    }

}

