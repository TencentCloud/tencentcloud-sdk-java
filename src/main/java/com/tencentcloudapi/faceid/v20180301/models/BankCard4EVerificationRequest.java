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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BankCard4EVerificationRequest extends AbstractModel{

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 银行卡
    */
    @SerializedName("BankCard")
    @Expose
    private String BankCard;

    /**
    * 手机号码
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 开户证件号，与CertType参数的证件类型一致，如：身份证，则传入身份证号。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。
目前默认：0 身份证，其他证件类型需求可以联系小助手faceid001确认。
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 银行卡 
     * @return BankCard 银行卡
     */
    public String getBankCard() {
        return this.BankCard;
    }

    /**
     * Set 银行卡
     * @param BankCard 银行卡
     */
    public void setBankCard(String BankCard) {
        this.BankCard = BankCard;
    }

    /**
     * Get 手机号码 
     * @return Phone 手机号码
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号码
     * @param Phone 手机号码
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 开户证件号，与CertType参数的证件类型一致，如：身份证，则传入身份证号。 
     * @return IdCard 开户证件号，与CertType参数的证件类型一致，如：身份证，则传入身份证号。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 开户证件号，与CertType参数的证件类型一致，如：身份证，则传入身份证号。
     * @param IdCard 开户证件号，与CertType参数的证件类型一致，如：身份证，则传入身份证号。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。
目前默认：0 身份证，其他证件类型需求可以联系小助手faceid001确认。 
     * @return CertType 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。
目前默认：0 身份证，其他证件类型需求可以联系小助手faceid001确认。
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。
目前默认：0 身份证，其他证件类型需求可以联系小助手faceid001确认。
     * @param CertType 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。
目前默认：0 身份证，其他证件类型需求可以联系小助手faceid001确认。
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BankCard", this.BankCard);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "CertType", this.CertType);

    }
}

