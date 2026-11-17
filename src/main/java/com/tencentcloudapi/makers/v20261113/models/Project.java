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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Project extends AbstractModel {

    /**
    * <p>项目 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>项目状态。Normal、Ban、Unlink、Process、Pending、Offline</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>站点 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>加速区域。mainland、overseas、global</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>代码来源。Github、Gitee、Coding、Upload、Gitlab、Bitbucket、Cnb</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>创建来源。Template、Custom、CLI、Guest</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>预设域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetDomain")
    @Expose
    private String PresetDomain;

    /**
    * <p>预设域名状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetDomainStatus")
    @Expose
    private String PresetDomainStatus;

    /**
    * <p>项目根目录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootDir")
    @Expose
    private String RootDir;

    /**
    * <p>构建产物目录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * <p>构建命令</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildCmd")
    @Expose
    private String BuildCmd;

    /**
    * <p>安装命令</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstallCmd")
    @Expose
    private String InstallCmd;

    /**
    * <p>框架</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * <p>Node.js 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodejsVersion")
    @Expose
    private String NodejsVersion;

    /**
    * <p>仓库地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoUrl")
    @Expose
    private String RepoUrl;

    /**
    * <p>仓库所有者</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoOwner")
    @Expose
    private String RepoOwner;

    /**
    * <p>仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * <p>生产分支</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoBranch")
    @Expose
    private String RepoBranch;

    /**
    * <p>预览分支</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoPreBranches")
    @Expose
    private String [] RepoPreBranches;

    /**
    * <p>部署地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regions")
    @Expose
    private Regions Regions;

    /**
    * <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvVars")
    @Expose
    private ProjectEnvVar [] EnvVars;

    /**
    * <p>自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomDomains")
    @Expose
    private CustomDomainItem [] CustomDomains;

    /**
    * <p>最近一次部署</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deployment")
    @Expose
    private ProjectDeployment Deployment;

    /**
    * <p>是否 Agent 项目。1 是，0 否</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAgent")
    @Expose
    private Long IsAgent;

    /**
    * <p>Agent 框架。非 Agent 项目为空</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentFramework")
    @Expose
    private String AgentFramework;

    /**
    * <p>是否命中用户级泛域名。1 是，0 否</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsTld")
    @Expose
    private Long IsTld;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get <p>项目 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>项目状态。Normal、Ban、Unlink、Process、Pending、Offline</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>项目状态。Normal、Ban、Unlink、Process、Pending、Offline</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>项目状态。Normal、Ban、Unlink、Process、Pending、Offline</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>项目状态。Normal、Ban、Unlink、Process、Pending、Offline</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>站点 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId <p>站点 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId <p>站点 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>加速区域。mainland、overseas、global</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area <p>加速区域。mainland、overseas、global</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>加速区域。mainland、overseas、global</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area <p>加速区域。mainland、overseas、global</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>代码来源。Github、Gitee、Coding、Upload、Gitlab、Bitbucket、Cnb</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Provider <p>代码来源。Github、Gitee、Coding、Upload、Gitlab、Bitbucket、Cnb</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>代码来源。Github、Gitee、Coding、Upload、Gitlab、Bitbucket、Cnb</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Provider <p>代码来源。Github、Gitee、Coding、Upload、Gitlab、Bitbucket、Cnb</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>创建来源。Template、Custom、CLI、Guest</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Channel <p>创建来源。Template、Custom、CLI、Guest</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>创建来源。Template、Custom、CLI、Guest</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Channel <p>创建来源。Template、Custom、CLI、Guest</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>预设域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetDomain <p>预设域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPresetDomain() {
        return this.PresetDomain;
    }

    /**
     * Set <p>预设域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetDomain <p>预设域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetDomain(String PresetDomain) {
        this.PresetDomain = PresetDomain;
    }

    /**
     * Get <p>预设域名状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetDomainStatus <p>预设域名状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPresetDomainStatus() {
        return this.PresetDomainStatus;
    }

    /**
     * Set <p>预设域名状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetDomainStatus <p>预设域名状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetDomainStatus(String PresetDomainStatus) {
        this.PresetDomainStatus = PresetDomainStatus;
    }

    /**
     * Get <p>项目根目录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootDir <p>项目根目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRootDir() {
        return this.RootDir;
    }

    /**
     * Set <p>项目根目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootDir <p>项目根目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootDir(String RootDir) {
        this.RootDir = RootDir;
    }

    /**
     * Get <p>构建产物目录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputDir <p>构建产物目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set <p>构建产物目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputDir <p>构建产物目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get <p>构建命令</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildCmd <p>构建命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuildCmd() {
        return this.BuildCmd;
    }

    /**
     * Set <p>构建命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildCmd <p>构建命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildCmd(String BuildCmd) {
        this.BuildCmd = BuildCmd;
    }

    /**
     * Get <p>安装命令</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstallCmd <p>安装命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstallCmd() {
        return this.InstallCmd;
    }

    /**
     * Set <p>安装命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstallCmd <p>安装命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstallCmd(String InstallCmd) {
        this.InstallCmd = InstallCmd;
    }

    /**
     * Get <p>框架</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Framework <p>框架</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set <p>框架</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Framework <p>框架</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get <p>Node.js 版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodejsVersion <p>Node.js 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodejsVersion() {
        return this.NodejsVersion;
    }

    /**
     * Set <p>Node.js 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodejsVersion <p>Node.js 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodejsVersion(String NodejsVersion) {
        this.NodejsVersion = NodejsVersion;
    }

    /**
     * Get <p>仓库地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoUrl <p>仓库地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoUrl() {
        return this.RepoUrl;
    }

    /**
     * Set <p>仓库地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoUrl <p>仓库地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoUrl(String RepoUrl) {
        this.RepoUrl = RepoUrl;
    }

    /**
     * Get <p>仓库所有者</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoOwner <p>仓库所有者</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoOwner() {
        return this.RepoOwner;
    }

    /**
     * Set <p>仓库所有者</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoOwner <p>仓库所有者</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoOwner(String RepoOwner) {
        this.RepoOwner = RepoOwner;
    }

    /**
     * Get <p>仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoName <p>仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set <p>仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoName <p>仓库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get <p>生产分支</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoBranch <p>生产分支</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoBranch() {
        return this.RepoBranch;
    }

    /**
     * Set <p>生产分支</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoBranch <p>生产分支</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoBranch(String RepoBranch) {
        this.RepoBranch = RepoBranch;
    }

    /**
     * Get <p>预览分支</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoPreBranches <p>预览分支</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRepoPreBranches() {
        return this.RepoPreBranches;
    }

    /**
     * Set <p>预览分支</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoPreBranches <p>预览分支</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoPreBranches(String [] RepoPreBranches) {
        this.RepoPreBranches = RepoPreBranches;
    }

    /**
     * Get <p>部署地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regions <p>部署地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Regions getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>部署地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regions <p>部署地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegions(Regions Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvVars <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProjectEnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvVars <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvVars(ProjectEnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get <p>自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomDomains <p>自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomDomainItem [] getCustomDomains() {
        return this.CustomDomains;
    }

    /**
     * Set <p>自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomDomains <p>自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomDomains(CustomDomainItem [] CustomDomains) {
        this.CustomDomains = CustomDomains;
    }

    /**
     * Get <p>最近一次部署</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deployment <p>最近一次部署</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProjectDeployment getDeployment() {
        return this.Deployment;
    }

    /**
     * Set <p>最近一次部署</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deployment <p>最近一次部署</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployment(ProjectDeployment Deployment) {
        this.Deployment = Deployment;
    }

    /**
     * Get <p>是否 Agent 项目。1 是，0 否</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAgent <p>是否 Agent 项目。1 是，0 否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAgent() {
        return this.IsAgent;
    }

    /**
     * Set <p>是否 Agent 项目。1 是，0 否</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAgent <p>是否 Agent 项目。1 是，0 否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAgent(Long IsAgent) {
        this.IsAgent = IsAgent;
    }

    /**
     * Get <p>Agent 框架。非 Agent 项目为空</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentFramework <p>Agent 框架。非 Agent 项目为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentFramework() {
        return this.AgentFramework;
    }

    /**
     * Set <p>Agent 框架。非 Agent 项目为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentFramework <p>Agent 框架。非 Agent 项目为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentFramework(String AgentFramework) {
        this.AgentFramework = AgentFramework;
    }

    /**
     * Get <p>是否命中用户级泛域名。1 是，0 否</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsTld <p>是否命中用户级泛域名。1 是，0 否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsTld() {
        return this.IsTld;
    }

    /**
     * Set <p>是否命中用户级泛域名。1 是，0 否</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsTld <p>是否命中用户级泛域名。1 是，0 否</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsTld(Long IsTld) {
        this.IsTld = IsTld;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedOn <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedOn <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedOn <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedOn <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public Project() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Project(Project source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.PresetDomain != null) {
            this.PresetDomain = new String(source.PresetDomain);
        }
        if (source.PresetDomainStatus != null) {
            this.PresetDomainStatus = new String(source.PresetDomainStatus);
        }
        if (source.RootDir != null) {
            this.RootDir = new String(source.RootDir);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.BuildCmd != null) {
            this.BuildCmd = new String(source.BuildCmd);
        }
        if (source.InstallCmd != null) {
            this.InstallCmd = new String(source.InstallCmd);
        }
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
        if (source.NodejsVersion != null) {
            this.NodejsVersion = new String(source.NodejsVersion);
        }
        if (source.RepoUrl != null) {
            this.RepoUrl = new String(source.RepoUrl);
        }
        if (source.RepoOwner != null) {
            this.RepoOwner = new String(source.RepoOwner);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.RepoBranch != null) {
            this.RepoBranch = new String(source.RepoBranch);
        }
        if (source.RepoPreBranches != null) {
            this.RepoPreBranches = new String[source.RepoPreBranches.length];
            for (int i = 0; i < source.RepoPreBranches.length; i++) {
                this.RepoPreBranches[i] = new String(source.RepoPreBranches[i]);
            }
        }
        if (source.Regions != null) {
            this.Regions = new Regions(source.Regions);
        }
        if (source.EnvVars != null) {
            this.EnvVars = new ProjectEnvVar[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new ProjectEnvVar(source.EnvVars[i]);
            }
        }
        if (source.CustomDomains != null) {
            this.CustomDomains = new CustomDomainItem[source.CustomDomains.length];
            for (int i = 0; i < source.CustomDomains.length; i++) {
                this.CustomDomains[i] = new CustomDomainItem(source.CustomDomains[i]);
            }
        }
        if (source.Deployment != null) {
            this.Deployment = new ProjectDeployment(source.Deployment);
        }
        if (source.IsAgent != null) {
            this.IsAgent = new Long(source.IsAgent);
        }
        if (source.AgentFramework != null) {
            this.AgentFramework = new String(source.AgentFramework);
        }
        if (source.IsTld != null) {
            this.IsTld = new Long(source.IsTld);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "PresetDomain", this.PresetDomain);
        this.setParamSimple(map, prefix + "PresetDomainStatus", this.PresetDomainStatus);
        this.setParamSimple(map, prefix + "RootDir", this.RootDir);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "BuildCmd", this.BuildCmd);
        this.setParamSimple(map, prefix + "InstallCmd", this.InstallCmd);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "NodejsVersion", this.NodejsVersion);
        this.setParamSimple(map, prefix + "RepoUrl", this.RepoUrl);
        this.setParamSimple(map, prefix + "RepoOwner", this.RepoOwner);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "RepoBranch", this.RepoBranch);
        this.setParamArraySimple(map, prefix + "RepoPreBranches.", this.RepoPreBranches);
        this.setParamObj(map, prefix + "Regions.", this.Regions);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamArrayObj(map, prefix + "CustomDomains.", this.CustomDomains);
        this.setParamObj(map, prefix + "Deployment.", this.Deployment);
        this.setParamSimple(map, prefix + "IsAgent", this.IsAgent);
        this.setParamSimple(map, prefix + "AgentFramework", this.AgentFramework);
        this.setParamSimple(map, prefix + "IsTld", this.IsTld);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

