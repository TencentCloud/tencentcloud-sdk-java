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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQVirtualHostInfo extends AbstractModel{

    /**
    * 集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * vhost名
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * vhost描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * vhost标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * vhost概览统计信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualHostStatistics")
    @Expose
    private RabbitMQVirtualHostStatistics VirtualHostStatistics;

    /**
    * vhost状态，与原生控制台对应，有running、partial、stopped、unknown
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageHeapCount")
    @Expose
    private Long MessageHeapCount;

    /**
    * 输入消息速率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageRateIn")
    @Expose
    private Float MessageRateIn;

    /**
    * 输出消息速率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageRateOut")
    @Expose
    private Float MessageRateOut;

    /**
     * Get 集群实例Id 
     * @return InstanceId 集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例Id
     * @param InstanceId 集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get vhost名 
     * @return VirtualHost vhost名
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set vhost名
     * @param VirtualHost vhost名
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get vhost描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description vhost描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set vhost描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description vhost描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get vhost标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags vhost标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set vhost标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags vhost标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get vhost概览统计信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualHostStatistics vhost概览统计信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RabbitMQVirtualHostStatistics getVirtualHostStatistics() {
        return this.VirtualHostStatistics;
    }

    /**
     * Set vhost概览统计信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualHostStatistics vhost概览统计信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualHostStatistics(RabbitMQVirtualHostStatistics VirtualHostStatistics) {
        this.VirtualHostStatistics = VirtualHostStatistics;
    }

    /**
     * Get vhost状态，与原生控制台对应，有running、partial、stopped、unknown
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status vhost状态，与原生控制台对应，有running、partial、stopped、unknown
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set vhost状态，与原生控制台对应，有running、partial、stopped、unknown
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status vhost状态，与原生控制台对应，有running、partial、stopped、unknown
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageHeapCount 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageHeapCount() {
        return this.MessageHeapCount;
    }

    /**
     * Set 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageHeapCount 消息堆积数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageHeapCount(Long MessageHeapCount) {
        this.MessageHeapCount = MessageHeapCount;
    }

    /**
     * Get 输入消息速率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageRateIn 输入消息速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMessageRateIn() {
        return this.MessageRateIn;
    }

    /**
     * Set 输入消息速率
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageRateIn 输入消息速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageRateIn(Float MessageRateIn) {
        this.MessageRateIn = MessageRateIn;
    }

    /**
     * Get 输出消息速率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageRateOut 输出消息速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMessageRateOut() {
        return this.MessageRateOut;
    }

    /**
     * Set 输出消息速率
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageRateOut 输出消息速率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageRateOut(Float MessageRateOut) {
        this.MessageRateOut = MessageRateOut;
    }

    public RabbitMQVirtualHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQVirtualHostInfo(RabbitMQVirtualHostInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.VirtualHostStatistics != null) {
            this.VirtualHostStatistics = new RabbitMQVirtualHostStatistics(source.VirtualHostStatistics);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MessageHeapCount != null) {
            this.MessageHeapCount = new Long(source.MessageHeapCount);
        }
        if (source.MessageRateIn != null) {
            this.MessageRateIn = new Float(source.MessageRateIn);
        }
        if (source.MessageRateOut != null) {
            this.MessageRateOut = new Float(source.MessageRateOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamObj(map, prefix + "VirtualHostStatistics.", this.VirtualHostStatistics);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MessageHeapCount", this.MessageHeapCount);
        this.setParamSimple(map, prefix + "MessageRateIn", this.MessageRateIn);
        this.setParamSimple(map, prefix + "MessageRateOut", this.MessageRateOut);

    }
}

