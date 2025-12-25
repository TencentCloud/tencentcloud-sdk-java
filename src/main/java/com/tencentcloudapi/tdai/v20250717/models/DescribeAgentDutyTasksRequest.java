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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentDutyTasksRequest extends AbstractModel {

    /**
    * agent实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 会话ID
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * 查询开始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 列表查询数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 任务启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务类型
    */
    @SerializedName("AgentTaskType")
    @Expose
    private String AgentTaskType;

    /**
    * 业务参数
    */
    @SerializedName("Parameters")
    @Expose
    private Parameter [] Parameters;

    /**
     * Get agent实例ID 
     * @return InstanceId agent实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set agent实例ID
     * @param InstanceId agent实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 会话ID 
     * @return ChatId 会话ID
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set 会话ID
     * @param ChatId 会话ID
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get 查询开始位置 
     * @return Offset 查询开始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询开始位置
     * @param Offset 查询开始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 列表查询数量 
     * @return Limit 列表查询数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列表查询数量
     * @param Limit 列表查询数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 任务启动时间 
     * @return StartTime 任务启动时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务启动时间
     * @param StartTime 任务启动时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间 
     * @return EndTime 任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
     * @param EndTime 任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务类型 
     * @return AgentTaskType 任务类型
     */
    public String getAgentTaskType() {
        return this.AgentTaskType;
    }

    /**
     * Set 任务类型
     * @param AgentTaskType 任务类型
     */
    public void setAgentTaskType(String AgentTaskType) {
        this.AgentTaskType = AgentTaskType;
    }

    /**
     * Get 业务参数 
     * @return Parameters 业务参数
     */
    public Parameter [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set 业务参数
     * @param Parameters 业务参数
     */
    public void setParameters(Parameter [] Parameters) {
        this.Parameters = Parameters;
    }

    public DescribeAgentDutyTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentDutyTasksRequest(DescribeAgentDutyTasksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AgentTaskType != null) {
            this.AgentTaskType = new String(source.AgentTaskType);
        }
        if (source.Parameters != null) {
            this.Parameters = new Parameter[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new Parameter(source.Parameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AgentTaskType", this.AgentTaskType);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);

    }
}

