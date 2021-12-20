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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMessageForwardResponse extends AbstractModel{

    /**
    * 区域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 区域名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 配置ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntId")
    @Expose
    private Long IntId;

    /**
    * json数组， 转发类型 1: 告警 2:GPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
    * kafka topic id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 配置创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户Uin信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * kafka topic 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 区域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 区域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 区域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 区域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionName 区域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 区域名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionName 区域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instance 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instance 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 配置ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntId 配置ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntId() {
        return this.IntId;
    }

    /**
     * Set 配置ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntId 配置ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntId(Long IntId) {
        this.IntId = IntId;
    }

    /**
     * Get json数组， 转发类型 1: 告警 2:GPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageType json数组， 转发类型 1: 告警 2:GPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set json数组， 转发类型 1: 告警 2:GPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageType json数组， 转发类型 1: 告警 2:GPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    /**
     * Get kafka topic id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId kafka topic id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set kafka topic id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId kafka topic id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 配置创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 配置创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 配置创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 配置创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户Uin信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户Uin信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户Uin信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get kafka topic 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName kafka topic 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set kafka topic 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName kafka topic 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMessageForwardResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageForwardResponse(DescribeMessageForwardResponse source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.IntId != null) {
            this.IntId = new Long(source.IntId);
        }
        if (source.MessageType != null) {
            this.MessageType = new String(source.MessageType);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "IntId", this.IntId);
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

