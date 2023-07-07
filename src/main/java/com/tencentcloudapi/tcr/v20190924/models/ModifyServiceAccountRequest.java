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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServiceAccountRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 服务级账号名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务级账号描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 有效期(单位：天)，从当前时间开始计算，优先级高于ExpiresAt
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 过期时间（时间戳，单位:毫秒）
    */
    @SerializedName("ExpiresAt")
    @Expose
    private Long ExpiresAt;

    /**
    * 是否禁用服务级账号
    */
    @SerializedName("Disable")
    @Expose
    private Boolean Disable;

    /**
    * 策略列表
    */
    @SerializedName("Permissions")
    @Expose
    private Permission [] Permissions;

    /**
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 服务级账号名 
     * @return Name 服务级账号名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务级账号名
     * @param Name 服务级账号名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 服务级账号描述 
     * @return Description 服务级账号描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 服务级账号描述
     * @param Description 服务级账号描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 有效期(单位：天)，从当前时间开始计算，优先级高于ExpiresAt 
     * @return Duration 有效期(单位：天)，从当前时间开始计算，优先级高于ExpiresAt
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 有效期(单位：天)，从当前时间开始计算，优先级高于ExpiresAt
     * @param Duration 有效期(单位：天)，从当前时间开始计算，优先级高于ExpiresAt
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 过期时间（时间戳，单位:毫秒） 
     * @return ExpiresAt 过期时间（时间戳，单位:毫秒）
     */
    public Long getExpiresAt() {
        return this.ExpiresAt;
    }

    /**
     * Set 过期时间（时间戳，单位:毫秒）
     * @param ExpiresAt 过期时间（时间戳，单位:毫秒）
     */
    public void setExpiresAt(Long ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
    }

    /**
     * Get 是否禁用服务级账号 
     * @return Disable 是否禁用服务级账号
     */
    public Boolean getDisable() {
        return this.Disable;
    }

    /**
     * Set 是否禁用服务级账号
     * @param Disable 是否禁用服务级账号
     */
    public void setDisable(Boolean Disable) {
        this.Disable = Disable;
    }

    /**
     * Get 策略列表 
     * @return Permissions 策略列表
     */
    public Permission [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 策略列表
     * @param Permissions 策略列表
     */
    public void setPermissions(Permission [] Permissions) {
        this.Permissions = Permissions;
    }

    public ModifyServiceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceAccountRequest(ModifyServiceAccountRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ExpiresAt != null) {
            this.ExpiresAt = new Long(source.ExpiresAt);
        }
        if (source.Disable != null) {
            this.Disable = new Boolean(source.Disable);
        }
        if (source.Permissions != null) {
            this.Permissions = new Permission[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new Permission(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ExpiresAt", this.ExpiresAt);
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamArrayObj(map, prefix + "Permissions.", this.Permissions);

    }
}

