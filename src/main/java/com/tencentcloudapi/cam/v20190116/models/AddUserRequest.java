/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddUserRequest extends AbstractModel {

    /**
    * <p>子用户用户名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>子用户备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>子用户是否可以登录控制台。传0子用户无法登录控制台，传1子用户可以登录控制台。</p>
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * <p>是否生成子用户密钥。传0不生成子用户密钥，传1生成子用户密钥。</p>
    */
    @SerializedName("UseApi")
    @Expose
    private Long UseApi;

    /**
    * <p>子用户控制台登录密码，若未进行密码规则设置则默认密码规则为8位以上同时包含大小写字母、数字和特殊字符。只有可以登录控制台时才有效，如果传空并且上面指定允许登录控制台，则自动生成随机密码，随机密码规则为32位包含大小写字母、数字和特殊字符。</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>子用户是否要在下次登录时重置密码。传0子用户下次登录控制台不需重置密码，传1子用户下次登录控制台需要重置密码。</p>
    */
    @SerializedName("NeedResetPassword")
    @Expose
    private Long NeedResetPassword;

    /**
    * <p>手机号</p>
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * <p>区号</p>
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * <p>邮箱</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get <p>子用户用户名</p> 
     * @return Name <p>子用户用户名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>子用户用户名</p>
     * @param Name <p>子用户用户名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>子用户备注</p> 
     * @return Remark <p>子用户备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>子用户备注</p>
     * @param Remark <p>子用户备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>子用户是否可以登录控制台。传0子用户无法登录控制台，传1子用户可以登录控制台。</p> 
     * @return ConsoleLogin <p>子用户是否可以登录控制台。传0子用户无法登录控制台，传1子用户可以登录控制台。</p>
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set <p>子用户是否可以登录控制台。传0子用户无法登录控制台，传1子用户可以登录控制台。</p>
     * @param ConsoleLogin <p>子用户是否可以登录控制台。传0子用户无法登录控制台，传1子用户可以登录控制台。</p>
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get <p>是否生成子用户密钥。传0不生成子用户密钥，传1生成子用户密钥。</p> 
     * @return UseApi <p>是否生成子用户密钥。传0不生成子用户密钥，传1生成子用户密钥。</p>
     */
    public Long getUseApi() {
        return this.UseApi;
    }

    /**
     * Set <p>是否生成子用户密钥。传0不生成子用户密钥，传1生成子用户密钥。</p>
     * @param UseApi <p>是否生成子用户密钥。传0不生成子用户密钥，传1生成子用户密钥。</p>
     */
    public void setUseApi(Long UseApi) {
        this.UseApi = UseApi;
    }

    /**
     * Get <p>子用户控制台登录密码，若未进行密码规则设置则默认密码规则为8位以上同时包含大小写字母、数字和特殊字符。只有可以登录控制台时才有效，如果传空并且上面指定允许登录控制台，则自动生成随机密码，随机密码规则为32位包含大小写字母、数字和特殊字符。</p> 
     * @return Password <p>子用户控制台登录密码，若未进行密码规则设置则默认密码规则为8位以上同时包含大小写字母、数字和特殊字符。只有可以登录控制台时才有效，如果传空并且上面指定允许登录控制台，则自动生成随机密码，随机密码规则为32位包含大小写字母、数字和特殊字符。</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>子用户控制台登录密码，若未进行密码规则设置则默认密码规则为8位以上同时包含大小写字母、数字和特殊字符。只有可以登录控制台时才有效，如果传空并且上面指定允许登录控制台，则自动生成随机密码，随机密码规则为32位包含大小写字母、数字和特殊字符。</p>
     * @param Password <p>子用户控制台登录密码，若未进行密码规则设置则默认密码规则为8位以上同时包含大小写字母、数字和特殊字符。只有可以登录控制台时才有效，如果传空并且上面指定允许登录控制台，则自动生成随机密码，随机密码规则为32位包含大小写字母、数字和特殊字符。</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>子用户是否要在下次登录时重置密码。传0子用户下次登录控制台不需重置密码，传1子用户下次登录控制台需要重置密码。</p> 
     * @return NeedResetPassword <p>子用户是否要在下次登录时重置密码。传0子用户下次登录控制台不需重置密码，传1子用户下次登录控制台需要重置密码。</p>
     */
    public Long getNeedResetPassword() {
        return this.NeedResetPassword;
    }

    /**
     * Set <p>子用户是否要在下次登录时重置密码。传0子用户下次登录控制台不需重置密码，传1子用户下次登录控制台需要重置密码。</p>
     * @param NeedResetPassword <p>子用户是否要在下次登录时重置密码。传0子用户下次登录控制台不需重置密码，传1子用户下次登录控制台需要重置密码。</p>
     */
    public void setNeedResetPassword(Long NeedResetPassword) {
        this.NeedResetPassword = NeedResetPassword;
    }

    /**
     * Get <p>手机号</p> 
     * @return PhoneNum <p>手机号</p>
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set <p>手机号</p>
     * @param PhoneNum <p>手机号</p>
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get <p>区号</p> 
     * @return CountryCode <p>区号</p>
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set <p>区号</p>
     * @param CountryCode <p>区号</p>
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get <p>邮箱</p> 
     * @return Email <p>邮箱</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>邮箱</p>
     * @param Email <p>邮箱</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public AddUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUserRequest(AddUserRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsoleLogin != null) {
            this.ConsoleLogin = new Long(source.ConsoleLogin);
        }
        if (source.UseApi != null) {
            this.UseApi = new Long(source.UseApi);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.NeedResetPassword != null) {
            this.NeedResetPassword = new Long(source.NeedResetPassword);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "UseApi", this.UseApi);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "NeedResetPassword", this.NeedResetPassword);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

