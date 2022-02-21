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

public class QueryOpenBankDownLoadUrlRequest extends AbstractModel{

    /**
    * 渠道商户号，外部接入平台方入驻云企付平台后下发。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 账单日期,yyyy-MM-dd。
    */
    @SerializedName("BillDate")
    @Expose
    private String BillDate;

    /**
    * 账单类型，默认交易账单。
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 渠道商户号，外部接入平台方入驻云企付平台后下发。 
     * @return ChannelMerchantId 渠道商户号，外部接入平台方入驻云企付平台后下发。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号，外部接入平台方入驻云企付平台后下发。
     * @param ChannelMerchantId 渠道商户号，外部接入平台方入驻云企付平台后下发。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 账单日期,yyyy-MM-dd。 
     * @return BillDate 账单日期,yyyy-MM-dd。
     */
    public String getBillDate() {
        return this.BillDate;
    }

    /**
     * Set 账单日期,yyyy-MM-dd。
     * @param BillDate 账单日期,yyyy-MM-dd。
     */
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
    }

    /**
     * Get 账单类型，默认交易账单。 
     * @return BillType 账单类型，默认交易账单。
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set 账单类型，默认交易账单。
     * @param BillType 账单类型，默认交易账单。
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境。 
     * @return Environment 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境。
     * @param Environment 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public QueryOpenBankDownLoadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankDownLoadUrlRequest(QueryOpenBankDownLoadUrlRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

