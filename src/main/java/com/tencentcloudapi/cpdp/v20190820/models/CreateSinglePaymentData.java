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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSinglePaymentData extends AbstractModel{

    /**
    * 平台交易流水号，唯一
    */
    @SerializedName("TradeSerialNo")
    @Expose
    private String TradeSerialNo;

    /**
    * 代理商ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 代理商名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
     * Get 平台交易流水号，唯一 
     * @return TradeSerialNo 平台交易流水号，唯一
     */
    public String getTradeSerialNo() {
        return this.TradeSerialNo;
    }

    /**
     * Set 平台交易流水号，唯一
     * @param TradeSerialNo 平台交易流水号，唯一
     */
    public void setTradeSerialNo(String TradeSerialNo) {
        this.TradeSerialNo = TradeSerialNo;
    }

    /**
     * Get 代理商ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentId 代理商ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 代理商ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentId 代理商ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 代理商名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentName 代理商名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set 代理商名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentName 代理商名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    public CreateSinglePaymentData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSinglePaymentData(CreateSinglePaymentData source) {
        if (source.TradeSerialNo != null) {
            this.TradeSerialNo = new String(source.TradeSerialNo);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TradeSerialNo", this.TradeSerialNo);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);

    }
}

