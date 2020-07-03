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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowLog extends AbstractModel{

    /**
    * 私用网络ID或者统一ID，建议使用统一ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 流日志唯一ID
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
    * 流日志实例名字
    */
    @SerializedName("FlowLogName")
    @Expose
    private String FlowLogName;

    /**
    * 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源唯一ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 流日志采集类型，ACCEPT|REJECT|ALL
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 流日志存储ID
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * 流日志存储ID状态
    */
    @SerializedName("CloudLogState")
    @Expose
    private String CloudLogState;

    /**
    * 流日志描述信息
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
    * 流日志创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 私用网络ID或者统一ID，建议使用统一ID 
     * @return VpcId 私用网络ID或者统一ID，建议使用统一ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私用网络ID或者统一ID，建议使用统一ID
     * @param VpcId 私用网络ID或者统一ID，建议使用统一ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 流日志唯一ID 
     * @return FlowLogId 流日志唯一ID
     */
    public String getFlowLogId() {
        return this.FlowLogId;
    }

    /**
     * Set 流日志唯一ID
     * @param FlowLogId 流日志唯一ID
     */
    public void setFlowLogId(String FlowLogId) {
        this.FlowLogId = FlowLogId;
    }

    /**
     * Get 流日志实例名字 
     * @return FlowLogName 流日志实例名字
     */
    public String getFlowLogName() {
        return this.FlowLogName;
    }

    /**
     * Set 流日志实例名字
     * @param FlowLogName 流日志实例名字
     */
    public void setFlowLogName(String FlowLogName) {
        this.FlowLogName = FlowLogName;
    }

    /**
     * Get 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE 
     * @return ResourceType 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE
     * @param ResourceType 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源唯一ID 
     * @return ResourceId 资源唯一ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一ID
     * @param ResourceId 资源唯一ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 流日志采集类型，ACCEPT|REJECT|ALL 
     * @return TrafficType 流日志采集类型，ACCEPT|REJECT|ALL
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set 流日志采集类型，ACCEPT|REJECT|ALL
     * @param TrafficType 流日志采集类型，ACCEPT|REJECT|ALL
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get 流日志存储ID 
     * @return CloudLogId 流日志存储ID
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * Set 流日志存储ID
     * @param CloudLogId 流日志存储ID
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * Get 流日志存储ID状态 
     * @return CloudLogState 流日志存储ID状态
     */
    public String getCloudLogState() {
        return this.CloudLogState;
    }

    /**
     * Set 流日志存储ID状态
     * @param CloudLogState 流日志存储ID状态
     */
    public void setCloudLogState(String CloudLogState) {
        this.CloudLogState = CloudLogState;
    }

    /**
     * Get 流日志描述信息 
     * @return FlowLogDescription 流日志描述信息
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set 流日志描述信息
     * @param FlowLogDescription 流日志描述信息
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
    }

    /**
     * Get 流日志创建时间 
     * @return CreatedTime 流日志创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 流日志创建时间
     * @param CreatedTime 流日志创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FlowLogId", this.FlowLogId);
        this.setParamSimple(map, prefix + "FlowLogName", this.FlowLogName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamSimple(map, prefix + "CloudLogState", this.CloudLogState);
        this.setParamSimple(map, prefix + "FlowLogDescription", this.FlowLogDescription);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

