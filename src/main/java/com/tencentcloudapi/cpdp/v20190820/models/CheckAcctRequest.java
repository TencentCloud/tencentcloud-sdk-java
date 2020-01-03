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

public class CheckAcctRequest extends AbstractModel{

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 聚鑫计费SubAppId，代表子商户
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 1：小额鉴权
2：短信校验鉴权
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

    /**
    * 结算账户账号
<敏感信息>加密详见《商户端接口敏感信息加密说明》
    */
    @SerializedName("SettleAcctNo")
    @Expose
    private String SettleAcctNo;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 按照聚鑫安全密钥计算的签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 短信验证码
BindType==2必填
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 币种 RMB
BindType==1必填
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 单位
1：元，2：角，3：分
BindType==1必填
    */
    @SerializedName("CurrencyUnit")
    @Expose
    private Long CurrencyUnit;

    /**
    * 金额
BindType==1必填
    */
    @SerializedName("CurrencyAmt")
    @Expose
    private String CurrencyAmt;

    /**
     * Get 聚鑫分配的支付主MidasAppId 
     * @return MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫分配的支付主MidasAppId
     * @param MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 聚鑫计费SubAppId，代表子商户 
     * @return SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 聚鑫计费SubAppId，代表子商户
     * @param SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 1：小额鉴权
2：短信校验鉴权 
     * @return BindType 1：小额鉴权
2：短信校验鉴权
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set 1：小额鉴权
2：短信校验鉴权
     * @param BindType 1：小额鉴权
2：短信校验鉴权
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
    }

    /**
     * Get 结算账户账号
<敏感信息>加密详见《商户端接口敏感信息加密说明》 
     * @return SettleAcctNo 结算账户账号
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public String getSettleAcctNo() {
        return this.SettleAcctNo;
    }

    /**
     * Set 结算账户账号
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     * @param SettleAcctNo 结算账户账号
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public void setSettleAcctNo(String SettleAcctNo) {
        this.SettleAcctNo = SettleAcctNo;
    }

    /**
     * Get 聚鑫分配的安全ID 
     * @return MidasSecretId 聚鑫分配的安全ID
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 聚鑫分配的安全ID
     * @param MidasSecretId 聚鑫分配的安全ID
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 按照聚鑫安全密钥计算的签名 
     * @return MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 按照聚鑫安全密钥计算的签名
     * @param MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Get 短信验证码
BindType==2必填 
     * @return CheckCode 短信验证码
BindType==2必填
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 短信验证码
BindType==2必填
     * @param CheckCode 短信验证码
BindType==2必填
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get 币种 RMB
BindType==1必填 
     * @return CurrencyType 币种 RMB
BindType==1必填
     */
    public String getCurrencyType() {
        return this.CurrencyType;
    }

    /**
     * Set 币种 RMB
BindType==1必填
     * @param CurrencyType 币种 RMB
BindType==1必填
     */
    public void setCurrencyType(String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    /**
     * Get 单位
1：元，2：角，3：分
BindType==1必填 
     * @return CurrencyUnit 单位
1：元，2：角，3：分
BindType==1必填
     */
    public Long getCurrencyUnit() {
        return this.CurrencyUnit;
    }

    /**
     * Set 单位
1：元，2：角，3：分
BindType==1必填
     * @param CurrencyUnit 单位
1：元，2：角，3：分
BindType==1必填
     */
    public void setCurrencyUnit(Long CurrencyUnit) {
        this.CurrencyUnit = CurrencyUnit;
    }

    /**
     * Get 金额
BindType==1必填 
     * @return CurrencyAmt 金额
BindType==1必填
     */
    public String getCurrencyAmt() {
        return this.CurrencyAmt;
    }

    /**
     * Set 金额
BindType==1必填
     * @param CurrencyAmt 金额
BindType==1必填
     */
    public void setCurrencyAmt(String CurrencyAmt) {
        this.CurrencyAmt = CurrencyAmt;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "SettleAcctNo", this.SettleAcctNo);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "CurrencyUnit", this.CurrencyUnit);
        this.setParamSimple(map, prefix + "CurrencyAmt", this.CurrencyAmt);

    }
}

