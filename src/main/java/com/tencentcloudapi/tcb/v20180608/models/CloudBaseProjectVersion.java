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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseProjectVersion extends AbstractModel{

    /**
    * 项目名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * SAM json
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sam")
    @Expose
    private String Sam;

    /**
    * 来源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private CodeSource Source;

    /**
    * 创建时间, unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间 ,unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 环境变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Parameters")
    @Expose
    private KVPair [] Parameters;

    /**
    * 项目类型, 枚举值:
"framework-oneclick" 控制台一键部署
"framework-local-oneclick" cli本地一键部署
"qci-extension-cicd" 内网coding ci cd
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ci的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CIId")
    @Expose
    private String CIId;

    /**
    * cd的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CDId")
    @Expose
    private String CDId;

    /**
    * 环境id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionNum")
    @Expose
    private Long VersionNum;

    /**
    * 错误原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * rc.json内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RcJson")
    @Expose
    private String RcJson;

    /**
    * 插件配置内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddonConfig")
    @Expose
    private String AddonConfig;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 网络配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkConfig")
    @Expose
    private String NetworkConfig;

    /**
    * 扩展id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtensionId")
    @Expose
    private String ExtensionId;

    /**
    * 错误类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailType")
    @Expose
    private String FailType;

    /**
    * 私有仓库地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoUrl")
    @Expose
    private String RepoUrl;

    /**
    * 是否私有仓库代码变更触发自动部署
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoDeployOnCodeChange")
    @Expose
    private Boolean AutoDeployOnCodeChange;

    /**
    * ci部署进度（%）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildPercent")
    @Expose
    private Long BuildPercent;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sam SAM json
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSam() {
        return this.Sam;
    }

    /**
     * Set SAM json
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sam SAM json
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSam(String Sam) {
        this.Sam = Sam;
    }

    /**
     * Get 来源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 来源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CodeSource getSource() {
        return this.Source;
    }

    /**
     * Set 来源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 来源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(CodeSource Source) {
        this.Source = Source;
    }

    /**
     * Get 创建时间, unix时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间, unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间, unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间, unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 ,unix时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间 ,unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间 ,unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间 ,unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 项目状态, 枚举值: 
        "creatingEnv"-创建环境中
	"createEnvFail"-创建环境失败
	"building"-构建中
	"buildFail"-构建失败
	"deploying"-部署中
	 "deployFail"-部署失败
	 "success"-部署成功
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 项目状态, 枚举值: 
        "creatingEnv"-创建环境中
	"createEnvFail"-创建环境失败
	"building"-构建中
	"buildFail"-构建失败
	"deploying"-部署中
	 "deployFail"-部署失败
	 "success"-部署成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 环境变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Parameters 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Parameters 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameters(KVPair [] Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 项目类型, 枚举值:
"framework-oneclick" 控制台一键部署
"framework-local-oneclick" cli本地一键部署
"qci-extension-cicd" 内网coding ci cd
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 项目类型, 枚举值:
"framework-oneclick" 控制台一键部署
"framework-local-oneclick" cli本地一键部署
"qci-extension-cicd" 内网coding ci cd
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 项目类型, 枚举值:
"framework-oneclick" 控制台一键部署
"framework-local-oneclick" cli本地一键部署
"qci-extension-cicd" 内网coding ci cd
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 项目类型, 枚举值:
"framework-oneclick" 控制台一键部署
"framework-local-oneclick" cli本地一键部署
"qci-extension-cicd" 内网coding ci cd
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ci的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CIId ci的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCIId() {
        return this.CIId;
    }

    /**
     * Set ci的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CIId ci的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCIId(String CIId) {
        this.CIId = CIId;
    }

    /**
     * Get cd的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CDId cd的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCDId() {
        return this.CDId;
    }

    /**
     * Set cd的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CDId cd的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCDId(String CDId) {
        this.CDId = CDId;
    }

    /**
     * Get 环境id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvId 环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvId 环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionNum 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionNum 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionNum(Long VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get 错误原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get rc.json内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RcJson rc.json内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRcJson() {
        return this.RcJson;
    }

    /**
     * Set rc.json内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param RcJson rc.json内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRcJson(String RcJson) {
        this.RcJson = RcJson;
    }

    /**
     * Get 插件配置内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddonConfig 插件配置内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddonConfig() {
        return this.AddonConfig;
    }

    /**
     * Set 插件配置内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddonConfig 插件配置内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddonConfig(String AddonConfig) {
        this.AddonConfig = AddonConfig;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 网络配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkConfig 网络配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkConfig() {
        return this.NetworkConfig;
    }

    /**
     * Set 网络配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkConfig 网络配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkConfig(String NetworkConfig) {
        this.NetworkConfig = NetworkConfig;
    }

    /**
     * Get 扩展id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtensionId 扩展id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtensionId() {
        return this.ExtensionId;
    }

    /**
     * Set 扩展id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtensionId 扩展id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtensionId(String ExtensionId) {
        this.ExtensionId = ExtensionId;
    }

    /**
     * Get 错误类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailType 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailType() {
        return this.FailType;
    }

    /**
     * Set 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailType 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailType(String FailType) {
        this.FailType = FailType;
    }

    /**
     * Get 私有仓库地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoUrl 私有仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoUrl() {
        return this.RepoUrl;
    }

    /**
     * Set 私有仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoUrl 私有仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoUrl(String RepoUrl) {
        this.RepoUrl = RepoUrl;
    }

    /**
     * Get 是否私有仓库代码变更触发自动部署
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoDeployOnCodeChange 是否私有仓库代码变更触发自动部署
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoDeployOnCodeChange() {
        return this.AutoDeployOnCodeChange;
    }

    /**
     * Set 是否私有仓库代码变更触发自动部署
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoDeployOnCodeChange 是否私有仓库代码变更触发自动部署
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoDeployOnCodeChange(Boolean AutoDeployOnCodeChange) {
        this.AutoDeployOnCodeChange = AutoDeployOnCodeChange;
    }

    /**
     * Get ci部署进度（%）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildPercent ci部署进度（%）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBuildPercent() {
        return this.BuildPercent;
    }

    /**
     * Set ci部署进度（%）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildPercent ci部署进度（%）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildPercent(Long BuildPercent) {
        this.BuildPercent = BuildPercent;
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

    }
}

