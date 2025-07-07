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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRoleConfigurationRequest extends AbstractModel {

    /**
    * 空间 ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 权限配置 ID
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * 新的权限配置描述。  长度：最大 1024 个字符。
    */
    @SerializedName("NewDescription")
    @Expose
    private String NewDescription;

    /**
    * 新的会话持续时间。  CIC 用户使用权限配置访问集团账号目标账号时，会话最多保持的时间。  单位：秒。  取值范围：900-43200（15 分钟-12 小时）。
    */
    @SerializedName("NewSessionDuration")
    @Expose
    private Long NewSessionDuration;

    /**
    * 新的初始访问页面。  CIC 用户使用权限配置访问集团账号目标账号时，初始访问的页面地址。  该页面必须是腾讯云控制台页面。
    */
    @SerializedName("NewRelayState")
    @Expose
    private String NewRelayState;

    /**
     * Get 空间 ID 
     * @return ZoneId 空间 ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间 ID
     * @param ZoneId 空间 ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 权限配置 ID 
     * @return RoleConfigurationId 权限配置 ID
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set 权限配置 ID
     * @param RoleConfigurationId 权限配置 ID
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get 新的权限配置描述。  长度：最大 1024 个字符。 
     * @return NewDescription 新的权限配置描述。  长度：最大 1024 个字符。
     */
    public String getNewDescription() {
        return this.NewDescription;
    }

    /**
     * Set 新的权限配置描述。  长度：最大 1024 个字符。
     * @param NewDescription 新的权限配置描述。  长度：最大 1024 个字符。
     */
    public void setNewDescription(String NewDescription) {
        this.NewDescription = NewDescription;
    }

    /**
     * Get 新的会话持续时间。  CIC 用户使用权限配置访问集团账号目标账号时，会话最多保持的时间。  单位：秒。  取值范围：900-43200（15 分钟-12 小时）。 
     * @return NewSessionDuration 新的会话持续时间。  CIC 用户使用权限配置访问集团账号目标账号时，会话最多保持的时间。  单位：秒。  取值范围：900-43200（15 分钟-12 小时）。
     */
    public Long getNewSessionDuration() {
        return this.NewSessionDuration;
    }

    /**
     * Set 新的会话持续时间。  CIC 用户使用权限配置访问集团账号目标账号时，会话最多保持的时间。  单位：秒。  取值范围：900-43200（15 分钟-12 小时）。
     * @param NewSessionDuration 新的会话持续时间。  CIC 用户使用权限配置访问集团账号目标账号时，会话最多保持的时间。  单位：秒。  取值范围：900-43200（15 分钟-12 小时）。
     */
    public void setNewSessionDuration(Long NewSessionDuration) {
        this.NewSessionDuration = NewSessionDuration;
    }

    /**
     * Get 新的初始访问页面。  CIC 用户使用权限配置访问集团账号目标账号时，初始访问的页面地址。  该页面必须是腾讯云控制台页面。 
     * @return NewRelayState 新的初始访问页面。  CIC 用户使用权限配置访问集团账号目标账号时，初始访问的页面地址。  该页面必须是腾讯云控制台页面。
     */
    public String getNewRelayState() {
        return this.NewRelayState;
    }

    /**
     * Set 新的初始访问页面。  CIC 用户使用权限配置访问集团账号目标账号时，初始访问的页面地址。  该页面必须是腾讯云控制台页面。
     * @param NewRelayState 新的初始访问页面。  CIC 用户使用权限配置访问集团账号目标账号时，初始访问的页面地址。  该页面必须是腾讯云控制台页面。
     */
    public void setNewRelayState(String NewRelayState) {
        this.NewRelayState = NewRelayState;
    }

    public UpdateRoleConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRoleConfigurationRequest(UpdateRoleConfigurationRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.NewDescription != null) {
            this.NewDescription = new String(source.NewDescription);
        }
        if (source.NewSessionDuration != null) {
            this.NewSessionDuration = new Long(source.NewSessionDuration);
        }
        if (source.NewRelayState != null) {
            this.NewRelayState = new String(source.NewRelayState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "NewDescription", this.NewDescription);
        this.setParamSimple(map, prefix + "NewSessionDuration", this.NewSessionDuration);
        this.setParamSimple(map, prefix + "NewRelayState", this.NewRelayState);

    }
}

