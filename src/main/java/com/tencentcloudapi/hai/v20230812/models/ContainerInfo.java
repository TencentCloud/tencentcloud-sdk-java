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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerInfo extends AbstractModel {

    /**
    * 镜像相关信息
    */
    @SerializedName("Image")
    @Expose
    private ImageInfo Image;

    /**
    * 服务监听端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 启动命令
    */
    @SerializedName("Scripts")
    @Expose
    private String [] Scripts;

    /**
    * 环境变量列表
    */
    @SerializedName("Envs")
    @Expose
    private EnvParam [] Envs;

    /**
    * 存储挂载配置
    */
    @SerializedName("Storages")
    @Expose
    private StorageInfo [] Storages;

    /**
     * Get 镜像相关信息 
     * @return Image 镜像相关信息
     */
    public ImageInfo getImage() {
        return this.Image;
    }

    /**
     * Set 镜像相关信息
     * @param Image 镜像相关信息
     */
    public void setImage(ImageInfo Image) {
        this.Image = Image;
    }

    /**
     * Get 服务监听端口 
     * @return Port 服务监听端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 服务监听端口
     * @param Port 服务监听端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 启动命令 
     * @return Scripts 启动命令
     */
    public String [] getScripts() {
        return this.Scripts;
    }

    /**
     * Set 启动命令
     * @param Scripts 启动命令
     */
    public void setScripts(String [] Scripts) {
        this.Scripts = Scripts;
    }

    /**
     * Get 环境变量列表 
     * @return Envs 环境变量列表
     */
    public EnvParam [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 环境变量列表
     * @param Envs 环境变量列表
     */
    public void setEnvs(EnvParam [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 存储挂载配置 
     * @return Storages 存储挂载配置
     */
    public StorageInfo [] getStorages() {
        return this.Storages;
    }

    /**
     * Set 存储挂载配置
     * @param Storages 存储挂载配置
     */
    public void setStorages(StorageInfo [] Storages) {
        this.Storages = Storages;
    }

    public ContainerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerInfo(ContainerInfo source) {
        if (source.Image != null) {
            this.Image = new ImageInfo(source.Image);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Scripts != null) {
            this.Scripts = new String[source.Scripts.length];
            for (int i = 0; i < source.Scripts.length; i++) {
                this.Scripts[i] = new String(source.Scripts[i]);
            }
        }
        if (source.Envs != null) {
            this.Envs = new EnvParam[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new EnvParam(source.Envs[i]);
            }
        }
        if (source.Storages != null) {
            this.Storages = new StorageInfo[source.Storages.length];
            for (int i = 0; i < source.Storages.length; i++) {
                this.Storages[i] = new StorageInfo(source.Storages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArraySimple(map, prefix + "Scripts.", this.Scripts);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "Storages.", this.Storages);

    }
}

