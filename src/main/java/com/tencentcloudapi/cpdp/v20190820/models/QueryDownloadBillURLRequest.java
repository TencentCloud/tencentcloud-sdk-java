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

public class QueryDownloadBillURLRequest extends AbstractModel{

    /**
    * 分配给商户的AppId。进件成功后返给商户方的AppId。
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 渠道编号。固定值：ZSB2B
    */
    @SerializedName("ChannelCode")
    @Expose
    private String ChannelCode;

    /**
    * 对账单日期，格式yyyyMMdd
    */
    @SerializedName("BillDate")
    @Expose
    private String BillDate;

    /**
     * Get 分配给商户的AppId。进件成功后返给商户方的AppId。 
     * @return MerchantAppId 分配给商户的AppId。进件成功后返给商户方的AppId。
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 分配给商户的AppId。进件成功后返给商户方的AppId。
     * @param MerchantAppId 分配给商户的AppId。进件成功后返给商户方的AppId。
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
    }

    /**
     * Get 渠道编号。固定值：ZSB2B 
     * @return ChannelCode 渠道编号。固定值：ZSB2B
     */
    public String getChannelCode() {
        return this.ChannelCode;
    }

    /**
     * Set 渠道编号。固定值：ZSB2B
     * @param ChannelCode 渠道编号。固定值：ZSB2B
     */
    public void setChannelCode(String ChannelCode) {
        this.ChannelCode = ChannelCode;
    }

    /**
     * Get 对账单日期，格式yyyyMMdd 
     * @return BillDate 对账单日期，格式yyyyMMdd
     */
    public String getBillDate() {
        return this.BillDate;
    }

    /**
     * Set 对账单日期，格式yyyyMMdd
     * @param BillDate 对账单日期，格式yyyyMMdd
     */
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
    }

    public QueryDownloadBillURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDownloadBillURLRequest(QueryDownloadBillURLRequest source) {
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.ChannelCode != null) {
            this.ChannelCode = new String(source.ChannelCode);
        }
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "ChannelCode", this.ChannelCode);
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);

    }
}

