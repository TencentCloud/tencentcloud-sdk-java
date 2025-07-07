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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseProjectVersion extends AbstractModel {

    /**
    * 项目名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * SAM json
    */
    @SerializedName("Sam")
    @Expose
    private String Sam;

    /**
    * 来源类型
    */
    @SerializedName("Source")
    @Expose
    private CodeSource Source;

    /**
    * 创建时间, unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间 ,unix时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 项目状态, 枚举值: 
        "creatingEnv"-创建环境中
	"createEnvFail"-创建环境失败
	"building"-构建中
	"buildFail"-构建失败
	"deploying"-部署中
	 "deployFail"-部署失败
	 "success"-部署成功
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 环境变量
    */
    @SerializedName("Parameters")
    @Expose
    private KVPair [] Parameters;

    /**
    * 项目类型, 枚举值:
"framework-oneclick" 控制台一键部署
"framework-local-oneclick" cli本地一键部署
"qci-extension-cicd" 内网coding ci cd
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ci的id
    */
    @SerializedName("CIId")
    @Expose
    private String CIId;

    /**
    * cd的id
    */
    @SerializedName("CDId")
    @Expose
    private String CDId;

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 版本号
    */
    @SerializedName("VersionNum")
    @Expose
    private Long VersionNum;

    /**
    * 错误原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * rc.json内容
    */
    @SerializedName("RcJson")
    @Expose
    private String RcJson;

    /**
    * 插件配置内容
    */
    @SerializedName("AddonConfig")
    @Expose
    private String AddonConfig;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 网络配置
    */
    @SerializedName("NetworkConfig")
    @Expose
    private String NetworkConfig;

    /**
    * 扩展id
    */
    @SerializedName("ExtensionId")
    @Expose
    private String ExtensionId;

    /**
    * 错误类型
    */
    @SerializedName("FailType")
    @Expose
    private String FailType;

    /**
    * 私有仓库地址
    */
    @SerializedName("RepoUrl")
    @Expose
    private String RepoUrl;

    /**
    * 是否私有仓库代码变更触发自动部署
    */
    @SerializedName("AutoDeployOnCodeChange")
    @Expose
    private Boolean AutoDeployOnCodeChange;

    /**
    * ci部署进度（%）
    */
    @SerializedName("BuildPercent")
    @Expose
    private Long BuildPercent;

    /**
    * Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * BuildFinishTime
    */
    @SerializedName("BuildFinishTime")
    @Expose
    private String BuildFinishTime;

    /**
    * DeployFinishTime
    */
    @SerializedName("DeployFinishTime")
    @Expose
    private String DeployFinishTime;

    /**
    * BuildId
    */
    @SerializedName("BuildId")
    @Expose
    private String BuildId;

    /**
    * SourceUrl
    */
    @SerializedName("SourceUrl")
    @Expose
    private String SourceUrl;

    /**
    * FailReasonShort
    */
    @SerializedName("FailReasonShort")
    @Expose
    private String FailReasonShort;

    /**
    * FirstInitRepo
    */
    @SerializedName("FirstInitRepo")
    @Expose
    private String FirstInitRepo;

    /**
     * Get 项目名 
     * @return Name 项目名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名
     * @param Name 项目名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get SAM json 
     * @return Sam SAM json
     */
    public String getSam() {
        return this.Sam;
    }

    /**
     * Set SAM json
     * @param Sam SAM json
     */
    public void setSam(String Sam) {
        this.Sam = Sam;
    }

    /**
     * Get 来源类型 
     * @return Source 来源类型
     */
    public CodeSource getSource() {
        return this.Source;
    }

    /**
     * Set 来源类型
     * @param Source 来源类型
     */
    public void setSource(CodeSource Source) {
        this.Source = Source;
    }

    /**
     * Get 创建时间, unix时间戳 
     * @return CreateTime 创建时间, unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间, unix时间戳
     * @param CreateTime 创建时间, unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 ,unix时间戳 
     * @return UpdateTime 更新时间 ,unix时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间 ,unix时间戳
     * @param UpdateTime 更新时间 ,unix时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 项目状态, 枚举值: 
        "creatingEnv"-创建环境中
	"createEnvFail"-创建环境失败
	"building"-构建中
	"buildFail"-构建失败
	"deploying"-部署中
	 "deployFail"-部署失败
	 "success"-部署成功 
     * @return Status 项目状态, 枚举值: 
        "creatingEnv"-创建环境中
	"createEnvFail"-创建环境失败
	"building"-构建中
	"buildFail"-构建失败
	"deploying"-部署中
	 "deployFail"-部署失败
	 "success"-部署成功
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 项目状态, 枚举值: 
        "creatingEnv"-创建环境中
	"createEnvFail"-创建环境失败
	"building"-构建中
	"buildFail"-构建失败
	"deploying"-部署中
	 "deployFail"-部署失败
	 "success"-部署成功
     * @param Status 项目状态, 枚举值: 
        "creatingEnv"-创建环境中
	"createEnvFail"-创建环境失败
	"building"-构建中
	"buildFail"-构建失败
	"deploying"-部署中
	 "deployFail"-部署失败
	 "success"-部署成功
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 环境变量 
     * @return Parameters 环境变量
     */
    public KVPair [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set 环境变量
     * @param Parameters 环境变量
     */
    public void setParameters(KVPair [] Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 项目类型, 枚举值:
"framework-oneclick" 控制台一键部署
"framework-local-oneclick" cli本地一键部署
"qci-extension-cicd" 内网coding ci cd 
     * @return Type 项目类型, 枚举值:
"framework-oneclick" 控制台一键部署
"framework-local-oneclick" cli本地一键部署
"qci-extension-cicd" 内网coding ci cd
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 项目类型, 枚举值:
"framework-oneclick" 控制台一键部署
"framework-local-oneclick" cli本地一键部署
"qci-extension-cicd" 内网coding ci cd
     * @param Type 项目类型, 枚举值:
"framework-oneclick" 控制台一键部署
"framework-local-oneclick" cli本地一键部署
"qci-extension-cicd" 内网coding ci cd
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ci的id 
     * @return CIId ci的id
     */
    public String getCIId() {
        return this.CIId;
    }

    /**
     * Set ci的id
     * @param CIId ci的id
     */
    public void setCIId(String CIId) {
        this.CIId = CIId;
    }

    /**
     * Get cd的id 
     * @return CDId cd的id
     */
    public String getCDId() {
        return this.CDId;
    }

    /**
     * Set cd的id
     * @param CDId cd的id
     */
    public void setCDId(String CDId) {
        this.CDId = CDId;
    }

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 版本号 
     * @return VersionNum 版本号
     */
    public Long getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set 版本号
     * @param VersionNum 版本号
     */
    public void setVersionNum(Long VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get 错误原因 
     * @return FailReason 错误原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 错误原因
     * @param FailReason 错误原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get rc.json内容 
     * @return RcJson rc.json内容
     */
    public String getRcJson() {
        return this.RcJson;
    }

    /**
     * Set rc.json内容
     * @param RcJson rc.json内容
     */
    public void setRcJson(String RcJson) {
        this.RcJson = RcJson;
    }

    /**
     * Get 插件配置内容 
     * @return AddonConfig 插件配置内容
     */
    public String getAddonConfig() {
        return this.AddonConfig;
    }

    /**
     * Set 插件配置内容
     * @param AddonConfig 插件配置内容
     */
    public void setAddonConfig(String AddonConfig) {
        this.AddonConfig = AddonConfig;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 网络配置 
     * @return NetworkConfig 网络配置
     */
    public String getNetworkConfig() {
        return this.NetworkConfig;
    }

    /**
     * Set 网络配置
     * @param NetworkConfig 网络配置
     */
    public void setNetworkConfig(String NetworkConfig) {
        this.NetworkConfig = NetworkConfig;
    }

    /**
     * Get 扩展id 
     * @return ExtensionId 扩展id
     */
    public String getExtensionId() {
        return this.ExtensionId;
    }

    /**
     * Set 扩展id
     * @param ExtensionId 扩展id
     */
    public void setExtensionId(String ExtensionId) {
        this.ExtensionId = ExtensionId;
    }

    /**
     * Get 错误类型 
     * @return FailType 错误类型
     */
    public String getFailType() {
        return this.FailType;
    }

    /**
     * Set 错误类型
     * @param FailType 错误类型
     */
    public void setFailType(String FailType) {
        this.FailType = FailType;
    }

    /**
     * Get 私有仓库地址 
     * @return RepoUrl 私有仓库地址
     */
    public String getRepoUrl() {
        return this.RepoUrl;
    }

    /**
     * Set 私有仓库地址
     * @param RepoUrl 私有仓库地址
     */
    public void setRepoUrl(String RepoUrl) {
        this.RepoUrl = RepoUrl;
    }

    /**
     * Get 是否私有仓库代码变更触发自动部署 
     * @return AutoDeployOnCodeChange 是否私有仓库代码变更触发自动部署
     */
    public Boolean getAutoDeployOnCodeChange() {
        return this.AutoDeployOnCodeChange;
    }

    /**
     * Set 是否私有仓库代码变更触发自动部署
     * @param AutoDeployOnCodeChange 是否私有仓库代码变更触发自动部署
     */
    public void setAutoDeployOnCodeChange(Boolean AutoDeployOnCodeChange) {
        this.AutoDeployOnCodeChange = AutoDeployOnCodeChange;
    }

    /**
     * Get ci部署进度（%） 
     * @return BuildPercent ci部署进度（%）
     */
    public Long getBuildPercent() {
        return this.BuildPercent;
    }

    /**
     * Set ci部署进度（%）
     * @param BuildPercent ci部署进度（%）
     */
    public void setBuildPercent(Long BuildPercent) {
        this.BuildPercent = BuildPercent;
    }

    /**
     * Get Uin 
     * @return Uin Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Uin
     * @param Uin Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get BuildFinishTime 
     * @return BuildFinishTime BuildFinishTime
     */
    public String getBuildFinishTime() {
        return this.BuildFinishTime;
    }

    /**
     * Set BuildFinishTime
     * @param BuildFinishTime BuildFinishTime
     */
    public void setBuildFinishTime(String BuildFinishTime) {
        this.BuildFinishTime = BuildFinishTime;
    }

    /**
     * Get DeployFinishTime 
     * @return DeployFinishTime DeployFinishTime
     */
    public String getDeployFinishTime() {
        return this.DeployFinishTime;
    }

    /**
     * Set DeployFinishTime
     * @param DeployFinishTime DeployFinishTime
     */
    public void setDeployFinishTime(String DeployFinishTime) {
        this.DeployFinishTime = DeployFinishTime;
    }

    /**
     * Get BuildId 
     * @return BuildId BuildId
     */
    public String getBuildId() {
        return this.BuildId;
    }

    /**
     * Set BuildId
     * @param BuildId BuildId
     */
    public void setBuildId(String BuildId) {
        this.BuildId = BuildId;
    }

    /**
     * Get SourceUrl 
     * @return SourceUrl SourceUrl
     */
    public String getSourceUrl() {
        return this.SourceUrl;
    }

    /**
     * Set SourceUrl
     * @param SourceUrl SourceUrl
     */
    public void setSourceUrl(String SourceUrl) {
        this.SourceUrl = SourceUrl;
    }

    /**
     * Get FailReasonShort 
     * @return FailReasonShort FailReasonShort
     */
    public String getFailReasonShort() {
        return this.FailReasonShort;
    }

    /**
     * Set FailReasonShort
     * @param FailReasonShort FailReasonShort
     */
    public void setFailReasonShort(String FailReasonShort) {
        this.FailReasonShort = FailReasonShort;
    }

    /**
     * Get FirstInitRepo 
     * @return FirstInitRepo FirstInitRepo
     */
    public String getFirstInitRepo() {
        return this.FirstInitRepo;
    }

    /**
     * Set FirstInitRepo
     * @param FirstInitRepo FirstInitRepo
     */
    public void setFirstInitRepo(String FirstInitRepo) {
        this.FirstInitRepo = FirstInitRepo;
    }

    public CloudBaseProjectVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseProjectVersion(CloudBaseProjectVersion source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sam != null) {
            this.Sam = new String(source.Sam);
        }
        if (source.Source != null) {
            this.Source = new CodeSource(source.Source);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Parameters != null) {
            this.Parameters = new KVPair[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new KVPair(source.Parameters[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CIId != null) {
            this.CIId = new String(source.CIId);
        }
        if (source.CDId != null) {
            this.CDId = new String(source.CDId);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.VersionNum != null) {
            this.VersionNum = new Long(source.VersionNum);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.RcJson != null) {
            this.RcJson = new String(source.RcJson);
        }
        if (source.AddonConfig != null) {
            this.AddonConfig = new String(source.AddonConfig);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.NetworkConfig != null) {
            this.NetworkConfig = new String(source.NetworkConfig);
        }
        if (source.ExtensionId != null) {
            this.ExtensionId = new String(source.ExtensionId);
        }
        if (source.FailType != null) {
            this.FailType = new String(source.FailType);
        }
        if (source.RepoUrl != null) {
            this.RepoUrl = new String(source.RepoUrl);
        }
        if (source.AutoDeployOnCodeChange != null) {
            this.AutoDeployOnCodeChange = new Boolean(source.AutoDeployOnCodeChange);
        }
        if (source.BuildPercent != null) {
            this.BuildPercent = new Long(source.BuildPercent);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.BuildFinishTime != null) {
            this.BuildFinishTime = new String(source.BuildFinishTime);
        }
        if (source.DeployFinishTime != null) {
            this.DeployFinishTime = new String(source.DeployFinishTime);
        }
        if (source.BuildId != null) {
            this.BuildId = new String(source.BuildId);
        }
        if (source.SourceUrl != null) {
            this.SourceUrl = new String(source.SourceUrl);
        }
        if (source.FailReasonShort != null) {
            this.FailReasonShort = new String(source.FailReasonShort);
        }
        if (source.FirstInitRepo != null) {
            this.FirstInitRepo = new String(source.FirstInitRepo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sam", this.Sam);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CIId", this.CIId);
        this.setParamSimple(map, prefix + "CDId", this.CDId);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "VersionNum", this.VersionNum);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "RcJson", this.RcJson);
        this.setParamSimple(map, prefix + "AddonConfig", this.AddonConfig);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NetworkConfig", this.NetworkConfig);
        this.setParamSimple(map, prefix + "ExtensionId", this.ExtensionId);
        this.setParamSimple(map, prefix + "FailType", this.FailType);
        this.setParamSimple(map, prefix + "RepoUrl", this.RepoUrl);
        this.setParamSimple(map, prefix + "AutoDeployOnCodeChange", this.AutoDeployOnCodeChange);
        this.setParamSimple(map, prefix + "BuildPercent", this.BuildPercent);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "BuildFinishTime", this.BuildFinishTime);
        this.setParamSimple(map, prefix + "DeployFinishTime", this.DeployFinishTime);
        this.setParamSimple(map, prefix + "BuildId", this.BuildId);
        this.setParamSimple(map, prefix + "SourceUrl", this.SourceUrl);
        this.setParamSimple(map, prefix + "FailReasonShort", this.FailReasonShort);
        this.setParamSimple(map, prefix + "FirstInitRepo", this.FirstInitRepo);

    }
}

