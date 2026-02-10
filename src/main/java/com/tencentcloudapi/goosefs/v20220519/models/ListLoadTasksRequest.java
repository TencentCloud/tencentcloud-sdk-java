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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLoadTasksRequest extends AbstractModel {

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 偏移量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 任务创建起始时间戳，默认为3天前：当前时间戳-86400*3
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * 任务变更时间戳
    */
    @SerializedName("EndTimestamp")
    @Expose
    private Long EndTimestamp;

    /**
    * 筛选任务状态，枚举Waiting,Running,Canceled,Completed。默认返回所有任务
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 筛选优先级任务，默认返回所有任务
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 偏移量 
     * @return Limit 偏移量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 偏移量
     * @param Limit 偏移量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 任务创建起始时间戳，默认为3天前：当前时间戳-86400*3 
     * @return StartTimestamp 任务创建起始时间戳，默认为3天前：当前时间戳-86400*3
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set 任务创建起始时间戳，默认为3天前：当前时间戳-86400*3
     * @param StartTimestamp 任务创建起始时间戳，默认为3天前：当前时间戳-86400*3
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get 任务变更时间戳 
     * @return EndTimestamp 任务变更时间戳
     */
    public Long getEndTimestamp() {
        return this.EndTimestamp;
    }

    /**
     * Set 任务变更时间戳
     * @param EndTimestamp 任务变更时间戳
     */
    public void setEndTimestamp(Long EndTimestamp) {
        this.EndTimestamp = EndTimestamp;
    }

    /**
     * Get 筛选任务状态，枚举Waiting,Running,Canceled,Completed。默认返回所有任务 
     * @return State 筛选任务状态，枚举Waiting,Running,Canceled,Completed。默认返回所有任务
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 筛选任务状态，枚举Waiting,Running,Canceled,Completed。默认返回所有任务
     * @param State 筛选任务状态，枚举Waiting,Running,Canceled,Completed。默认返回所有任务
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 筛选优先级任务，默认返回所有任务 
     * @return Priority 筛选优先级任务，默认返回所有任务
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 筛选优先级任务，默认返回所有任务
     * @param Priority 筛选优先级任务，默认返回所有任务
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public ListLoadTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListLoadTasksRequest(ListLoadTasksRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.EndTimestamp != null) {
            this.EndTimestamp = new Long(source.EndTimestamp);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "EndTimestamp", this.EndTimestamp);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

