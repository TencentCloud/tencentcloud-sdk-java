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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleConfiguration extends AbstractModel {

    /**
    * 权限配置配置ID。
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * 权限配置配名称。
    */
    @SerializedName("RoleConfigurationName")
    @Expose
    private String RoleConfigurationName;

    /**
    * 权限配置的描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 会话持续时间。CIC 用户使用访问配置访问成员账号时，会话最多保持的时间。
单位：秒。
    */
    @SerializedName("SessionDuration")
    @Expose
    private Long SessionDuration;

    /**
    * 初始访问页面。CIC 用户使用访问配置访问成员账号时，初始访问的页面地址。
    */
    @SerializedName("RelayState")
    @Expose
    private String RelayState;

    /**
    * 权限配置的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 权限配置的更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 如果有入参FilterTargets查询成员账号是否配置过权限，配置了返回true，否则返回false。
    */
    @SerializedName("IsSelected")
    @Expose
    private Boolean IsSelected;

    /**
     * Get 权限配置配置ID。 
     * @return RoleConfigurationId 权限配置配置ID。
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set 权限配置配置ID。
     * @param RoleConfigurationId 权限配置配置ID。
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get 权限配置配名称。 
     * @return RoleConfigurationName 权限配置配名称。
     */
    public String getRoleConfigurationName() {
        return this.RoleConfigurationName;
    }

    /**
     * Set 权限配置配名称。
     * @param RoleConfigurationName 权限配置配名称。
     */
    public void setRoleConfigurationName(String RoleConfigurationName) {
        this.RoleConfigurationName = RoleConfigurationName;
    }

    /**
     * Get 权限配置的描述。 
     * @return Description 权限配置的描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 权限配置的描述。
     * @param Description 权限配置的描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 会话持续时间。CIC 用户使用访问配置访问成员账号时，会话最多保持的时间。
单位：秒。 
     * @return SessionDuration 会话持续时间。CIC 用户使用访问配置访问成员账号时，会话最多保持的时间。
单位：秒。
     */
    public Long getSessionDuration() {
        return this.SessionDuration;
    }

    /**
     * Set 会话持续时间。CIC 用户使用访问配置访问成员账号时，会话最多保持的时间。
单位：秒。
     * @param SessionDuration 会话持续时间。CIC 用户使用访问配置访问成员账号时，会话最多保持的时间。
单位：秒。
     */
    public void setSessionDuration(Long SessionDuration) {
        this.SessionDuration = SessionDuration;
    }

    /**
     * Get 初始访问页面。CIC 用户使用访问配置访问成员账号时，初始访问的页面地址。 
     * @return RelayState 初始访问页面。CIC 用户使用访问配置访问成员账号时，初始访问的页面地址。
     */
    public String getRelayState() {
        return this.RelayState;
    }

    /**
     * Set 初始访问页面。CIC 用户使用访问配置访问成员账号时，初始访问的页面地址。
     * @param RelayState 初始访问页面。CIC 用户使用访问配置访问成员账号时，初始访问的页面地址。
     */
    public void setRelayState(String RelayState) {
        this.RelayState = RelayState;
    }

    /**
     * Get 权限配置的创建时间。 
     * @return CreateTime 权限配置的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 权限配置的创建时间。
     * @param CreateTime 权限配置的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 权限配置的更新时间。 
     * @return UpdateTime 权限配置的更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 权限配置的更新时间。
     * @param UpdateTime 权限配置的更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 如果有入参FilterTargets查询成员账号是否配置过权限，配置了返回true，否则返回false。 
     * @return IsSelected 如果有入参FilterTargets查询成员账号是否配置过权限，配置了返回true，否则返回false。
     */
    public Boolean getIsSelected() {
        return this.IsSelected;
    }

    /**
     * Set 如果有入参FilterTargets查询成员账号是否配置过权限，配置了返回true，否则返回false。
     * @param IsSelected 如果有入参FilterTargets查询成员账号是否配置过权限，配置了返回true，否则返回false。
     */
    public void setIsSelected(Boolean IsSelected) {
        this.IsSelected = IsSelected;
    }

    public RoleConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleConfiguration(RoleConfiguration source) {
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RoleConfigurationName != null) {
            this.RoleConfigurationName = new String(source.RoleConfigurationName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SessionDuration != null) {
            this.SessionDuration = new Long(source.SessionDuration);
        }
        if (source.RelayState != null) {
            this.RelayState = new String(source.RelayState);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsSelected != null) {
            this.IsSelected = new Boolean(source.IsSelected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RoleConfigurationName", this.RoleConfigurationName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SessionDuration", this.SessionDuration);
        this.setParamSimple(map, prefix + "RelayState", this.RelayState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsSelected", this.IsSelected);

    }
}

