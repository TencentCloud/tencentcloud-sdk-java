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
package com.tencentcloudapi.cloudstudio.v20230508.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkspaceRequest extends AbstractModel {

    /**
    * <p>工作空间名称, 长度限制 2~64</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>工作空间描述, 长度限制 0~255</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>工作空间规格。Standard: 2C4G, Calculation: 4C8G, Profession: 8C16G. 默认是 Standard。</p>
    */
    @SerializedName("Specs")
    @Expose
    private String Specs;

    /**
    * <p>工作空间基础镜像名称, 默认会使用 All In One 镜像, 长度限制 1~255</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>Git 仓库. 工作空间启动时会自动克隆该仓库</p>
    */
    @SerializedName("Repository")
    @Expose
    private GitRepository Repository;

    /**
    * <p>环境变量. 会被注入到工作空间中</p>
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * <p>预装插件. 工作空间启动时, 会自动安装这些插件。长度限制: 0~10</p>
    */
    @SerializedName("Extensions")
    @Expose
    private String [] Extensions;

    /**
    * <p>工作空间生命周期钩子.  分为三个阶段 init, start, destroy. 分别表示工作空间数据初始化阶段, 工作空间启动阶段, 工作空间关闭阶段.  用户可以自定义 shell 命令.</p>
    */
    @SerializedName("Lifecycle")
    @Expose
    private LifeCycle Lifecycle;

    /**
    * <p>应用名称</p>
    */
    @SerializedName("TenantAppId")
    @Expose
    private Long TenantAppId;

    /**
    * <p>用户UIN</p>
    */
    @SerializedName("TenantUin")
    @Expose
    private String TenantUin;

    /**
    * <p>VPCID</p>
    */
    @SerializedName("TenantUniqVpcId")
    @Expose
    private String TenantUniqVpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("TenantSubnetId")
    @Expose
    private String TenantSubnetId;

    /**
     * Get <p>工作空间名称, 长度限制 2~64</p> 
     * @return Name <p>工作空间名称, 长度限制 2~64</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>工作空间名称, 长度限制 2~64</p>
     * @param Name <p>工作空间名称, 长度限制 2~64</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>工作空间描述, 长度限制 0~255</p> 
     * @return Description <p>工作空间描述, 长度限制 0~255</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>工作空间描述, 长度限制 0~255</p>
     * @param Description <p>工作空间描述, 长度限制 0~255</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>工作空间规格。Standard: 2C4G, Calculation: 4C8G, Profession: 8C16G. 默认是 Standard。</p> 
     * @return Specs <p>工作空间规格。Standard: 2C4G, Calculation: 4C8G, Profession: 8C16G. 默认是 Standard。</p>
     */
    public String getSpecs() {
        return this.Specs;
    }

    /**
     * Set <p>工作空间规格。Standard: 2C4G, Calculation: 4C8G, Profession: 8C16G. 默认是 Standard。</p>
     * @param Specs <p>工作空间规格。Standard: 2C4G, Calculation: 4C8G, Profession: 8C16G. 默认是 Standard。</p>
     */
    public void setSpecs(String Specs) {
        this.Specs = Specs;
    }

    /**
     * Get <p>工作空间基础镜像名称, 默认会使用 All In One 镜像, 长度限制 1~255</p> 
     * @return Image <p>工作空间基础镜像名称, 默认会使用 All In One 镜像, 长度限制 1~255</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>工作空间基础镜像名称, 默认会使用 All In One 镜像, 长度限制 1~255</p>
     * @param Image <p>工作空间基础镜像名称, 默认会使用 All In One 镜像, 长度限制 1~255</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>Git 仓库. 工作空间启动时会自动克隆该仓库</p> 
     * @return Repository <p>Git 仓库. 工作空间启动时会自动克隆该仓库</p>
     */
    public GitRepository getRepository() {
        return this.Repository;
    }

    /**
     * Set <p>Git 仓库. 工作空间启动时会自动克隆该仓库</p>
     * @param Repository <p>Git 仓库. 工作空间启动时会自动克隆该仓库</p>
     */
    public void setRepository(GitRepository Repository) {
        this.Repository = Repository;
    }

    /**
     * Get <p>环境变量. 会被注入到工作空间中</p> 
     * @return Envs <p>环境变量. 会被注入到工作空间中</p>
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>环境变量. 会被注入到工作空间中</p>
     * @param Envs <p>环境变量. 会被注入到工作空间中</p>
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get <p>预装插件. 工作空间启动时, 会自动安装这些插件。长度限制: 0~10</p> 
     * @return Extensions <p>预装插件. 工作空间启动时, 会自动安装这些插件。长度限制: 0~10</p>
     */
    public String [] getExtensions() {
        return this.Extensions;
    }

    /**
     * Set <p>预装插件. 工作空间启动时, 会自动安装这些插件。长度限制: 0~10</p>
     * @param Extensions <p>预装插件. 工作空间启动时, 会自动安装这些插件。长度限制: 0~10</p>
     */
    public void setExtensions(String [] Extensions) {
        this.Extensions = Extensions;
    }

    /**
     * Get <p>工作空间生命周期钩子.  分为三个阶段 init, start, destroy. 分别表示工作空间数据初始化阶段, 工作空间启动阶段, 工作空间关闭阶段.  用户可以自定义 shell 命令.</p> 
     * @return Lifecycle <p>工作空间生命周期钩子.  分为三个阶段 init, start, destroy. 分别表示工作空间数据初始化阶段, 工作空间启动阶段, 工作空间关闭阶段.  用户可以自定义 shell 命令.</p>
     */
    public LifeCycle getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set <p>工作空间生命周期钩子.  分为三个阶段 init, start, destroy. 分别表示工作空间数据初始化阶段, 工作空间启动阶段, 工作空间关闭阶段.  用户可以自定义 shell 命令.</p>
     * @param Lifecycle <p>工作空间生命周期钩子.  分为三个阶段 init, start, destroy. 分别表示工作空间数据初始化阶段, 工作空间启动阶段, 工作空间关闭阶段.  用户可以自定义 shell 命令.</p>
     */
    public void setLifecycle(LifeCycle Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get <p>应用名称</p> 
     * @return TenantAppId <p>应用名称</p>
     */
    public Long getTenantAppId() {
        return this.TenantAppId;
    }

    /**
     * Set <p>应用名称</p>
     * @param TenantAppId <p>应用名称</p>
     */
    public void setTenantAppId(Long TenantAppId) {
        this.TenantAppId = TenantAppId;
    }

    /**
     * Get <p>用户UIN</p> 
     * @return TenantUin <p>用户UIN</p>
     */
    public String getTenantUin() {
        return this.TenantUin;
    }

    /**
     * Set <p>用户UIN</p>
     * @param TenantUin <p>用户UIN</p>
     */
    public void setTenantUin(String TenantUin) {
        this.TenantUin = TenantUin;
    }

    /**
     * Get <p>VPCID</p> 
     * @return TenantUniqVpcId <p>VPCID</p>
     */
    public String getTenantUniqVpcId() {
        return this.TenantUniqVpcId;
    }

    /**
     * Set <p>VPCID</p>
     * @param TenantUniqVpcId <p>VPCID</p>
     */
    public void setTenantUniqVpcId(String TenantUniqVpcId) {
        this.TenantUniqVpcId = TenantUniqVpcId;
    }

    /**
     * Get <p>子网ID</p> 
     * @return TenantSubnetId <p>子网ID</p>
     */
    public String getTenantSubnetId() {
        return this.TenantSubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param TenantSubnetId <p>子网ID</p>
     */
    public void setTenantSubnetId(String TenantSubnetId) {
        this.TenantSubnetId = TenantSubnetId;
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

    }
}

