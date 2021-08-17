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

public class BindAccountRequest extends AbstractModel{

    /**
    * 主播Id
    */
    @SerializedName("AnchorId")
    @Expose
    private String AnchorId;

    /**
    * 1 微信企业付款 
2 支付宝转账 
3 平安银企直连代发转账
    */
    @SerializedName("TransferType")
    @Expose
    private Long TransferType;

    /**
    * 收款方标识。
微信为open_id；
支付宝为会员alipay_user_id;
平安为收款方银行账号;
    */
    @SerializedName("AccountNo")
    @Expose
    private String AccountNo;

    /**
    * 手机号
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
     * Get 主播Id 
     * @return AnchorId 主播Id
     */
    public String getAnchorId() {
        return this.AnchorId;
    }

    /**
     * Set 主播Id
     * @param AnchorId 主播Id
     */
    public void setAnchorId(String AnchorId) {
        this.AnchorId = AnchorId;
    }

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
     * Get 收款方标识。
微信为open_id；
支付宝为会员alipay_user_id;
平安为收款方银行账号; 
     * @return AccountNo 收款方标识。
微信为open_id；
支付宝为会员alipay_user_id;
平安为收款方银行账号;
     */
    public String getAccountNo() {
        return this.AccountNo;
    }

    /**
     * Set 收款方标识。
微信为open_id；
支付宝为会员alipay_user_id;
平安为收款方银行账号;
     * @param AccountNo 收款方标识。
微信为open_id；
支付宝为会员alipay_user_id;
平安为收款方银行账号;
     */
    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    /**
     * Get 手机号 
     * @return PhoneNum 手机号
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 手机号
     * @param PhoneNum 手机号
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public BindAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindAccountRequest(BindAccountRequest source) {
        if (source.AnchorId != null) {
            this.AnchorId = new String(source.AnchorId);
        }
        if (source.TransferType != null) {
            this.TransferType = new Long(source.TransferType);
        }
        if (source.AccountNo != null) {
            this.AccountNo = new String(source.AccountNo);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnchorId", this.AnchorId);
        this.setParamSimple(map, prefix + "TransferType", this.TransferType);
        this.setParamSimple(map, prefix + "AccountNo", this.AccountNo);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);

    }
}

