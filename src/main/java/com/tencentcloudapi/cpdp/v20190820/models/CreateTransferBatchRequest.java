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

public class CreateTransferBatchRequest extends AbstractModel{

    /**
    * 商户号。
示例值：129284394
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 转账明细列表。
发起批量转账的明细列表，最多三千笔
    */
    @SerializedName("TransferDetails")
    @Expose
    private TransferDetailRequest [] TransferDetails;

    /**
    * 直连商户appId。
即商户号绑定的appid。
示例值：wxf636efh567hg4356
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 商家批次单号。
商户系统内部的商家批次单号，此参数只能由数字、字母组成，商户系统内部唯一，UTF8编码，最多32个字符。
示例值：plfk2020042013
    */
    @SerializedName("MerchantBatchNo")
    @Expose
    private String MerchantBatchNo;

    /**
    * 批次名称。
批量转账的名称。
示例值：2019年1月深圳分部报销单
    */
    @SerializedName("BatchName")
    @Expose
    private String BatchName;

    /**
    * 转账说明。
UTF8编码，最多32个字符。
示例值：2019年深圳分部报销单
    */
    @SerializedName("BatchRemark")
    @Expose
    private String BatchRemark;

    /**
    * 转账总金额。
转账金额，单位为分。
示例值：4000000
    */
    @SerializedName("TotalAmount")
    @Expose
    private Long TotalAmount;

    /**
    * 转账总笔数。
一个转账批次最多允许发起三千笔转账。
示例值：200
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 环境名。
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
     * Get 转账明细列表。
发起批量转账的明细列表，最多三千笔 
     * @return TransferDetails 转账明细列表。
发起批量转账的明细列表，最多三千笔
     */
    public TransferDetailRequest [] getTransferDetails() {
        return this.TransferDetails;
    }

    /**
     * Set 转账明细列表。
发起批量转账的明细列表，最多三千笔
     * @param TransferDetails 转账明细列表。
发起批量转账的明细列表，最多三千笔
     */
    public void setTransferDetails(TransferDetailRequest [] TransferDetails) {
        this.TransferDetails = TransferDetails;
    }

    /**
     * Get 直连商户appId。
即商户号绑定的appid。
示例值：wxf636efh567hg4356 
     * @return MerchantAppId 直连商户appId。
即商户号绑定的appid。
示例值：wxf636efh567hg4356
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 直连商户appId。
即商户号绑定的appid。
示例值：wxf636efh567hg4356
     * @param MerchantAppId 直连商户appId。
即商户号绑定的appid。
示例值：wxf636efh567hg4356
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
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
     * Get 批次名称。
批量转账的名称。
示例值：2019年1月深圳分部报销单 
     * @return BatchName 批次名称。
批量转账的名称。
示例值：2019年1月深圳分部报销单
     */
    public String getBatchName() {
        return this.BatchName;
    }

    /**
     * Set 批次名称。
批量转账的名称。
示例值：2019年1月深圳分部报销单
     * @param BatchName 批次名称。
批量转账的名称。
示例值：2019年1月深圳分部报销单
     */
    public void setBatchName(String BatchName) {
        this.BatchName = BatchName;
    }

    /**
     * Get 转账说明。
UTF8编码，最多32个字符。
示例值：2019年深圳分部报销单 
     * @return BatchRemark 转账说明。
UTF8编码，最多32个字符。
示例值：2019年深圳分部报销单
     */
    public String getBatchRemark() {
        return this.BatchRemark;
    }

    /**
     * Set 转账说明。
UTF8编码，最多32个字符。
示例值：2019年深圳分部报销单
     * @param BatchRemark 转账说明。
UTF8编码，最多32个字符。
示例值：2019年深圳分部报销单
     */
    public void setBatchRemark(String BatchRemark) {
        this.BatchRemark = BatchRemark;
    }

    /**
     * Get 转账总金额。
转账金额，单位为分。
示例值：4000000 
     * @return TotalAmount 转账总金额。
转账金额，单位为分。
示例值：4000000
     */
    public Long getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 转账总金额。
转账金额，单位为分。
示例值：4000000
     * @param TotalAmount 转账总金额。
转账金额，单位为分。
示例值：4000000
     */
    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 转账总笔数。
一个转账批次最多允许发起三千笔转账。
示例值：200 
     * @return TotalNum 转账总笔数。
一个转账批次最多允许发起三千笔转账。
示例值：200
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 转账总笔数。
一个转账批次最多允许发起三千笔转账。
示例值：200
     * @param TotalNum 转账总笔数。
一个转账批次最多允许发起三千笔转账。
示例值：200
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 环境名。
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release 
     * @return Profile 环境名。
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 环境名。
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     * @param Profile 环境名。
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public CreateTransferBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTransferBatchRequest(CreateTransferBatchRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.TransferDetails != null) {
            this.TransferDetails = new TransferDetailRequest[source.TransferDetails.length];
            for (int i = 0; i < source.TransferDetails.length; i++) {
                this.TransferDetails[i] = new TransferDetailRequest(source.TransferDetails[i]);
            }
        }
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.MerchantBatchNo != null) {
            this.MerchantBatchNo = new String(source.MerchantBatchNo);
        }
        if (source.BatchName != null) {
            this.BatchName = new String(source.BatchName);
        }
        if (source.BatchRemark != null) {
            this.BatchRemark = new String(source.BatchRemark);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Long(source.TotalAmount);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
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
        this.setParamArrayObj(map, prefix + "TransferDetails.", this.TransferDetails);
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "MerchantBatchNo", this.MerchantBatchNo);
        this.setParamSimple(map, prefix + "BatchName", this.BatchName);
        this.setParamSimple(map, prefix + "BatchRemark", this.BatchRemark);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

