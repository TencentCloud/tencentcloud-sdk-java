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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabaseTupleStatus extends AbstractModel{

    /**
    * 发布数据库名称
    */
    @SerializedName("PublishDatabase")
    @Expose
    private String PublishDatabase;

    /**
    * 订阅数据库名称
    */
    @SerializedName("SubscribeDatabase")
    @Expose
    private String SubscribeDatabase;

    /**
    * 最近一次同步时间
    */
    @SerializedName("LastSyncTime")
    @Expose
    private String LastSyncTime;

    /**
    * 数据库之间的发布订阅状态 running，success，fail，unknow
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 发布数据库名称 
     * @return PublishDatabase 发布数据库名称
     */
    public String getPublishDatabase() {
        return this.PublishDatabase;
    }

    /**
     * Set 发布数据库名称
     * @param PublishDatabase 发布数据库名称
     */
    public void setPublishDatabase(String PublishDatabase) {
        this.PublishDatabase = PublishDatabase;
    }

    /**
     * Get 订阅数据库名称 
     * @return SubscribeDatabase 订阅数据库名称
     */
    public String getSubscribeDatabase() {
        return this.SubscribeDatabase;
    }

    /**
     * Set 订阅数据库名称
     * @param SubscribeDatabase 订阅数据库名称
     */
    public void setSubscribeDatabase(String SubscribeDatabase) {
        this.SubscribeDatabase = SubscribeDatabase;
    }

    /**
     * Get 最近一次同步时间 
     * @return LastSyncTime 最近一次同步时间
     */
    public String getLastSyncTime() {
        return this.LastSyncTime;
    }

    /**
     * Set 最近一次同步时间
     * @param LastSyncTime 最近一次同步时间
     */
    public void setLastSyncTime(String LastSyncTime) {
        this.LastSyncTime = LastSyncTime;
    }

    /**
     * Get 数据库之间的发布订阅状态 running，success，fail，unknow 
     * @return Status 数据库之间的发布订阅状态 running，success，fail，unknow
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 数据库之间的发布订阅状态 running，success，fail，unknow
     * @param Status 数据库之间的发布订阅状态 running，success，fail，unknow
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishDatabase", this.PublishDatabase);
        this.setParamSimple(map, prefix + "SubscribeDatabase", this.SubscribeDatabase);
        this.setParamSimple(map, prefix + "LastSyncTime", this.LastSyncTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

