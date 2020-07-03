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

public class CreateRedInvoiceResultData extends AbstractModel{

    /**
    * 红冲状态码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 红冲状态消息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 发票ID
    */
    @SerializedName("InvoiceId")
    @Expose
    private String InvoiceId;

    /**
    * 业务开票号
    */
    @SerializedName("OrderSn")
    @Expose
    private String OrderSn;

    /**
     * Get 红冲状态码 
     * @return Code 红冲状态码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 红冲状态码
     * @param Code 红冲状态码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 红冲状态消息 
     * @return Message 红冲状态消息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 红冲状态消息
     * @param Message 红冲状态消息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 发票ID 
     * @return InvoiceId 发票ID
     */
    public String getInvoiceId() {
        return this.InvoiceId;
    }

    /**
     * Set 发票ID
     * @param InvoiceId 发票ID
     */
    public void setInvoiceId(String InvoiceId) {
        this.InvoiceId = InvoiceId;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "InvoiceId", this.InvoiceId);
        this.setParamSimple(map, prefix + "OrderSn", this.OrderSn);

    }
}

