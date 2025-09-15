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

public class Weapp extends AbstractModel {

    /**
    * 应用id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 应用所属者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 标识
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 应用名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 环境信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * 状态.
0:已经安装
3:安装中
4:安装失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 环境信息
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 环境地域
    */
    @SerializedName("EnvRegion")
    @Expose
    private String EnvRegion;

    /**
    * 资源包
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 应用信息是否安装到cms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CmsProject")
    @Expose
    private Long CmsProject;

    /**
    * 渠道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 模板id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 是否计费应用
    */
    @SerializedName("IsFree")
    @Expose
    private Boolean IsFree;

    /**
    * 应用内容类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 应用类型，是否为B端应用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppType")
    @Expose
    private Long AppType;

    /**
    * 关联B端一样id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachAppId")
    @Expose
    private String AttachAppId;

    /**
    * 应用类型，是否为企业应用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EType")
    @Expose
    private Long EType;

    /**
    * 企业应用数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EData")
    @Expose
    private String EData;

    /**
    * 最新一次小程序构建id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastMpCiId")
    @Expose
    private String LastMpCiId;

    /**
    * 最新一次小程序状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastMpCiStatus")
    @Expose
    private String LastMpCiStatus;

    /**
    * 最新一次web构建id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastWebCiId")
    @Expose
    private String LastWebCiId;

    /**
    * 最新一次web状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastWebCiStatus")
    @Expose
    private String LastWebCiStatus;

    /**
    * 最新部署时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastDeployTime")
    @Expose
    private String LastDeployTime;

    /**
    * 安装任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobInfo")
    @Expose
    private AppJobInfo JobInfo;

    /**
    * 应用端
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 最新一次web构建模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastWebCiMode")
    @Expose
    private Long LastWebCiMode;

    /**
    * 最新一次小程序构建模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastMpCiMode")
    @Expose
    private Long LastMpCiMode;

    /**
    * 应用场景化入口类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * client_Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 图标地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 页面图标地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaviconUrl")
    @Expose
    private String FaviconUrl;

    /**
    * 图标背景色
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackgroundColor")
    @Expose
    private String BackgroundColor;

    /**
    * 应用是否收藏
    */
    @SerializedName("Favorite")
    @Expose
    private Boolean Favorite;

    /**
    * 发布平台：web、mp、pc、adminPortal、xPagePC、cloudAdmin
    */
    @SerializedName("PublishPlatform")
    @Expose
    private String PublishPlatform;

    /**
     * Get 应用id 
     * @return Id 应用id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 应用id
     * @param Id 应用id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 应用所属者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 应用所属者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 应用所属者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 应用所属者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 标识 
     * @return Name 标识
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标识
     * @param Name 标识
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 应用名称 
     * @return Title 应用名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 应用名称
     * @param Title 应用名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 环境信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Env 环境信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set 环境信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Env 环境信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get 状态.
0:已经安装
3:安装中
4:安装失败 
     * @return Status 状态.
0:已经安装
3:安装中
4:安装失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态.
0:已经安装
3:安装中
4:安装失败
     * @param Status 状态.
0:已经安装
3:安装中
4:安装失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 环境信息 
     * @return EnvId 环境信息
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境信息
     * @param EnvId 环境信息
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 环境地域 
     * @return EnvRegion 环境地域
     */
    public String getEnvRegion() {
        return this.EnvRegion;
    }

    /**
     * Set 环境地域
     * @param EnvRegion 环境地域
     */
    public void setEnvRegion(String EnvRegion) {
        this.EnvRegion = EnvRegion;
    }

    /**
     * Get 资源包 
     * @return PkgId 资源包
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 资源包
     * @param PkgId 资源包
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 应用信息是否安装到cms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CmsProject 应用信息是否安装到cms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCmsProject() {
        return this.CmsProject;
    }

    /**
     * Set 应用信息是否安装到cms
注意：此字段可能返回 null，表示取不到有效值。
     * @param CmsProject 应用信息是否安装到cms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmsProject(Long CmsProject) {
        this.CmsProject = CmsProject;
    }

    /**
     * Get 渠道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Channel 渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道
注意：此字段可能返回 null，表示取不到有效值。
     * @param Channel 渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 模板id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 是否计费应用 
     * @return IsFree 是否计费应用
     */
    public Boolean getIsFree() {
        return this.IsFree;
    }

    /**
     * Set 是否计费应用
     * @param IsFree 是否计费应用
     */
    public void setIsFree(Boolean IsFree) {
        this.IsFree = IsFree;
    }

    /**
     * Get 应用内容类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentType 应用内容类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 应用内容类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentType 应用内容类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 应用类型，是否为B端应用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppType 应用类型，是否为B端应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型，是否为B端应用
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppType 应用类型，是否为B端应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppType(Long AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 关联B端一样id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachAppId 关联B端一样id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttachAppId() {
        return this.AttachAppId;
    }

    /**
     * Set 关联B端一样id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachAppId 关联B端一样id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachAppId(String AttachAppId) {
        this.AttachAppId = AttachAppId;
    }

    /**
     * Get 应用类型，是否为企业应用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EType 应用类型，是否为企业应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEType() {
        return this.EType;
    }

    /**
     * Set 应用类型，是否为企业应用
注意：此字段可能返回 null，表示取不到有效值。
     * @param EType 应用类型，是否为企业应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEType(Long EType) {
        this.EType = EType;
    }

    /**
     * Get 企业应用数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EData 企业应用数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEData() {
        return this.EData;
    }

    /**
     * Set 企业应用数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param EData 企业应用数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEData(String EData) {
        this.EData = EData;
    }

    /**
     * Get 最新一次小程序构建id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastMpCiId 最新一次小程序构建id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastMpCiId() {
        return this.LastMpCiId;
    }

    /**
     * Set 最新一次小程序构建id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastMpCiId 最新一次小程序构建id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastMpCiId(String LastMpCiId) {
        this.LastMpCiId = LastMpCiId;
    }

    /**
     * Get 最新一次小程序状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastMpCiStatus 最新一次小程序状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastMpCiStatus() {
        return this.LastMpCiStatus;
    }

    /**
     * Set 最新一次小程序状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastMpCiStatus 最新一次小程序状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastMpCiStatus(String LastMpCiStatus) {
        this.LastMpCiStatus = LastMpCiStatus;
    }

    /**
     * Get 最新一次web构建id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastWebCiId 最新一次web构建id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastWebCiId() {
        return this.LastWebCiId;
    }

    /**
     * Set 最新一次web构建id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastWebCiId 最新一次web构建id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastWebCiId(String LastWebCiId) {
        this.LastWebCiId = LastWebCiId;
    }

    /**
     * Get 最新一次web状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastWebCiStatus 最新一次web状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastWebCiStatus() {
        return this.LastWebCiStatus;
    }

    /**
     * Set 最新一次web状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastWebCiStatus 最新一次web状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastWebCiStatus(String LastWebCiStatus) {
        this.LastWebCiStatus = LastWebCiStatus;
    }

    /**
     * Get 最新部署时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastDeployTime 最新部署时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastDeployTime() {
        return this.LastDeployTime;
    }

    /**
     * Set 最新部署时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastDeployTime 最新部署时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastDeployTime(String LastDeployTime) {
        this.LastDeployTime = LastDeployTime;
    }

    /**
     * Get 安装任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowId 安装任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 安装任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowId 安装任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobInfo 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppJobInfo getJobInfo() {
        return this.JobInfo;
    }

    /**
     * Set 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobInfo 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobInfo(AppJobInfo JobInfo) {
        this.JobInfo = JobInfo;
    }

    /**
     * Get 应用端
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Platform 应用端
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 应用端
注意：此字段可能返回 null，表示取不到有效值。
     * @param Platform 应用端
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 最新一次web构建模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastWebCiMode 最新一次web构建模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastWebCiMode() {
        return this.LastWebCiMode;
    }

    /**
     * Set 最新一次web构建模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastWebCiMode 最新一次web构建模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastWebCiMode(Long LastWebCiMode) {
        this.LastWebCiMode = LastWebCiMode;
    }

    /**
     * Get 最新一次小程序构建模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastMpCiMode 最新一次小程序构建模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastMpCiMode() {
        return this.LastMpCiMode;
    }

    /**
     * Set 最新一次小程序构建模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastMpCiMode 最新一次小程序构建模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastMpCiMode(Long LastMpCiMode) {
        this.LastMpCiMode = LastMpCiMode;
    }

    /**
     * Get 应用场景化入口类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneType 应用场景化入口类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 应用场景化入口类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneType 应用场景化入口类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get client_Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientId client_Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set client_Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientId client_Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 图标地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IconUrl 图标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 图标地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IconUrl 图标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get 页面图标地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaviconUrl 页面图标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFaviconUrl() {
        return this.FaviconUrl;
    }

    /**
     * Set 页面图标地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaviconUrl 页面图标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaviconUrl(String FaviconUrl) {
        this.FaviconUrl = FaviconUrl;
    }

    /**
     * Get 图标背景色
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackgroundColor 图标背景色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set 图标背景色
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackgroundColor 图标背景色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackgroundColor(String BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    /**
     * Get 应用是否收藏 
     * @return Favorite 应用是否收藏
     */
    public Boolean getFavorite() {
        return this.Favorite;
    }

    /**
     * Set 应用是否收藏
     * @param Favorite 应用是否收藏
     */
    public void setFavorite(Boolean Favorite) {
        this.Favorite = Favorite;
    }

    /**
     * Get 发布平台：web、mp、pc、adminPortal、xPagePC、cloudAdmin 
     * @return PublishPlatform 发布平台：web、mp、pc、adminPortal、xPagePC、cloudAdmin
     */
    public String getPublishPlatform() {
        return this.PublishPlatform;
    }

    /**
     * Set 发布平台：web、mp、pc、adminPortal、xPagePC、cloudAdmin
     * @param PublishPlatform 发布平台：web、mp、pc、adminPortal、xPagePC、cloudAdmin
     */
    public void setPublishPlatform(String PublishPlatform) {
        this.PublishPlatform = PublishPlatform;
    }

    public Weapp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Weapp(Weapp source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.EnvRegion != null) {
            this.EnvRegion = new String(source.EnvRegion);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.CmsProject != null) {
            this.CmsProject = new Long(source.CmsProject);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.IsFree != null) {
            this.IsFree = new Boolean(source.IsFree);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.AppType != null) {
            this.AppType = new Long(source.AppType);
        }
        if (source.AttachAppId != null) {
            this.AttachAppId = new String(source.AttachAppId);
        }
        if (source.EType != null) {
            this.EType = new Long(source.EType);
        }
        if (source.EData != null) {
            this.EData = new String(source.EData);
        }
        if (source.LastMpCiId != null) {
            this.LastMpCiId = new String(source.LastMpCiId);
        }
        if (source.LastMpCiStatus != null) {
            this.LastMpCiStatus = new String(source.LastMpCiStatus);
        }
        if (source.LastWebCiId != null) {
            this.LastWebCiId = new String(source.LastWebCiId);
        }
        if (source.LastWebCiStatus != null) {
            this.LastWebCiStatus = new String(source.LastWebCiStatus);
        }
        if (source.LastDeployTime != null) {
            this.LastDeployTime = new String(source.LastDeployTime);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.JobInfo != null) {
            this.JobInfo = new AppJobInfo(source.JobInfo);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.LastWebCiMode != null) {
            this.LastWebCiMode = new Long(source.LastWebCiMode);
        }
        if (source.LastMpCiMode != null) {
            this.LastMpCiMode = new Long(source.LastMpCiMode);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.FaviconUrl != null) {
            this.FaviconUrl = new String(source.FaviconUrl);
        }
        if (source.BackgroundColor != null) {
            this.BackgroundColor = new String(source.BackgroundColor);
        }
        if (source.Favorite != null) {
            this.Favorite = new Boolean(source.Favorite);
        }
        if (source.PublishPlatform != null) {
            this.PublishPlatform = new String(source.PublishPlatform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "EnvRegion", this.EnvRegion);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "CmsProject", this.CmsProject);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "IsFree", this.IsFree);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "AttachAppId", this.AttachAppId);
        this.setParamSimple(map, prefix + "EType", this.EType);
        this.setParamSimple(map, prefix + "EData", this.EData);
        this.setParamSimple(map, prefix + "LastMpCiId", this.LastMpCiId);
        this.setParamSimple(map, prefix + "LastMpCiStatus", this.LastMpCiStatus);
        this.setParamSimple(map, prefix + "LastWebCiId", this.LastWebCiId);
        this.setParamSimple(map, prefix + "LastWebCiStatus", this.LastWebCiStatus);
        this.setParamSimple(map, prefix + "LastDeployTime", this.LastDeployTime);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamObj(map, prefix + "JobInfo.", this.JobInfo);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "LastWebCiMode", this.LastWebCiMode);
        this.setParamSimple(map, prefix + "LastMpCiMode", this.LastMpCiMode);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "FaviconUrl", this.FaviconUrl);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);
        this.setParamSimple(map, prefix + "Favorite", this.Favorite);
        this.setParamSimple(map, prefix + "PublishPlatform", this.PublishPlatform);

    }
}

