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

public class BindAcctRequest extends AbstractModel{

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
    * 1 – 小额转账验证
2 – 短信验证
每个结算账户每天只能使用一次小额转账验证
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

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
    * 1 – 本行账户
2 – 他行账户
    */
    @SerializedName("SettleAcctType")
    @Expose
    private Long SettleAcctType;

    /**
    * 证件类型，见《证件类型》表
    */
    @SerializedName("IdType")
    @Expose
    private String IdType;

    /**
    * 证件号码
<敏感信息>加密详见《商户端接口敏感信息加密说明》
    */
    @SerializedName("IdCode")
    @Expose
    private String IdCode;

    /**
    * 开户行名称
    */
    @SerializedName("AcctBranchName")
    @Expose
    private String AcctBranchName;

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
    * 用于短信验证
BindType==2时必填
<敏感信息>加密详见《商户端接口敏感信息加密说明》
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 大小额行号，超级网银行号和大小额行号
二选一
    */
    @SerializedName("CnapsBranchId")
    @Expose
    private String CnapsBranchId;

    /**
    * 超级网银行号，超级网银行号和大小额行号
二选一
    */
    @SerializedName("EiconBankBranchId")
    @Expose
    private String EiconBankBranchId;

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
     * Get 1 – 小额转账验证
2 – 短信验证
每个结算账户每天只能使用一次小额转账验证 
     * @return BindType 1 – 小额转账验证
2 – 短信验证
每个结算账户每天只能使用一次小额转账验证
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set 1 – 小额转账验证
2 – 短信验证
每个结算账户每天只能使用一次小额转账验证
     * @param BindType 1 – 小额转账验证
2 – 短信验证
每个结算账户每天只能使用一次小额转账验证
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
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
     * Get 1 – 本行账户
2 – 他行账户 
     * @return SettleAcctType 1 – 本行账户
2 – 他行账户
     */
    public Long getSettleAcctType() {
        return this.SettleAcctType;
    }

    /**
     * Set 1 – 本行账户
2 – 他行账户
     * @param SettleAcctType 1 – 本行账户
2 – 他行账户
     */
    public void setSettleAcctType(Long SettleAcctType) {
        this.SettleAcctType = SettleAcctType;
    }

    /**
     * Get 证件类型，见《证件类型》表 
     * @return IdType 证件类型，见《证件类型》表
     */
    public String getIdType() {
        return this.IdType;
    }

    /**
     * Set 证件类型，见《证件类型》表
     * @param IdType 证件类型，见《证件类型》表
     */
    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    /**
     * Get 证件号码
<敏感信息>加密详见《商户端接口敏感信息加密说明》 
     * @return IdCode 证件号码
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public String getIdCode() {
        return this.IdCode;
    }

    /**
     * Set 证件号码
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     * @param IdCode 证件号码
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public void setIdCode(String IdCode) {
        this.IdCode = IdCode;
    }

    /**
     * Get 开户行名称 
     * @return AcctBranchName 开户行名称
     */
    public String getAcctBranchName() {
        return this.AcctBranchName;
    }

    /**
     * Set 开户行名称
     * @param AcctBranchName 开户行名称
     */
    public void setAcctBranchName(String AcctBranchName) {
        this.AcctBranchName = AcctBranchName;
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
     * Get 用于短信验证
BindType==2时必填
<敏感信息>加密详见《商户端接口敏感信息加密说明》 
     * @return Mobile 用于短信验证
BindType==2时必填
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 用于短信验证
BindType==2时必填
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     * @param Mobile 用于短信验证
BindType==2时必填
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 大小额行号，超级网银行号和大小额行号
二选一 
     * @return CnapsBranchId 大小额行号，超级网银行号和大小额行号
二选一
     */
    public String getCnapsBranchId() {
        return this.CnapsBranchId;
    }

    /**
     * Set 大小额行号，超级网银行号和大小额行号
二选一
     * @param CnapsBranchId 大小额行号，超级网银行号和大小额行号
二选一
     */
    public void setCnapsBranchId(String CnapsBranchId) {
        this.CnapsBranchId = CnapsBranchId;
    }

    /**
     * Get 超级网银行号，超级网银行号和大小额行号
二选一 
     * @return EiconBankBranchId 超级网银行号，超级网银行号和大小额行号
二选一
     */
    public String getEiconBankBranchId() {
        return this.EiconBankBranchId;
    }

    /**
     * Set 超级网银行号，超级网银行号和大小额行号
二选一
     * @param EiconBankBranchId 超级网银行号，超级网银行号和大小额行号
二选一
     */
    public void setEiconBankBranchId(String EiconBankBranchId) {
        this.EiconBankBranchId = EiconBankBranchId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "SettleAcctNo", this.SettleAcctNo);
        this.setParamSimple(map, prefix + "SettleAcctName", this.SettleAcctName);
        this.setParamSimple(map, prefix + "SettleAcctType", this.SettleAcctType);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "IdCode", this.IdCode);
        this.setParamSimple(map, prefix + "AcctBranchName", this.AcctBranchName);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "CnapsBranchId", this.CnapsBranchId);
        this.setParamSimple(map, prefix + "EiconBankBranchId", this.EiconBankBranchId);

    }
}

