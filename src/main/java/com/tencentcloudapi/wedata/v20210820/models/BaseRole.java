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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseRole extends AbstractModel {

    /**
    * 角色id
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 角色昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 角色类型, 分为System,Tenant,Project,Commercial
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * 系统预设
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemDefault")
    @Expose
    private Boolean SystemDefault;

    /**
    * 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 成员统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * 权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privileges")
    @Expose
    private RolePrivilege [] Privileges;

    /**
    * 操作者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private BaseUser Operator;

    /**
    * 操作时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateTime")
    @Expose
    private Long OperateTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTimeStr")
    @Expose
    private String CreateTimeStr;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTimeStr")
    @Expose
    private String UpdateTimeStr;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
     * Get 角色id 
     * @return RoleId 角色id
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色id
     * @param RoleId 角色id
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 角色名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleName 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleName 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 角色昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 角色昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 角色昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 角色昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 角色类型, 分为System,Tenant,Project,Commercial
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleType 角色类型, 分为System,Tenant,Project,Commercial
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set 角色类型, 分为System,Tenant,Project,Commercial
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleType 角色类型, 分为System,Tenant,Project,Commercial
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get 系统预设
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemDefault 系统预设
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSystemDefault() {
        return this.SystemDefault;
    }

    /**
     * Set 系统预设
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemDefault 系统预设
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemDefault(Boolean SystemDefault) {
        this.SystemDefault = SystemDefault;
    }

    /**
     * Get 自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Parameters 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Parameters 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 成员统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberCount 成员统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set 成员统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberCount 成员统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get 权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Privileges 权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RolePrivilege [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Privileges 权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivileges(RolePrivilege [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get 操作者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 操作者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseUser getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 操作者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(BaseUser Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 操作时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateTime 操作时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperateTime() {
        return this.OperateTime;
    }

    /**
     * Set 操作时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateTime 操作时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateTime(Long OperateTime) {
        this.OperateTime = OperateTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTimeStr 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTimeStr() {
        return this.CreateTimeStr;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTimeStr 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTimeStr(String CreateTimeStr) {
        this.CreateTimeStr = CreateTimeStr;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTimeStr 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTimeStr() {
        return this.UpdateTimeStr;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTimeStr 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTimeStr(String UpdateTimeStr) {
        this.UpdateTimeStr = UpdateTimeStr;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    public BaseRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseRole(BaseRole source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.SystemDefault != null) {
            this.SystemDefault = new Boolean(source.SystemDefault);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.Privileges != null) {
            this.Privileges = new RolePrivilege[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new RolePrivilege(source.Privileges[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new BaseUser(source.Operator);
        }
        if (source.OperateTime != null) {
            this.OperateTime = new Long(source.OperateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.CreateTimeStr != null) {
            this.CreateTimeStr = new String(source.CreateTimeStr);
        }
        if (source.UpdateTimeStr != null) {
            this.UpdateTimeStr = new String(source.UpdateTimeStr);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "SystemDefault", this.SystemDefault);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamArrayObj(map, prefix + "Privileges.", this.Privileges);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "OperateTime", this.OperateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateTimeStr", this.CreateTimeStr);
        this.setParamSimple(map, prefix + "UpdateTimeStr", this.UpdateTimeStr);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);

    }
}

