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

public class InstanceStateInfo extends AbstractModel {

    /**
    * <p>集群状态，例如：Serving</p>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

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
    private Long FlowProgress;

    /**
    * <p>集群状态描述，例如：运行中</p>
    */
    @SerializedName("InstanceStateDesc")
    @Expose
    private String InstanceStateDesc;

    /**
    * <p>集群流程错误信息，例如：“创建失败，资源不足”</p>
    */
    @SerializedName("FlowMsg")
    @Expose
    private String FlowMsg;

    /**
    * <p>当前步骤的名称，例如：”购买资源中“</p>
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * <p>请求id</p>
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <p>流程的二级名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessSubName")
    @Expose
    private String ProcessSubName;

    /**
    * <p>请求ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestID")
    @Expose
    private String RequestID;

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
    public Long getFlowProgress() {
        return this.FlowProgress;
    }

    /**
     * Set <p>集群操作进度</p>
     * @param FlowProgress <p>集群操作进度</p>
     */
    public void setFlowProgress(Long FlowProgress) {
        this.FlowProgress = FlowProgress;
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
     * Get <p>集群流程错误信息，例如：“创建失败，资源不足”</p> 
     * @return FlowMsg <p>集群流程错误信息，例如：“创建失败，资源不足”</p>
     */
    public String getFlowMsg() {
        return this.FlowMsg;
    }

    /**
     * Set <p>集群流程错误信息，例如：“创建失败，资源不足”</p>
     * @param FlowMsg <p>集群流程错误信息，例如：“创建失败，资源不足”</p>
     */
    public void setFlowMsg(String FlowMsg) {
        this.FlowMsg = FlowMsg;
    }

    /**
     * Get <p>当前步骤的名称，例如：”购买资源中“</p> 
     * @return ProcessName <p>当前步骤的名称，例如：”购买资源中“</p>
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set <p>当前步骤的名称，例如：”购买资源中“</p>
     * @param ProcessName <p>当前步骤的名称，例如：”购买资源中“</p>
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get <p>请求id</p> 
     * @return RequestId <p>请求id</p>
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>请求id</p>
     * @param RequestId <p>请求id</p>
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get <p>流程的二级名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessSubName <p>流程的二级名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessSubName() {
        return this.ProcessSubName;
    }

    /**
     * Set <p>流程的二级名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessSubName <p>流程的二级名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessSubName(String ProcessSubName) {
        this.ProcessSubName = ProcessSubName;
    }

    /**
     * Get <p>请求ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestID <p>请求ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestID() {
        return this.RequestID;
    }

    /**
     * Set <p>请求ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestID <p>请求ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestID(String RequestID) {
        this.RequestID = RequestID;
    }

    public InstanceStateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceStateInfo(InstanceStateInfo source) {
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
            this.FlowProgress = new Long(source.FlowProgress);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.ProcessSubName != null) {
            this.ProcessSubName = new String(source.ProcessSubName);
        }
        if (source.RequestID != null) {
            this.RequestID = new String(source.RequestID);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "ProcessSubName", this.ProcessSubName);
        this.setParamSimple(map, prefix + "RequestID", this.RequestID);

    }
}

