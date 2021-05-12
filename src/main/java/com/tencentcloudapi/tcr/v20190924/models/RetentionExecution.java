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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionExecution extends AbstractModel{

    /**
    * 执行Id
    */
    @SerializedName("ExecutionId")
    @Expose
    private Long ExecutionId;

    /**
    * 所属规则id
    */
    @SerializedName("RetentionId")
    @Expose
    private Long RetentionId;

    /**
    * 执行的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 执行的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 执行的状态，Failed, Succeed, Stopped, InProgress
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 执行Id 
     * @return ExecutionId 执行Id
     */
    public Long getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set 执行Id
     * @param ExecutionId 执行Id
     */
    public void setExecutionId(Long ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get 所属规则id 
     * @return RetentionId 所属规则id
     */
    public Long getRetentionId() {
        return this.RetentionId;
    }

    /**
     * Set 所属规则id
     * @param RetentionId 所属规则id
     */
    public void setRetentionId(Long RetentionId) {
        this.RetentionId = RetentionId;
    }

    /**
     * Get 执行的开始时间 
     * @return StartTime 执行的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 执行的开始时间
     * @param StartTime 执行的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 执行的结束时间 
     * @return EndTime 执行的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 执行的结束时间
     * @param EndTime 执行的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 执行的状态，Failed, Succeed, Stopped, InProgress 
     * @return Status 执行的状态，Failed, Succeed, Stopped, InProgress
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 执行的状态，Failed, Succeed, Stopped, InProgress
     * @param Status 执行的状态，Failed, Succeed, Stopped, InProgress
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public RetentionExecution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetentionExecution(RetentionExecution source) {
        if (source.ExecutionId != null) {
            this.ExecutionId = new Long(source.ExecutionId);
        }
        if (source.RetentionId != null) {
            this.RetentionId = new Long(source.RetentionId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "RetentionId", this.RetentionId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

