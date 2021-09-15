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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyOrganizationOperator extends AbstractModel{

    /**
    * 经办人ID（渠道颁发）
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 经办人姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 经办人身份证件类型
用户证件类型：默认ID_CARD
1. ID_CARD - 居民身份证
2. HOUSEHOLD_REGISTER - 户口本
3. TEMP_ID_CARD - 临时居民身份证
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 经办人身份证号
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 经办人手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
     * Get 经办人ID（渠道颁发） 
     * @return Id 经办人ID（渠道颁发）
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 经办人ID（渠道颁发）
     * @param Id 经办人ID（渠道颁发）
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 经办人姓名 
     * @return Name 经办人姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 经办人姓名
     * @param Name 经办人姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 经办人身份证件类型
用户证件类型：默认ID_CARD
1. ID_CARD - 居民身份证
2. HOUSEHOLD_REGISTER - 户口本
3. TEMP_ID_CARD - 临时居民身份证 
     * @return IdCardType 经办人身份证件类型
用户证件类型：默认ID_CARD
1. ID_CARD - 居民身份证
2. HOUSEHOLD_REGISTER - 户口本
3. TEMP_ID_CARD - 临时居民身份证
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 经办人身份证件类型
用户证件类型：默认ID_CARD
1. ID_CARD - 居民身份证
2. HOUSEHOLD_REGISTER - 户口本
3. TEMP_ID_CARD - 临时居民身份证
     * @param IdCardType 经办人身份证件类型
用户证件类型：默认ID_CARD
1. ID_CARD - 居民身份证
2. HOUSEHOLD_REGISTER - 户口本
3. TEMP_ID_CARD - 临时居民身份证
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 经办人身份证号 
     * @return IdCardNumber 经办人身份证号
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 经办人身份证号
     * @param IdCardNumber 经办人身份证号
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 经办人手机号 
     * @return Mobile 经办人手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 经办人手机号
     * @param Mobile 经办人手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public ProxyOrganizationOperator() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyOrganizationOperator(ProxyOrganizationOperator source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);

    }
}

