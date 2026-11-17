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

public class ModifyProjectRequest extends AbstractModel {

    /**
    * <p>Makers 站点 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>项目 ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * <p>封面地址</p>
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * <p>Node.js 版本</p>
    */
    @SerializedName("NodeJsVersion")
    @Expose
    private String NodeJsVersion;

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
     * Get <p>项目 ID</p> 
     * @return ProjectId <p>项目 ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID</p>
     * @param ProjectId <p>项目 ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get <p>封面地址</p> 
     * @return CoverUrl <p>封面地址</p>
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set <p>封面地址</p>
     * @param CoverUrl <p>封面地址</p>
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get <p>Node.js 版本</p> 
     * @return NodeJsVersion <p>Node.js 版本</p>
     */
    public String getNodeJsVersion() {
        return this.NodeJsVersion;
    }

    /**
     * Set <p>Node.js 版本</p>
     * @param NodeJsVersion <p>Node.js 版本</p>
     */
    public void setNodeJsVersion(String NodeJsVersion) {
        this.NodeJsVersion = NodeJsVersion;
    }

    public ModifyProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectRequest(ModifyProjectRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.NodeJsVersion != null) {
            this.NodeJsVersion = new String(source.NodeJsVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RootDir", this.RootDir);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "BuildCmd", this.BuildCmd);
        this.setParamSimple(map, prefix + "InstallCmd", this.InstallCmd);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "NodeJsVersion", this.NodeJsVersion);

    }
}

