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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMetricSubscribeRequest extends AbstractModel {

    /**
    * 指标采集任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 指标采集任务配置的日志主题id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get 指标采集任务id 
     * @return TaskId 指标采集任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 指标采集任务id
     * @param TaskId 指标采集任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 指标采集任务配置的日志主题id。 
     * @return TopicId 指标采集任务配置的日志主题id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 指标采集任务配置的日志主题id。
     * @param TopicId 指标采集任务配置的日志主题id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public DeleteMetricSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMetricSubscribeRequest(DeleteMetricSubscribeRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

