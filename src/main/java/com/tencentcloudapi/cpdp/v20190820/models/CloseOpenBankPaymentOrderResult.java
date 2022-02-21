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

public class CloseOpenBankPaymentOrderResult extends AbstractModel{

    /**
    * 外部商户订单号
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 云企付平台订单号
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 订单状态。关单成功CLOSED
    */
    @SerializedName("OrderStatus")
    @Expose
    private String OrderStatus;

    /**
     * Get 外部商户订单号 
     * @return OutOrderId 外部商户订单号
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部商户订单号
     * @param OutOrderId 外部商户订单号
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 云企付平台订单号 
     * @return ChannelOrderId 云企付平台订单号
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 云企付平台订单号
     * @param ChannelOrderId 云企付平台订单号
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 订单状态。关单成功CLOSED 
     * @return OrderStatus 订单状态。关单成功CLOSED
     */
    public String getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set 订单状态。关单成功CLOSED
     * @param OrderStatus 订单状态。关单成功CLOSED
     */
    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public CloseOpenBankPaymentOrderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseOpenBankPaymentOrderResult(CloseOpenBankPaymentOrderResult source) {
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new String(source.OrderStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);

    }
}

