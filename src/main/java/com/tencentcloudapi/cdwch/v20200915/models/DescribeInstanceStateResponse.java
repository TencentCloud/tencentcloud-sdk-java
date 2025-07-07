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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceStateResponse extends AbstractModel {

    /**
    * 集群状态，例如：Serving
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 集群操作创建时间
    */
    @SerializedName("FlowCreateTime")
    @Expose
    private String FlowCreateTime;

    /**
    * 集群操作名称
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 集群操作进度
    */
    @SerializedName("FlowProgress")
    @Expose
    private Float FlowProgress;

    /**
    * 集群状态描述，例如：运行中
    */
    @SerializedName("InstanceStateDesc")
    @Expose
    private String InstanceStateDesc;

    /**
    * 集群流程错误信息，例如：“创建失败，资源不足”
    */
    @SerializedName("FlowMsg")
    @Expose
    private String FlowMsg;

    /**
    * 当前步骤的名称，例如：”购买资源中“
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 当前步骤的名称，例如：”购买资源中“
    */
    @SerializedName("ProcessSubName")
    @Expose
    private String ProcessSubName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群状态，例如：Serving 
     * @return InstanceState 集群状态，例如：Serving
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 集群状态，例如：Serving
     * @param InstanceState 集群状态，例如：Serving
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 集群操作创建时间 
     * @return FlowCreateTime 集群操作创建时间
     */
    public String getFlowCreateTime() {
        return this.FlowCreateTime;
    }

    /**
     * Set 集群操作创建时间
     * @param FlowCreateTime 集群操作创建时间
     */
    public void setFlowCreateTime(String FlowCreateTime) {
        this.FlowCreateTime = FlowCreateTime;
    }

    /**
     * Get 集群操作名称 
     * @return FlowName 集群操作名称
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 集群操作名称
     * @param FlowName 集群操作名称
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 集群操作进度 
     * @return FlowProgress 集群操作进度
     */
    public Float getFlowProgress() {
        return this.FlowProgress;
    }

    /**
     * Set 集群操作进度
     * @param FlowProgress 集群操作进度
     */
    public void setFlowProgress(Float FlowProgress) {
        this.FlowProgress = FlowProgress;
    }

    /**
     * Get 集群状态描述，例如：运行中 
     * @return InstanceStateDesc 集群状态描述，例如：运行中
     */
    public String getInstanceStateDesc() {
        return this.InstanceStateDesc;
    }

    /**
     * Set 集群状态描述，例如：运行中
     * @param InstanceStateDesc 集群状态描述，例如：运行中
     */
    public void setInstanceStateDesc(String InstanceStateDesc) {
        this.InstanceStateDesc = InstanceStateDesc;
    }

    /**
     * Get 集群流程错误信息，例如：“创建失败，资源不足” 
     * @return FlowMsg 集群流程错误信息，例如：“创建失败，资源不足”
     */
    public String getFlowMsg() {
        return this.FlowMsg;
    }

    /**
     * Set 集群流程错误信息，例如：“创建失败，资源不足”
     * @param FlowMsg 集群流程错误信息，例如：“创建失败，资源不足”
     */
    public void setFlowMsg(String FlowMsg) {
        this.FlowMsg = FlowMsg;
    }

    /**
     * Get 当前步骤的名称，例如：”购买资源中“ 
     * @return ProcessName 当前步骤的名称，例如：”购买资源中“
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 当前步骤的名称，例如：”购买资源中“
     * @param ProcessName 当前步骤的名称，例如：”购买资源中“
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 当前步骤的名称，例如：”购买资源中“ 
     * @return ProcessSubName 当前步骤的名称，例如：”购买资源中“
     */
    public String getProcessSubName() {
        return this.ProcessSubName;
    }

    /**
     * Set 当前步骤的名称，例如：”购买资源中“
     * @param ProcessSubName 当前步骤的名称，例如：”购买资源中“
     */
    public void setProcessSubName(String ProcessSubName) {
        this.ProcessSubName = ProcessSubName;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceStateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceStateResponse(DescribeInstanceStateResponse source) {
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
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
        if (source.InstanceStateDesc != null) {
            this.InstanceStateDesc = new String(source.InstanceStateDesc);
        }
        if (source.FlowMsg != null) {
            this.FlowMsg = new String(source.FlowMsg);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessSubName != null) {
            this.ProcessSubName = new String(source.ProcessSubName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "FlowCreateTime", this.FlowCreateTime);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowProgress", this.FlowProgress);
        this.setParamSimple(map, prefix + "InstanceStateDesc", this.InstanceStateDesc);
        this.setParamSimple(map, prefix + "FlowMsg", this.FlowMsg);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessSubName", this.ProcessSubName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

