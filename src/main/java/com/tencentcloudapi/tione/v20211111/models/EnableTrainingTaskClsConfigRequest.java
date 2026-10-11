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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableTrainingTaskClsConfigRequest extends AbstractModel {

    /**
    * 训练任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 是否开启CLS日志投递
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * 日志配置
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
     * Get 训练任务ID 
     * @return TaskId 训练任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 训练任务ID
     * @param TaskId 训练任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 是否开启CLS日志投递 
     * @return LogEnable 是否开启CLS日志投递
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set 是否开启CLS日志投递
     * @param LogEnable 是否开启CLS日志投递
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get 日志配置 
     * @return LogConfig 日志配置
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set 日志配置
     * @param LogConfig 日志配置
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    public EnableTrainingTaskClsConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableTrainingTaskClsConfigRequest(EnableTrainingTaskClsConfigRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Boolean(source.LogEnable);
        }
        if (source.LogConfig != null) {
            this.LogConfig = new LogConfig(source.LogConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);

    }
}

