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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePreparedPersonalEsignRequest extends AbstractModel{

    /**
    * 个人用户名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 身份证件号码
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 印章图片的base64
    */
    @SerializedName("SealImage")
    @Expose
    private String SealImage;

    /**
    * 印章名称
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 身份证件类型:
ID_CARD 身份证
PASSPORT 护照
HONGKONG_AND_MACAO 中国香港
FOREIGN_ID_CARD 境外身份
HONGKONG_MACAO_AND_TAIWAN 中国台湾
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 手机号码
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 是否需开通自动签
    */
    @SerializedName("EnableAutoSign")
    @Expose
    private Boolean EnableAutoSign;

    /**
     * Get 个人用户名称 
     * @return UserName 个人用户名称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 个人用户名称
     * @param UserName 个人用户名称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 身份证件号码 
     * @return IdCardNumber 身份证件号码
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 身份证件号码
     * @param IdCardNumber 身份证件号码
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 印章图片的base64 
     * @return SealImage 印章图片的base64
     */
    public String getSealImage() {
        return this.SealImage;
    }

    /**
     * Set 印章图片的base64
     * @param SealImage 印章图片的base64
     */
    public void setSealImage(String SealImage) {
        this.SealImage = SealImage;
    }

    /**
     * Get 印章名称 
     * @return SealName 印章名称
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 印章名称
     * @param SealName 印章名称
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。 
     * @return Operator 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     * @param Operator 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 身份证件类型:
ID_CARD 身份证
PASSPORT 护照
HONGKONG_AND_MACAO 中国香港
FOREIGN_ID_CARD 境外身份
HONGKONG_MACAO_AND_TAIWAN 中国台湾 
     * @return IdCardType 身份证件类型:
ID_CARD 身份证
PASSPORT 护照
HONGKONG_AND_MACAO 中国香港
FOREIGN_ID_CARD 境外身份
HONGKONG_MACAO_AND_TAIWAN 中国台湾
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 身份证件类型:
ID_CARD 身份证
PASSPORT 护照
HONGKONG_AND_MACAO 中国香港
FOREIGN_ID_CARD 境外身份
HONGKONG_MACAO_AND_TAIWAN 中国台湾
     * @param IdCardType 身份证件类型:
ID_CARD 身份证
PASSPORT 护照
HONGKONG_AND_MACAO 中国香港
FOREIGN_ID_CARD 境外身份
HONGKONG_MACAO_AND_TAIWAN 中国台湾
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 手机号码 
     * @return Mobile 手机号码
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号码
     * @param Mobile 手机号码
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 是否需开通自动签 
     * @return EnableAutoSign 是否需开通自动签
     */
    public Boolean getEnableAutoSign() {
        return this.EnableAutoSign;
    }

    /**
     * Set 是否需开通自动签
     * @param EnableAutoSign 是否需开通自动签
     */
    public void setEnableAutoSign(Boolean EnableAutoSign) {
        this.EnableAutoSign = EnableAutoSign;
    }

    public CreatePreparedPersonalEsignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePreparedPersonalEsignRequest(CreatePreparedPersonalEsignRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.SealImage != null) {
            this.SealImage = new String(source.SealImage);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.EnableAutoSign != null) {
            this.EnableAutoSign = new Boolean(source.EnableAutoSign);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "SealImage", this.SealImage);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "EnableAutoSign", this.EnableAutoSign);

    }
}

