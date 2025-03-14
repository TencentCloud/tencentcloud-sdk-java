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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskMonitorInfo extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 引擎名称
    */
    @SerializedName("HouseName")
    @Expose
    private String HouseName;

    /**
    * sql语句
    */
    @SerializedName("QuerySQL")
    @Expose
    private String QuerySQL;

    /**
    * 任务时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 执行时间
    */
    @SerializedName("UsedTime")
    @Expose
    private String UsedTime;

    /**
    * 数据扫描量
    */
    @SerializedName("DataAmount")
    @Expose
    private String DataAmount;

    /**
    * 指标信息
    */
    @SerializedName("QueryStats")
    @Expose
    private String QueryStats;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 引擎名称 
     * @return HouseName 引擎名称
     */
    public String getHouseName() {
        return this.HouseName;
    }

    /**
     * Set 引擎名称
     * @param HouseName 引擎名称
     */
    public void setHouseName(String HouseName) {
        this.HouseName = HouseName;
    }

    /**
     * Get sql语句 
     * @return QuerySQL sql语句
     */
    public String getQuerySQL() {
        return this.QuerySQL;
    }

    /**
     * Set sql语句
     * @param QuerySQL sql语句
     */
    public void setQuerySQL(String QuerySQL) {
        this.QuerySQL = QuerySQL;
    }

    /**
     * Get 任务时间 
     * @return CreateTime 任务时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务时间
     * @param CreateTime 任务时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 执行时间 
     * @return UsedTime 执行时间
     */
    public String getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set 执行时间
     * @param UsedTime 执行时间
     */
    public void setUsedTime(String UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get 数据扫描量 
     * @return DataAmount 数据扫描量
     */
    public String getDataAmount() {
        return this.DataAmount;
    }

    /**
     * Set 数据扫描量
     * @param DataAmount 数据扫描量
     */
    public void setDataAmount(String DataAmount) {
        this.DataAmount = DataAmount;
    }

    /**
     * Get 指标信息 
     * @return QueryStats 指标信息
     */
    public String getQueryStats() {
        return this.QueryStats;
    }

    /**
     * Set 指标信息
     * @param QueryStats 指标信息
     */
    public void setQueryStats(String QueryStats) {
        this.QueryStats = QueryStats;
    }

    public TaskMonitorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskMonitorInfo(TaskMonitorInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.HouseName != null) {
            this.HouseName = new String(source.HouseName);
        }
        if (source.QuerySQL != null) {
            this.QuerySQL = new String(source.QuerySQL);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new String(source.UsedTime);
        }
        if (source.DataAmount != null) {
            this.DataAmount = new String(source.DataAmount);
        }
        if (source.QueryStats != null) {
            this.QueryStats = new String(source.QueryStats);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "HouseName", this.HouseName);
        this.setParamSimple(map, prefix + "QuerySQL", this.QuerySQL);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamSimple(map, prefix + "DataAmount", this.DataAmount);
        this.setParamSimple(map, prefix + "QueryStats", this.QueryStats);

    }
}

