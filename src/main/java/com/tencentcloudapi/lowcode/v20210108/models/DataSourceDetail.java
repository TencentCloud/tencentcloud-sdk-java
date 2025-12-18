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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceDetail extends AbstractModel {

    /**
    * 数据源 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 数据源名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 数据源标识
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据源类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据源描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据源配置
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * cms 项目状态, 0: 重新获取详情信息，1： 不需要重新获取详情信息
    */
    @SerializedName("CmsProject")
    @Expose
    private String CmsProject;

    /**
    * 当前为环境 id
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * schema 版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaVersion")
    @Expose
    private String SchemaVersion;

    /**
    * 创建者用户 ID
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 环境 id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceVersion")
    @Expose
    private String DataSourceVersion;

    /**
    * 所属应用数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppUsageList")
    @Expose
    private DataSourceLinkApp [] AppUsageList;

    /**
    * 发布时间
    */
    @SerializedName("PublishedAt")
    @Expose
    private String PublishedAt;

    /**
    * 子数据源ids
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChildDataSourceIds")
    @Expose
    private String [] ChildDataSourceIds;

    /**
    * 数据源发布信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fun")
    @Expose
    private String Fun;

    /**
    * 云函数状态 1 Active 2 Creating 3 Updating 4 Deleting  9 Deleted 11 CreatFailed  12 UpdateFailed 13 DeleteFailed 21 UpdateTimeOut
    */
    @SerializedName("ScfStatus")
    @Expose
    private Long ScfStatus;

    /**
    * 自定义方法
    */
    @SerializedName("Methods")
    @Expose
    private String Methods;

    /**
    * 子数据源名数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChildDataSourceNames")
    @Expose
    private String [] ChildDataSourceNames;

    /**
    * 是否旧数据源 1 新 0 旧
    */
    @SerializedName("IsNewDataSource")
    @Expose
    private Long IsNewDataSource;

    /**
    * 数据源视图id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ViewId")
    @Expose
    private String ViewId;

    /**
    * 数据源属性配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Configuration")
    @Expose
    private String Configuration;

    /**
    * 外部数据源模板code
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateCode")
    @Expose
    private String TemplateCode;

    /**
    * 外部数据源模板来源 0 空模板 1 腾讯文档 2 腾讯会议 3 企业微信 4 微信电商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 发布版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishVersion")
    @Expose
    private String PublishVersion;

    /**
    * 发布视图id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishViewId")
    @Expose
    private String PublishViewId;

    /**
    * 数据源子类型   "database" 标准模型 "custom-database" 自定义模型 "system" 系统模型 "connector" 连接器 "custom-connector" 自定义连接器 "hidden" 隐藏数据源
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 授权状态  0 授权无效 1 授权有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthStatus")
    @Expose
    private Long AuthStatus;

    /**
    * 数据源授权信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthInfo")
    @Expose
    private TicketAuthInfo AuthInfo;

    /**
    * 1发布0未发布
    */
    @SerializedName("PublishStatus")
    @Expose
    private Long PublishStatus;

    /**
    * 更新版本
    */
    @SerializedName("UpdateVersion")
    @Expose
    private Long UpdateVersion;

    /**
    * 模型关联关系字段列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelationFieldList")
    @Expose
    private RelationField [] RelationFieldList;

    /**
    * db实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbInstanceType")
    @Expose
    private String DbInstanceType;

    /**
    * 体验环境db表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreviewTableName")
    @Expose
    private String PreviewTableName;

    /**
    * 正式环境db表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishedTableName")
    @Expose
    private String PublishedTableName;

    /**
    * DB来源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbSourceType")
    @Expose
    private String DbSourceType;

    /**
    * 模型预览状态开关
    */
    @SerializedName("StagingSwitch")
    @Expose
    private Boolean StagingSwitch;

    /**
     * Get 数据源 ID 
     * @return Id 数据源 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 数据源 ID
     * @param Id 数据源 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 数据源名称 
     * @return Title 数据源名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 数据源名称
     * @param Title 数据源名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 数据源标识 
     * @return Name 数据源标识
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据源标识
     * @param Name 数据源标识
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据源类型 
     * @return Type 数据源类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据源类型
     * @param Type 数据源类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据源描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 数据源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据源描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 数据源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据源配置 
     * @return Schema 数据源配置
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 数据源配置
     * @param Schema 数据源配置
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get cms 项目状态, 0: 重新获取详情信息，1： 不需要重新获取详情信息 
     * @return CmsProject cms 项目状态, 0: 重新获取详情信息，1： 不需要重新获取详情信息
     */
    public String getCmsProject() {
        return this.CmsProject;
    }

    /**
     * Set cms 项目状态, 0: 重新获取详情信息，1： 不需要重新获取详情信息
     * @param CmsProject cms 项目状态, 0: 重新获取详情信息，1： 不需要重新获取详情信息
     */
    public void setCmsProject(String CmsProject) {
        this.CmsProject = CmsProject;
    }

    /**
     * Get 当前为环境 id 
     * @return PkgId 当前为环境 id
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 当前为环境 id
     * @param PkgId 当前为环境 id
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get schema 版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaVersion schema 版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaVersion() {
        return this.SchemaVersion;
    }

    /**
     * Set schema 版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaVersion schema 版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaVersion(String SchemaVersion) {
        this.SchemaVersion = SchemaVersion;
    }

    /**
     * Get 创建者用户 ID 
     * @return CreatorId 创建者用户 ID
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建者用户 ID
     * @param CreatorId 创建者用户 ID
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 环境 id 
     * @return EnvId 环境 id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 id
     * @param EnvId 环境 id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceVersion 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceVersion() {
        return this.DataSourceVersion;
    }

    /**
     * Set 版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceVersion 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceVersion(String DataSourceVersion) {
        this.DataSourceVersion = DataSourceVersion;
    }

    /**
     * Get 所属应用数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppUsageList 所属应用数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSourceLinkApp [] getAppUsageList() {
        return this.AppUsageList;
    }

    /**
     * Set 所属应用数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppUsageList 所属应用数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppUsageList(DataSourceLinkApp [] AppUsageList) {
        this.AppUsageList = AppUsageList;
    }

    /**
     * Get 发布时间 
     * @return PublishedAt 发布时间
     */
    public String getPublishedAt() {
        return this.PublishedAt;
    }

    /**
     * Set 发布时间
     * @param PublishedAt 发布时间
     */
    public void setPublishedAt(String PublishedAt) {
        this.PublishedAt = PublishedAt;
    }

    /**
     * Get 子数据源ids
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChildDataSourceIds 子数据源ids
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getChildDataSourceIds() {
        return this.ChildDataSourceIds;
    }

    /**
     * Set 子数据源ids
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChildDataSourceIds 子数据源ids
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildDataSourceIds(String [] ChildDataSourceIds) {
        this.ChildDataSourceIds = ChildDataSourceIds;
    }

    /**
     * Get 数据源发布信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fun 数据源发布信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFun() {
        return this.Fun;
    }

    /**
     * Set 数据源发布信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fun 数据源发布信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFun(String Fun) {
        this.Fun = Fun;
    }

    /**
     * Get 云函数状态 1 Active 2 Creating 3 Updating 4 Deleting  9 Deleted 11 CreatFailed  12 UpdateFailed 13 DeleteFailed 21 UpdateTimeOut 
     * @return ScfStatus 云函数状态 1 Active 2 Creating 3 Updating 4 Deleting  9 Deleted 11 CreatFailed  12 UpdateFailed 13 DeleteFailed 21 UpdateTimeOut
     */
    public Long getScfStatus() {
        return this.ScfStatus;
    }

    /**
     * Set 云函数状态 1 Active 2 Creating 3 Updating 4 Deleting  9 Deleted 11 CreatFailed  12 UpdateFailed 13 DeleteFailed 21 UpdateTimeOut
     * @param ScfStatus 云函数状态 1 Active 2 Creating 3 Updating 4 Deleting  9 Deleted 11 CreatFailed  12 UpdateFailed 13 DeleteFailed 21 UpdateTimeOut
     */
    public void setScfStatus(Long ScfStatus) {
        this.ScfStatus = ScfStatus;
    }

    /**
     * Get 自定义方法 
     * @return Methods 自定义方法
     */
    public String getMethods() {
        return this.Methods;
    }

    /**
     * Set 自定义方法
     * @param Methods 自定义方法
     */
    public void setMethods(String Methods) {
        this.Methods = Methods;
    }

    /**
     * Get 子数据源名数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChildDataSourceNames 子数据源名数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getChildDataSourceNames() {
        return this.ChildDataSourceNames;
    }

    /**
     * Set 子数据源名数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChildDataSourceNames 子数据源名数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildDataSourceNames(String [] ChildDataSourceNames) {
        this.ChildDataSourceNames = ChildDataSourceNames;
    }

    /**
     * Get 是否旧数据源 1 新 0 旧 
     * @return IsNewDataSource 是否旧数据源 1 新 0 旧
     */
    public Long getIsNewDataSource() {
        return this.IsNewDataSource;
    }

    /**
     * Set 是否旧数据源 1 新 0 旧
     * @param IsNewDataSource 是否旧数据源 1 新 0 旧
     */
    public void setIsNewDataSource(Long IsNewDataSource) {
        this.IsNewDataSource = IsNewDataSource;
    }

    /**
     * Get 数据源视图id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ViewId 数据源视图id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getViewId() {
        return this.ViewId;
    }

    /**
     * Set 数据源视图id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ViewId 数据源视图id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setViewId(String ViewId) {
        this.ViewId = ViewId;
    }

    /**
     * Get 数据源属性配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Configuration 数据源属性配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfiguration() {
        return this.Configuration;
    }

    /**
     * Set 数据源属性配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Configuration 数据源属性配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfiguration(String Configuration) {
        this.Configuration = Configuration;
    }

    /**
     * Get 外部数据源模板code
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateCode 外部数据源模板code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateCode() {
        return this.TemplateCode;
    }

    /**
     * Set 外部数据源模板code
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateCode 外部数据源模板code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateCode(String TemplateCode) {
        this.TemplateCode = TemplateCode;
    }

    /**
     * Get 外部数据源模板来源 0 空模板 1 腾讯文档 2 腾讯会议 3 企业微信 4 微信电商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 外部数据源模板来源 0 空模板 1 腾讯文档 2 腾讯会议 3 企业微信 4 微信电商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 外部数据源模板来源 0 空模板 1 腾讯文档 2 腾讯会议 3 企业微信 4 微信电商
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 外部数据源模板来源 0 空模板 1 腾讯文档 2 腾讯会议 3 企业微信 4 微信电商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 发布版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishVersion 发布版本
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getPublishVersion() {
        return this.PublishVersion;
    }

    /**
     * Set 发布版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishVersion 发布版本
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setPublishVersion(String PublishVersion) {
        this.PublishVersion = PublishVersion;
    }

    /**
     * Get 发布视图id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishViewId 发布视图id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublishViewId() {
        return this.PublishViewId;
    }

    /**
     * Set 发布视图id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishViewId 发布视图id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishViewId(String PublishViewId) {
        this.PublishViewId = PublishViewId;
    }

    /**
     * Get 数据源子类型   "database" 标准模型 "custom-database" 自定义模型 "system" 系统模型 "connector" 连接器 "custom-connector" 自定义连接器 "hidden" 隐藏数据源 
     * @return SubType 数据源子类型   "database" 标准模型 "custom-database" 自定义模型 "system" 系统模型 "connector" 连接器 "custom-connector" 自定义连接器 "hidden" 隐藏数据源
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 数据源子类型   "database" 标准模型 "custom-database" 自定义模型 "system" 系统模型 "connector" 连接器 "custom-connector" 自定义连接器 "hidden" 隐藏数据源
     * @param SubType 数据源子类型   "database" 标准模型 "custom-database" 自定义模型 "system" 系统模型 "connector" 连接器 "custom-connector" 自定义连接器 "hidden" 隐藏数据源
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 授权状态  0 授权无效 1 授权有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthStatus 授权状态  0 授权无效 1 授权有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set 授权状态  0 授权无效 1 授权有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthStatus 授权状态  0 授权无效 1 授权有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthStatus(Long AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    /**
     * Get 数据源授权信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthInfo 数据源授权信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TicketAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set 数据源授权信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthInfo 数据源授权信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthInfo(TicketAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    /**
     * Get 1发布0未发布 
     * @return PublishStatus 1发布0未发布
     */
    public Long getPublishStatus() {
        return this.PublishStatus;
    }

    /**
     * Set 1发布0未发布
     * @param PublishStatus 1发布0未发布
     */
    public void setPublishStatus(Long PublishStatus) {
        this.PublishStatus = PublishStatus;
    }

    /**
     * Get 更新版本 
     * @return UpdateVersion 更新版本
     */
    public Long getUpdateVersion() {
        return this.UpdateVersion;
    }

    /**
     * Set 更新版本
     * @param UpdateVersion 更新版本
     */
    public void setUpdateVersion(Long UpdateVersion) {
        this.UpdateVersion = UpdateVersion;
    }

    /**
     * Get 模型关联关系字段列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelationFieldList 模型关联关系字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RelationField [] getRelationFieldList() {
        return this.RelationFieldList;
    }

    /**
     * Set 模型关联关系字段列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelationFieldList 模型关联关系字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelationFieldList(RelationField [] RelationFieldList) {
        this.RelationFieldList = RelationFieldList;
    }

    /**
     * Get db实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbInstanceType db实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbInstanceType() {
        return this.DbInstanceType;
    }

    /**
     * Set db实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbInstanceType db实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbInstanceType(String DbInstanceType) {
        this.DbInstanceType = DbInstanceType;
    }

    /**
     * Get 体验环境db表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreviewTableName 体验环境db表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreviewTableName() {
        return this.PreviewTableName;
    }

    /**
     * Set 体验环境db表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreviewTableName 体验环境db表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreviewTableName(String PreviewTableName) {
        this.PreviewTableName = PreviewTableName;
    }

    /**
     * Get 正式环境db表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishedTableName 正式环境db表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublishedTableName() {
        return this.PublishedTableName;
    }

    /**
     * Set 正式环境db表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishedTableName 正式环境db表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishedTableName(String PublishedTableName) {
        this.PublishedTableName = PublishedTableName;
    }

    /**
     * Get DB来源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbSourceType DB来源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbSourceType() {
        return this.DbSourceType;
    }

    /**
     * Set DB来源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbSourceType DB来源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbSourceType(String DbSourceType) {
        this.DbSourceType = DbSourceType;
    }

    /**
     * Get 模型预览状态开关 
     * @return StagingSwitch 模型预览状态开关
     */
    public Boolean getStagingSwitch() {
        return this.StagingSwitch;
    }

    /**
     * Set 模型预览状态开关
     * @param StagingSwitch 模型预览状态开关
     */
    public void setStagingSwitch(Boolean StagingSwitch) {
        this.StagingSwitch = StagingSwitch;
    }

    public DataSourceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceDetail(DataSourceDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.CmsProject != null) {
            this.CmsProject = new String(source.CmsProject);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.SchemaVersion != null) {
            this.SchemaVersion = new String(source.SchemaVersion);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.DataSourceVersion != null) {
            this.DataSourceVersion = new String(source.DataSourceVersion);
        }
        if (source.AppUsageList != null) {
            this.AppUsageList = new DataSourceLinkApp[source.AppUsageList.length];
            for (int i = 0; i < source.AppUsageList.length; i++) {
                this.AppUsageList[i] = new DataSourceLinkApp(source.AppUsageList[i]);
            }
        }
        if (source.PublishedAt != null) {
            this.PublishedAt = new String(source.PublishedAt);
        }
        if (source.ChildDataSourceIds != null) {
            this.ChildDataSourceIds = new String[source.ChildDataSourceIds.length];
            for (int i = 0; i < source.ChildDataSourceIds.length; i++) {
                this.ChildDataSourceIds[i] = new String(source.ChildDataSourceIds[i]);
            }
        }
        if (source.Fun != null) {
            this.Fun = new String(source.Fun);
        }
        if (source.ScfStatus != null) {
            this.ScfStatus = new Long(source.ScfStatus);
        }
        if (source.Methods != null) {
            this.Methods = new String(source.Methods);
        }
        if (source.ChildDataSourceNames != null) {
            this.ChildDataSourceNames = new String[source.ChildDataSourceNames.length];
            for (int i = 0; i < source.ChildDataSourceNames.length; i++) {
                this.ChildDataSourceNames[i] = new String(source.ChildDataSourceNames[i]);
            }
        }
        if (source.IsNewDataSource != null) {
            this.IsNewDataSource = new Long(source.IsNewDataSource);
        }
        if (source.ViewId != null) {
            this.ViewId = new String(source.ViewId);
        }
        if (source.Configuration != null) {
            this.Configuration = new String(source.Configuration);
        }
        if (source.TemplateCode != null) {
            this.TemplateCode = new String(source.TemplateCode);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.PublishVersion != null) {
            this.PublishVersion = new String(source.PublishVersion);
        }
        if (source.PublishViewId != null) {
            this.PublishViewId = new String(source.PublishViewId);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.AuthStatus != null) {
            this.AuthStatus = new Long(source.AuthStatus);
        }
        if (source.AuthInfo != null) {
            this.AuthInfo = new TicketAuthInfo(source.AuthInfo);
        }
        if (source.PublishStatus != null) {
            this.PublishStatus = new Long(source.PublishStatus);
        }
        if (source.UpdateVersion != null) {
            this.UpdateVersion = new Long(source.UpdateVersion);
        }
        if (source.RelationFieldList != null) {
            this.RelationFieldList = new RelationField[source.RelationFieldList.length];
            for (int i = 0; i < source.RelationFieldList.length; i++) {
                this.RelationFieldList[i] = new RelationField(source.RelationFieldList[i]);
            }
        }
        if (source.DbInstanceType != null) {
            this.DbInstanceType = new String(source.DbInstanceType);
        }
        if (source.PreviewTableName != null) {
            this.PreviewTableName = new String(source.PreviewTableName);
        }
        if (source.PublishedTableName != null) {
            this.PublishedTableName = new String(source.PublishedTableName);
        }
        if (source.DbSourceType != null) {
            this.DbSourceType = new String(source.DbSourceType);
        }
        if (source.StagingSwitch != null) {
            this.StagingSwitch = new Boolean(source.StagingSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "CmsProject", this.CmsProject);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "SchemaVersion", this.SchemaVersion);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "DataSourceVersion", this.DataSourceVersion);
        this.setParamArrayObj(map, prefix + "AppUsageList.", this.AppUsageList);
        this.setParamSimple(map, prefix + "PublishedAt", this.PublishedAt);
        this.setParamArraySimple(map, prefix + "ChildDataSourceIds.", this.ChildDataSourceIds);
        this.setParamSimple(map, prefix + "Fun", this.Fun);
        this.setParamSimple(map, prefix + "ScfStatus", this.ScfStatus);
        this.setParamSimple(map, prefix + "Methods", this.Methods);
        this.setParamArraySimple(map, prefix + "ChildDataSourceNames.", this.ChildDataSourceNames);
        this.setParamSimple(map, prefix + "IsNewDataSource", this.IsNewDataSource);
        this.setParamSimple(map, prefix + "ViewId", this.ViewId);
        this.setParamSimple(map, prefix + "Configuration", this.Configuration);
        this.setParamSimple(map, prefix + "TemplateCode", this.TemplateCode);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "PublishVersion", this.PublishVersion);
        this.setParamSimple(map, prefix + "PublishViewId", this.PublishViewId);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "AuthStatus", this.AuthStatus);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);
        this.setParamSimple(map, prefix + "PublishStatus", this.PublishStatus);
        this.setParamSimple(map, prefix + "UpdateVersion", this.UpdateVersion);
        this.setParamArrayObj(map, prefix + "RelationFieldList.", this.RelationFieldList);
        this.setParamSimple(map, prefix + "DbInstanceType", this.DbInstanceType);
        this.setParamSimple(map, prefix + "PreviewTableName", this.PreviewTableName);
        this.setParamSimple(map, prefix + "PublishedTableName", this.PublishedTableName);
        this.setParamSimple(map, prefix + "DbSourceType", this.DbSourceType);
        this.setParamSimple(map, prefix + "StagingSwitch", this.StagingSwitch);

    }
}

