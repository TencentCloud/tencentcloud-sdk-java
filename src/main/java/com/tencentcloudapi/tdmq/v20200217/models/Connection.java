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

public class Connection extends AbstractModel{

    /**
    * 生产者地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 主题分区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * 生产者版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientVersion")
    @Expose
    private String ClientVersion;

    /**
    * 生产者名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * 生产者ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProducerId")
    @Expose
    private String ProducerId;

    /**
    * 消息平均大小(byte)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageMsgSize")
    @Expose
    private String AverageMsgSize;

    /**
    * 生成速率(byte/秒)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgThroughputIn")
    @Expose
    private String MsgThroughputIn;

    /**
     * Get 生产者地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 生产者地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 生产者地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 生产者地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 主题分区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions 主题分区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 主题分区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions 主题分区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 生产者版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientVersion 生产者版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientVersion() {
        return this.ClientVersion;
    }

    /**
     * Set 生产者版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientVersion 生产者版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientVersion(String ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    /**
     * Get 生产者名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProducerName 生产者名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set 生产者名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProducerName 生产者名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get 生产者ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProducerId 生产者ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProducerId() {
        return this.ProducerId;
    }

    /**
     * Set 生产者ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProducerId 生产者ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProducerId(String ProducerId) {
        this.ProducerId = ProducerId;
    }

    /**
     * Get 消息平均大小(byte)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageMsgSize 消息平均大小(byte)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAverageMsgSize() {
        return this.AverageMsgSize;
    }

    /**
     * Set 消息平均大小(byte)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageMsgSize 消息平均大小(byte)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageMsgSize(String AverageMsgSize) {
        this.AverageMsgSize = AverageMsgSize;
    }

    /**
     * Get 生成速率(byte/秒)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgThroughputIn 生成速率(byte/秒)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgThroughputIn() {
        return this.MsgThroughputIn;
    }

    /**
     * Set 生成速率(byte/秒)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgThroughputIn 生成速率(byte/秒)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgThroughputIn(String MsgThroughputIn) {
        this.MsgThroughputIn = MsgThroughputIn;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "ClientVersion", this.ClientVersion);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "ProducerId", this.ProducerId);
        this.setParamSimple(map, prefix + "AverageMsgSize", this.AverageMsgSize);
        this.setParamSimple(map, prefix + "MsgThroughputIn", this.MsgThroughputIn);

    }
}

