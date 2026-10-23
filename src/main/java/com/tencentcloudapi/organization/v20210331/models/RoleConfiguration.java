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

public class RoleConfiguration extends AbstractModel {

    /**
    * <p>权限配置配置ID。</p>
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * <p>权限配置配名称。</p>
    */
    @SerializedName("RoleConfigurationName")
    @Expose
    private String RoleConfigurationName;

    /**
    * <p>权限配置的描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>会话持续时间。CIC 用户使用访问配置访问成员账号时，会话最多保持的时间。<br>单位：秒。</p>
    */
    @SerializedName("SessionDuration")
    @Expose
    private Long SessionDuration;

    /**
    * <p>初始访问页面。CIC 用户使用访问配置访问成员账号时，初始访问的页面地址。</p>
    */
    @SerializedName("RelayState")
    @Expose
    private String RelayState;

    /**
    * <p>权限配置的创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>权限配置的更新时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>如果有入参FilterTargets查询成员账号是否配置过权限，配置了返回true，否则返回false。</p>
    */
    @SerializedName("IsSelected")
    @Expose
    private Boolean IsSelected;

    /**
    * <p>会话时长应用状态</p><p>枚举值：</p><ul><li>Success： 全部账号应用成功</li><li>Failed： 存在失败账号</li><li>Applying： 任务在途</li><li>Unknown： 已部署账号超查询上限</li></ul>
    */
    @SerializedName("ApplyStatus")
    @Expose
    private String ApplyStatus;

    /**
    * <p>当前已真实下发到 CAM 的会话时长</p><p>取值范围：[900, 43200]</p><p>单位：秒</p>
    */
    @SerializedName("AppliedSessionDuration")
    @Expose
    private Long AppliedSessionDuration;

    /**
    * <p>最近一次成功下发时间</p><p>参数格式： YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("SessionDurationUpdateTime")
    @Expose
    private String SessionDurationUpdateTime;

    /**
    * <p>未成功应用的账号明细</p><p>仅 Failed 态返回</p>
    */
    @SerializedName("FailedAccounts")
    @Expose
    private FailedAccount [] FailedAccounts;

    /**
     * Get <p>权限配置配置ID。</p> 
     * @return RoleConfigurationId <p>权限配置配置ID。</p>
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set <p>权限配置配置ID。</p>
     * @param RoleConfigurationId <p>权限配置配置ID。</p>
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get <p>权限配置配名称。</p> 
     * @return RoleConfigurationName <p>权限配置配名称。</p>
     */
    public String getRoleConfigurationName() {
        return this.RoleConfigurationName;
    }

    /**
     * Set <p>权限配置配名称。</p>
     * @param RoleConfigurationName <p>权限配置配名称。</p>
     */
    public void setRoleConfigurationName(String RoleConfigurationName) {
        this.RoleConfigurationName = RoleConfigurationName;
    }

    /**
     * Get <p>权限配置的描述。</p> 
     * @return Description <p>权限配置的描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>权限配置的描述。</p>
     * @param Description <p>权限配置的描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>会话持续时间。CIC 用户使用访问配置访问成员账号时，会话最多保持的时间。<br>单位：秒。</p> 
     * @return SessionDuration <p>会话持续时间。CIC 用户使用访问配置访问成员账号时，会话最多保持的时间。<br>单位：秒。</p>
     */
    public Long getSessionDuration() {
        return this.SessionDuration;
    }

    /**
     * Set <p>会话持续时间。CIC 用户使用访问配置访问成员账号时，会话最多保持的时间。<br>单位：秒。</p>
     * @param SessionDuration <p>会话持续时间。CIC 用户使用访问配置访问成员账号时，会话最多保持的时间。<br>单位：秒。</p>
     */
    public void setSessionDuration(Long SessionDuration) {
        this.SessionDuration = SessionDuration;
    }

    /**
     * Get <p>初始访问页面。CIC 用户使用访问配置访问成员账号时，初始访问的页面地址。</p> 
     * @return RelayState <p>初始访问页面。CIC 用户使用访问配置访问成员账号时，初始访问的页面地址。</p>
     */
    public String getRelayState() {
        return this.RelayState;
    }

    /**
     * Set <p>初始访问页面。CIC 用户使用访问配置访问成员账号时，初始访问的页面地址。</p>
     * @param RelayState <p>初始访问页面。CIC 用户使用访问配置访问成员账号时，初始访问的页面地址。</p>
     */
    public void setRelayState(String RelayState) {
        this.RelayState = RelayState;
    }

    /**
     * Get <p>权限配置的创建时间。</p> 
     * @return CreateTime <p>权限配置的创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>权限配置的创建时间。</p>
     * @param CreateTime <p>权限配置的创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>权限配置的更新时间。</p> 
     * @return UpdateTime <p>权限配置的更新时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>权限配置的更新时间。</p>
     * @param UpdateTime <p>权限配置的更新时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>如果有入参FilterTargets查询成员账号是否配置过权限，配置了返回true，否则返回false。</p> 
     * @return IsSelected <p>如果有入参FilterTargets查询成员账号是否配置过权限，配置了返回true，否则返回false。</p>
     */
    public Boolean getIsSelected() {
        return this.IsSelected;
    }

    /**
     * Set <p>如果有入参FilterTargets查询成员账号是否配置过权限，配置了返回true，否则返回false。</p>
     * @param IsSelected <p>如果有入参FilterTargets查询成员账号是否配置过权限，配置了返回true，否则返回false。</p>
     */
    public void setIsSelected(Boolean IsSelected) {
        this.IsSelected = IsSelected;
    }

    /**
     * Get <p>会话时长应用状态</p><p>枚举值：</p><ul><li>Success： 全部账号应用成功</li><li>Failed： 存在失败账号</li><li>Applying： 任务在途</li><li>Unknown： 已部署账号超查询上限</li></ul> 
     * @return ApplyStatus <p>会话时长应用状态</p><p>枚举值：</p><ul><li>Success： 全部账号应用成功</li><li>Failed： 存在失败账号</li><li>Applying： 任务在途</li><li>Unknown： 已部署账号超查询上限</li></ul>
     */
    public String getApplyStatus() {
        return this.ApplyStatus;
    }

    /**
     * Set <p>会话时长应用状态</p><p>枚举值：</p><ul><li>Success： 全部账号应用成功</li><li>Failed： 存在失败账号</li><li>Applying： 任务在途</li><li>Unknown： 已部署账号超查询上限</li></ul>
     * @param ApplyStatus <p>会话时长应用状态</p><p>枚举值：</p><ul><li>Success： 全部账号应用成功</li><li>Failed： 存在失败账号</li><li>Applying： 任务在途</li><li>Unknown： 已部署账号超查询上限</li></ul>
     */
    public void setApplyStatus(String ApplyStatus) {
        this.ApplyStatus = ApplyStatus;
    }

    /**
     * Get <p>当前已真实下发到 CAM 的会话时长</p><p>取值范围：[900, 43200]</p><p>单位：秒</p> 
     * @return AppliedSessionDuration <p>当前已真实下发到 CAM 的会话时长</p><p>取值范围：[900, 43200]</p><p>单位：秒</p>
     */
    public Long getAppliedSessionDuration() {
        return this.AppliedSessionDuration;
    }

    /**
     * Set <p>当前已真实下发到 CAM 的会话时长</p><p>取值范围：[900, 43200]</p><p>单位：秒</p>
     * @param AppliedSessionDuration <p>当前已真实下发到 CAM 的会话时长</p><p>取值范围：[900, 43200]</p><p>单位：秒</p>
     */
    public void setAppliedSessionDuration(Long AppliedSessionDuration) {
        this.AppliedSessionDuration = AppliedSessionDuration;
    }

    /**
     * Get <p>最近一次成功下发时间</p><p>参数格式： YYYY-MM-DD hh:mm:ss</p> 
     * @return SessionDurationUpdateTime <p>最近一次成功下发时间</p><p>参数格式： YYYY-MM-DD hh:mm:ss</p>
     */
    public String getSessionDurationUpdateTime() {
        return this.SessionDurationUpdateTime;
    }

    /**
     * Set <p>最近一次成功下发时间</p><p>参数格式： YYYY-MM-DD hh:mm:ss</p>
     * @param SessionDurationUpdateTime <p>最近一次成功下发时间</p><p>参数格式： YYYY-MM-DD hh:mm:ss</p>
     */
    public void setSessionDurationUpdateTime(String SessionDurationUpdateTime) {
        this.SessionDurationUpdateTime = SessionDurationUpdateTime;
    }

    /**
     * Get <p>未成功应用的账号明细</p><p>仅 Failed 态返回</p> 
     * @return FailedAccounts <p>未成功应用的账号明细</p><p>仅 Failed 态返回</p>
     */
    public FailedAccount [] getFailedAccounts() {
        return this.FailedAccounts;
    }

    /**
     * Set <p>未成功应用的账号明细</p><p>仅 Failed 态返回</p>
     * @param FailedAccounts <p>未成功应用的账号明细</p><p>仅 Failed 态返回</p>
     */
    public void setFailedAccounts(FailedAccount [] FailedAccounts) {
        this.FailedAccounts = FailedAccounts;
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
        if (source.ApplyStatus != null) {
            this.ApplyStatus = new String(source.ApplyStatus);
        }
        if (source.AppliedSessionDuration != null) {
            this.AppliedSessionDuration = new Long(source.AppliedSessionDuration);
        }
        if (source.SessionDurationUpdateTime != null) {
            this.SessionDurationUpdateTime = new String(source.SessionDurationUpdateTime);
        }
        if (source.FailedAccounts != null) {
            this.FailedAccounts = new FailedAccount[source.FailedAccounts.length];
            for (int i = 0; i < source.FailedAccounts.length; i++) {
                this.FailedAccounts[i] = new FailedAccount(source.FailedAccounts[i]);
            }
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
        this.setParamSimple(map, prefix + "ApplyStatus", this.ApplyStatus);
        this.setParamSimple(map, prefix + "AppliedSessionDuration", this.AppliedSessionDuration);
        this.setParamSimple(map, prefix + "SessionDurationUpdateTime", this.SessionDurationUpdateTime);
        this.setParamArrayObj(map, prefix + "FailedAccounts.", this.FailedAccounts);

    }
}

