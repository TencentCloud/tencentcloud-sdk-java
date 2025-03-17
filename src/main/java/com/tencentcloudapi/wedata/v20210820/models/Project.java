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

public class Project extends AbstractModel {

    /**
    * 项目的所在租户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目标识，英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目显示名称，可以为中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 创建者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private BaseUser Creator;

    /**
    * 租户信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tenant")
    @Expose
    private BaseTenant Tenant;

    /**
    * 项目的管理员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminUsers")
    @Expose
    private BaseUser [] AdminUsers;

    /**
    * 项目关联的集群信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Clusters")
    @Expose
    private BaseClusterInfo [] Clusters;

    /**
    * 项目的额外配置参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 项目状态：0：禁用，1：启用，-3:禁用中，2：启用中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 项目类型，SIMPLE：简单模式 STANDARD：标准模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 二级菜单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondModuleList")
    @Expose
    private String [] SecondModuleList;

    /**
    * 项目负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private BaseUser Owner;

    /**
     * Get 项目的所在租户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 项目的所在租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 项目的所在租户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 项目的所在租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
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
     * Get 项目标识，英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目标识，英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目标识，英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目标识，英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目显示名称，可以为中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 项目显示名称，可以为中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 项目显示名称，可以为中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 项目显示名称，可以为中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseUser getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(BaseUser Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 租户信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tenant 租户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseTenant getTenant() {
        return this.Tenant;
    }

    /**
     * Set 租户信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tenant 租户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenant(BaseTenant Tenant) {
        this.Tenant = Tenant;
    }

    /**
     * Get 项目的管理员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminUsers 项目的管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseUser [] getAdminUsers() {
        return this.AdminUsers;
    }

    /**
     * Set 项目的管理员
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminUsers 项目的管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminUsers(BaseUser [] AdminUsers) {
        this.AdminUsers = AdminUsers;
    }

    /**
     * Get 项目关联的集群信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Clusters 项目关联的集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseClusterInfo [] getClusters() {
        return this.Clusters;
    }

    /**
     * Set 项目关联的集群信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Clusters 项目关联的集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusters(BaseClusterInfo [] Clusters) {
        this.Clusters = Clusters;
    }

    /**
     * Get 项目的额外配置参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 项目的额外配置参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 项目的额外配置参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 项目的额外配置参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get 项目状态：0：禁用，1：启用，-3:禁用中，2：启用中 
     * @return Status 项目状态：0：禁用，1：启用，-3:禁用中，2：启用中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 项目状态：0：禁用，1：启用，-3:禁用中，2：启用中
     * @param Status 项目状态：0：禁用，1：启用，-3:禁用中，2：启用中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 项目类型，SIMPLE：简单模式 STANDARD：标准模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model 项目类型，SIMPLE：简单模式 STANDARD：标准模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 项目类型，SIMPLE：简单模式 STANDARD：标准模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 项目类型，SIMPLE：简单模式 STANDARD：标准模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 二级菜单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondModuleList 二级菜单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecondModuleList() {
        return this.SecondModuleList;
    }

    /**
     * Set 二级菜单
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondModuleList 二级菜单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondModuleList(String [] SecondModuleList) {
        this.SecondModuleList = SecondModuleList;
    }

    /**
     * Get 项目负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 项目负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseUser getOwner() {
        return this.Owner;
    }

    /**
     * Set 项目负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 项目负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(BaseUser Owner) {
        this.Owner = Owner;
    }

    public Project() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Project(Project source) {
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new BaseUser(source.Creator);
        }
        if (source.Tenant != null) {
            this.Tenant = new BaseTenant(source.Tenant);
        }
        if (source.AdminUsers != null) {
            this.AdminUsers = new BaseUser[source.AdminUsers.length];
            for (int i = 0; i < source.AdminUsers.length; i++) {
                this.AdminUsers[i] = new BaseUser(source.AdminUsers[i]);
            }
        }
        if (source.Clusters != null) {
            this.Clusters = new BaseClusterInfo[source.Clusters.length];
            for (int i = 0; i < source.Clusters.length; i++) {
                this.Clusters[i] = new BaseClusterInfo(source.Clusters[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.SecondModuleList != null) {
            this.SecondModuleList = new String[source.SecondModuleList.length];
            for (int i = 0; i < source.SecondModuleList.length; i++) {
                this.SecondModuleList[i] = new String(source.SecondModuleList[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new BaseUser(source.Owner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamObj(map, prefix + "Tenant.", this.Tenant);
        this.setParamArrayObj(map, prefix + "AdminUsers.", this.AdminUsers);
        this.setParamArrayObj(map, prefix + "Clusters.", this.Clusters);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArraySimple(map, prefix + "SecondModuleList.", this.SecondModuleList);
        this.setParamObj(map, prefix + "Owner.", this.Owner);

    }
}

