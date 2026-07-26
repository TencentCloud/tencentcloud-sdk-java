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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerTaskSummary extends AbstractModel {

    /**
    * OwnerUserId
    */
    @SerializedName("OwnerUserId")
    @Expose
    private String OwnerUserId;

    /**
    * 定时配置概要
    */
    @SerializedName("PolicySummary")
    @Expose
    private String PolicySummary;

    /**
    * 空间ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 任务相关状态
    */
    @SerializedName("Status")
    @Expose
    private TimerStatus Status;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务ID
    */
    @SerializedName("TimerId")
    @Expose
    private String TimerId;

    /**
     * Get OwnerUserId 
     * @return OwnerUserId OwnerUserId
     */
    public String getOwnerUserId() {
        return this.OwnerUserId;
    }

    /**
     * Set OwnerUserId
     * @param OwnerUserId OwnerUserId
     */
    public void setOwnerUserId(String OwnerUserId) {
        this.OwnerUserId = OwnerUserId;
    }

    /**
     * Get 定时配置概要 
     * @return PolicySummary 定时配置概要
     */
    public String getPolicySummary() {
        return this.PolicySummary;
    }

    /**
     * Set 定时配置概要
     * @param PolicySummary 定时配置概要
     */
    public void setPolicySummary(String PolicySummary) {
        this.PolicySummary = PolicySummary;
    }

    /**
     * Get 空间ID 
     * @return SpaceId 空间ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间ID
     * @param SpaceId 空间ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 任务相关状态 
     * @return Status 任务相关状态
     */
    public TimerStatus getStatus() {
        return this.Status;
    }

    /**
     * Set 任务相关状态
     * @param Status 任务相关状态
     */
    public void setStatus(TimerStatus Status) {
        this.Status = Status;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务ID 
     * @return TimerId 任务ID
     */
    public String getTimerId() {
        return this.TimerId;
    }

    /**
     * Set 任务ID
     * @param TimerId 任务ID
     */
    public void setTimerId(String TimerId) {
        this.TimerId = TimerId;
    }

    public TimerTaskSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerTaskSummary(TimerTaskSummary source) {
        if (source.OwnerUserId != null) {
            this.OwnerUserId = new String(source.OwnerUserId);
        }
        if (source.PolicySummary != null) {
            this.PolicySummary = new String(source.PolicySummary);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Status != null) {
            this.Status = new TimerStatus(source.Status);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TimerId != null) {
            this.TimerId = new String(source.TimerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUserId", this.OwnerUserId);
        this.setParamSimple(map, prefix + "PolicySummary", this.PolicySummary);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TimerId", this.TimerId);

    }
}

