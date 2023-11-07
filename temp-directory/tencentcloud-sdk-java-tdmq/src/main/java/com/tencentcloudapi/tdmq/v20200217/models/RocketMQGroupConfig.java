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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQGroupConfig extends AbstractModel {

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 消费组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 是否开启广播消费
    */
    @SerializedName("ConsumeBroadcastEnable")
    @Expose
    private Boolean ConsumeBroadcastEnable;

    /**
    * 是否开启消费
    */
    @SerializedName("ConsumeEnable")
    @Expose
    private Boolean ConsumeEnable;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 协议类型，支持以下枚举值
TCP;
HTTP;
    */
    @SerializedName("ConsumerGroupType")
    @Expose
    private String ConsumerGroupType;

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 消费组名称 
     * @return GroupName 消费组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 消费组名称
     * @param GroupName 消费组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 是否开启广播消费 
     * @return ConsumeBroadcastEnable 是否开启广播消费
     */
    public Boolean getConsumeBroadcastEnable() {
        return this.ConsumeBroadcastEnable;
    }

    /**
     * Set 是否开启广播消费
     * @param ConsumeBroadcastEnable 是否开启广播消费
     */
    public void setConsumeBroadcastEnable(Boolean ConsumeBroadcastEnable) {
        this.ConsumeBroadcastEnable = ConsumeBroadcastEnable;
    }

    /**
     * Get 是否开启消费 
     * @return ConsumeEnable 是否开启消费
     */
    public Boolean getConsumeEnable() {
        return this.ConsumeEnable;
    }

    /**
     * Set 是否开启消费
     * @param ConsumeEnable 是否开启消费
     */
    public void setConsumeEnable(Boolean ConsumeEnable) {
        this.ConsumeEnable = ConsumeEnable;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 协议类型，支持以下枚举值
TCP;
HTTP; 
     * @return ConsumerGroupType 协议类型，支持以下枚举值
TCP;
HTTP;
     */
    public String getConsumerGroupType() {
        return this.ConsumerGroupType;
    }

    /**
     * Set 协议类型，支持以下枚举值
TCP;
HTTP;
     * @param ConsumerGroupType 协议类型，支持以下枚举值
TCP;
HTTP;
     */
    public void setConsumerGroupType(String ConsumerGroupType) {
        this.ConsumerGroupType = ConsumerGroupType;
    }

    public RocketMQGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQGroupConfig(RocketMQGroupConfig source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ConsumeBroadcastEnable != null) {
            this.ConsumeBroadcastEnable = new Boolean(source.ConsumeBroadcastEnable);
        }
        if (source.ConsumeEnable != null) {
            this.ConsumeEnable = new Boolean(source.ConsumeEnable);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsumerGroupType != null) {
            this.ConsumerGroupType = new String(source.ConsumerGroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ConsumeBroadcastEnable", this.ConsumeBroadcastEnable);
        this.setParamSimple(map, prefix + "ConsumeEnable", this.ConsumeEnable);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsumerGroupType", this.ConsumerGroupType);

    }
}

