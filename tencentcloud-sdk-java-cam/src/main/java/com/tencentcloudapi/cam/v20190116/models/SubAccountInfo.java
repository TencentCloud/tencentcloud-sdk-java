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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubAccountInfo extends AbstractModel{

    /**
    * 子用户用户 ID
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 子用户用户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子用户 UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * 子用户备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 子用户能否登录控制台
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * 手机号
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 区号
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get 子用户用户 ID 
     * @return Uin 子用户用户 ID
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 子用户用户 ID
     * @param Uin 子用户用户 ID
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子用户用户名 
     * @return Name 子用户用户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子用户用户名
     * @param Name 子用户用户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 子用户 UID 
     * @return Uid 子用户 UID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set 子用户 UID
     * @param Uid 子用户 UID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 子用户备注 
     * @return Remark 子用户备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 子用户备注
     * @param Remark 子用户备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 子用户能否登录控制台 
     * @return ConsoleLogin 子用户能否登录控制台
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set 子用户能否登录控制台
     * @param ConsoleLogin 子用户能否登录控制台
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get 手机号 
     * @return PhoneNum 手机号
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 手机号
     * @param PhoneNum 手机号
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 区号 
     * @return CountryCode 区号
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 区号
     * @param CountryCode 区号
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 邮箱 
     * @return Email 邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
     * @param Email 邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

