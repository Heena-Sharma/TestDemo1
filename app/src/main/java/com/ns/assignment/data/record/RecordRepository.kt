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

package com.ns.assignment.data.record

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.ns.assignment.fragments.RecordFragment
import com.ns.assignment.util.Utility
import com.ns.assignment.viewmodals.RecordListViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import org.json.JSONArray
import org.json.JSONObject
import java.util.ArrayList
import javax.inject.Inject
import javax.inject.Singleton


/**
 * Repository module for handling data operations.
 *
 * Collecting from the Flows in is main-safe.  Room supports Coroutines and moves the
 * query execution off of the main thread.
 */
@Singleton
class RecordRepository @Inject constructor(@ApplicationContext private val appContext: Context) {
//    private var record: MutableLiveData<List<Records>> = MutableLiveData<List<Records>>()


    fun getRecords():RecordsBase? {

      val obj = loadJSONFromAssets(appContext, "testdata.json")
        val recordBase: RecordsBase = Gson().fromJson(obj, RecordsBase::class.java)
        Log.e("recordBase=", recordBase.toString())
       return recordBase

          }

    private fun loadJSONFromAssets(@ApplicationContext appContext: Context, fileName: String): String {
        return appContext.assets.open(fileName).bufferedReader().use { reader ->
            reader.readText()
        }
    }
}
