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

public class QueryTransferDetailRequest extends AbstractModel{

    /**
    * 商户号。
示例值：129284394
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
    */
    @SerializedName("MerchantBatchNo")
    @Expose
    private String MerchantBatchNo;

    /**
    * 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
    */
    @SerializedName("MerchantDetailNo")
    @Expose
    private String MerchantDetailNo;

    /**
    * 微信批次单号。
微信商家转账系统返回的唯一标识。
商家单号（包含批次号和明细单号）和微信单号（包含批次号和明细单号）二者必填其一。
示例值：1030000071100999991182020050700019480001
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
    */
    @SerializedName("DetailId")
    @Expose
    private String DetailId;

    /**
    * 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 商户号。
示例值：129284394 
     * @return MerchantId 商户号。
示例值：129284394
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户号。
示例值：129284394
     * @param MerchantId 商户号。
示例值：129284394
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013 
     * @return MerchantBatchNo 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
     */
    public String getMerchantBatchNo() {
        return this.MerchantBatchNo;
    }

    /**
     * Set 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
     * @param MerchantBatchNo 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
     */
    public void setMerchantBatchNo(String MerchantBatchNo) {
        this.MerchantBatchNo = MerchantBatchNo;
    }

    /**
     * Get 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013 
     * @return MerchantDetailNo 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
     */
    public String getMerchantDetailNo() {
        return this.MerchantDetailNo;
    }

    /**
     * Set 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
     * @param MerchantDetailNo 商家明细单号。
商户系统内部的商家明细单号
示例值：plfk2020042013
     */
    public void setMerchantDetailNo(String MerchantDetailNo) {
        this.MerchantDetailNo = MerchantDetailNo;
    }

    /**
     * Get 微信批次单号。
微信商家转账系统返回的唯一标识。
商家单号（包含批次号和明细单号）和微信单号（包含批次号和明细单号）二者必填其一。
示例值：1030000071100999991182020050700019480001 
     * @return BatchId 微信批次单号。
微信商家转账系统返回的唯一标识。
商家单号（包含批次号和明细单号）和微信单号（包含批次号和明细单号）二者必填其一。
示例值：1030000071100999991182020050700019480001
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 微信批次单号。
微信商家转账系统返回的唯一标识。
商家单号（包含批次号和明细单号）和微信单号（包含批次号和明细单号）二者必填其一。
示例值：1030000071100999991182020050700019480001
     * @param BatchId 微信批次单号。
微信商家转账系统返回的唯一标识。
商家单号（包含批次号和明细单号）和微信单号（包含批次号和明细单号）二者必填其一。
示例值：1030000071100999991182020050700019480001
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001 
     * @return DetailId 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     */
    public String getDetailId() {
        return this.DetailId;
    }

    /**
     * Set 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     * @param DetailId 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480001
     */
    public void setDetailId(String DetailId) {
        this.DetailId = DetailId;
    }

    /**
     * Get 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release 
     * @return Profile 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     * @param Profile 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public QueryTransferDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTransferDetailRequest(QueryTransferDetailRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.MerchantBatchNo != null) {
            this.MerchantBatchNo = new String(source.MerchantBatchNo);
        }
        if (source.MerchantDetailNo != null) {
            this.MerchantDetailNo = new String(source.MerchantDetailNo);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.DetailId != null) {
            this.DetailId = new String(source.DetailId);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "MerchantBatchNo", this.MerchantBatchNo);
        this.setParamSimple(map, prefix + "MerchantDetailNo", this.MerchantDetailNo);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "DetailId", this.DetailId);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

