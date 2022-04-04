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
    * 私用网络ID或者统一ID，建议使用统一ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 流日志唯一ID。
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
    * 流日志实例名字。
    */
    @SerializedName("FlowLogName")
    @Expose
    private String FlowLogName;

    /**
    * 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE|CCN|NAT|DCG。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源唯一ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 流日志采集类型，ACCEPT|REJECT|ALL。
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 流日志存储ID。
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * 流日志存储ID状态。
    */
    @SerializedName("CloudLogState")
    @Expose
    private String CloudLogState;

    /**
    * 流日志描述信息。
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
    * 流日志创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 是否启用，true-启用，false-停用。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 消费端类型：cls、ckafka。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 消费端信息，当消费端类型为ckafka时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowLogStorage")
    @Expose
    private FlowLogStorage FlowLogStorage;

    /**
     * Get 私用网络ID或者统一ID，建议使用统一ID。 
     * @return VpcId 私用网络ID或者统一ID，建议使用统一ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私用网络ID或者统一ID，建议使用统一ID。
     * @param VpcId 私用网络ID或者统一ID，建议使用统一ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 流日志唯一ID。 
     * @return FlowLogId 流日志唯一ID。
     */
    public String getFlowLogId() {
        return this.FlowLogId;
    }

    /**
     * Set 流日志唯一ID。
     * @param FlowLogId 流日志唯一ID。
     */
    public void setFlowLogId(String FlowLogId) {
        this.FlowLogId = FlowLogId;
    }

    /**
     * Get 流日志实例名字。 
     * @return FlowLogName 流日志实例名字。
     */
    public String getFlowLogName() {
        return this.FlowLogName;
    }

    /**
     * Set 流日志实例名字。
     * @param FlowLogName 流日志实例名字。
     */
    public void setFlowLogName(String FlowLogName) {
        this.FlowLogName = FlowLogName;
    }

    /**
     * Get 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE|CCN|NAT|DCG。 
     * @return ResourceType 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE|CCN|NAT|DCG。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE|CCN|NAT|DCG。
     * @param ResourceType 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE|CCN|NAT|DCG。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源唯一ID。 
     * @return ResourceId 资源唯一ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一ID。
     * @param ResourceId 资源唯一ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 流日志采集类型，ACCEPT|REJECT|ALL。 
     * @return TrafficType 流日志采集类型，ACCEPT|REJECT|ALL。
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set 流日志采集类型，ACCEPT|REJECT|ALL。
     * @param TrafficType 流日志采集类型，ACCEPT|REJECT|ALL。
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get 流日志存储ID。 
     * @return CloudLogId 流日志存储ID。
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * Set 流日志存储ID。
     * @param CloudLogId 流日志存储ID。
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * Get 流日志存储ID状态。 
     * @return CloudLogState 流日志存储ID状态。
     */
    public String getCloudLogState() {
        return this.CloudLogState;
    }

    /**
     * Set 流日志存储ID状态。
     * @param CloudLogState 流日志存储ID状态。
     */
    public void setCloudLogState(String CloudLogState) {
        this.CloudLogState = CloudLogState;
    }

    /**
     * Get 流日志描述信息。 
     * @return FlowLogDescription 流日志描述信息。
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set 流日志描述信息。
     * @param FlowLogDescription 流日志描述信息。
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
    }

    /**
     * Get 流日志创建时间。 
     * @return CreatedTime 流日志创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 流日志创建时间。
     * @param CreatedTime 流日志创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。 
     * @return TagSet 标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     * @param TagSet 标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 是否启用，true-启用，false-停用。 
     * @return Enable 是否启用，true-启用，false-停用。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用，true-启用，false-停用。
     * @param Enable 是否启用，true-启用，false-停用。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 消费端类型：cls、ckafka。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 消费端类型：cls、ckafka。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 消费端类型：cls、ckafka。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 消费端类型：cls、ckafka。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 消费端信息，当消费端类型为ckafka时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowLogStorage 消费端信息，当消费端类型为ckafka时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FlowLogStorage getFlowLogStorage() {
        return this.FlowLogStorage;
    }

    /**
     * Set 消费端信息，当消费端类型为ckafka时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowLogStorage 消费端信息，当消费端类型为ckafka时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowLogStorage(FlowLogStorage FlowLogStorage) {
        this.FlowLogStorage = FlowLogStorage;
    }

    public FlowLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowLog(FlowLog source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.FlowLogId != null) {
            this.FlowLogId = new String(source.FlowLogId);
        }
        if (source.FlowLogName != null) {
            this.FlowLogName = new String(source.FlowLogName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.CloudLogId != null) {
            this.CloudLogId = new String(source.CloudLogId);
        }
        if (source.CloudLogState != null) {
            this.CloudLogState = new String(source.CloudLogState);
        }
        if (source.FlowLogDescription != null) {
            this.FlowLogDescription = new String(source.FlowLogDescription);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.FlowLogStorage != null) {
            this.FlowLogStorage = new FlowLogStorage(source.FlowLogStorage);
        }
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
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamObj(map, prefix + "FlowLogStorage.", this.FlowLogStorage);

    }
}

