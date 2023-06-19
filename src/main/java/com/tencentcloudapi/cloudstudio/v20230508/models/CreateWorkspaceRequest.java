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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkspaceRequest extends AbstractModel{

    /**
    * 工作空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 工作空间描述
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
    * 工作空间基础镜像名称, 默认会使用 All In One 镜像
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
    * 预装插件. 工作空间启动时, 会自动安装这些插件 
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
     * Get 工作空间名称 
     * @return Name 工作空间名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 工作空间名称
     * @param Name 工作空间名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 工作空间描述 
     * @return Description 工作空间描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 工作空间描述
     * @param Description 工作空间描述
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
     * Get 工作空间基础镜像名称, 默认会使用 All In One 镜像 
     * @return Image 工作空间基础镜像名称, 默认会使用 All In One 镜像
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 工作空间基础镜像名称, 默认会使用 All In One 镜像
     * @param Image 工作空间基础镜像名称, 默认会使用 All In One 镜像
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
     * Get 预装插件. 工作空间启动时, 会自动安装这些插件  
     * @return Extensions 预装插件. 工作空间启动时, 会自动安装这些插件 
     */
    public String [] getExtensions() {
        return this.Extensions;
    }

    /**
     * Set 预装插件. 工作空间启动时, 会自动安装这些插件 
     * @param Extensions 预装插件. 工作空间启动时, 会自动安装这些插件 
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

    }
}

