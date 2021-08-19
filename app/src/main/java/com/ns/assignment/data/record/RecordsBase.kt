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



data class RecordsBase(
    val Status: Int,
    val Message: String,
    val data: RecordsMain

){
    override fun toString(): String {
        return "RecordsBase(Status=$Status, Message='$Message', data=$data)"
    }
}

data class Records(
    val Id: String,
    val title: String,
    val shortDescription: String,
    val collectedValue: String,
    val totalValue: String,
    val startDate: String,
    val endDate: String,
    val mainImageURL: String=""
){
    override fun toString(): String {
        return "Records(Id='$Id', title='$title', shortDescription='$shortDescription', collectedValue='$collectedValue', totalValue='$totalValue', startDate='$startDate', endDate='$endDate', mainImageURL='$mainImageURL')"
    }
}
data class RecordsMain(
    val TotalRecords: Int,
    val Records: MutableList<Records>,

    ){
    override fun toString(): String {
        return "RecordsMain(TotalRecords=$TotalRecords, Records=$Records)"
    }
}