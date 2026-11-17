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

public class CreateProjectRequest extends AbstractModel {

    /**
    * <p>Makers 站点 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>项目名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>创建来源。Template、Custom、CLI、Guest</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>代码来源。Upload、Github、Gitee、Gitlab、Coding</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>接入方标识</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>加速区域。mainland、overseas、global</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Node.js 版本。14.21.3、16.20.2、18.20.4、20.18.0、22.11.0、22.17.1、22.21.1、24.5.0、24.11.0、24.18.0</p>
    */
    @SerializedName("NodeJsVersion")
    @Expose
    private String NodeJsVersion;

    /**
    * <p>项目根目录</p>
    */
    @SerializedName("RootDir")
    @Expose
    private String RootDir;

    /**
    * <p>构建产物目录</p>
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * <p>构建命令</p>
    */
    @SerializedName("BuildCmd")
    @Expose
    private String BuildCmd;

    /**
    * <p>安装命令</p>
    */
    @SerializedName("InstallCmd")
    @Expose
    private String InstallCmd;

    /**
    * <p>框架</p>
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * <p>模板 ID</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>仓库地址</p>
    */
    @SerializedName("RepoUrl")
    @Expose
    private String RepoUrl;

    /**
    * <p>仓库所有者</p>
    */
    @SerializedName("RepoOwner")
    @Expose
    private String RepoOwner;

    /**
    * <p>仓库名称</p>
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * <p>生产分支</p>
    */
    @SerializedName("RepoBranch")
    @Expose
    private String RepoBranch;

    /**
    * <p>初始环境变量</p>
    */
    @SerializedName("EnvVars")
    @Expose
    private EnvVar [] EnvVars;

    /**
    * <p>Coding 命名空间。Provider 为 Coding 时使用</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>Coding 项目 ID。Provider 为 Coding 时使用</p>
    */
    @SerializedName("CodingProjectId")
    @Expose
    private Long CodingProjectId;

    /**
     * Get <p>Makers 站点 ID</p> 
     * @return ZoneId <p>Makers 站点 ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Makers 站点 ID</p>
     * @param ZoneId <p>Makers 站点 ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>项目名称</p> 
     * @return Name <p>项目名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>项目名称</p>
     * @param Name <p>项目名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>创建来源。Template、Custom、CLI、Guest</p> 
     * @return Channel <p>创建来源。Template、Custom、CLI、Guest</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>创建来源。Template、Custom、CLI、Guest</p>
     * @param Channel <p>创建来源。Template、Custom、CLI、Guest</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>代码来源。Upload、Github、Gitee、Gitlab、Coding</p> 
     * @return Provider <p>代码来源。Upload、Github、Gitee、Gitlab、Coding</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>代码来源。Upload、Github、Gitee、Gitlab、Coding</p>
     * @param Provider <p>代码来源。Upload、Github、Gitee、Gitlab、Coding</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>接入方标识</p> 
     * @return Source <p>接入方标识</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>接入方标识</p>
     * @param Source <p>接入方标识</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>加速区域。mainland、overseas、global</p> 
     * @return Area <p>加速区域。mainland、overseas、global</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>加速区域。mainland、overseas、global</p>
     * @param Area <p>加速区域。mainland、overseas、global</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Node.js 版本。14.21.3、16.20.2、18.20.4、20.18.0、22.11.0、22.17.1、22.21.1、24.5.0、24.11.0、24.18.0</p> 
     * @return NodeJsVersion <p>Node.js 版本。14.21.3、16.20.2、18.20.4、20.18.0、22.11.0、22.17.1、22.21.1、24.5.0、24.11.0、24.18.0</p>
     */
    public String getNodeJsVersion() {
        return this.NodeJsVersion;
    }

    /**
     * Set <p>Node.js 版本。14.21.3、16.20.2、18.20.4、20.18.0、22.11.0、22.17.1、22.21.1、24.5.0、24.11.0、24.18.0</p>
     * @param NodeJsVersion <p>Node.js 版本。14.21.3、16.20.2、18.20.4、20.18.0、22.11.0、22.17.1、22.21.1、24.5.0、24.11.0、24.18.0</p>
     */
    public void setNodeJsVersion(String NodeJsVersion) {
        this.NodeJsVersion = NodeJsVersion;
    }

    /**
     * Get <p>项目根目录</p> 
     * @return RootDir <p>项目根目录</p>
     */
    public String getRootDir() {
        return this.RootDir;
    }

    /**
     * Set <p>项目根目录</p>
     * @param RootDir <p>项目根目录</p>
     */
    public void setRootDir(String RootDir) {
        this.RootDir = RootDir;
    }

    /**
     * Get <p>构建产物目录</p> 
     * @return OutputDir <p>构建产物目录</p>
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set <p>构建产物目录</p>
     * @param OutputDir <p>构建产物目录</p>
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get <p>构建命令</p> 
     * @return BuildCmd <p>构建命令</p>
     */
    public String getBuildCmd() {
        return this.BuildCmd;
    }

    /**
     * Set <p>构建命令</p>
     * @param BuildCmd <p>构建命令</p>
     */
    public void setBuildCmd(String BuildCmd) {
        this.BuildCmd = BuildCmd;
    }

    /**
     * Get <p>安装命令</p> 
     * @return InstallCmd <p>安装命令</p>
     */
    public String getInstallCmd() {
        return this.InstallCmd;
    }

    /**
     * Set <p>安装命令</p>
     * @param InstallCmd <p>安装命令</p>
     */
    public void setInstallCmd(String InstallCmd) {
        this.InstallCmd = InstallCmd;
    }

    /**
     * Get <p>框架</p> 
     * @return Framework <p>框架</p>
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set <p>框架</p>
     * @param Framework <p>框架</p>
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get <p>模板 ID</p> 
     * @return TemplateId <p>模板 ID</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板 ID</p>
     * @param TemplateId <p>模板 ID</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>仓库地址</p> 
     * @return RepoUrl <p>仓库地址</p>
     */
    public String getRepoUrl() {
        return this.RepoUrl;
    }

    /**
     * Set <p>仓库地址</p>
     * @param RepoUrl <p>仓库地址</p>
     */
    public void setRepoUrl(String RepoUrl) {
        this.RepoUrl = RepoUrl;
    }

    /**
     * Get <p>仓库所有者</p> 
     * @return RepoOwner <p>仓库所有者</p>
     */
    public String getRepoOwner() {
        return this.RepoOwner;
    }

    /**
     * Set <p>仓库所有者</p>
     * @param RepoOwner <p>仓库所有者</p>
     */
    public void setRepoOwner(String RepoOwner) {
        this.RepoOwner = RepoOwner;
    }

    /**
     * Get <p>仓库名称</p> 
     * @return RepoName <p>仓库名称</p>
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set <p>仓库名称</p>
     * @param RepoName <p>仓库名称</p>
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get <p>生产分支</p> 
     * @return RepoBranch <p>生产分支</p>
     */
    public String getRepoBranch() {
        return this.RepoBranch;
    }

    /**
     * Set <p>生产分支</p>
     * @param RepoBranch <p>生产分支</p>
     */
    public void setRepoBranch(String RepoBranch) {
        this.RepoBranch = RepoBranch;
    }

    /**
     * Get <p>初始环境变量</p> 
     * @return EnvVars <p>初始环境变量</p>
     */
    public EnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>初始环境变量</p>
     * @param EnvVars <p>初始环境变量</p>
     */
    public void setEnvVars(EnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get <p>Coding 命名空间。Provider 为 Coding 时使用</p> 
     * @return Namespace <p>Coding 命名空间。Provider 为 Coding 时使用</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Coding 命名空间。Provider 为 Coding 时使用</p>
     * @param Namespace <p>Coding 命名空间。Provider 为 Coding 时使用</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>Coding 项目 ID。Provider 为 Coding 时使用</p> 
     * @return CodingProjectId <p>Coding 项目 ID。Provider 为 Coding 时使用</p>
     */
    public Long getCodingProjectId() {
        return this.CodingProjectId;
    }

    /**
     * Set <p>Coding 项目 ID。Provider 为 Coding 时使用</p>
     * @param CodingProjectId <p>Coding 项目 ID。Provider 为 Coding 时使用</p>
     */
    public void setCodingProjectId(Long CodingProjectId) {
        this.CodingProjectId = CodingProjectId;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.NodeJsVersion != null) {
            this.NodeJsVersion = new String(source.NodeJsVersion);
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
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
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
        if (source.EnvVars != null) {
            this.EnvVars = new EnvVar[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new EnvVar(source.EnvVars[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.CodingProjectId != null) {
            this.CodingProjectId = new Long(source.CodingProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "NodeJsVersion", this.NodeJsVersion);
        this.setParamSimple(map, prefix + "RootDir", this.RootDir);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "BuildCmd", this.BuildCmd);
        this.setParamSimple(map, prefix + "InstallCmd", this.InstallCmd);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "RepoUrl", this.RepoUrl);
        this.setParamSimple(map, prefix + "RepoOwner", this.RepoOwner);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "RepoBranch", this.RepoBranch);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CodingProjectId", this.CodingProjectId);

    }
}

