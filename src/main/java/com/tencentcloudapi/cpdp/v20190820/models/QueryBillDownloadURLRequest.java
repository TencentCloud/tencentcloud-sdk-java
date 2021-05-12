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

public class QueryBillDownloadURLRequest extends AbstractModel{

    /**
    * 商户号
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 代发类型：
1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
    */
    @SerializedName("TransferType")
    @Expose
    private Long TransferType;

    /**
    * 账单日期，格式yyyy-MM-dd
    */
    @SerializedName("BillDate")
    @Expose
    private String BillDate;

    /**
     * Get 商户号 
     * @return MerchantId 商户号
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户号
     * @param MerchantId 商户号
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 代发类型：
1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账 
     * @return TransferType 代发类型：
1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
     */
    public Long getTransferType() {
        return this.TransferType;
    }

    /**
     * Set 代发类型：
1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
     * @param TransferType 代发类型：
1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
     */
    public void setTransferType(Long TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get 账单日期，格式yyyy-MM-dd 
     * @return BillDate 账单日期，格式yyyy-MM-dd
     */
    public String getBillDate() {
        return this.BillDate;
    }

    /**
     * Set 账单日期，格式yyyy-MM-dd
     * @param BillDate 账单日期，格式yyyy-MM-dd
     */
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
    }

    public QueryBillDownloadURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryBillDownloadURLRequest(QueryBillDownloadURLRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.TransferType != null) {
            this.TransferType = new Long(source.TransferType);
        }
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "TransferType", this.TransferType);
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);

    }
}

