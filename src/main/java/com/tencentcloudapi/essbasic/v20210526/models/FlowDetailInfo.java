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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowDetailInfo extends AbstractModel{

    /**
    * 合同(流程)的Id
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 合同(流程)的名字
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 合同(流程)的类型
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 合同(流程)的状态
    */
    @SerializedName("FlowStatus")
    @Expose
    private String FlowStatus;

    /**
    * 合同(流程)的信息
    */
    @SerializedName("FlowMessage")
    @Expose
    private String FlowMessage;

    /**
    * 合同(流程)的创建时间戳
    */
    @SerializedName("CreateOn")
    @Expose
    private Long CreateOn;

    /**
    * 合同(流程)的签署截止时间戳
    */
    @SerializedName("DeadLine")
    @Expose
    private Long DeadLine;

    /**
    * 用户自定义数据
    */
    @SerializedName("CustomData")
    @Expose
    private String CustomData;

    /**
    * 合同(流程)的签署人数组
    */
    @SerializedName("FlowApproverInfos")
    @Expose
    private FlowApproverDetail [] FlowApproverInfos;

    /**
     * Get 合同(流程)的Id 
     * @return FlowId 合同(流程)的Id
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同(流程)的Id
     * @param FlowId 合同(流程)的Id
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 合同(流程)的名字 
     * @return FlowName 合同(流程)的名字
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同(流程)的名字
     * @param FlowName 合同(流程)的名字
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 合同(流程)的类型 
     * @return FlowType 合同(流程)的类型
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 合同(流程)的类型
     * @param FlowType 合同(流程)的类型
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 合同(流程)的状态 
     * @return FlowStatus 合同(流程)的状态
     */
    public String getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set 合同(流程)的状态
     * @param FlowStatus 合同(流程)的状态
     */
    public void setFlowStatus(String FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get 合同(流程)的信息 
     * @return FlowMessage 合同(流程)的信息
     */
    public String getFlowMessage() {
        return this.FlowMessage;
    }

    /**
     * Set 合同(流程)的信息
     * @param FlowMessage 合同(流程)的信息
     */
    public void setFlowMessage(String FlowMessage) {
        this.FlowMessage = FlowMessage;
    }

    /**
     * Get 合同(流程)的创建时间戳 
     * @return CreateOn 合同(流程)的创建时间戳
     */
    public Long getCreateOn() {
        return this.CreateOn;
    }

    /**
     * Set 合同(流程)的创建时间戳
     * @param CreateOn 合同(流程)的创建时间戳
     */
    public void setCreateOn(Long CreateOn) {
        this.CreateOn = CreateOn;
    }

    /**
     * Get 合同(流程)的签署截止时间戳 
     * @return DeadLine 合同(流程)的签署截止时间戳
     */
    public Long getDeadLine() {
        return this.DeadLine;
    }

    /**
     * Set 合同(流程)的签署截止时间戳
     * @param DeadLine 合同(流程)的签署截止时间戳
     */
    public void setDeadLine(Long DeadLine) {
        this.DeadLine = DeadLine;
    }

    /**
     * Get 用户自定义数据 
     * @return CustomData 用户自定义数据
     */
    public String getCustomData() {
        return this.CustomData;
    }

    /**
     * Set 用户自定义数据
     * @param CustomData 用户自定义数据
     */
    public void setCustomData(String CustomData) {
        this.CustomData = CustomData;
    }

    /**
     * Get 合同(流程)的签署人数组 
     * @return FlowApproverInfos 合同(流程)的签署人数组
     */
    public FlowApproverDetail [] getFlowApproverInfos() {
        return this.FlowApproverInfos;
    }

    /**
     * Set 合同(流程)的签署人数组
     * @param FlowApproverInfos 合同(流程)的签署人数组
     */
    public void setFlowApproverInfos(FlowApproverDetail [] FlowApproverInfos) {
        this.FlowApproverInfos = FlowApproverInfos;
    }

    public FlowDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowDetailInfo(FlowDetailInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowStatus != null) {
            this.FlowStatus = new String(source.FlowStatus);
        }
        if (source.FlowMessage != null) {
            this.FlowMessage = new String(source.FlowMessage);
        }
        if (source.CreateOn != null) {
            this.CreateOn = new Long(source.CreateOn);
        }
        if (source.DeadLine != null) {
            this.DeadLine = new Long(source.DeadLine);
        }
        if (source.CustomData != null) {
            this.CustomData = new String(source.CustomData);
        }
        if (source.FlowApproverInfos != null) {
            this.FlowApproverInfos = new FlowApproverDetail[source.FlowApproverInfos.length];
            for (int i = 0; i < source.FlowApproverInfos.length; i++) {
                this.FlowApproverInfos[i] = new FlowApproverDetail(source.FlowApproverInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowStatus", this.FlowStatus);
        this.setParamSimple(map, prefix + "FlowMessage", this.FlowMessage);
        this.setParamSimple(map, prefix + "CreateOn", this.CreateOn);
        this.setParamSimple(map, prefix + "DeadLine", this.DeadLine);
        this.setParamSimple(map, prefix + "CustomData", this.CustomData);
        this.setParamArrayObj(map, prefix + "FlowApproverInfos.", this.FlowApproverInfos);

    }
}

