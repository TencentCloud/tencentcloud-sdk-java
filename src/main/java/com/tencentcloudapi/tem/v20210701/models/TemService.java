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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemService extends AbstractModel{

    /**
    * 主键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 服务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 命名空间id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyDate")
    @Expose
    private String ModifyDate;

    /**
    * 修改人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Modifier")
    @Expose
    private String Modifier;

    /**
    * 创建者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * tcr个人版or企业版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoType")
    @Expose
    private Long RepoType;

    /**
    * 企业版实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 镜像仓库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 编程语言
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodingLanguage")
    @Expose
    private String CodingLanguage;

    /**
    * 部署方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * 环境名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 服务当前运行环境的实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveVersions")
    @Expose
    private ServiceVersionBrief [] ActiveVersions;

    /**
    * 是否启用链路追踪
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableTracing")
    @Expose
    private Long EnableTracing;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否有资源权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasAuthority")
    @Expose
    private Boolean HasAuthority;

    /**
     * Get 主键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 主键
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 服务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 服务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 服务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 服务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
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
     * Get 命名空间id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentId 命名空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 命名空间id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentId 命名空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateDate 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateDate 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyDate 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyDate() {
        return this.ModifyDate;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyDate 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    /**
     * Get 修改人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Modifier 修改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifier() {
        return this.Modifier;
    }

    /**
     * Set 修改人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Modifier 修改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifier(String Modifier) {
        this.Modifier = Modifier;
    }

    /**
     * Get 创建者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get tcr个人版or企业版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoType tcr个人版or企业版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRepoType() {
        return this.RepoType;
    }

    /**
     * Set tcr个人版or企业版
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoType tcr个人版or企业版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoType(Long RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get 企业版实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 企业版实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 企业版实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 企业版实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 镜像仓库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoName 镜像仓库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 镜像仓库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoName 镜像仓库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 编程语言
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodingLanguage 编程语言
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodingLanguage() {
        return this.CodingLanguage;
    }

    /**
     * Set 编程语言
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodingLanguage 编程语言
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodingLanguage(String CodingLanguage) {
        this.CodingLanguage = CodingLanguage;
    }

    /**
     * Get 部署方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployMode 部署方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 部署方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployMode 部署方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 环境名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentName 环境名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentName 环境名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 服务当前运行环境的实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveVersions 服务当前运行环境的实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceVersionBrief [] getActiveVersions() {
        return this.ActiveVersions;
    }

    /**
     * Set 服务当前运行环境的实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveVersions 服务当前运行环境的实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveVersions(ServiceVersionBrief [] ActiveVersions) {
        this.ActiveVersions = ActiveVersions;
    }

    /**
     * Get 是否启用链路追踪
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableTracing 是否启用链路追踪
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableTracing() {
        return this.EnableTracing;
    }

    /**
     * Set 是否启用链路追踪
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableTracing 是否启用链路追踪
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableTracing(Long EnableTracing) {
        this.EnableTracing = EnableTracing;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否有资源权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasAuthority 是否有资源权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasAuthority() {
        return this.HasAuthority;
    }

    /**
     * Set 是否有资源权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasAuthority 是否有资源权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasAuthority(Boolean HasAuthority) {
        this.HasAuthority = HasAuthority;
    }

    public TemService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemService(TemService source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.ModifyDate != null) {
            this.ModifyDate = new String(source.ModifyDate);
        }
        if (source.Modifier != null) {
            this.Modifier = new String(source.Modifier);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.RepoType != null) {
            this.RepoType = new Long(source.RepoType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.CodingLanguage != null) {
            this.CodingLanguage = new String(source.CodingLanguage);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ActiveVersions != null) {
            this.ActiveVersions = new ServiceVersionBrief[source.ActiveVersions.length];
            for (int i = 0; i < source.ActiveVersions.length; i++) {
                this.ActiveVersions[i] = new ServiceVersionBrief(source.ActiveVersions[i]);
            }
        }
        if (source.EnableTracing != null) {
            this.EnableTracing = new Long(source.EnableTracing);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HasAuthority != null) {
            this.HasAuthority = new Boolean(source.HasAuthority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "ModifyDate", this.ModifyDate);
        this.setParamSimple(map, prefix + "Modifier", this.Modifier);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "CodingLanguage", this.CodingLanguage);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamArrayObj(map, prefix + "ActiveVersions.", this.ActiveVersions);
        this.setParamSimple(map, prefix + "EnableTracing", this.EnableTracing);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HasAuthority", this.HasAuthority);

    }
}

