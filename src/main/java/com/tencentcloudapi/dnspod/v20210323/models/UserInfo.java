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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel{

    /**
    * 用户昵称
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 用户ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户账号, 邮箱格式
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 账号状态：”enabled”: 正常；”disabled”: 被封禁
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 电话号码
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 邮箱是否通过验证：”yes”: 通过；”no”: 未通过
    */
    @SerializedName("EmailVerified")
    @Expose
    private String EmailVerified;

    /**
    * 手机是否通过验证：”yes”: 通过；”no”: 未通过
    */
    @SerializedName("TelephoneVerified")
    @Expose
    private String TelephoneVerified;

    /**
    * 账号等级, 按照用户账号下域名等级排序, 选取一个最高等级为账号等级, 具体对应情况参见域名等级。
    */
    @SerializedName("UserGrade")
    @Expose
    private String UserGrade;

    /**
    * 用户名称, 企业用户对应为公司名称
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 是否绑定微信：”yes”: 通过；”no”: 未通过
    */
    @SerializedName("WechatBinded")
    @Expose
    private String WechatBinded;

    /**
    * 用户UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
     * Get 用户昵称 
     * @return Nick 用户昵称
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 用户昵称
     * @param Nick 用户昵称
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 用户ID 
     * @return Id 用户ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 用户ID
     * @param Id 用户ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户账号, 邮箱格式 
     * @return Email 用户账号, 邮箱格式
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 用户账号, 邮箱格式
     * @param Email 用户账号, 邮箱格式
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 账号状态：”enabled”: 正常；”disabled”: 被封禁 
     * @return Status 账号状态：”enabled”: 正常；”disabled”: 被封禁
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 账号状态：”enabled”: 正常；”disabled”: 被封禁
     * @param Status 账号状态：”enabled”: 正常；”disabled”: 被封禁
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 电话号码 
     * @return Telephone 电话号码
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 电话号码
     * @param Telephone 电话号码
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get 邮箱是否通过验证：”yes”: 通过；”no”: 未通过 
     * @return EmailVerified 邮箱是否通过验证：”yes”: 通过；”no”: 未通过
     */
    public String getEmailVerified() {
        return this.EmailVerified;
    }

    /**
     * Set 邮箱是否通过验证：”yes”: 通过；”no”: 未通过
     * @param EmailVerified 邮箱是否通过验证：”yes”: 通过；”no”: 未通过
     */
    public void setEmailVerified(String EmailVerified) {
        this.EmailVerified = EmailVerified;
    }

    /**
     * Get 手机是否通过验证：”yes”: 通过；”no”: 未通过 
     * @return TelephoneVerified 手机是否通过验证：”yes”: 通过；”no”: 未通过
     */
    public String getTelephoneVerified() {
        return this.TelephoneVerified;
    }

    /**
     * Set 手机是否通过验证：”yes”: 通过；”no”: 未通过
     * @param TelephoneVerified 手机是否通过验证：”yes”: 通过；”no”: 未通过
     */
    public void setTelephoneVerified(String TelephoneVerified) {
        this.TelephoneVerified = TelephoneVerified;
    }

    /**
     * Get 账号等级, 按照用户账号下域名等级排序, 选取一个最高等级为账号等级, 具体对应情况参见域名等级。 
     * @return UserGrade 账号等级, 按照用户账号下域名等级排序, 选取一个最高等级为账号等级, 具体对应情况参见域名等级。
     */
    public String getUserGrade() {
        return this.UserGrade;
    }

    /**
     * Set 账号等级, 按照用户账号下域名等级排序, 选取一个最高等级为账号等级, 具体对应情况参见域名等级。
     * @param UserGrade 账号等级, 按照用户账号下域名等级排序, 选取一个最高等级为账号等级, 具体对应情况参见域名等级。
     */
    public void setUserGrade(String UserGrade) {
        this.UserGrade = UserGrade;
    }

    /**
     * Get 用户名称, 企业用户对应为公司名称 
     * @return RealName 用户名称, 企业用户对应为公司名称
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 用户名称, 企业用户对应为公司名称
     * @param RealName 用户名称, 企业用户对应为公司名称
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 是否绑定微信：”yes”: 通过；”no”: 未通过 
     * @return WechatBinded 是否绑定微信：”yes”: 通过；”no”: 未通过
     */
    public String getWechatBinded() {
        return this.WechatBinded;
    }

    /**
     * Set 是否绑定微信：”yes”: 通过；”no”: 未通过
     * @param WechatBinded 是否绑定微信：”yes”: 通过；”no”: 未通过
     */
    public void setWechatBinded(String WechatBinded) {
        this.WechatBinded = WechatBinded;
    }

    /**
     * Get 用户UIN 
     * @return Uin 用户UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 用户UIN
     * @param Uin 用户UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.EmailVerified != null) {
            this.EmailVerified = new String(source.EmailVerified);
        }
        if (source.TelephoneVerified != null) {
            this.TelephoneVerified = new String(source.TelephoneVerified);
        }
        if (source.UserGrade != null) {
            this.UserGrade = new String(source.UserGrade);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.WechatBinded != null) {
            this.WechatBinded = new String(source.WechatBinded);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "EmailVerified", this.EmailVerified);
        this.setParamSimple(map, prefix + "TelephoneVerified", this.TelephoneVerified);
        this.setParamSimple(map, prefix + "UserGrade", this.UserGrade);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "WechatBinded", this.WechatBinded);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

