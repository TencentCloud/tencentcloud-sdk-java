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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserRequest extends AbstractModel {

    /**
    * <p>用户ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>用户姓名，最大长度20个字符，不能包含空格</p>
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * <p>按照&quot;国家地区代码|手机号&quot;的格式输入。如: &quot;+86|xxxxxxxx&quot;</p>
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * <p>电子邮件</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>用户生效时间，如:&quot;2021-09-22T00:00:00+00:00&quot;<br>生效、失效时间不填则用户长期有效</p>
    */
    @SerializedName("ValidateFrom")
    @Expose
    private String ValidateFrom;

    /**
    * <p>用户失效时间，如:&quot;2021-09-23T00:00:00+00:00&quot;<br>生效、失效时间不填则用户长期有效</p>
    */
    @SerializedName("ValidateTo")
    @Expose
    private String ValidateTo;

    /**
    * <p>所属用户组ID集合</p>
    */
    @SerializedName("GroupIdSet")
    @Expose
    private Long [] GroupIdSet;

    /**
    * <p>认证方式，0 - 本地，1 - LDAP，2 - OAuth 不传则默认为0</p>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问</p>
    */
    @SerializedName("ValidateTime")
    @Expose
    private String ValidateTime;

    /**
    * <p>用户所属部门的ID，如1.2.3</p>
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
     * Get <p>用户ID</p> 
     * @return Id <p>用户ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>用户ID</p>
     * @param Id <p>用户ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>用户姓名，最大长度20个字符，不能包含空格</p> 
     * @return RealName <p>用户姓名，最大长度20个字符，不能包含空格</p>
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set <p>用户姓名，最大长度20个字符，不能包含空格</p>
     * @param RealName <p>用户姓名，最大长度20个字符，不能包含空格</p>
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get <p>按照&quot;国家地区代码|手机号&quot;的格式输入。如: &quot;+86|xxxxxxxx&quot;</p> 
     * @return Phone <p>按照&quot;国家地区代码|手机号&quot;的格式输入。如: &quot;+86|xxxxxxxx&quot;</p>
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set <p>按照&quot;国家地区代码|手机号&quot;的格式输入。如: &quot;+86|xxxxxxxx&quot;</p>
     * @param Phone <p>按照&quot;国家地区代码|手机号&quot;的格式输入。如: &quot;+86|xxxxxxxx&quot;</p>
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get <p>电子邮件</p> 
     * @return Email <p>电子邮件</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>电子邮件</p>
     * @param Email <p>电子邮件</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>用户生效时间，如:&quot;2021-09-22T00:00:00+00:00&quot;<br>生效、失效时间不填则用户长期有效</p> 
     * @return ValidateFrom <p>用户生效时间，如:&quot;2021-09-22T00:00:00+00:00&quot;<br>生效、失效时间不填则用户长期有效</p>
     */
    public String getValidateFrom() {
        return this.ValidateFrom;
    }

    /**
     * Set <p>用户生效时间，如:&quot;2021-09-22T00:00:00+00:00&quot;<br>生效、失效时间不填则用户长期有效</p>
     * @param ValidateFrom <p>用户生效时间，如:&quot;2021-09-22T00:00:00+00:00&quot;<br>生效、失效时间不填则用户长期有效</p>
     */
    public void setValidateFrom(String ValidateFrom) {
        this.ValidateFrom = ValidateFrom;
    }

    /**
     * Get <p>用户失效时间，如:&quot;2021-09-23T00:00:00+00:00&quot;<br>生效、失效时间不填则用户长期有效</p> 
     * @return ValidateTo <p>用户失效时间，如:&quot;2021-09-23T00:00:00+00:00&quot;<br>生效、失效时间不填则用户长期有效</p>
     */
    public String getValidateTo() {
        return this.ValidateTo;
    }

    /**
     * Set <p>用户失效时间，如:&quot;2021-09-23T00:00:00+00:00&quot;<br>生效、失效时间不填则用户长期有效</p>
     * @param ValidateTo <p>用户失效时间，如:&quot;2021-09-23T00:00:00+00:00&quot;<br>生效、失效时间不填则用户长期有效</p>
     */
    public void setValidateTo(String ValidateTo) {
        this.ValidateTo = ValidateTo;
    }

    /**
     * Get <p>所属用户组ID集合</p> 
     * @return GroupIdSet <p>所属用户组ID集合</p>
     */
    public Long [] getGroupIdSet() {
        return this.GroupIdSet;
    }

    /**
     * Set <p>所属用户组ID集合</p>
     * @param GroupIdSet <p>所属用户组ID集合</p>
     */
    public void setGroupIdSet(Long [] GroupIdSet) {
        this.GroupIdSet = GroupIdSet;
    }

    /**
     * Get <p>认证方式，0 - 本地，1 - LDAP，2 - OAuth 不传则默认为0</p> 
     * @return AuthType <p>认证方式，0 - 本地，1 - LDAP，2 - OAuth 不传则默认为0</p>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>认证方式，0 - 本地，1 - LDAP，2 - OAuth 不传则默认为0</p>
     * @param AuthType <p>认证方式，0 - 本地，1 - LDAP，2 - OAuth 不传则默认为0</p>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问</p> 
     * @return ValidateTime <p>访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问</p>
     */
    public String getValidateTime() {
        return this.ValidateTime;
    }

    /**
     * Set <p>访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问</p>
     * @param ValidateTime <p>访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问</p>
     */
    public void setValidateTime(String ValidateTime) {
        this.ValidateTime = ValidateTime;
    }

    /**
     * Get <p>用户所属部门的ID，如1.2.3</p> 
     * @return DepartmentId <p>用户所属部门的ID，如1.2.3</p>
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set <p>用户所属部门的ID，如1.2.3</p>
     * @param DepartmentId <p>用户所属部门的ID，如1.2.3</p>
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
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
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
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
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);

    }
}

