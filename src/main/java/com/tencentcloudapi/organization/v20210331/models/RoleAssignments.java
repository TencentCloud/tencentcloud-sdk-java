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

public class RoleAssignments extends AbstractModel {

    /**
    * 权限配置ID。
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * 权限配置名称。
    */
    @SerializedName("RoleConfigurationName")
    @Expose
    private String RoleConfigurationName;

    /**
    * 集团账号目标账号的UIN。
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * CAM 用户同步的身份 ID。取值： 当PrincipalType取值为Group时，该值为CIC 用户组 ID（g-********）。 当PrincipalType取值为User时，该值为CIC 用户 ID（u-********）。
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * CAM 用户同步的身份类型。取值： User：表示该 CAM 用户同步的身份是CIC用户。 Group：表示该 CAM 用户同步的身份是CIC用户组。
    */
    @SerializedName("PrincipalType")
    @Expose
    private String PrincipalType;

    /**
    * 用户名称或者用户组名称
    */
    @SerializedName("PrincipalName")
    @Expose
    private String PrincipalName;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 集团账号目标账号的名称。
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
     * Get 权限配置ID。 
     * @return RoleConfigurationId 权限配置ID。
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set 权限配置ID。
     * @param RoleConfigurationId 权限配置ID。
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get 权限配置名称。 
     * @return RoleConfigurationName 权限配置名称。
     */
    public String getRoleConfigurationName() {
        return this.RoleConfigurationName;
    }

    /**
     * Set 权限配置名称。
     * @param RoleConfigurationName 权限配置名称。
     */
    public void setRoleConfigurationName(String RoleConfigurationName) {
        this.RoleConfigurationName = RoleConfigurationName;
    }

    /**
     * Get 集团账号目标账号的UIN。 
     * @return TargetUin 集团账号目标账号的UIN。
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 集团账号目标账号的UIN。
     * @param TargetUin 集团账号目标账号的UIN。
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号。 
     * @return TargetType 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号。
     * @param TargetType 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get CAM 用户同步的身份 ID。取值： 当PrincipalType取值为Group时，该值为CIC 用户组 ID（g-********）。 当PrincipalType取值为User时，该值为CIC 用户 ID（u-********）。 
     * @return PrincipalId CAM 用户同步的身份 ID。取值： 当PrincipalType取值为Group时，该值为CIC 用户组 ID（g-********）。 当PrincipalType取值为User时，该值为CIC 用户 ID（u-********）。
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set CAM 用户同步的身份 ID。取值： 当PrincipalType取值为Group时，该值为CIC 用户组 ID（g-********）。 当PrincipalType取值为User时，该值为CIC 用户 ID（u-********）。
     * @param PrincipalId CAM 用户同步的身份 ID。取值： 当PrincipalType取值为Group时，该值为CIC 用户组 ID（g-********）。 当PrincipalType取值为User时，该值为CIC 用户 ID（u-********）。
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get CAM 用户同步的身份类型。取值： User：表示该 CAM 用户同步的身份是CIC用户。 Group：表示该 CAM 用户同步的身份是CIC用户组。 
     * @return PrincipalType CAM 用户同步的身份类型。取值： User：表示该 CAM 用户同步的身份是CIC用户。 Group：表示该 CAM 用户同步的身份是CIC用户组。
     */
    public String getPrincipalType() {
        return this.PrincipalType;
    }

    /**
     * Set CAM 用户同步的身份类型。取值： User：表示该 CAM 用户同步的身份是CIC用户。 Group：表示该 CAM 用户同步的身份是CIC用户组。
     * @param PrincipalType CAM 用户同步的身份类型。取值： User：表示该 CAM 用户同步的身份是CIC用户。 Group：表示该 CAM 用户同步的身份是CIC用户组。
     */
    public void setPrincipalType(String PrincipalType) {
        this.PrincipalType = PrincipalType;
    }

    /**
     * Get 用户名称或者用户组名称 
     * @return PrincipalName 用户名称或者用户组名称
     */
    public String getPrincipalName() {
        return this.PrincipalName;
    }

    /**
     * Set 用户名称或者用户组名称
     * @param PrincipalName 用户名称或者用户组名称
     */
    public void setPrincipalName(String PrincipalName) {
        this.PrincipalName = PrincipalName;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。 
     * @return UpdateTime 更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
     * @param UpdateTime 更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 集团账号目标账号的名称。 
     * @return TargetName 集团账号目标账号的名称。
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 集团账号目标账号的名称。
     * @param TargetName 集团账号目标账号的名称。
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    public RoleAssignments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleAssignments(RoleAssignments source) {
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RoleConfigurationName != null) {
            this.RoleConfigurationName = new String(source.RoleConfigurationName);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.PrincipalType != null) {
            this.PrincipalType = new String(source.PrincipalType);
        }
        if (source.PrincipalName != null) {
            this.PrincipalName = new String(source.PrincipalName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RoleConfigurationName", this.RoleConfigurationName);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "PrincipalType", this.PrincipalType);
        this.setParamSimple(map, prefix + "PrincipalName", this.PrincipalName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);

    }
}

