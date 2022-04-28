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

public class CreateApplicationRequest extends AbstractModel{

    /**
    * 应用名
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否使用默认镜像服务 1-是，0-否
    */
    @SerializedName("UseDefaultImageService")
    @Expose
    private Long UseDefaultImageService;

    /**
    * 如果是绑定仓库，绑定的仓库类型，0-个人版，1-企业版
    */
    @SerializedName("RepoType")
    @Expose
    private Long RepoType;

    /**
    * 企业版镜像服务的实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 绑定镜像服务器地址
    */
    @SerializedName("RepoServer")
    @Expose
    private String RepoServer;

    /**
    * 绑定镜像仓库名
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 应用所在子网
    */
    @SerializedName("SubnetList")
    @Expose
    private String [] SubnetList;

    /**
    * 编程语言 
- JAVA
- OTHER
    */
    @SerializedName("CodingLanguage")
    @Expose
    private String CodingLanguage;

    /**
    * 部署方式 
- IMAGE
- JAR
- WAR
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * 是否开启 Java 应用的 APM 自动上报功能，1 表示启用；0 表示关闭
    */
    @SerializedName("EnableTracing")
    @Expose
    private Long EnableTracing;

    /**
    * 使用默认镜像服务额外参数
    */
    @SerializedName("UseDefaultImageServiceParameters")
    @Expose
    private UseDefaultRepoParameters UseDefaultImageServiceParameters;

    /**
     * Get 应用名 
     * @return ApplicationName 应用名
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名
     * @param ApplicationName 应用名
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否使用默认镜像服务 1-是，0-否 
     * @return UseDefaultImageService 是否使用默认镜像服务 1-是，0-否
     */
    public Long getUseDefaultImageService() {
        return this.UseDefaultImageService;
    }

    /**
     * Set 是否使用默认镜像服务 1-是，0-否
     * @param UseDefaultImageService 是否使用默认镜像服务 1-是，0-否
     */
    public void setUseDefaultImageService(Long UseDefaultImageService) {
        this.UseDefaultImageService = UseDefaultImageService;
    }

    /**
     * Get 如果是绑定仓库，绑定的仓库类型，0-个人版，1-企业版 
     * @return RepoType 如果是绑定仓库，绑定的仓库类型，0-个人版，1-企业版
     */
    public Long getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 如果是绑定仓库，绑定的仓库类型，0-个人版，1-企业版
     * @param RepoType 如果是绑定仓库，绑定的仓库类型，0-个人版，1-企业版
     */
    public void setRepoType(Long RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get 企业版镜像服务的实例id 
     * @return InstanceId 企业版镜像服务的实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 企业版镜像服务的实例id
     * @param InstanceId 企业版镜像服务的实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 绑定镜像服务器地址 
     * @return RepoServer 绑定镜像服务器地址
     */
    public String getRepoServer() {
        return this.RepoServer;
    }

    /**
     * Set 绑定镜像服务器地址
     * @param RepoServer 绑定镜像服务器地址
     */
    public void setRepoServer(String RepoServer) {
        this.RepoServer = RepoServer;
    }

    /**
     * Get 绑定镜像仓库名 
     * @return RepoName 绑定镜像仓库名
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 绑定镜像仓库名
     * @param RepoName 绑定镜像仓库名
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 应用所在子网 
     * @return SubnetList 应用所在子网
     */
    public String [] getSubnetList() {
        return this.SubnetList;
    }

    /**
     * Set 应用所在子网
     * @param SubnetList 应用所在子网
     */
    public void setSubnetList(String [] SubnetList) {
        this.SubnetList = SubnetList;
    }

    /**
     * Get 编程语言 
- JAVA
- OTHER 
     * @return CodingLanguage 编程语言 
- JAVA
- OTHER
     */
    public String getCodingLanguage() {
        return this.CodingLanguage;
    }

    /**
     * Set 编程语言 
- JAVA
- OTHER
     * @param CodingLanguage 编程语言 
- JAVA
- OTHER
     */
    public void setCodingLanguage(String CodingLanguage) {
        this.CodingLanguage = CodingLanguage;
    }

    /**
     * Get 部署方式 
- IMAGE
- JAR
- WAR 
     * @return DeployMode 部署方式 
- IMAGE
- JAR
- WAR
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 部署方式 
- IMAGE
- JAR
- WAR
     * @param DeployMode 部署方式 
- IMAGE
- JAR
- WAR
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 是否开启 Java 应用的 APM 自动上报功能，1 表示启用；0 表示关闭 
     * @return EnableTracing 是否开启 Java 应用的 APM 自动上报功能，1 表示启用；0 表示关闭
     */
    public Long getEnableTracing() {
        return this.EnableTracing;
    }

    /**
     * Set 是否开启 Java 应用的 APM 自动上报功能，1 表示启用；0 表示关闭
     * @param EnableTracing 是否开启 Java 应用的 APM 自动上报功能，1 表示启用；0 表示关闭
     */
    public void setEnableTracing(Long EnableTracing) {
        this.EnableTracing = EnableTracing;
    }

    /**
     * Get 使用默认镜像服务额外参数 
     * @return UseDefaultImageServiceParameters 使用默认镜像服务额外参数
     */
    public UseDefaultRepoParameters getUseDefaultImageServiceParameters() {
        return this.UseDefaultImageServiceParameters;
    }

    /**
     * Set 使用默认镜像服务额外参数
     * @param UseDefaultImageServiceParameters 使用默认镜像服务额外参数
     */
    public void setUseDefaultImageServiceParameters(UseDefaultRepoParameters UseDefaultImageServiceParameters) {
        this.UseDefaultImageServiceParameters = UseDefaultImageServiceParameters;
    }

    public CreateApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationRequest(CreateApplicationRequest source) {
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UseDefaultImageService != null) {
            this.UseDefaultImageService = new Long(source.UseDefaultImageService);
        }
        if (source.RepoType != null) {
            this.RepoType = new Long(source.RepoType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RepoServer != null) {
            this.RepoServer = new String(source.RepoServer);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.SubnetList != null) {
            this.SubnetList = new String[source.SubnetList.length];
            for (int i = 0; i < source.SubnetList.length; i++) {
                this.SubnetList[i] = new String(source.SubnetList[i]);
            }
        }
        if (source.CodingLanguage != null) {
            this.CodingLanguage = new String(source.CodingLanguage);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.EnableTracing != null) {
            this.EnableTracing = new Long(source.EnableTracing);
        }
        if (source.UseDefaultImageServiceParameters != null) {
            this.UseDefaultImageServiceParameters = new UseDefaultRepoParameters(source.UseDefaultImageServiceParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UseDefaultImageService", this.UseDefaultImageService);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RepoServer", this.RepoServer);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamArraySimple(map, prefix + "SubnetList.", this.SubnetList);
        this.setParamSimple(map, prefix + "CodingLanguage", this.CodingLanguage);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "EnableTracing", this.EnableTracing);
        this.setParamObj(map, prefix + "UseDefaultImageServiceParameters.", this.UseDefaultImageServiceParameters);

    }
}

