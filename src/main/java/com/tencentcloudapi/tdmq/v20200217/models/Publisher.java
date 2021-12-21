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

public class Publisher extends AbstractModel{

    /**
    * 生产者id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProducerId")
    @Expose
    private Long ProducerId;

    /**
    * 生产者名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * 生产者地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 客户端版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientVersion")
    @Expose
    private String ClientVersion;

    /**
    * 消息生产速率（条/秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRateIn")
    @Expose
    private Float MsgRateIn;

    /**
    * 消息生产吞吐速率（字节/秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgThroughputIn")
    @Expose
    private Float MsgThroughputIn;

    /**
    * 平均消息大小（字节）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageMsgSize")
    @Expose
    private Float AverageMsgSize;

    /**
    * 连接时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectedSince")
    @Expose
    private String ConnectedSince;

    /**
    * 生产者连接的主题分区号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get 生产者id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProducerId 生产者id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProducerId() {
        return this.ProducerId;
    }

    /**
     * Set 生产者id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProducerId 生产者id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProducerId(Long ProducerId) {
        this.ProducerId = ProducerId;
    }

    /**
     * Get 生产者名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProducerName 生产者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set 生产者名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProducerName 生产者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get 生产者地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 生产者地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 生产者地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 生产者地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 客户端版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientVersion 客户端版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientVersion() {
        return this.ClientVersion;
    }

    /**
     * Set 客户端版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientVersion 客户端版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientVersion(String ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    /**
     * Get 消息生产速率（条/秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRateIn 消息生产速率（条/秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMsgRateIn() {
        return this.MsgRateIn;
    }

    /**
     * Set 消息生产速率（条/秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRateIn 消息生产速率（条/秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRateIn(Float MsgRateIn) {
        this.MsgRateIn = MsgRateIn;
    }

    /**
     * Get 消息生产吞吐速率（字节/秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgThroughputIn 消息生产吞吐速率（字节/秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMsgThroughputIn() {
        return this.MsgThroughputIn;
    }

    /**
     * Set 消息生产吞吐速率（字节/秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgThroughputIn 消息生产吞吐速率（字节/秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgThroughputIn(Float MsgThroughputIn) {
        this.MsgThroughputIn = MsgThroughputIn;
    }

    /**
     * Get 平均消息大小（字节）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageMsgSize 平均消息大小（字节）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAverageMsgSize() {
        return this.AverageMsgSize;
    }

    /**
     * Set 平均消息大小（字节）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageMsgSize 平均消息大小（字节）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageMsgSize(Float AverageMsgSize) {
        this.AverageMsgSize = AverageMsgSize;
    }

    /**
     * Get 连接时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectedSince 连接时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectedSince() {
        return this.ConnectedSince;
    }

    /**
     * Set 连接时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectedSince 连接时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectedSince(String ConnectedSince) {
        this.ConnectedSince = ConnectedSince;
    }

    /**
     * Get 生产者连接的主题分区号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partition 生产者连接的主题分区号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 生产者连接的主题分区号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partition 生产者连接的主题分区号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    public Publisher() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Publisher(Publisher source) {
        if (source.ProducerId != null) {
            this.ProducerId = new Long(source.ProducerId);
        }
        if (source.ProducerName != null) {
            this.ProducerName = new String(source.ProducerName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.ClientVersion != null) {
            this.ClientVersion = new String(source.ClientVersion);
        }
        if (source.MsgRateIn != null) {
            this.MsgRateIn = new Float(source.MsgRateIn);
        }
        if (source.MsgThroughputIn != null) {
            this.MsgThroughputIn = new Float(source.MsgThroughputIn);
        }
        if (source.AverageMsgSize != null) {
            this.AverageMsgSize = new Float(source.AverageMsgSize);
        }
        if (source.ConnectedSince != null) {
            this.ConnectedSince = new String(source.ConnectedSince);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProducerId", this.ProducerId);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "ClientVersion", this.ClientVersion);
        this.setParamSimple(map, prefix + "MsgRateIn", this.MsgRateIn);
        this.setParamSimple(map, prefix + "MsgThroughputIn", this.MsgThroughputIn);
        this.setParamSimple(map, prefix + "AverageMsgSize", this.AverageMsgSize);
        this.setParamSimple(map, prefix + "ConnectedSince", this.ConnectedSince);
        this.setParamSimple(map, prefix + "Partition", this.Partition);

    }
}

