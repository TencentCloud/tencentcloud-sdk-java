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
    * <p>空间 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>权限配置 ID</p>
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * <p>新的权限配置描述。  长度：最大 1024 个字符。</p>
    */
    @SerializedName("NewDescription")
    @Expose
    private String NewDescription;

    /**
    * <p>新的会话持续时间。  CIC 用户使用权限配置访问集团账号目标账号时，会话最多保持的时间。  单位：秒。  取值范围：900-43200（15 分钟-12 小时）。</p>
    */
    @SerializedName("NewSessionDuration")
    @Expose
    private Long NewSessionDuration;

    /**
    * <p>新的初始访问页面。  CIC 用户使用权限配置访问集团账号目标账号时，初始访问的页面地址。  该页面必须是腾讯云控制台页面。</p>
    */
    @SerializedName("NewRelayState")
    @Expose
    private String NewRelayState;

    /**
    * <p>true=保存并应用（立即下发）；false/缺省=仅保存</p>
    */
    @SerializedName("IsApply")
    @Expose
    private Boolean IsApply;

    /**
     * Get <p>空间 ID</p> 
     * @return ZoneId <p>空间 ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>空间 ID</p>
     * @param ZoneId <p>空间 ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>权限配置 ID</p> 
     * @return RoleConfigurationId <p>权限配置 ID</p>
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set <p>权限配置 ID</p>
     * @param RoleConfigurationId <p>权限配置 ID</p>
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get <p>新的权限配置描述。  长度：最大 1024 个字符。</p> 
     * @return NewDescription <p>新的权限配置描述。  长度：最大 1024 个字符。</p>
     */
    public String getNewDescription() {
        return this.NewDescription;
    }

    /**
     * Set <p>新的权限配置描述。  长度：最大 1024 个字符。</p>
     * @param NewDescription <p>新的权限配置描述。  长度：最大 1024 个字符。</p>
     */
    public void setNewDescription(String NewDescription) {
        this.NewDescription = NewDescription;
    }

    /**
     * Get <p>新的会话持续时间。  CIC 用户使用权限配置访问集团账号目标账号时，会话最多保持的时间。  单位：秒。  取值范围：900-43200（15 分钟-12 小时）。</p> 
     * @return NewSessionDuration <p>新的会话持续时间。  CIC 用户使用权限配置访问集团账号目标账号时，会话最多保持的时间。  单位：秒。  取值范围：900-43200（15 分钟-12 小时）。</p>
     */
    public Long getNewSessionDuration() {
        return this.NewSessionDuration;
    }

    /**
     * Set <p>新的会话持续时间。  CIC 用户使用权限配置访问集团账号目标账号时，会话最多保持的时间。  单位：秒。  取值范围：900-43200（15 分钟-12 小时）。</p>
     * @param NewSessionDuration <p>新的会话持续时间。  CIC 用户使用权限配置访问集团账号目标账号时，会话最多保持的时间。  单位：秒。  取值范围：900-43200（15 分钟-12 小时）。</p>
     */
    public void setNewSessionDuration(Long NewSessionDuration) {
        this.NewSessionDuration = NewSessionDuration;
    }

    /**
     * Get <p>新的初始访问页面。  CIC 用户使用权限配置访问集团账号目标账号时，初始访问的页面地址。  该页面必须是腾讯云控制台页面。</p> 
     * @return NewRelayState <p>新的初始访问页面。  CIC 用户使用权限配置访问集团账号目标账号时，初始访问的页面地址。  该页面必须是腾讯云控制台页面。</p>
     */
    public String getNewRelayState() {
        return this.NewRelayState;
    }

    /**
     * Set <p>新的初始访问页面。  CIC 用户使用权限配置访问集团账号目标账号时，初始访问的页面地址。  该页面必须是腾讯云控制台页面。</p>
     * @param NewRelayState <p>新的初始访问页面。  CIC 用户使用权限配置访问集团账号目标账号时，初始访问的页面地址。  该页面必须是腾讯云控制台页面。</p>
     */
    public void setNewRelayState(String NewRelayState) {
        this.NewRelayState = NewRelayState;
    }

    /**
     * Get <p>true=保存并应用（立即下发）；false/缺省=仅保存</p> 
     * @return IsApply <p>true=保存并应用（立即下发）；false/缺省=仅保存</p>
     */
    public Boolean getIsApply() {
        return this.IsApply;
    }

    /**
     * Set <p>true=保存并应用（立即下发）；false/缺省=仅保存</p>
     * @param IsApply <p>true=保存并应用（立即下发）；false/缺省=仅保存</p>
     */
    public void setIsApply(Boolean IsApply) {
        this.IsApply = IsApply;
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
        if (source.IsApply != null) {
            this.IsApply = new Boolean(source.IsApply);
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
        this.setParamSimple(map, prefix + "IsApply", this.IsApply);

    }
}

