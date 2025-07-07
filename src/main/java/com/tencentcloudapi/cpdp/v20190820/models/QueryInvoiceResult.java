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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryInvoiceResult extends AbstractModel {

    /**
    * 错误消息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 错误码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 查询发票数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private QueryInvoiceResultData Data;

    /**
    * 订单数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Order")
    @Expose
    private Order Order;

    /**
     * Get 错误消息 
     * @return Message 错误消息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误消息
     * @param Message 错误消息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 错误码 
     * @return Code 错误码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 错误码
     * @param Code 错误码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 查询发票数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 查询发票数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QueryInvoiceResultData getData() {
        return this.Data;
    }

    /**
     * Set 查询发票数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 查询发票数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(QueryInvoiceResultData Data) {
        this.Data = Data;
    }

    /**
     * Get 订单数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Order 订单数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Order getOrder() {
        return this.Order;
    }

    /**
     * Set 订单数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Order 订单数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrder(Order Order) {
        this.Order = Order;
    }

    public QueryInvoiceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryInvoiceResult(QueryInvoiceResult source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Data != null) {
            this.Data = new QueryInvoiceResultData(source.Data);
        }
        if (source.Order != null) {
            this.Order = new Order(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamObj(map, prefix + "Order.", this.Order);

    }
}

