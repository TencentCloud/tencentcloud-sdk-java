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
package com.tencentcloudapi.evt.v20250217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoleUserRequest extends AbstractModel {

    /**
    * <p>自定义角色体系的ID</p><p>角色体系ID</p>
    */
    @SerializedName("RoleSystemId")
    @Expose
    private Long RoleSystemId;

    /**
    * <p>要添加的自定义用户ID，建议与腾讯云-子用户的用户名称保持一致</p><p>人员ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>自定义用户的名称</p><p>人员名称</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>是否启用当前用户</p>枚举值：<ul><li> 1： 启用</li><li> 2： 禁用</li></ul><p>是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * <p>自定义用户的手机号</p><p>手机号</p>
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * <p>自定义用户的身份属性列表</p><p>属性列表</p>
    */
    @SerializedName("Attributes")
    @Expose
    private UserAttribute [] Attributes;

    /**
    * <p>自定义用户与腾讯云-子用户关联，如果不传默认按照子用户名称进行匹配</p>
    */
    @SerializedName("TencentUin")
    @Expose
    private Long TencentUin;

    /**
     * Get <p>自定义角色体系的ID</p><p>角色体系ID</p> 
     * @return RoleSystemId <p>自定义角色体系的ID</p><p>角色体系ID</p>
     */
    public Long getRoleSystemId() {
        return this.RoleSystemId;
    }

    /**
     * Set <p>自定义角色体系的ID</p><p>角色体系ID</p>
     * @param RoleSystemId <p>自定义角色体系的ID</p><p>角色体系ID</p>
     */
    public void setRoleSystemId(Long RoleSystemId) {
        this.RoleSystemId = RoleSystemId;
    }

    /**
     * Get <p>要添加的自定义用户ID，建议与腾讯云-子用户的用户名称保持一致</p><p>人员ID</p> 
     * @return UserId <p>要添加的自定义用户ID，建议与腾讯云-子用户的用户名称保持一致</p><p>人员ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>要添加的自定义用户ID，建议与腾讯云-子用户的用户名称保持一致</p><p>人员ID</p>
     * @param UserId <p>要添加的自定义用户ID，建议与腾讯云-子用户的用户名称保持一致</p><p>人员ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>自定义用户的名称</p><p>人员名称</p> 
     * @return Username <p>自定义用户的名称</p><p>人员名称</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>自定义用户的名称</p><p>人员名称</p>
     * @param Username <p>自定义用户的名称</p><p>人员名称</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>是否启用当前用户</p>枚举值：<ul><li> 1： 启用</li><li> 2： 禁用</li></ul><p>是否启用</p> 
     * @return Enabled <p>是否启用当前用户</p>枚举值：<ul><li> 1： 启用</li><li> 2： 禁用</li></ul><p>是否启用</p>
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用当前用户</p>枚举值：<ul><li> 1： 启用</li><li> 2： 禁用</li></ul><p>是否启用</p>
     * @param Enabled <p>是否启用当前用户</p>枚举值：<ul><li> 1： 启用</li><li> 2： 禁用</li></ul><p>是否启用</p>
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>自定义用户的手机号</p><p>手机号</p> 
     * @return Phone <p>自定义用户的手机号</p><p>手机号</p>
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set <p>自定义用户的手机号</p><p>手机号</p>
     * @param Phone <p>自定义用户的手机号</p><p>手机号</p>
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get <p>自定义用户的身份属性列表</p><p>属性列表</p> 
     * @return Attributes <p>自定义用户的身份属性列表</p><p>属性列表</p>
     */
    public UserAttribute [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set <p>自定义用户的身份属性列表</p><p>属性列表</p>
     * @param Attributes <p>自定义用户的身份属性列表</p><p>属性列表</p>
     */
    public void setAttributes(UserAttribute [] Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get <p>自定义用户与腾讯云-子用户关联，如果不传默认按照子用户名称进行匹配</p> 
     * @return TencentUin <p>自定义用户与腾讯云-子用户关联，如果不传默认按照子用户名称进行匹配</p>
     */
    public Long getTencentUin() {
        return this.TencentUin;
    }

    /**
     * Set <p>自定义用户与腾讯云-子用户关联，如果不传默认按照子用户名称进行匹配</p>
     * @param TencentUin <p>自定义用户与腾讯云-子用户关联，如果不传默认按照子用户名称进行匹配</p>
     */
    public void setTencentUin(Long TencentUin) {
        this.TencentUin = TencentUin;
    }

    public CreateRoleUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoleUserRequest(CreateRoleUserRequest source) {
        if (source.RoleSystemId != null) {
            this.RoleSystemId = new Long(source.RoleSystemId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Attributes != null) {
            this.Attributes = new UserAttribute[source.Attributes.length];
            for (int i = 0; i < source.Attributes.length; i++) {
                this.Attributes[i] = new UserAttribute(source.Attributes[i]);
            }
        }
        if (source.TencentUin != null) {
            this.TencentUin = new Long(source.TencentUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleSystemId", this.RoleSystemId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamArrayObj(map, prefix + "Attributes.", this.Attributes);
        this.setParamSimple(map, prefix + "TencentUin", this.TencentUin);

    }
}

