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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceStateItem extends AbstractModel {

    /**
    * <p>集群实例名称</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>集群状态，例如：Serving</p>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * <p>集群状态描述，例如：运行中</p>
    */
    @SerializedName("InstanceStateDesc")
    @Expose
    private String InstanceStateDesc;

    /**
    * <p>集群备份任务开启状态</p>
    */
    @SerializedName("BackupStatus")
    @Expose
    private Long BackupStatus;

    /**
    * <p>集群备份任务开启状态2</p>
    */
    @SerializedName("BackupOpenStatus")
    @Expose
    private Long BackupOpenStatus;

    /**
    * <p>集群操作创建时间</p>
    */
    @SerializedName("FlowCreateTime")
    @Expose
    private String FlowCreateTime;

    /**
    * <p>集群操作名称</p>
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * <p>集群操作进度</p>
    */
    @SerializedName("FlowProgress")
    @Expose
    private Float FlowProgress;

    /**
    * <p>集群流程错误信息</p>
    */
    @SerializedName("FlowMsg")
    @Expose
    private String FlowMsg;

    /**
    * <p>当前步骤的名称</p>
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
     * Get <p>集群实例名称</p> 
     * @return InstanceId <p>集群实例名称</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群实例名称</p>
     * @param InstanceId <p>集群实例名称</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>集群状态，例如：Serving</p> 
     * @return InstanceState <p>集群状态，例如：Serving</p>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set <p>集群状态，例如：Serving</p>
     * @param InstanceState <p>集群状态，例如：Serving</p>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get <p>集群状态描述，例如：运行中</p> 
     * @return InstanceStateDesc <p>集群状态描述，例如：运行中</p>
     */
    public String getInstanceStateDesc() {
        return this.InstanceStateDesc;
    }

    /**
     * Set <p>集群状态描述，例如：运行中</p>
     * @param InstanceStateDesc <p>集群状态描述，例如：运行中</p>
     */
    public void setInstanceStateDesc(String InstanceStateDesc) {
        this.InstanceStateDesc = InstanceStateDesc;
    }

    /**
     * Get <p>集群备份任务开启状态</p> 
     * @return BackupStatus <p>集群备份任务开启状态</p>
     */
    public Long getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set <p>集群备份任务开启状态</p>
     * @param BackupStatus <p>集群备份任务开启状态</p>
     */
    public void setBackupStatus(Long BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get <p>集群备份任务开启状态2</p> 
     * @return BackupOpenStatus <p>集群备份任务开启状态2</p>
     */
    public Long getBackupOpenStatus() {
        return this.BackupOpenStatus;
    }

    /**
     * Set <p>集群备份任务开启状态2</p>
     * @param BackupOpenStatus <p>集群备份任务开启状态2</p>
     */
    public void setBackupOpenStatus(Long BackupOpenStatus) {
        this.BackupOpenStatus = BackupOpenStatus;
    }

    /**
     * Get <p>集群操作创建时间</p> 
     * @return FlowCreateTime <p>集群操作创建时间</p>
     */
    public String getFlowCreateTime() {
        return this.FlowCreateTime;
    }

    /**
     * Set <p>集群操作创建时间</p>
     * @param FlowCreateTime <p>集群操作创建时间</p>
     */
    public void setFlowCreateTime(String FlowCreateTime) {
        this.FlowCreateTime = FlowCreateTime;
    }

    /**
     * Get <p>集群操作名称</p> 
     * @return FlowName <p>集群操作名称</p>
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set <p>集群操作名称</p>
     * @param FlowName <p>集群操作名称</p>
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get <p>集群操作进度</p> 
     * @return FlowProgress <p>集群操作进度</p>
     */
    public Float getFlowProgress() {
        return this.FlowProgress;
    }

    /**
     * Set <p>集群操作进度</p>
     * @param FlowProgress <p>集群操作进度</p>
     */
    public void setFlowProgress(Float FlowProgress) {
        this.FlowProgress = FlowProgress;
    }

    /**
     * Get <p>集群流程错误信息</p> 
     * @return FlowMsg <p>集群流程错误信息</p>
     */
    public String getFlowMsg() {
        return this.FlowMsg;
    }

    /**
     * Set <p>集群流程错误信息</p>
     * @param FlowMsg <p>集群流程错误信息</p>
     */
    public void setFlowMsg(String FlowMsg) {
        this.FlowMsg = FlowMsg;
    }

    /**
     * Get <p>当前步骤的名称</p> 
     * @return ProcessName <p>当前步骤的名称</p>
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set <p>当前步骤的名称</p>
     * @param ProcessName <p>当前步骤的名称</p>
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    public InstanceStateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceStateItem(InstanceStateItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.InstanceStateDesc != null) {
            this.InstanceStateDesc = new String(source.InstanceStateDesc);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new Long(source.BackupStatus);
        }
        if (source.BackupOpenStatus != null) {
            this.BackupOpenStatus = new Long(source.BackupOpenStatus);
        }
        if (source.FlowCreateTime != null) {
            this.FlowCreateTime = new String(source.FlowCreateTime);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowProgress != null) {
            this.FlowProgress = new Float(source.FlowProgress);
        }
        if (source.FlowMsg != null) {
            this.FlowMsg = new String(source.FlowMsg);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "InstanceStateDesc", this.InstanceStateDesc);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "BackupOpenStatus", this.BackupOpenStatus);
        this.setParamSimple(map, prefix + "FlowCreateTime", this.FlowCreateTime);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowProgress", this.FlowProgress);
        this.setParamSimple(map, prefix + "FlowMsg", this.FlowMsg);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);

    }
}

