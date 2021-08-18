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

public class CreateBatchPaymentRequest extends AbstractModel{

    /**
    * 1 微信企业付款 
2 支付宝转账 
3 平安银企直连代发转账
    */
    @SerializedName("TransferType")
    @Expose
    private Long TransferType;

    /**
    * 转账详情
    */
    @SerializedName("RecipientList")
    @Expose
    private CreateBatchPaymentRecipient [] RecipientList;

    /**
    * 请求预留字段
    */
    @SerializedName("ReqReserved")
    @Expose
    private String ReqReserved;

    /**
    * 回调Url
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
     * Get 1 微信企业付款 
2 支付宝转账 
3 平安银企直连代发转账 
     * @return TransferType 1 微信企业付款 
2 支付宝转账 
3 平安银企直连代发转账
     */
    public Long getTransferType() {
        return this.TransferType;
    }

    /**
     * Set 1 微信企业付款 
2 支付宝转账 
3 平安银企直连代发转账
     * @param TransferType 1 微信企业付款 
2 支付宝转账 
3 平安银企直连代发转账
     */
    public void setTransferType(Long TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get 转账详情 
     * @return RecipientList 转账详情
     */
    public CreateBatchPaymentRecipient [] getRecipientList() {
        return this.RecipientList;
    }

    /**
     * Set 转账详情
     * @param RecipientList 转账详情
     */
    public void setRecipientList(CreateBatchPaymentRecipient [] RecipientList) {
        this.RecipientList = RecipientList;
    }

    /**
     * Get 请求预留字段 
     * @return ReqReserved 请求预留字段
     */
    public String getReqReserved() {
        return this.ReqReserved;
    }

    /**
     * Set 请求预留字段
     * @param ReqReserved 请求预留字段
     */
    public void setReqReserved(String ReqReserved) {
        this.ReqReserved = ReqReserved;
    }

    /**
     * Get 回调Url 
     * @return NotifyUrl 回调Url
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 回调Url
     * @param NotifyUrl 回调Url
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    public CreateBatchPaymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchPaymentRequest(CreateBatchPaymentRequest source) {
        if (source.TransferType != null) {
            this.TransferType = new Long(source.TransferType);
        }
        if (source.RecipientList != null) {
            this.RecipientList = new CreateBatchPaymentRecipient[source.RecipientList.length];
            for (int i = 0; i < source.RecipientList.length; i++) {
                this.RecipientList[i] = new CreateBatchPaymentRecipient(source.RecipientList[i]);
            }
        }
        if (source.ReqReserved != null) {
            this.ReqReserved = new String(source.ReqReserved);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransferType", this.TransferType);
        this.setParamArrayObj(map, prefix + "RecipientList.", this.RecipientList);
        this.setParamSimple(map, prefix + "ReqReserved", this.ReqReserved);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);

    }
}

