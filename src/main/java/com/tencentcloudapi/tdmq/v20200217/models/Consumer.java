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

public class Consumer extends AbstractModel{

    /**
    * 消费者开始连接的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectedSince")
    @Expose
    private String ConnectedSince;

    /**
    * 消费者地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerAddr")
    @Expose
    private String ConsumerAddr;

    /**
    * 消费者名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerName")
    @Expose
    private String ConsumerName;

    /**
    * 消费者版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientVersion")
    @Expose
    private String ClientVersion;

    /**
     * Get 消费者开始连接的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectedSince 消费者开始连接的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectedSince() {
        return this.ConnectedSince;
    }

    /**
     * Set 消费者开始连接的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectedSince 消费者开始连接的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectedSince(String ConnectedSince) {
        this.ConnectedSince = ConnectedSince;
    }

    /**
     * Get 消费者地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerAddr 消费者地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerAddr() {
        return this.ConsumerAddr;
    }

    /**
     * Set 消费者地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerAddr 消费者地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerAddr(String ConsumerAddr) {
        this.ConsumerAddr = ConsumerAddr;
    }

    /**
     * Get 消费者名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerName 消费者名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerName() {
        return this.ConsumerName;
    }

    /**
     * Set 消费者名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerName 消费者名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerName(String ConsumerName) {
        this.ConsumerName = ConsumerName;
    }

    /**
     * Get 消费者版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientVersion 消费者版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientVersion() {
        return this.ClientVersion;
    }

    /**
     * Set 消费者版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientVersion 消费者版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientVersion(String ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectedSince", this.ConnectedSince);
        this.setParamSimple(map, prefix + "ConsumerAddr", this.ConsumerAddr);
        this.setParamSimple(map, prefix + "ConsumerName", this.ConsumerName);
        this.setParamSimple(map, prefix + "ClientVersion", this.ClientVersion);

    }
}

