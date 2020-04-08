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

public class CreateRedInvoiceItem extends AbstractModel{

    /**
    * 订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 发票结果回传地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 业务开票号
    */
    @SerializedName("OrderSn")
    @Expose
    private String OrderSn;

    /**
    * 红字信息表编码
    */
    @SerializedName("RedSerialNo")
    @Expose
    private String RedSerialNo;

    /**
     * Get 订单号 
     * @return OrderId 订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
     * @param OrderId 订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 发票结果回传地址 
     * @return CallbackUrl 发票结果回传地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 发票结果回传地址
     * @param CallbackUrl 发票结果回传地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 业务开票号 
     * @return OrderSn 业务开票号
     */
    public String getOrderSn() {
        return this.OrderSn;
    }

    /**
     * Set 业务开票号
     * @param OrderSn 业务开票号
     */
    public void setOrderSn(String OrderSn) {
        this.OrderSn = OrderSn;
    }

    /**
     * Get 红字信息表编码 
     * @return RedSerialNo 红字信息表编码
     */
    public String getRedSerialNo() {
        return this.RedSerialNo;
    }

    /**
     * Set 红字信息表编码
     * @param RedSerialNo 红字信息表编码
     */
    public void setRedSerialNo(String RedSerialNo) {
        this.RedSerialNo = RedSerialNo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "OrderSn", this.OrderSn);
        this.setParamSimple(map, prefix + "RedSerialNo", this.RedSerialNo);

    }
}

