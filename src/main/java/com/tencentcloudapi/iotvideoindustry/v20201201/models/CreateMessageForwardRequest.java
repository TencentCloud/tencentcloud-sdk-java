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

public class CreateMessageForwardRequest extends AbstractModel{

    /**
    * 区域ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 区域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 实例ID
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * json数组， 转发类型 1: 告警 2:GPS
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
    * kafka topic id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * kafka topic 名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get 区域ID 
     * @return RegionId 区域ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 区域ID
     * @param RegionId 区域ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域名称 
     * @return RegionName 区域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 区域名称
     * @param RegionName 区域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 实例ID 
     * @return Instance 实例ID
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set 实例ID
     * @param Instance 实例ID
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get json数组， 转发类型 1: 告警 2:GPS 
     * @return MessageType json数组， 转发类型 1: 告警 2:GPS
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set json数组， 转发类型 1: 告警 2:GPS
     * @param MessageType json数组， 转发类型 1: 告警 2:GPS
     */
    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    /**
     * Get kafka topic id 
     * @return TopicId kafka topic id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set kafka topic id
     * @param TopicId kafka topic id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get kafka topic 名称 
     * @return TopicName kafka topic 名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set kafka topic 名称
     * @param TopicName kafka topic 名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public CreateMessageForwardRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMessageForwardRequest(CreateMessageForwardRequest source) {
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
        if (source.MessageType != null) {
            this.MessageType = new String(source.MessageType);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
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
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

