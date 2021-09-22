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

public class QuerySinglePaymentResultData extends AbstractModel{

    /**
    * 平台交易流水号，唯一
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeSerialNo")
    @Expose
    private String TradeSerialNo;

    /**
    * 订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 交易状态。
0 处理中  
1 预占成功 
2 交易成功 
3 交易失败 
4 未知渠道异常 
5 预占额度失败
6 提交成功
7 提交失败
8 订单重复提交
99 未知系统异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeStatus")
    @Expose
    private Long TradeStatus;

    /**
    * 业务备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
    * 交易状态描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeStatusDesc")
    @Expose
    private String TradeStatusDesc;

    /**
     * Get 平台交易流水号，唯一
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeSerialNo 平台交易流水号，唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeSerialNo() {
        return this.TradeSerialNo;
    }

    /**
     * Set 平台交易流水号，唯一
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeSerialNo 平台交易流水号，唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeSerialNo(String TradeSerialNo) {
        this.TradeSerialNo = TradeSerialNo;
    }

    /**
     * Get 订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderId 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 交易状态。
0 处理中  
1 预占成功 
2 交易成功 
3 交易失败 
4 未知渠道异常 
5 预占额度失败
6 提交成功
7 提交失败
8 订单重复提交
99 未知系统异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeStatus 交易状态。
0 处理中  
1 预占成功 
2 交易成功 
3 交易失败 
4 未知渠道异常 
5 预占额度失败
6 提交成功
7 提交失败
8 订单重复提交
99 未知系统异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTradeStatus() {
        return this.TradeStatus;
    }

    /**
     * Set 交易状态。
0 处理中  
1 预占成功 
2 交易成功 
3 交易失败 
4 未知渠道异常 
5 预占额度失败
6 提交成功
7 提交失败
8 订单重复提交
99 未知系统异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeStatus 交易状态。
0 处理中  
1 预占成功 
2 交易成功 
3 交易失败 
4 未知渠道异常 
5 预占额度失败
6 提交成功
7 提交失败
8 订单重复提交
99 未知系统异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeStatus(Long TradeStatus) {
        this.TradeStatus = TradeStatus;
    }

    /**
     * Get 业务备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 业务备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 业务备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 业务备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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

    /**
     * Get 交易状态描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeStatusDesc 交易状态描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeStatusDesc() {
        return this.TradeStatusDesc;
    }

    /**
     * Set 交易状态描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeStatusDesc 交易状态描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeStatusDesc(String TradeStatusDesc) {
        this.TradeStatusDesc = TradeStatusDesc;
    }

    public QuerySinglePaymentResultData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySinglePaymentResultData(QuerySinglePaymentResultData source) {
        if (source.TradeSerialNo != null) {
            this.TradeSerialNo = new String(source.TradeSerialNo);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.TradeStatus != null) {
            this.TradeStatus = new Long(source.TradeStatus);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.TradeStatusDesc != null) {
            this.TradeStatusDesc = new String(source.TradeStatusDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TradeSerialNo", this.TradeSerialNo);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "TradeStatus", this.TradeStatus);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "TradeStatusDesc", this.TradeStatusDesc);

    }
}

