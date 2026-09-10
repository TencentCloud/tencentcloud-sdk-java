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

public class ModifyWorkspaceRequest extends AbstractModel {

    /**
    * <p>工作空间 SpaceKey. 更新该工作空间的属性</p>
    */
    @SerializedName("SpaceKey")
    @Expose
    private String SpaceKey;

    /**
    * <p>工作空间名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>工作空间描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>工作空间规格。STANDARD: 2C4G, CALCULATION: 4C8G, PROFESSION: 8C16G. 默认是 STANDARD。</p>
    */
    @SerializedName("Specs")
    @Expose
    private String Specs;

    /**
    * <p>环境变量. 会被注入到工作空间中</p>
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * <p>预装插件. 工作空间启动时, 会自动安装这些插件</p>
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
     * Get <p>工作空间 SpaceKey. 更新该工作空间的属性</p> 
     * @return SpaceKey <p>工作空间 SpaceKey. 更新该工作空间的属性</p>
     */
    public String getSpaceKey() {
        return this.SpaceKey;
    }

    /**
     * Set <p>工作空间 SpaceKey. 更新该工作空间的属性</p>
     * @param SpaceKey <p>工作空间 SpaceKey. 更新该工作空间的属性</p>
     */
    public void setSpaceKey(String SpaceKey) {
        this.SpaceKey = SpaceKey;
    }

    /**
     * Get <p>工作空间名称</p> 
     * @return Name <p>工作空间名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>工作空间名称</p>
     * @param Name <p>工作空间名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>工作空间描述</p> 
     * @return Description <p>工作空间描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>工作空间描述</p>
     * @param Description <p>工作空间描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>工作空间规格。STANDARD: 2C4G, CALCULATION: 4C8G, PROFESSION: 8C16G. 默认是 STANDARD。</p> 
     * @return Specs <p>工作空间规格。STANDARD: 2C4G, CALCULATION: 4C8G, PROFESSION: 8C16G. 默认是 STANDARD。</p>
     */
    public String getSpecs() {
        return this.Specs;
    }

    /**
     * Set <p>工作空间规格。STANDARD: 2C4G, CALCULATION: 4C8G, PROFESSION: 8C16G. 默认是 STANDARD。</p>
     * @param Specs <p>工作空间规格。STANDARD: 2C4G, CALCULATION: 4C8G, PROFESSION: 8C16G. 默认是 STANDARD。</p>
     */
    public void setSpecs(String Specs) {
        this.Specs = Specs;
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
     * Get <p>预装插件. 工作空间启动时, 会自动安装这些插件</p> 
     * @return Extensions <p>预装插件. 工作空间启动时, 会自动安装这些插件</p>
     */
    public String [] getExtensions() {
        return this.Extensions;
    }

    /**
     * Set <p>预装插件. 工作空间启动时, 会自动安装这些插件</p>
     * @param Extensions <p>预装插件. 工作空间启动时, 会自动安装这些插件</p>
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

    public ModifyWorkspaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWorkspaceRequest(ModifyWorkspaceRequest source) {
        if (source.SpaceKey != null) {
            this.SpaceKey = new String(source.SpaceKey);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Specs != null) {
            this.Specs = new String(source.Specs);
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
        this.setParamSimple(map, prefix + "SpaceKey", this.SpaceKey);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Specs", this.Specs);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArraySimple(map, prefix + "Extensions.", this.Extensions);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);

    }
}

