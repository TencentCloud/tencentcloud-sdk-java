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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserRequest extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户姓名，最大长度20个字符，不能包含空格
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 电子邮件
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
    */
    @SerializedName("ValidateFrom")
    @Expose
    private String ValidateFrom;

    /**
    * 用户失效时间，如:"2021-09-23T00:00:00+00:00"
生效、失效时间不填则用户长期有效
    */
    @SerializedName("ValidateTo")
    @Expose
    private String ValidateTo;

    /**
    * 所属用户组ID集合
    */
    @SerializedName("GroupIdSet")
    @Expose
    private Long [] GroupIdSet;

    /**
    * 认证方式，0 - 本地，1 - LDAP，2 - OAuth 不传则默认为0
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问
    */
    @SerializedName("ValidateTime")
    @Expose
    private String ValidateTime;

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
     * Get 用户姓名，最大长度20个字符，不能包含空格 
     * @return RealName 用户姓名，最大长度20个字符，不能包含空格
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 用户姓名，最大长度20个字符，不能包含空格
     * @param RealName 用户姓名，最大长度20个字符，不能包含空格
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx" 
     * @return Phone 大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
     * @param Phone 大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 电子邮件 
     * @return Email 电子邮件
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 电子邮件
     * @param Email 电子邮件
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 用户生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效 
     * @return ValidateFrom 用户生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     */
    public String getValidateFrom() {
        return this.ValidateFrom;
    }

    /**
     * Set 用户生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     * @param ValidateFrom 用户生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     */
    public void setValidateFrom(String ValidateFrom) {
        this.ValidateFrom = ValidateFrom;
    }

    /**
     * Get 用户失效时间，如:"2021-09-23T00:00:00+00:00"
生效、失效时间不填则用户长期有效 
     * @return ValidateTo 用户失效时间，如:"2021-09-23T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     */
    public String getValidateTo() {
        return this.ValidateTo;
    }

    /**
     * Set 用户失效时间，如:"2021-09-23T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     * @param ValidateTo 用户失效时间，如:"2021-09-23T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     */
    public void setValidateTo(String ValidateTo) {
        this.ValidateTo = ValidateTo;
    }

    /**
     * Get 所属用户组ID集合 
     * @return GroupIdSet 所属用户组ID集合
     */
    public Long [] getGroupIdSet() {
        return this.GroupIdSet;
    }

    /**
     * Set 所属用户组ID集合
     * @param GroupIdSet 所属用户组ID集合
     */
    public void setGroupIdSet(Long [] GroupIdSet) {
        this.GroupIdSet = GroupIdSet;
    }

    /**
     * Get 认证方式，0 - 本地，1 - LDAP，2 - OAuth 不传则默认为0 
     * @return AuthType 认证方式，0 - 本地，1 - LDAP，2 - OAuth 不传则默认为0
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 认证方式，0 - 本地，1 - LDAP，2 - OAuth 不传则默认为0
     * @param AuthType 认证方式，0 - 本地，1 - LDAP，2 - OAuth 不传则默认为0
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问 
     * @return ValidateTime 访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问
     */
    public String getValidateTime() {
        return this.ValidateTime;
    }

    /**
     * Set 访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问
     * @param ValidateTime 访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问
     */
    public void setValidateTime(String ValidateTime) {
        this.ValidateTime = ValidateTime;
    }

    public ModifyUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserRequest(ModifyUserRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.ValidateFrom != null) {
            this.ValidateFrom = new String(source.ValidateFrom);
        }
        if (source.ValidateTo != null) {
            this.ValidateTo = new String(source.ValidateTo);
        }
        if (source.GroupIdSet != null) {
            this.GroupIdSet = new Long[source.GroupIdSet.length];
            for (int i = 0; i < source.GroupIdSet.length; i++) {
                this.GroupIdSet[i] = new Long(source.GroupIdSet[i]);
            }
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.ValidateTime != null) {
            this.ValidateTime = new String(source.ValidateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamArraySimple(map, prefix + "GroupIdSet.", this.GroupIdSet);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ValidateTime", this.ValidateTime);

    }
}

