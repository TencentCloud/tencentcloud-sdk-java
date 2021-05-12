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

public class QueryTransferBatchRequest extends AbstractModel{

    /**
    * 商户号。
示例值：129284394
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480101
    */
    @SerializedName("NeedQueryDetail")
    @Expose
    private Boolean NeedQueryDetail;

    /**
    * 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
    */
    @SerializedName("MerchantBatchNo")
    @Expose
    private String MerchantBatchNo;

    /**
    * 是否查询账单明细。
true-是；
false-否，默认否。
商户可选择是否查询指定状态的转账明细单，当转账批次单状态为“FINISHED”（已完成）时，才会返回满足条件的转账明细单。
示例值：true
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

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
    * 请求资源起始位置。
从0开始，默认值为0。
示例值：20
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大资源条数。
该次请求可返回的最大资源（转账明细单）条数，最小20条，最大100条，不传则默认20条。不足20条按实际条数返回
示例值：20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 明细状态。
ALL：全部，需要同时查询转账成功喝失败的明细单；
SUCCESS：转账成功，只查询成功的明细单；
FAIL：转账失败，只查询转账失败的明细单。
示例值：FAIL
    */
    @SerializedName("DetailStatus")
    @Expose
    private String DetailStatus;

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
     * Get 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480101 
     * @return NeedQueryDetail 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480101
     */
    public Boolean getNeedQueryDetail() {
        return this.NeedQueryDetail;
    }

    /**
     * Set 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480101
     * @param NeedQueryDetail 微信明细单号。
微信区分明细单返回的唯一标识。
示例值：1030000071100999991182020050700019480101
     */
    public void setNeedQueryDetail(Boolean NeedQueryDetail) {
        this.NeedQueryDetail = NeedQueryDetail;
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
     * Get 是否查询账单明细。
true-是；
false-否，默认否。
商户可选择是否查询指定状态的转账明细单，当转账批次单状态为“FINISHED”（已完成）时，才会返回满足条件的转账明细单。
示例值：true 
     * @return BatchId 是否查询账单明细。
true-是；
false-否，默认否。
商户可选择是否查询指定状态的转账明细单，当转账批次单状态为“FINISHED”（已完成）时，才会返回满足条件的转账明细单。
示例值：true
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 是否查询账单明细。
true-是；
false-否，默认否。
商户可选择是否查询指定状态的转账明细单，当转账批次单状态为“FINISHED”（已完成）时，才会返回满足条件的转账明细单。
示例值：true
     * @param BatchId 是否查询账单明细。
true-是；
false-否，默认否。
商户可选择是否查询指定状态的转账明细单，当转账批次单状态为“FINISHED”（已完成）时，才会返回满足条件的转账明细单。
示例值：true
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
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

    /**
     * Get 请求资源起始位置。
从0开始，默认值为0。
示例值：20 
     * @return Offset 请求资源起始位置。
从0开始，默认值为0。
示例值：20
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 请求资源起始位置。
从0开始，默认值为0。
示例值：20
     * @param Offset 请求资源起始位置。
从0开始，默认值为0。
示例值：20
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大资源条数。
该次请求可返回的最大资源（转账明细单）条数，最小20条，最大100条，不传则默认20条。不足20条按实际条数返回
示例值：20 
     * @return Limit 最大资源条数。
该次请求可返回的最大资源（转账明细单）条数，最小20条，最大100条，不传则默认20条。不足20条按实际条数返回
示例值：20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大资源条数。
该次请求可返回的最大资源（转账明细单）条数，最小20条，最大100条，不传则默认20条。不足20条按实际条数返回
示例值：20
     * @param Limit 最大资源条数。
该次请求可返回的最大资源（转账明细单）条数，最小20条，最大100条，不传则默认20条。不足20条按实际条数返回
示例值：20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 明细状态。
ALL：全部，需要同时查询转账成功喝失败的明细单；
SUCCESS：转账成功，只查询成功的明细单；
FAIL：转账失败，只查询转账失败的明细单。
示例值：FAIL 
     * @return DetailStatus 明细状态。
ALL：全部，需要同时查询转账成功喝失败的明细单；
SUCCESS：转账成功，只查询成功的明细单；
FAIL：转账失败，只查询转账失败的明细单。
示例值：FAIL
     */
    public String getDetailStatus() {
        return this.DetailStatus;
    }

    /**
     * Set 明细状态。
ALL：全部，需要同时查询转账成功喝失败的明细单；
SUCCESS：转账成功，只查询成功的明细单；
FAIL：转账失败，只查询转账失败的明细单。
示例值：FAIL
     * @param DetailStatus 明细状态。
ALL：全部，需要同时查询转账成功喝失败的明细单；
SUCCESS：转账成功，只查询成功的明细单；
FAIL：转账失败，只查询转账失败的明细单。
示例值：FAIL
     */
    public void setDetailStatus(String DetailStatus) {
        this.DetailStatus = DetailStatus;
    }

    public QueryTransferBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTransferBatchRequest(QueryTransferBatchRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.NeedQueryDetail != null) {
            this.NeedQueryDetail = new Boolean(source.NeedQueryDetail);
        }
        if (source.MerchantBatchNo != null) {
            this.MerchantBatchNo = new String(source.MerchantBatchNo);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DetailStatus != null) {
            this.DetailStatus = new String(source.DetailStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "NeedQueryDetail", this.NeedQueryDetail);
        this.setParamSimple(map, prefix + "MerchantBatchNo", this.MerchantBatchNo);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DetailStatus", this.DetailStatus);

    }
}

