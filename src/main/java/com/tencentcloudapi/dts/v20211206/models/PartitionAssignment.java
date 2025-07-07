/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartitionAssignment extends AbstractModel {

    /**
    * 消费者的clientId
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 该消费者正在消费的分区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionNo")
    @Expose
    private Long [] PartitionNo;

    /**
     * Get 消费者的clientId 
     * @return ClientId 消费者的clientId
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 消费者的clientId
     * @param ClientId 消费者的clientId
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 该消费者正在消费的分区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionNo 该消费者正在消费的分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPartitionNo() {
        return this.PartitionNo;
    }

    /**
     * Set 该消费者正在消费的分区
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionNo 该消费者正在消费的分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionNo(Long [] PartitionNo) {
        this.PartitionNo = PartitionNo;
    }

    public PartitionAssignment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionAssignment(PartitionAssignment source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.PartitionNo != null) {
            this.PartitionNo = new Long[source.PartitionNo.length];
            for (int i = 0; i < source.PartitionNo.length; i++) {
                this.PartitionNo[i] = new Long(source.PartitionNo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamArraySimple(map, prefix + "PartitionNo.", this.PartitionNo);

    }
}

