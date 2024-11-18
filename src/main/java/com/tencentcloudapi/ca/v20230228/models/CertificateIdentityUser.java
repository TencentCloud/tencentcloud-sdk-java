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
package com.tencentcloudapi.ca.v20230228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateIdentityUser extends AbstractModel {

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 唯一身份id
    */
    @SerializedName("IdentityUniqueId")
    @Expose
    private String IdentityUniqueId;

    /**
    * 身份证号
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 身份鉴别类型
1：授权金融机构身份鉴别
    */
    @SerializedName("IdentificationType")
    @Expose
    private String IdentificationType;

    /**
    * 身份鉴别措施
1、身份证鉴别
2、银行卡鉴别
3、支付账户密码验证
4、人脸识别验证
    */
    @SerializedName("IdentificationMeasures")
    @Expose
    private String [] IdentificationMeasures;

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
     * Get 唯一身份id 
     * @return IdentityUniqueId 唯一身份id
     */
    public String getIdentityUniqueId() {
        return this.IdentityUniqueId;
    }

    /**
     * Set 唯一身份id
     * @param IdentityUniqueId 唯一身份id
     */
    public void setIdentityUniqueId(String IdentityUniqueId) {
        this.IdentityUniqueId = IdentityUniqueId;
    }

    /**
     * Get 身份证号 
     * @return IdCardNumber 身份证号
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 身份证号
     * @param IdCardNumber 身份证号
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 身份鉴别类型
1：授权金融机构身份鉴别 
     * @return IdentificationType 身份鉴别类型
1：授权金融机构身份鉴别
     */
    public String getIdentificationType() {
        return this.IdentificationType;
    }

    /**
     * Set 身份鉴别类型
1：授权金融机构身份鉴别
     * @param IdentificationType 身份鉴别类型
1：授权金融机构身份鉴别
     */
    public void setIdentificationType(String IdentificationType) {
        this.IdentificationType = IdentificationType;
    }

    /**
     * Get 身份鉴别措施
1、身份证鉴别
2、银行卡鉴别
3、支付账户密码验证
4、人脸识别验证 
     * @return IdentificationMeasures 身份鉴别措施
1、身份证鉴别
2、银行卡鉴别
3、支付账户密码验证
4、人脸识别验证
     */
    public String [] getIdentificationMeasures() {
        return this.IdentificationMeasures;
    }

    /**
     * Set 身份鉴别措施
1、身份证鉴别
2、银行卡鉴别
3、支付账户密码验证
4、人脸识别验证
     * @param IdentificationMeasures 身份鉴别措施
1、身份证鉴别
2、银行卡鉴别
3、支付账户密码验证
4、人脸识别验证
     */
    public void setIdentificationMeasures(String [] IdentificationMeasures) {
        this.IdentificationMeasures = IdentificationMeasures;
    }

    public CertificateIdentityUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateIdentityUser(CertificateIdentityUser source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdentityUniqueId != null) {
            this.IdentityUniqueId = new String(source.IdentityUniqueId);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.IdentificationType != null) {
            this.IdentificationType = new String(source.IdentificationType);
        }
        if (source.IdentificationMeasures != null) {
            this.IdentificationMeasures = new String[source.IdentificationMeasures.length];
            for (int i = 0; i < source.IdentificationMeasures.length; i++) {
                this.IdentificationMeasures[i] = new String(source.IdentificationMeasures[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdentityUniqueId", this.IdentityUniqueId);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "IdentificationType", this.IdentificationType);
        this.setParamArraySimple(map, prefix + "IdentificationMeasures.", this.IdentificationMeasures);

    }
}

