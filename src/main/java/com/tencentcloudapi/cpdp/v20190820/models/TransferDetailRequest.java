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

public class TransferDetailRequest extends AbstractModel{

    /**
    * 商家明细单号。
商户系统内部区分转账批次单下不同转账明细单的唯一标识，要求此参数只能由数字、大小写字母组成。
示例值：x23zy545Bd5436
    */
    @SerializedName("MerchantDetailNo")
    @Expose
    private String MerchantDetailNo;

    /**
    * 转账金额。
转账金额单位为分。
示例值：200000
    */
    @SerializedName("TransferAmount")
    @Expose
    private Long TransferAmount;

    /**
    * 转账备注。
单条转账备注（微信用户会收到该备注）。UTF8编码，最多32字符。
示例值：2020年4月报销
    */
    @SerializedName("TransferRemark")
    @Expose
    private String TransferRemark;

    /**
    * 用户在直连商户下的唯一标识。
示例值：o-MYE42l80oelYMDE34nYD456Xoy
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 收款用户姓名。
收款方姓名。
示例值：张三
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get 商家明细单号。
商户系统内部区分转账批次单下不同转账明细单的唯一标识，要求此参数只能由数字、大小写字母组成。
示例值：x23zy545Bd5436 
     * @return MerchantDetailNo 商家明细单号。
商户系统内部区分转账批次单下不同转账明细单的唯一标识，要求此参数只能由数字、大小写字母组成。
示例值：x23zy545Bd5436
     */
    public String getMerchantDetailNo() {
        return this.MerchantDetailNo;
    }

    /**
     * Set 商家明细单号。
商户系统内部区分转账批次单下不同转账明细单的唯一标识，要求此参数只能由数字、大小写字母组成。
示例值：x23zy545Bd5436
     * @param MerchantDetailNo 商家明细单号。
商户系统内部区分转账批次单下不同转账明细单的唯一标识，要求此参数只能由数字、大小写字母组成。
示例值：x23zy545Bd5436
     */
    public void setMerchantDetailNo(String MerchantDetailNo) {
        this.MerchantDetailNo = MerchantDetailNo;
    }

    /**
     * Get 转账金额。
转账金额单位为分。
示例值：200000 
     * @return TransferAmount 转账金额。
转账金额单位为分。
示例值：200000
     */
    public Long getTransferAmount() {
        return this.TransferAmount;
    }

    /**
     * Set 转账金额。
转账金额单位为分。
示例值：200000
     * @param TransferAmount 转账金额。
转账金额单位为分。
示例值：200000
     */
    public void setTransferAmount(Long TransferAmount) {
        this.TransferAmount = TransferAmount;
    }

    /**
     * Get 转账备注。
单条转账备注（微信用户会收到该备注）。UTF8编码，最多32字符。
示例值：2020年4月报销 
     * @return TransferRemark 转账备注。
单条转账备注（微信用户会收到该备注）。UTF8编码，最多32字符。
示例值：2020年4月报销
     */
    public String getTransferRemark() {
        return this.TransferRemark;
    }

    /**
     * Set 转账备注。
单条转账备注（微信用户会收到该备注）。UTF8编码，最多32字符。
示例值：2020年4月报销
     * @param TransferRemark 转账备注。
单条转账备注（微信用户会收到该备注）。UTF8编码，最多32字符。
示例值：2020年4月报销
     */
    public void setTransferRemark(String TransferRemark) {
        this.TransferRemark = TransferRemark;
    }

    /**
     * Get 用户在直连商户下的唯一标识。
示例值：o-MYE42l80oelYMDE34nYD456Xoy 
     * @return OpenId 用户在直连商户下的唯一标识。
示例值：o-MYE42l80oelYMDE34nYD456Xoy
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户在直连商户下的唯一标识。
示例值：o-MYE42l80oelYMDE34nYD456Xoy
     * @param OpenId 用户在直连商户下的唯一标识。
示例值：o-MYE42l80oelYMDE34nYD456Xoy
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 收款用户姓名。
收款方姓名。
示例值：张三 
     * @return UserName 收款用户姓名。
收款方姓名。
示例值：张三
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 收款用户姓名。
收款方姓名。
示例值：张三
     * @param UserName 收款用户姓名。
收款方姓名。
示例值：张三
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public TransferDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferDetailRequest(TransferDetailRequest source) {
        if (source.MerchantDetailNo != null) {
            this.MerchantDetailNo = new String(source.MerchantDetailNo);
        }
        if (source.TransferAmount != null) {
            this.TransferAmount = new Long(source.TransferAmount);
        }
        if (source.TransferRemark != null) {
            this.TransferRemark = new String(source.TransferRemark);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantDetailNo", this.MerchantDetailNo);
        this.setParamSimple(map, prefix + "TransferAmount", this.TransferAmount);
        this.setParamSimple(map, prefix + "TransferRemark", this.TransferRemark);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

