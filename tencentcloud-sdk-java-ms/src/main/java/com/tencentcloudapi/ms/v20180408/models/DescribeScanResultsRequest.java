/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanResultsRequest extends AbstractModel{

    /**
    * 任务唯一标识
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 批量查询一个或者多个app的扫描结果，如果不传表示查询该任务下所提交的所有app
    */
    @SerializedName("AppMd5s")
    @Expose
    private String [] AppMd5s;

    /**
     * Get 任务唯一标识 
     * @return ItemId 任务唯一标识
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 任务唯一标识
     * @param ItemId 任务唯一标识
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 批量查询一个或者多个app的扫描结果，如果不传表示查询该任务下所提交的所有app 
     * @return AppMd5s 批量查询一个或者多个app的扫描结果，如果不传表示查询该任务下所提交的所有app
     */
    public String [] getAppMd5s() {
        return this.AppMd5s;
    }

    /**
     * Set 批量查询一个或者多个app的扫描结果，如果不传表示查询该任务下所提交的所有app
     * @param AppMd5s 批量查询一个或者多个app的扫描结果，如果不传表示查询该任务下所提交的所有app
     */
    public void setAppMd5s(String [] AppMd5s) {
        this.AppMd5s = AppMd5s;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamArraySimple(map, prefix + "AppMd5s.", this.AppMd5s);

    }
}

