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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineageTask extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务来源
    */
    @SerializedName("TaskSource")
    @Expose
    private String TaskSource;

    /**
    * 任务扩展参数
    */
    @SerializedName("ExtParams")
    @Expose
    private ExtParam [] ExtParams;

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
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务来源 
     * @return TaskSource 任务来源
     */
    public String getTaskSource() {
        return this.TaskSource;
    }

    /**
     * Set 任务来源
     * @param TaskSource 任务来源
     */
    public void setTaskSource(String TaskSource) {
        this.TaskSource = TaskSource;
    }

    /**
     * Get 任务扩展参数 
     * @return ExtParams 任务扩展参数
     */
    public ExtParam [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set 任务扩展参数
     * @param ExtParams 任务扩展参数
     */
    public void setExtParams(ExtParam [] ExtParams) {
        this.ExtParams = ExtParams;
    }

    public LineageTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageTask(LineageTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskSource != null) {
            this.TaskSource = new String(source.TaskSource);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new ExtParam[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new ExtParam(source.ExtParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskSource", this.TaskSource);
        this.setParamArrayObj(map, prefix + "ExtParams.", this.ExtParams);

    }
}

