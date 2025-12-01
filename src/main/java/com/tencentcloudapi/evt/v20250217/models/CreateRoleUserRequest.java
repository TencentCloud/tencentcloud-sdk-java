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
    * 角色体系ID
    */
    @SerializedName("RoleSystemId")
    @Expose
    private Long RoleSystemId;

    /**
    * 人员ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 人员名称
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * 手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 属性列表
    */
    @SerializedName("Attributes")
    @Expose
    private UserAttribute [] Attributes;

    /**
     * Get 角色体系ID 
     * @return RoleSystemId 角色体系ID
     */
    public Long getRoleSystemId() {
        return this.RoleSystemId;
    }

    /**
     * Set 角色体系ID
     * @param RoleSystemId 角色体系ID
     */
    public void setRoleSystemId(Long RoleSystemId) {
        this.RoleSystemId = RoleSystemId;
    }

    /**
     * Get 人员ID 
     * @return UserId 人员ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 人员ID
     * @param UserId 人员ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 人员名称 
     * @return Username 人员名称
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 人员名称
     * @param Username 人员名称
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 手机号 
     * @return Phone 手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号
     * @param Phone 手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 属性列表 
     * @return Attributes 属性列表
     */
    public UserAttribute [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set 属性列表
     * @param Attributes 属性列表
     */
    public void setAttributes(UserAttribute [] Attributes) {
        this.Attributes = Attributes;
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

    }
}

