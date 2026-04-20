/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDatahubTaskRequest extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>任务并发上限</p>
    */
    @SerializedName("TasksMax")
    @Expose
    private Long TasksMax;

    /**
    * <p>数据同步限流值上限</p>单位：MB/s
    */
    @SerializedName("SyncThrottleLimit")
    @Expose
    private Long SyncThrottleLimit;

    /**
    * <p>开启自动扩容</p>枚举值：<ul><li> true： 自动扩容</li><li> false： 手动扩容</li></ul>
    */
    @SerializedName("AutoExpandFlag")
    @Expose
    private Boolean AutoExpandFlag;

    /**
     * Get <p>任务id</p> 
     * @return TaskId <p>任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
     * @param TaskId <p>任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务描述信息</p> 
     * @return Description <p>任务描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述信息</p>
     * @param Description <p>任务描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>任务并发上限</p> 
     * @return TasksMax <p>任务并发上限</p>
     */
    public Long getTasksMax() {
        return this.TasksMax;
    }

    /**
     * Set <p>任务并发上限</p>
     * @param TasksMax <p>任务并发上限</p>
     */
    public void setTasksMax(Long TasksMax) {
        this.TasksMax = TasksMax;
    }

    /**
     * Get <p>数据同步限流值上限</p>单位：MB/s 
     * @return SyncThrottleLimit <p>数据同步限流值上限</p>单位：MB/s
     */
    public Long getSyncThrottleLimit() {
        return this.SyncThrottleLimit;
    }

    /**
     * Set <p>数据同步限流值上限</p>单位：MB/s
     * @param SyncThrottleLimit <p>数据同步限流值上限</p>单位：MB/s
     */
    public void setSyncThrottleLimit(Long SyncThrottleLimit) {
        this.SyncThrottleLimit = SyncThrottleLimit;
    }

    /**
     * Get <p>开启自动扩容</p>枚举值：<ul><li> true： 自动扩容</li><li> false： 手动扩容</li></ul> 
     * @return AutoExpandFlag <p>开启自动扩容</p>枚举值：<ul><li> true： 自动扩容</li><li> false： 手动扩容</li></ul>
     */
    public Boolean getAutoExpandFlag() {
        return this.AutoExpandFlag;
    }

    /**
     * Set <p>开启自动扩容</p>枚举值：<ul><li> true： 自动扩容</li><li> false： 手动扩容</li></ul>
     * @param AutoExpandFlag <p>开启自动扩容</p>枚举值：<ul><li> true： 自动扩容</li><li> false： 手动扩容</li></ul>
     */
    public void setAutoExpandFlag(Boolean AutoExpandFlag) {
        this.AutoExpandFlag = AutoExpandFlag;
    }

    public ModifyDatahubTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDatahubTaskRequest(ModifyDatahubTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TasksMax != null) {
            this.TasksMax = new Long(source.TasksMax);
        }
        if (source.SyncThrottleLimit != null) {
            this.SyncThrottleLimit = new Long(source.SyncThrottleLimit);
        }
        if (source.AutoExpandFlag != null) {
            this.AutoExpandFlag = new Boolean(source.AutoExpandFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TasksMax", this.TasksMax);
        this.setParamSimple(map, prefix + "SyncThrottleLimit", this.SyncThrottleLimit);
        this.setParamSimple(map, prefix + "AutoExpandFlag", this.AutoExpandFlag);

    }
}

