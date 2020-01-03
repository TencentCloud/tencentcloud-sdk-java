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

public class ApplyWithdrawalRequest extends AbstractModel{

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
    * 用于提现
<敏感信息>加密详见《商户端接口敏感信息加密说明》
    */
    @SerializedName("SettleAcctNo")
    @Expose
    private String SettleAcctNo;

    /**
    * 结算账户户名
<敏感信息>加密详见《商户端接口敏感信息加密说明》
    */
    @SerializedName("SettleAcctName")
    @Expose
    private String SettleAcctName;

    /**
    * 币种 RMB
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 单位，1：元，2：角，3：分
    */
    @SerializedName("CurrencyUnit")
    @Expose
    private Long CurrencyUnit;

    /**
    * 金额
    */
    @SerializedName("CurrencyAmt")
    @Expose
    private String CurrencyAmt;

    /**
    * 交易网名称
    */
    @SerializedName("TranWebName")
    @Expose
    private String TranWebName;

    /**
    * 会员证件类型
    */
    @SerializedName("IdType")
    @Expose
    private String IdType;

    /**
    * 会员证件号码
<敏感信息>加密详见《商户端接口敏感信息加密说明》
    */
    @SerializedName("IdCode")
    @Expose
    private String IdCode;

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
     * Get 用于提现
<敏感信息>加密详见《商户端接口敏感信息加密说明》 
     * @return SettleAcctNo 用于提现
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public String getSettleAcctNo() {
        return this.SettleAcctNo;
    }

    /**
     * Set 用于提现
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     * @param SettleAcctNo 用于提现
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public void setSettleAcctNo(String SettleAcctNo) {
        this.SettleAcctNo = SettleAcctNo;
    }

    /**
     * Get 结算账户户名
<敏感信息>加密详见《商户端接口敏感信息加密说明》 
     * @return SettleAcctName 结算账户户名
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public String getSettleAcctName() {
        return this.SettleAcctName;
    }

    /**
     * Set 结算账户户名
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     * @param SettleAcctName 结算账户户名
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public void setSettleAcctName(String SettleAcctName) {
        this.SettleAcctName = SettleAcctName;
    }

    /**
     * Get 币种 RMB 
     * @return CurrencyType 币种 RMB
     */
    public String getCurrencyType() {
        return this.CurrencyType;
    }

    /**
     * Set 币种 RMB
     * @param CurrencyType 币种 RMB
     */
    public void setCurrencyType(String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    /**
     * Get 单位，1：元，2：角，3：分 
     * @return CurrencyUnit 单位，1：元，2：角，3：分
     */
    public Long getCurrencyUnit() {
        return this.CurrencyUnit;
    }

    /**
     * Set 单位，1：元，2：角，3：分
     * @param CurrencyUnit 单位，1：元，2：角，3：分
     */
    public void setCurrencyUnit(Long CurrencyUnit) {
        this.CurrencyUnit = CurrencyUnit;
    }

    /**
     * Get 金额 
     * @return CurrencyAmt 金额
     */
    public String getCurrencyAmt() {
        return this.CurrencyAmt;
    }

    /**
     * Set 金额
     * @param CurrencyAmt 金额
     */
    public void setCurrencyAmt(String CurrencyAmt) {
        this.CurrencyAmt = CurrencyAmt;
    }

    /**
     * Get 交易网名称 
     * @return TranWebName 交易网名称
     */
    public String getTranWebName() {
        return this.TranWebName;
    }

    /**
     * Set 交易网名称
     * @param TranWebName 交易网名称
     */
    public void setTranWebName(String TranWebName) {
        this.TranWebName = TranWebName;
    }

    /**
     * Get 会员证件类型 
     * @return IdType 会员证件类型
     */
    public String getIdType() {
        return this.IdType;
    }

    /**
     * Set 会员证件类型
     * @param IdType 会员证件类型
     */
    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    /**
     * Get 会员证件号码
<敏感信息>加密详见《商户端接口敏感信息加密说明》 
     * @return IdCode 会员证件号码
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public String getIdCode() {
        return this.IdCode;
    }

    /**
     * Set 会员证件号码
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     * @param IdCode 会员证件号码
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public void setIdCode(String IdCode) {
        this.IdCode = IdCode;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "SettleAcctNo", this.SettleAcctNo);
        this.setParamSimple(map, prefix + "SettleAcctName", this.SettleAcctName);
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "CurrencyUnit", this.CurrencyUnit);
        this.setParamSimple(map, prefix + "CurrencyAmt", this.CurrencyAmt);
        this.setParamSimple(map, prefix + "TranWebName", this.TranWebName);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "IdCode", this.IdCode);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);

    }
}

