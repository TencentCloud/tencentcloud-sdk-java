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

public class QuerySinglePaymentResultRequest extends AbstractModel{

    /**
    * 转账类型
    */
    @SerializedName("TransferType")
    @Expose
    private Long TransferType;

    /**
    * 交易流水流水号，唯一
    */
    @SerializedName("TradeSerialNo")
    @Expose
    private String TradeSerialNo;

    /**
    * 订单号，与TradeSerialNo不能同时为空
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
     * Get 转账类型 
     * @return TransferType 转账类型
     */
    public Long getTransferType() {
        return this.TransferType;
    }

    /**
     * Set 转账类型
     * @param TransferType 转账类型
     */
    public void setTransferType(Long TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get 交易流水流水号，唯一 
     * @return TradeSerialNo 交易流水流水号，唯一
     */
    public String getTradeSerialNo() {
        return this.TradeSerialNo;
    }

    /**
     * Set 交易流水流水号，唯一
     * @param TradeSerialNo 交易流水流水号，唯一
     */
    public void setTradeSerialNo(String TradeSerialNo) {
        this.TradeSerialNo = TradeSerialNo;
    }

    /**
     * Get 订单号，与TradeSerialNo不能同时为空 
     * @return OrderId 订单号，与TradeSerialNo不能同时为空
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号，与TradeSerialNo不能同时为空
     * @param OrderId 订单号，与TradeSerialNo不能同时为空
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public QuerySinglePaymentResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySinglePaymentResultRequest(QuerySinglePaymentResultRequest source) {
        if (source.TransferType != null) {
            this.TransferType = new Long(source.TransferType);
        }
        if (source.TradeSerialNo != null) {
            this.TradeSerialNo = new String(source.TradeSerialNo);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransferType", this.TransferType);
        this.setParamSimple(map, prefix + "TradeSerialNo", this.TradeSerialNo);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);

    }
}

