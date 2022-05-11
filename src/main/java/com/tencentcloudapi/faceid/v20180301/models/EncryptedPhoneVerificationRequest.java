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

public class EncryptedPhoneVerificationRequest extends AbstractModel{

    /**
    * 身份证号，加密方式以EncryptionMode为准
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名，加密方式以EncryptionMode为准
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 手机号，加密方式以EncryptionMode为准
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 敏感信息的加密方式，目前支持明文、MD5和SHA256加密传输，参数取值：

0：明文，不加密
1:   使用MD5加密
2:   使用SHA256
    */
    @SerializedName("EncryptionMode")
    @Expose
    private String EncryptionMode;

    /**
     * Get 身份证号，加密方式以EncryptionMode为准 
     * @return IdCard 身份证号，加密方式以EncryptionMode为准
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份证号，加密方式以EncryptionMode为准
     * @param IdCard 身份证号，加密方式以EncryptionMode为准
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 姓名，加密方式以EncryptionMode为准 
     * @return Name 姓名，加密方式以EncryptionMode为准
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名，加密方式以EncryptionMode为准
     * @param Name 姓名，加密方式以EncryptionMode为准
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 手机号，加密方式以EncryptionMode为准 
     * @return Phone 手机号，加密方式以EncryptionMode为准
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号，加密方式以EncryptionMode为准
     * @param Phone 手机号，加密方式以EncryptionMode为准
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 敏感信息的加密方式，目前支持明文、MD5和SHA256加密传输，参数取值：

0：明文，不加密
1:   使用MD5加密
2:   使用SHA256 
     * @return EncryptionMode 敏感信息的加密方式，目前支持明文、MD5和SHA256加密传输，参数取值：

0：明文，不加密
1:   使用MD5加密
2:   使用SHA256
     */
    public String getEncryptionMode() {
        return this.EncryptionMode;
    }

    /**
     * Set 敏感信息的加密方式，目前支持明文、MD5和SHA256加密传输，参数取值：

0：明文，不加密
1:   使用MD5加密
2:   使用SHA256
     * @param EncryptionMode 敏感信息的加密方式，目前支持明文、MD5和SHA256加密传输，参数取值：

0：明文，不加密
1:   使用MD5加密
2:   使用SHA256
     */
    public void setEncryptionMode(String EncryptionMode) {
        this.EncryptionMode = EncryptionMode;
    }

    public EncryptedPhoneVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncryptedPhoneVerificationRequest(EncryptedPhoneVerificationRequest source) {
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.EncryptionMode != null) {
            this.EncryptionMode = new String(source.EncryptionMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "EncryptionMode", this.EncryptionMode);

    }
}

