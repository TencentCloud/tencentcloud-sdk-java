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

public class UserProvisioning extends AbstractModel {

    /**
    * CAM 用户同步的状态。取值：

Enabled：CAM 用户同步已启用。
Disabled：CAM 用户同步未启用。
    */
    @SerializedName("UserProvisioningId")
    @Expose
    private String UserProvisioningId;

    /**
    * 描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CAM 用户同步的状态。取值：
Enabled：CAM 用户同步已启用。
Disabled：CAM 用户同步未启用。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CAM 用户同步的身份 ID。取值：
当PrincipalType取值为Group时，该值为CIC用户组 ID（g-********）。
当PrincipalType取值为User时，该值为CIC用户 ID（u-********）。
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * CAM 用户同步的身份名称。取值：
当PrincipalType取值为Group时，该值为CIC用户组名称。
当PrincipalType取值为User时，该值为CIC用户名称。
    */
    @SerializedName("PrincipalName")
    @Expose
    private String PrincipalName;

    /**
    * CAM 用户同步的身份类型。取值：

User：表示该 CAM 用户同步的身份是CIC用户。
Group：表示该 CAM 用户同步的身份是CIC用户组。
    */
    @SerializedName("PrincipalType")
    @Expose
    private String PrincipalType;

    /**
    * 集团账号目标账号的UIN。
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * 集团账号目标账号的名称。
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 冲突策略。当CIC 用户同步到 CAM 时，如果 CAM 中存在同名用户时的处理策略。取值： KeepBoth：两者都保留。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则对CIC 用户的用户名添加后缀_cic后尝试创建该用户名的 CAM 用户。 TakeOver：替换。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则直接将已经存在的 CAM 用户替换为CIC 同步用户。
    */
    @SerializedName("DuplicationStrategy")
    @Expose
    private String DuplicationStrategy;

    /**
    * 删除策略。删除 CAM 用户同步时，对已同步的 CAM 用户的处理策略。取值： Delete：删除。删除 CAM 用户同步时，会删除从CIC 已经同步到 CAM 中的 CAM 用户。 Keep：保留。删除 RAM 用户同步时，会保留从CIC 已经同步到 CAM 中的 CAM 用户。
    */
    @SerializedName("DeletionStrategy")
    @Expose
    private String DeletionStrategy;

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
    * 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
     * Get CAM 用户同步的状态。取值：

Enabled：CAM 用户同步已启用。
Disabled：CAM 用户同步未启用。 
     * @return UserProvisioningId CAM 用户同步的状态。取值：

Enabled：CAM 用户同步已启用。
Disabled：CAM 用户同步未启用。
     */
    public String getUserProvisioningId() {
        return this.UserProvisioningId;
    }

    /**
     * Set CAM 用户同步的状态。取值：

Enabled：CAM 用户同步已启用。
Disabled：CAM 用户同步未启用。
     * @param UserProvisioningId CAM 用户同步的状态。取值：

Enabled：CAM 用户同步已启用。
Disabled：CAM 用户同步未启用。
     */
    public void setUserProvisioningId(String UserProvisioningId) {
        this.UserProvisioningId = UserProvisioningId;
    }

    /**
     * Get 描述。 
     * @return Description 描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。
     * @param Description 描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CAM 用户同步的状态。取值：
Enabled：CAM 用户同步已启用。
Disabled：CAM 用户同步未启用。 
     * @return Status CAM 用户同步的状态。取值：
Enabled：CAM 用户同步已启用。
Disabled：CAM 用户同步未启用。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set CAM 用户同步的状态。取值：
Enabled：CAM 用户同步已启用。
Disabled：CAM 用户同步未启用。
     * @param Status CAM 用户同步的状态。取值：
Enabled：CAM 用户同步已启用。
Disabled：CAM 用户同步未启用。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CAM 用户同步的身份 ID。取值：
当PrincipalType取值为Group时，该值为CIC用户组 ID（g-********）。
当PrincipalType取值为User时，该值为CIC用户 ID（u-********）。 
     * @return PrincipalId CAM 用户同步的身份 ID。取值：
当PrincipalType取值为Group时，该值为CIC用户组 ID（g-********）。
当PrincipalType取值为User时，该值为CIC用户 ID（u-********）。
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set CAM 用户同步的身份 ID。取值：
当PrincipalType取值为Group时，该值为CIC用户组 ID（g-********）。
当PrincipalType取值为User时，该值为CIC用户 ID（u-********）。
     * @param PrincipalId CAM 用户同步的身份 ID。取值：
当PrincipalType取值为Group时，该值为CIC用户组 ID（g-********）。
当PrincipalType取值为User时，该值为CIC用户 ID（u-********）。
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get CAM 用户同步的身份名称。取值：
当PrincipalType取值为Group时，该值为CIC用户组名称。
当PrincipalType取值为User时，该值为CIC用户名称。 
     * @return PrincipalName CAM 用户同步的身份名称。取值：
当PrincipalType取值为Group时，该值为CIC用户组名称。
当PrincipalType取值为User时，该值为CIC用户名称。
     */
    public String getPrincipalName() {
        return this.PrincipalName;
    }

    /**
     * Set CAM 用户同步的身份名称。取值：
当PrincipalType取值为Group时，该值为CIC用户组名称。
当PrincipalType取值为User时，该值为CIC用户名称。
     * @param PrincipalName CAM 用户同步的身份名称。取值：
当PrincipalType取值为Group时，该值为CIC用户组名称。
当PrincipalType取值为User时，该值为CIC用户名称。
     */
    public void setPrincipalName(String PrincipalName) {
        this.PrincipalName = PrincipalName;
    }

    /**
     * Get CAM 用户同步的身份类型。取值：

User：表示该 CAM 用户同步的身份是CIC用户。
Group：表示该 CAM 用户同步的身份是CIC用户组。 
     * @return PrincipalType CAM 用户同步的身份类型。取值：

User：表示该 CAM 用户同步的身份是CIC用户。
Group：表示该 CAM 用户同步的身份是CIC用户组。
     */
    public String getPrincipalType() {
        return this.PrincipalType;
    }

    /**
     * Set CAM 用户同步的身份类型。取值：

User：表示该 CAM 用户同步的身份是CIC用户。
Group：表示该 CAM 用户同步的身份是CIC用户组。
     * @param PrincipalType CAM 用户同步的身份类型。取值：

User：表示该 CAM 用户同步的身份是CIC用户。
Group：表示该 CAM 用户同步的身份是CIC用户组。
     */
    public void setPrincipalType(String PrincipalType) {
        this.PrincipalType = PrincipalType;
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

    /**
     * Get 冲突策略。当CIC 用户同步到 CAM 时，如果 CAM 中存在同名用户时的处理策略。取值： KeepBoth：两者都保留。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则对CIC 用户的用户名添加后缀_cic后尝试创建该用户名的 CAM 用户。 TakeOver：替换。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则直接将已经存在的 CAM 用户替换为CIC 同步用户。 
     * @return DuplicationStrategy 冲突策略。当CIC 用户同步到 CAM 时，如果 CAM 中存在同名用户时的处理策略。取值： KeepBoth：两者都保留。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则对CIC 用户的用户名添加后缀_cic后尝试创建该用户名的 CAM 用户。 TakeOver：替换。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则直接将已经存在的 CAM 用户替换为CIC 同步用户。
     */
    public String getDuplicationStrategy() {
        return this.DuplicationStrategy;
    }

    /**
     * Set 冲突策略。当CIC 用户同步到 CAM 时，如果 CAM 中存在同名用户时的处理策略。取值： KeepBoth：两者都保留。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则对CIC 用户的用户名添加后缀_cic后尝试创建该用户名的 CAM 用户。 TakeOver：替换。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则直接将已经存在的 CAM 用户替换为CIC 同步用户。
     * @param DuplicationStrategy 冲突策略。当CIC 用户同步到 CAM 时，如果 CAM 中存在同名用户时的处理策略。取值： KeepBoth：两者都保留。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则对CIC 用户的用户名添加后缀_cic后尝试创建该用户名的 CAM 用户。 TakeOver：替换。当CIC 用户被同步到 CAM 时，如果 CAM 已经存在同名用户，则直接将已经存在的 CAM 用户替换为CIC 同步用户。
     */
    public void setDuplicationStrategy(String DuplicationStrategy) {
        this.DuplicationStrategy = DuplicationStrategy;
    }

    /**
     * Get 删除策略。删除 CAM 用户同步时，对已同步的 CAM 用户的处理策略。取值： Delete：删除。删除 CAM 用户同步时，会删除从CIC 已经同步到 CAM 中的 CAM 用户。 Keep：保留。删除 RAM 用户同步时，会保留从CIC 已经同步到 CAM 中的 CAM 用户。 
     * @return DeletionStrategy 删除策略。删除 CAM 用户同步时，对已同步的 CAM 用户的处理策略。取值： Delete：删除。删除 CAM 用户同步时，会删除从CIC 已经同步到 CAM 中的 CAM 用户。 Keep：保留。删除 RAM 用户同步时，会保留从CIC 已经同步到 CAM 中的 CAM 用户。
     */
    public String getDeletionStrategy() {
        return this.DeletionStrategy;
    }

    /**
     * Set 删除策略。删除 CAM 用户同步时，对已同步的 CAM 用户的处理策略。取值： Delete：删除。删除 CAM 用户同步时，会删除从CIC 已经同步到 CAM 中的 CAM 用户。 Keep：保留。删除 RAM 用户同步时，会保留从CIC 已经同步到 CAM 中的 CAM 用户。
     * @param DeletionStrategy 删除策略。删除 CAM 用户同步时，对已同步的 CAM 用户的处理策略。取值： Delete：删除。删除 CAM 用户同步时，会删除从CIC 已经同步到 CAM 中的 CAM 用户。 Keep：保留。删除 RAM 用户同步时，会保留从CIC 已经同步到 CAM 中的 CAM 用户。
     */
    public void setDeletionStrategy(String DeletionStrategy) {
        this.DeletionStrategy = DeletionStrategy;
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
     * Get 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号 
     * @return TargetType 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     * @param TargetType 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    public UserProvisioning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserProvisioning(UserProvisioning source) {
        if (source.UserProvisioningId != null) {
            this.UserProvisioningId = new String(source.UserProvisioningId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.PrincipalName != null) {
            this.PrincipalName = new String(source.PrincipalName);
        }
        if (source.PrincipalType != null) {
            this.PrincipalType = new String(source.PrincipalType);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.DuplicationStrategy != null) {
            this.DuplicationStrategy = new String(source.DuplicationStrategy);
        }
        if (source.DeletionStrategy != null) {
            this.DeletionStrategy = new String(source.DeletionStrategy);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserProvisioningId", this.UserProvisioningId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "PrincipalName", this.PrincipalName);
        this.setParamSimple(map, prefix + "PrincipalType", this.PrincipalType);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "DuplicationStrategy", this.DuplicationStrategy);
        this.setParamSimple(map, prefix + "DeletionStrategy", this.DeletionStrategy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);

    }
}

