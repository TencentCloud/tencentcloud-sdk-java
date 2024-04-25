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
package com.tencentcloudapi.cloudstudio.v20230508.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkspaceRequest extends AbstractModel {

    /**
    * 工作空间名称, 长度限制 2~64
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 工作空间描述, 长度限制 0~255
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工作空间规格。Standard: 2C4G, Calculation: 4C8G, Profession: 8C16G. 默认是 Standard。
    */
    @SerializedName("Specs")
    @Expose
    private String Specs;

    /**
    * 工作空间基础镜像名称, 默认会使用 All In One 镜像, 长度限制 1~255
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Git 仓库. 工作空间启动时会自动克隆该仓库
    */
    @SerializedName("Repository")
    @Expose
    private GitRepository Repository;

    /**
    * 环境变量. 会被注入到工作空间中
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * 预装插件. 工作空间启动时, 会自动安装这些插件。长度限制: 0~10
    */
    @SerializedName("Extensions")
    @Expose
    private String [] Extensions;

    /**
    * 工作空间生命周期钩子.  分为三个阶段 init, start, destroy. 分别表示工作空间数据初始化阶段, 工作空间启动阶段, 工作空间关闭阶段.  用户可以自定义 shell 命令. 
    */
    @SerializedName("Lifecycle")
    @Expose
    private LifeCycle Lifecycle;

    /**
    * 应用名称
    */
    @SerializedName("TenantAppId")
    @Expose
    private Long TenantAppId;

    /**
    * 用户UIN
    */
    @SerializedName("TenantUin")
    @Expose
    private String TenantUin;

    /**
    * VPCID
    */
    @SerializedName("TenantUniqVpcId")
    @Expose
    private String TenantUniqVpcId;

    /**
    * 子网ID
    */
    @SerializedName("TenantSubnetId")
    @Expose
    private String TenantSubnetId;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 工作空间名称, 长度限制 2~64 
     * @return Name 工作空间名称, 长度限制 2~64
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 工作空间名称, 长度限制 2~64
     * @param Name 工作空间名称, 长度限制 2~64
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 工作空间描述, 长度限制 0~255 
     * @return Description 工作空间描述, 长度限制 0~255
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 工作空间描述, 长度限制 0~255
     * @param Description 工作空间描述, 长度限制 0~255
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工作空间规格。Standard: 2C4G, Calculation: 4C8G, Profession: 8C16G. 默认是 Standard。 
     * @return Specs 工作空间规格。Standard: 2C4G, Calculation: 4C8G, Profession: 8C16G. 默认是 Standard。
     */
    public String getSpecs() {
        return this.Specs;
    }

    /**
     * Set 工作空间规格。Standard: 2C4G, Calculation: 4C8G, Profession: 8C16G. 默认是 Standard。
     * @param Specs 工作空间规格。Standard: 2C4G, Calculation: 4C8G, Profession: 8C16G. 默认是 Standard。
     */
    public void setSpecs(String Specs) {
        this.Specs = Specs;
    }

    /**
     * Get 工作空间基础镜像名称, 默认会使用 All In One 镜像, 长度限制 1~255 
     * @return Image 工作空间基础镜像名称, 默认会使用 All In One 镜像, 长度限制 1~255
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 工作空间基础镜像名称, 默认会使用 All In One 镜像, 长度限制 1~255
     * @param Image 工作空间基础镜像名称, 默认会使用 All In One 镜像, 长度限制 1~255
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get Git 仓库. 工作空间启动时会自动克隆该仓库 
     * @return Repository Git 仓库. 工作空间启动时会自动克隆该仓库
     */
    public GitRepository getRepository() {
        return this.Repository;
    }

    /**
     * Set Git 仓库. 工作空间启动时会自动克隆该仓库
     * @param Repository Git 仓库. 工作空间启动时会自动克隆该仓库
     */
    public void setRepository(GitRepository Repository) {
        this.Repository = Repository;
    }

    /**
     * Get 环境变量. 会被注入到工作空间中 
     * @return Envs 环境变量. 会被注入到工作空间中
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 环境变量. 会被注入到工作空间中
     * @param Envs 环境变量. 会被注入到工作空间中
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 预装插件. 工作空间启动时, 会自动安装这些插件。长度限制: 0~10 
     * @return Extensions 预装插件. 工作空间启动时, 会自动安装这些插件。长度限制: 0~10
     */
    public String [] getExtensions() {
        return this.Extensions;
    }

    /**
     * Set 预装插件. 工作空间启动时, 会自动安装这些插件。长度限制: 0~10
     * @param Extensions 预装插件. 工作空间启动时, 会自动安装这些插件。长度限制: 0~10
     */
    public void setExtensions(String [] Extensions) {
        this.Extensions = Extensions;
    }

    /**
     * Get 工作空间生命周期钩子.  分为三个阶段 init, start, destroy. 分别表示工作空间数据初始化阶段, 工作空间启动阶段, 工作空间关闭阶段.  用户可以自定义 shell 命令.  
     * @return Lifecycle 工作空间生命周期钩子.  分为三个阶段 init, start, destroy. 分别表示工作空间数据初始化阶段, 工作空间启动阶段, 工作空间关闭阶段.  用户可以自定义 shell 命令. 
     */
    public LifeCycle getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set 工作空间生命周期钩子.  分为三个阶段 init, start, destroy. 分别表示工作空间数据初始化阶段, 工作空间启动阶段, 工作空间关闭阶段.  用户可以自定义 shell 命令. 
     * @param Lifecycle 工作空间生命周期钩子.  分为三个阶段 init, start, destroy. 分别表示工作空间数据初始化阶段, 工作空间启动阶段, 工作空间关闭阶段.  用户可以自定义 shell 命令. 
     */
    public void setLifecycle(LifeCycle Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get 应用名称 
     * @return TenantAppId 应用名称
     */
    public Long getTenantAppId() {
        return this.TenantAppId;
    }

    /**
     * Set 应用名称
     * @param TenantAppId 应用名称
     */
    public void setTenantAppId(Long TenantAppId) {
        this.TenantAppId = TenantAppId;
    }

    /**
     * Get 用户UIN 
     * @return TenantUin 用户UIN
     */
    public String getTenantUin() {
        return this.TenantUin;
    }

    /**
     * Set 用户UIN
     * @param TenantUin 用户UIN
     */
    public void setTenantUin(String TenantUin) {
        this.TenantUin = TenantUin;
    }

    /**
     * Get VPCID 
     * @return TenantUniqVpcId VPCID
     */
    public String getTenantUniqVpcId() {
        return this.TenantUniqVpcId;
    }

    /**
     * Set VPCID
     * @param TenantUniqVpcId VPCID
     */
    public void setTenantUniqVpcId(String TenantUniqVpcId) {
        this.TenantUniqVpcId = TenantUniqVpcId;
    }

    /**
     * Get 子网ID 
     * @return TenantSubnetId 子网ID
     */
    public String getTenantSubnetId() {
        return this.TenantSubnetId;
    }

    /**
     * Set 子网ID
     * @param TenantSubnetId 子网ID
     */
    public void setTenantSubnetId(String TenantSubnetId) {
        this.TenantSubnetId = TenantSubnetId;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public CreateWorkspaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkspaceRequest(CreateWorkspaceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Specs != null) {
            this.Specs = new String(source.Specs);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Repository != null) {
            this.Repository = new GitRepository(source.Repository);
        }
        if (source.Envs != null) {
            this.Envs = new Env[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new Env(source.Envs[i]);
            }
        }
        if (source.Extensions != null) {
            this.Extensions = new String[source.Extensions.length];
            for (int i = 0; i < source.Extensions.length; i++) {
                this.Extensions[i] = new String(source.Extensions[i]);
            }
        }
        if (source.Lifecycle != null) {
            this.Lifecycle = new LifeCycle(source.Lifecycle);
        }
        if (source.TenantAppId != null) {
            this.TenantAppId = new Long(source.TenantAppId);
        }
        if (source.TenantUin != null) {
            this.TenantUin = new String(source.TenantUin);
        }
        if (source.TenantUniqVpcId != null) {
            this.TenantUniqVpcId = new String(source.TenantUniqVpcId);
        }
        if (source.TenantSubnetId != null) {
            this.TenantSubnetId = new String(source.TenantSubnetId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Specs", this.Specs);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamObj(map, prefix + "Repository.", this.Repository);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArraySimple(map, prefix + "Extensions.", this.Extensions);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);
        this.setParamSimple(map, prefix + "TenantAppId", this.TenantAppId);
        this.setParamSimple(map, prefix + "TenantUin", this.TenantUin);
        this.setParamSimple(map, prefix + "TenantUniqVpcId", this.TenantUniqVpcId);
        this.setParamSimple(map, prefix + "TenantSubnetId", this.TenantSubnetId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

