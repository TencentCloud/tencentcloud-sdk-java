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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCRUserVerifyRequest extends AbstractModel{

    /**
    * 用户真实姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户身份证号
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * 用户手机号码
    */
    @SerializedName("UserPhone")
    @Expose
    private String UserPhone;

    /**
    * 短信验证码，接口接入可以置空
    */
    @SerializedName("VerificationCode")
    @Expose
    private String VerificationCode;

    /**
    * 字段已废弃，认证类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 用户真实姓名 
     * @return UserName 用户真实姓名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户真实姓名
     * @param UserName 用户真实姓名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户身份证号 
     * @return UserID 用户身份证号
     */
    public String getUserID() {
        return this.UserID;
    }

    /**
     * Set 用户身份证号
     * @param UserID 用户身份证号
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * Get 用户手机号码 
     * @return UserPhone 用户手机号码
     */
    public String getUserPhone() {
        return this.UserPhone;
    }

    /**
     * Set 用户手机号码
     * @param UserPhone 用户手机号码
     */
    public void setUserPhone(String UserPhone) {
        this.UserPhone = UserPhone;
    }

    /**
     * Get 短信验证码，接口接入可以置空 
     * @return VerificationCode 短信验证码，接口接入可以置空
     */
    public String getVerificationCode() {
        return this.VerificationCode;
    }

    /**
     * Set 短信验证码，接口接入可以置空
     * @param VerificationCode 短信验证码，接口接入可以置空
     */
    public void setVerificationCode(String VerificationCode) {
        this.VerificationCode = VerificationCode;
    }

    /**
     * Get 字段已废弃，认证类型 
     * @return Type 字段已废弃，认证类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段已废弃，认证类型
     * @param Type 字段已废弃，认证类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateCRUserVerifyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRUserVerifyRequest(CreateCRUserVerifyRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.UserPhone != null) {
            this.UserPhone = new String(source.UserPhone);
        }
        if (source.VerificationCode != null) {
            this.VerificationCode = new String(source.VerificationCode);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "UserPhone", this.UserPhone);
        this.setParamSimple(map, prefix + "VerificationCode", this.VerificationCode);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

