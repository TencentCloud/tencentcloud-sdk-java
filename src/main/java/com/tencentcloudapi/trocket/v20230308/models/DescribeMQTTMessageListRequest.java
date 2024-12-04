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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMQTTMessageListRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 请求任务id
    */
    @SerializedName("TaskRequestId")
    @Expose
    private String TaskRequestId;

    /**
    * 查询起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询结果限制数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名称 
     * @return Topic 主题名称
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称
     * @param Topic 主题名称
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 请求任务id 
     * @return TaskRequestId 请求任务id
     */
    public String getTaskRequestId() {
        return this.TaskRequestId;
    }

    /**
     * Set 请求任务id
     * @param TaskRequestId 请求任务id
     */
    public void setTaskRequestId(String TaskRequestId) {
        this.TaskRequestId = TaskRequestId;
    }

    /**
     * Get 查询起始位置 
     * @return Offset 查询起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始位置
     * @param Offset 查询起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询结果限制数量 
     * @return Limit 查询结果限制数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询结果限制数量
     * @param Limit 查询结果限制数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeMQTTMessageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMQTTMessageListRequest(DescribeMQTTMessageListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TaskRequestId != null) {
            this.TaskRequestId = new String(source.TaskRequestId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskRequestId", this.TaskRequestId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

