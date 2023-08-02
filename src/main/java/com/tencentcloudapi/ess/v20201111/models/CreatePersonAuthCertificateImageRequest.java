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

public class CreatePersonAuthCertificateImageRequest extends AbstractModel{

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 个人用户名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 身份证件类型取值：
ID_CARD 身居民身份证
PASSPORT 护照
HONGKONG_AND_MACAO 港澳居民来往内地通行证
FOREIGN_ID_CARD 外国人永久居留身份证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 身份证件号码
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

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
     * Get 身份证件类型取值：
ID_CARD 身居民身份证
PASSPORT 护照
HONGKONG_AND_MACAO 港澳居民来往内地通行证
FOREIGN_ID_CARD 外国人永久居留身份证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证) 
     * @return IdCardType 身份证件类型取值：
ID_CARD 身居民身份证
PASSPORT 护照
HONGKONG_AND_MACAO 港澳居民来往内地通行证
FOREIGN_ID_CARD 外国人永久居留身份证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 身份证件类型取值：
ID_CARD 身居民身份证
PASSPORT 护照
HONGKONG_AND_MACAO 港澳居民来往内地通行证
FOREIGN_ID_CARD 外国人永久居留身份证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
     * @param IdCardType 身份证件类型取值：
ID_CARD 身居民身份证
PASSPORT 护照
HONGKONG_AND_MACAO 港澳居民来往内地通行证
FOREIGN_ID_CARD 外国人永久居留身份证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
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

    public CreatePersonAuthCertificateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonAuthCertificateImageRequest(CreatePersonAuthCertificateImageRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);

    }
}

