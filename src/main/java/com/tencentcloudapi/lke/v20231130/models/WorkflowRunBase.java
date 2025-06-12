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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowRunBase extends AbstractModel {

    /**
    * 运行环境。0: 测试环境； 1: 正式环境
    */
    @SerializedName("RunEnv")
    @Expose
    private Long RunEnv;

    /**
    * 应用ID
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 工作流运行实例的ID
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * 所属工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运行状态。0: 排队中；1: 运行中；2: 运行成功；3: 运行失败； 4: 已取消
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 错误信息
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * 消耗的token总数
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * 创建时间（毫秒时间戳）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 开始时间（毫秒时间戳）
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间（毫秒时间戳）
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 运行环境。0: 测试环境； 1: 正式环境 
     * @return RunEnv 运行环境。0: 测试环境； 1: 正式环境
     */
    public Long getRunEnv() {
        return this.RunEnv;
    }

    /**
     * Set 运行环境。0: 测试环境； 1: 正式环境
     * @param RunEnv 运行环境。0: 测试环境； 1: 正式环境
     */
    public void setRunEnv(Long RunEnv) {
        this.RunEnv = RunEnv;
    }

    /**
     * Get 应用ID 
     * @return AppBizId 应用ID
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID
     * @param AppBizId 应用ID
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 工作流运行实例的ID 
     * @return WorkflowRunId 工作流运行实例的ID
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set 工作流运行实例的ID
     * @param WorkflowRunId 工作流运行实例的ID
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get 所属工作流ID 
     * @return WorkflowId 所属工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 所属工作流ID
     * @param WorkflowId 所属工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 运行状态。0: 排队中；1: 运行中；2: 运行成功；3: 运行失败； 4: 已取消 
     * @return State 运行状态。0: 排队中；1: 运行中；2: 运行成功；3: 运行失败； 4: 已取消
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 运行状态。0: 排队中；1: 运行中；2: 运行成功；3: 运行失败； 4: 已取消
     * @param State 运行状态。0: 排队中；1: 运行中；2: 运行成功；3: 运行失败； 4: 已取消
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 错误信息 
     * @return FailMessage 错误信息
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set 错误信息
     * @param FailMessage 错误信息
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get 消耗的token总数 
     * @return TotalTokens 消耗的token总数
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 消耗的token总数
     * @param TotalTokens 消耗的token总数
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get 创建时间（毫秒时间戳） 
     * @return CreateTime 创建时间（毫秒时间戳）
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间（毫秒时间戳）
     * @param CreateTime 创建时间（毫秒时间戳）
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 开始时间（毫秒时间戳） 
     * @return StartTime 开始时间（毫秒时间戳）
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间（毫秒时间戳）
     * @param StartTime 开始时间（毫秒时间戳）
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间（毫秒时间戳） 
     * @return EndTime 结束时间（毫秒时间戳）
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（毫秒时间戳）
     * @param EndTime 结束时间（毫秒时间戳）
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public WorkflowRunBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunBase(WorkflowRunBase source) {
        if (source.RunEnv != null) {
            this.RunEnv = new Long(source.RunEnv);
        }
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunEnv", this.RunEnv);
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

