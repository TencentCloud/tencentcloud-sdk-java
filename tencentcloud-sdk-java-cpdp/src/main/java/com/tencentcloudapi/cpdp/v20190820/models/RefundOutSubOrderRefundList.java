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

public class RefundOutSubOrderRefundList extends AbstractModel{

    /**
    * 平台应退金额
    */
    @SerializedName("PlatformRefundAmt")
    @Expose
    private Long PlatformRefundAmt;

    /**
    * 子订单退款金额
    */
    @SerializedName("RefundAmt")
    @Expose
    private Long RefundAmt;

    /**
    * 商家应退金额
    */
    @SerializedName("SubMchRefundAmt")
    @Expose
    private Long SubMchRefundAmt;

    /**
    * 子订单号
    */
    @SerializedName("SubOutTradeNo")
    @Expose
    private String SubOutTradeNo;

    /**
    * 子退款单号，调用方需要保证 全局唯一性
    */
    @SerializedName("SubRefundId")
    @Expose
    private String SubRefundId;

    /**
     * Get 平台应退金额 
     * @return PlatformRefundAmt 平台应退金额
     */
    public Long getPlatformRefundAmt() {
        return this.PlatformRefundAmt;
    }

    /**
     * Set 平台应退金额
     * @param PlatformRefundAmt 平台应退金额
     */
    public void setPlatformRefundAmt(Long PlatformRefundAmt) {
        this.PlatformRefundAmt = PlatformRefundAmt;
    }

    /**
     * Get 子订单退款金额 
     * @return RefundAmt 子订单退款金额
     */
    public Long getRefundAmt() {
        return this.RefundAmt;
    }

    /**
     * Set 子订单退款金额
     * @param RefundAmt 子订单退款金额
     */
    public void setRefundAmt(Long RefundAmt) {
        this.RefundAmt = RefundAmt;
    }

    /**
     * Get 商家应退金额 
     * @return SubMchRefundAmt 商家应退金额
     */
    public Long getSubMchRefundAmt() {
        return this.SubMchRefundAmt;
    }

    /**
     * Set 商家应退金额
     * @param SubMchRefundAmt 商家应退金额
     */
    public void setSubMchRefundAmt(Long SubMchRefundAmt) {
        this.SubMchRefundAmt = SubMchRefundAmt;
    }

    /**
     * Get 子订单号 
     * @return SubOutTradeNo 子订单号
     */
    public String getSubOutTradeNo() {
        return this.SubOutTradeNo;
    }

    /**
     * Set 子订单号
     * @param SubOutTradeNo 子订单号
     */
    public void setSubOutTradeNo(String SubOutTradeNo) {
        this.SubOutTradeNo = SubOutTradeNo;
    }

    /**
     * Get 子退款单号，调用方需要保证 全局唯一性 
     * @return SubRefundId 子退款单号，调用方需要保证 全局唯一性
     */
    public String getSubRefundId() {
        return this.SubRefundId;
    }

    /**
     * Set 子退款单号，调用方需要保证 全局唯一性
     * @param SubRefundId 子退款单号，调用方需要保证 全局唯一性
     */
    public void setSubRefundId(String SubRefundId) {
        this.SubRefundId = SubRefundId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformRefundAmt", this.PlatformRefundAmt);
        this.setParamSimple(map, prefix + "RefundAmt", this.RefundAmt);
        this.setParamSimple(map, prefix + "SubMchRefundAmt", this.SubMchRefundAmt);
        this.setParamSimple(map, prefix + "SubOutTradeNo", this.SubOutTradeNo);
        this.setParamSimple(map, prefix + "SubRefundId", this.SubRefundId);

    }
}

