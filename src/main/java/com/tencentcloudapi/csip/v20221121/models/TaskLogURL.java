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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskLogURL extends AbstractModel {

    /**
    * 报告下载临时链接
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * 任务报告id
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * 任务报告名称
    */
    @SerializedName("TaskLogName")
    @Expose
    private String TaskLogName;

    /**
    * APP ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get 报告下载临时链接 
     * @return URL 报告下载临时链接
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 报告下载临时链接
     * @param URL 报告下载临时链接
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get 任务报告id 
     * @return LogId 任务报告id
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set 任务报告id
     * @param LogId 任务报告id
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 任务报告名称 
     * @return TaskLogName 任务报告名称
     */
    public String getTaskLogName() {
        return this.TaskLogName;
    }

    /**
     * Set 任务报告名称
     * @param TaskLogName 任务报告名称
     */
    public void setTaskLogName(String TaskLogName) {
        this.TaskLogName = TaskLogName;
    }

    /**
     * Get APP ID 
     * @return AppId APP ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set APP ID
     * @param AppId APP ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    public TaskLogURL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLogURL(TaskLogURL source) {
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.TaskLogName != null) {
            this.TaskLogName = new String(source.TaskLogName);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "TaskLogName", this.TaskLogName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

