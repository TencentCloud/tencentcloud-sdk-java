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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleSignOnEmployees extends AbstractModel {

    /**
    * 用户在idp分配的唯一值，需要保持跟在电子签应用集成->单点登录配置->端点配置中配置的。
如下图配置![image](https://qcloudimg.tencent-cloud.cn/raw/6ff22248c930b2a7684322cac9401a9c.png)。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 企业员工姓名。 员工的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
注：`创建和更新场景无需填写。`
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户邮箱。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 员工角色信息。
此处roleId为电子签配置的 RoleId，可通过接口[查询企业角色列表](https://qian.tencent.com/developers/companyApis/roles/DescribeIntegrationRoles) 获取
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * 员工是否实名。
    */
    @SerializedName("IsVerified")
    @Expose
    private Boolean IsVerified;

    /**
    * 员工创建时间戳，单位秒。
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
     * Get 用户在idp分配的唯一值，需要保持跟在电子签应用集成->单点登录配置->端点配置中配置的。
如下图配置![image](https://qcloudimg.tencent-cloud.cn/raw/6ff22248c930b2a7684322cac9401a9c.png)。 
     * @return OpenId 用户在idp分配的唯一值，需要保持跟在电子签应用集成->单点登录配置->端点配置中配置的。
如下图配置![image](https://qcloudimg.tencent-cloud.cn/raw/6ff22248c930b2a7684322cac9401a9c.png)。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户在idp分配的唯一值，需要保持跟在电子签应用集成->单点登录配置->端点配置中配置的。
如下图配置![image](https://qcloudimg.tencent-cloud.cn/raw/6ff22248c930b2a7684322cac9401a9c.png)。
     * @param OpenId 用户在idp分配的唯一值，需要保持跟在电子签应用集成->单点登录配置->端点配置中配置的。
如下图配置![image](https://qcloudimg.tencent-cloud.cn/raw/6ff22248c930b2a7684322cac9401a9c.png)。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 企业员工姓名。 员工的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。	 
     * @return Name 企业员工姓名。 员工的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。	
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 企业员工姓名。 员工的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。	
     * @param Name 企业员工姓名。 员工的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。	
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。 
     * @return Mobile 用户手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 用户手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。
     * @param Mobile 用户手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
注：`创建和更新场景无需填写。` 
     * @return UserId 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
注：`创建和更新场景无需填写。`
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
注：`创建和更新场景无需填写。`
     * @param UserId 员工在腾讯电子签平台的唯一身份标识，为32位字符串。
注：`创建和更新场景无需填写。`
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户邮箱。 
     * @return Email 用户邮箱。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 用户邮箱。
     * @param Email 用户邮箱。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 员工角色信息。
此处roleId为电子签配置的 RoleId，可通过接口[查询企业角色列表](https://qian.tencent.com/developers/companyApis/roles/DescribeIntegrationRoles) 获取 
     * @return RoleIds 员工角色信息。
此处roleId为电子签配置的 RoleId，可通过接口[查询企业角色列表](https://qian.tencent.com/developers/companyApis/roles/DescribeIntegrationRoles) 获取
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set 员工角色信息。
此处roleId为电子签配置的 RoleId，可通过接口[查询企业角色列表](https://qian.tencent.com/developers/companyApis/roles/DescribeIntegrationRoles) 获取
     * @param RoleIds 员工角色信息。
此处roleId为电子签配置的 RoleId，可通过接口[查询企业角色列表](https://qian.tencent.com/developers/companyApis/roles/DescribeIntegrationRoles) 获取
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    /**
     * Get 员工是否实名。 
     * @return IsVerified 员工是否实名。
     */
    public Boolean getIsVerified() {
        return this.IsVerified;
    }

    /**
     * Set 员工是否实名。
     * @param IsVerified 员工是否实名。
     */
    public void setIsVerified(Boolean IsVerified) {
        this.IsVerified = IsVerified;
    }

    /**
     * Get 员工创建时间戳，单位秒。 
     * @return CreatedOn 员工创建时间戳，单位秒。
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 员工创建时间戳，单位秒。
     * @param CreatedOn 员工创建时间戳，单位秒。
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    public SingleSignOnEmployees() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SingleSignOnEmployees(SingleSignOnEmployees source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
        if (source.IsVerified != null) {
            this.IsVerified = new Boolean(source.IsVerified);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamSimple(map, prefix + "IsVerified", this.IsVerified);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);

    }
}

