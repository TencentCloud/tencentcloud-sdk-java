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

public class ListAllUser extends AbstractModel {

    /**
    * <p>子账号账号ID。</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>子账号用户名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>子账号 UID。</p>
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * <p>子账号备注。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>子账号能否登录控制台。</p>
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * <p>手机号。</p>
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * <p>区号。</p>
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * <p>邮箱。</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>创建时间。</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>账号类型</p><p>枚举值：</p><ul><li>Owner： 主账号</li><li>SubUser： 子用户</li><li>CICUser： CIC 用户</li><li>WechatCorpUser： 企业微信子用户</li><li>AgentIdentity： AgentIdentity用户</li><li>Collaborator： 协作者</li><li>MessageReceiver： 消息接收者</li><li>Unknown： 未知</li></ul>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
     * Get <p>子账号账号ID。</p> 
     * @return Uin <p>子账号账号ID。</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>子账号账号ID。</p>
     * @param Uin <p>子账号账号ID。</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>子账号用户名。</p> 
     * @return Name <p>子账号用户名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>子账号用户名。</p>
     * @param Name <p>子账号用户名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>子账号 UID。</p> 
     * @return Uid <p>子账号 UID。</p>
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set <p>子账号 UID。</p>
     * @param Uid <p>子账号 UID。</p>
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get <p>子账号备注。</p> 
     * @return Remark <p>子账号备注。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>子账号备注。</p>
     * @param Remark <p>子账号备注。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>子账号能否登录控制台。</p> 
     * @return ConsoleLogin <p>子账号能否登录控制台。</p>
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set <p>子账号能否登录控制台。</p>
     * @param ConsoleLogin <p>子账号能否登录控制台。</p>
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get <p>手机号。</p> 
     * @return PhoneNum <p>手机号。</p>
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set <p>手机号。</p>
     * @param PhoneNum <p>手机号。</p>
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get <p>区号。</p> 
     * @return CountryCode <p>区号。</p>
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set <p>区号。</p>
     * @param CountryCode <p>区号。</p>
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get <p>邮箱。</p> 
     * @return Email <p>邮箱。</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>邮箱。</p>
     * @param Email <p>邮箱。</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>创建时间。</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return CreateTime <p>创建时间。</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param CreateTime <p>创建时间。</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>账号类型</p><p>枚举值：</p><ul><li>Owner： 主账号</li><li>SubUser： 子用户</li><li>CICUser： CIC 用户</li><li>WechatCorpUser： 企业微信子用户</li><li>AgentIdentity： AgentIdentity用户</li><li>Collaborator： 协作者</li><li>MessageReceiver： 消息接收者</li><li>Unknown： 未知</li></ul> 
     * @return UserType <p>账号类型</p><p>枚举值：</p><ul><li>Owner： 主账号</li><li>SubUser： 子用户</li><li>CICUser： CIC 用户</li><li>WechatCorpUser： 企业微信子用户</li><li>AgentIdentity： AgentIdentity用户</li><li>Collaborator： 协作者</li><li>MessageReceiver： 消息接收者</li><li>Unknown： 未知</li></ul>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>账号类型</p><p>枚举值：</p><ul><li>Owner： 主账号</li><li>SubUser： 子用户</li><li>CICUser： CIC 用户</li><li>WechatCorpUser： 企业微信子用户</li><li>AgentIdentity： AgentIdentity用户</li><li>Collaborator： 协作者</li><li>MessageReceiver： 消息接收者</li><li>Unknown： 未知</li></ul>
     * @param UserType <p>账号类型</p><p>枚举值：</p><ul><li>Owner： 主账号</li><li>SubUser： 子用户</li><li>CICUser： CIC 用户</li><li>WechatCorpUser： 企业微信子用户</li><li>AgentIdentity： AgentIdentity用户</li><li>Collaborator： 协作者</li><li>MessageReceiver： 消息接收者</li><li>Unknown： 未知</li></ul>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public ListAllUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAllUser(ListAllUser source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsoleLogin != null) {
            this.ConsoleLogin = new Long(source.ConsoleLogin);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

