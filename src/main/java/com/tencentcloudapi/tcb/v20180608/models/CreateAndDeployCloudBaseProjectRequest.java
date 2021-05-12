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

public class CreateAndDeployCloudBaseProjectRequest extends AbstractModel{

    /**
    * 项目名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private CodeSource Source;

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 项目类型, 枚举值为: framework-oneclick,qci-extension-cicd
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 环境变量
    */
    @SerializedName("Parameters")
    @Expose
    private KVPair [] Parameters;

    /**
    * 环境别名。要以a-z开头，不能包含a-zA-z0-9-以外的字符
    */
    @SerializedName("EnvAlias")
    @Expose
    private String EnvAlias;

    /**
    * rc.json的内容
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
    * 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
    */
    @SerializedName("FreeQuota")
    @Expose
    private String FreeQuota;

    /**
    * 是否代码变更触发自动部署
    */
    @SerializedName("AutoDeployOnCodeChange")
    @Expose
    private Boolean AutoDeployOnCodeChange;

    /**
    * 私有仓库地址
    */
    @SerializedName("RepoUrl")
    @Expose
    private String RepoUrl;

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
     * Get 来源 
     * @return Source 来源
     */
    public CodeSource getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(CodeSource Source) {
        this.Source = Source;
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
     * Get 项目类型, 枚举值为: framework-oneclick,qci-extension-cicd 
     * @return Type 项目类型, 枚举值为: framework-oneclick,qci-extension-cicd
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 项目类型, 枚举值为: framework-oneclick,qci-extension-cicd
     * @param Type 项目类型, 枚举值为: framework-oneclick,qci-extension-cicd
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get 环境别名。要以a-z开头，不能包含a-zA-z0-9-以外的字符 
     * @return EnvAlias 环境别名。要以a-z开头，不能包含a-zA-z0-9-以外的字符
     */
    public String getEnvAlias() {
        return this.EnvAlias;
    }

    /**
     * Set 环境别名。要以a-z开头，不能包含a-zA-z0-9-以外的字符
     * @param EnvAlias 环境别名。要以a-z开头，不能包含a-zA-z0-9-以外的字符
     */
    public void setEnvAlias(String EnvAlias) {
        this.EnvAlias = EnvAlias;
    }

    /**
     * Get rc.json的内容 
     * @return RcJson rc.json的内容
     */
    public String getRcJson() {
        return this.RcJson;
    }

    /**
     * Set rc.json的内容
     * @param RcJson rc.json的内容
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
     * Get 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。 
     * @return FreeQuota 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
     */
    public String getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
     * @param FreeQuota 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
     */
    public void setFreeQuota(String FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get 是否代码变更触发自动部署 
     * @return AutoDeployOnCodeChange 是否代码变更触发自动部署
     */
    public Boolean getAutoDeployOnCodeChange() {
        return this.AutoDeployOnCodeChange;
    }

    /**
     * Set 是否代码变更触发自动部署
     * @param AutoDeployOnCodeChange 是否代码变更触发自动部署
     */
    public void setAutoDeployOnCodeChange(Boolean AutoDeployOnCodeChange) {
        this.AutoDeployOnCodeChange = AutoDeployOnCodeChange;
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

    public CreateAndDeployCloudBaseProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndDeployCloudBaseProjectRequest(CreateAndDeployCloudBaseProjectRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Source != null) {
            this.Source = new CodeSource(source.Source);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Parameters != null) {
            this.Parameters = new KVPair[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new KVPair(source.Parameters[i]);
            }
        }
        if (source.EnvAlias != null) {
            this.EnvAlias = new String(source.EnvAlias);
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
        if (source.FreeQuota != null) {
            this.FreeQuota = new String(source.FreeQuota);
        }
        if (source.AutoDeployOnCodeChange != null) {
            this.AutoDeployOnCodeChange = new Boolean(source.AutoDeployOnCodeChange);
        }
        if (source.RepoUrl != null) {
            this.RepoUrl = new String(source.RepoUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);
        this.setParamSimple(map, prefix + "EnvAlias", this.EnvAlias);
        this.setParamSimple(map, prefix + "RcJson", this.RcJson);
        this.setParamSimple(map, prefix + "AddonConfig", this.AddonConfig);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NetworkConfig", this.NetworkConfig);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);
        this.setParamSimple(map, prefix + "AutoDeployOnCodeChange", this.AutoDeployOnCodeChange);
        this.setParamSimple(map, prefix + "RepoUrl", this.RepoUrl);

    }
}

