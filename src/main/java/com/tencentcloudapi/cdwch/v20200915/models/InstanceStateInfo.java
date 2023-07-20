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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceStateInfo extends AbstractModel{

    /**
    * 集群状态，例如：Serving
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 集群操作创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowCreateTime")
    @Expose
    private String FlowCreateTime;

    /**
    * 集群操作名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 集群操作进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowProgress")
    @Expose
    private Long FlowProgress;

    /**
    * 集群状态描述，例如：运行中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStateDesc")
    @Expose
    private String InstanceStateDesc;

    /**
    * 集群流程错误信息，例如：“创建失败，资源不足”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowMsg")
    @Expose
    private String FlowMsg;

    /**
    * 当前步骤的名称，例如：”购买资源中“
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 请求id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 流程的二级名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessSubName")
    @Expose
    private String ProcessSubName;

    /**
     * Get 集群状态，例如：Serving
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceState 集群状态，例如：Serving
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 集群状态，例如：Serving
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceState 集群状态，例如：Serving
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 集群操作创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowCreateTime 集群操作创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowCreateTime() {
        return this.FlowCreateTime;
    }

    /**
     * Set 集群操作创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowCreateTime 集群操作创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowCreateTime(String FlowCreateTime) {
        this.FlowCreateTime = FlowCreateTime;
    }

    /**
     * Get 集群操作名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowName 集群操作名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 集群操作名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowName 集群操作名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 集群操作进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowProgress 集群操作进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowProgress() {
        return this.FlowProgress;
    }

    /**
     * Set 集群操作进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowProgress 集群操作进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowProgress(Long FlowProgress) {
        this.FlowProgress = FlowProgress;
    }

    /**
     * Get 集群状态描述，例如：运行中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStateDesc 集群状态描述，例如：运行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStateDesc() {
        return this.InstanceStateDesc;
    }

    /**
     * Set 集群状态描述，例如：运行中
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStateDesc 集群状态描述，例如：运行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStateDesc(String InstanceStateDesc) {
        this.InstanceStateDesc = InstanceStateDesc;
    }

    /**
     * Get 集群流程错误信息，例如：“创建失败，资源不足”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowMsg 集群流程错误信息，例如：“创建失败，资源不足”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowMsg() {
        return this.FlowMsg;
    }

    /**
     * Set 集群流程错误信息，例如：“创建失败，资源不足”
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowMsg 集群流程错误信息，例如：“创建失败，资源不足”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowMsg(String FlowMsg) {
        this.FlowMsg = FlowMsg;
    }

    /**
     * Get 当前步骤的名称，例如：”购买资源中“
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessName 当前步骤的名称，例如：”购买资源中“
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 当前步骤的名称，例如：”购买资源中“
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessName 当前步骤的名称，例如：”购买资源中“
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 请求id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestId 请求id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 请求id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestId 请求id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 流程的二级名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessSubName 流程的二级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessSubName() {
        return this.ProcessSubName;
    }

    /**
     * Set 流程的二级名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessSubName 流程的二级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessSubName(String ProcessSubName) {
        this.ProcessSubName = ProcessSubName;
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

    }
}

