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
    * <p>镜像相关信息</p>
    */
    @SerializedName("Image")
    @Expose
    private ImageInfo Image;

    /**
    * <p>服务监听端口</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>启动命令</p>
    */
    @SerializedName("Scripts")
    @Expose
    private String [] Scripts;

    /**
    * <p>环境变量列表</p>
    */
    @SerializedName("Envs")
    @Expose
    private EnvParam [] Envs;

    /**
    * <p>存储挂载配置</p>
    */
    @SerializedName("Storages")
    @Expose
    private StorageInfo [] Storages;

    /**
    * <p>探针信息</p>
    */
    @SerializedName("Probe")
    @Expose
    private ProbeInfo Probe;

    /**
     * Get <p>镜像相关信息</p> 
     * @return Image <p>镜像相关信息</p>
     */
    public ImageInfo getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像相关信息</p>
     * @param Image <p>镜像相关信息</p>
     */
    public void setImage(ImageInfo Image) {
        this.Image = Image;
    }

    /**
     * Get <p>服务监听端口</p> 
     * @return Port <p>服务监听端口</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>服务监听端口</p>
     * @param Port <p>服务监听端口</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>启动命令</p> 
     * @return Scripts <p>启动命令</p>
     */
    public String [] getScripts() {
        return this.Scripts;
    }

    /**
     * Set <p>启动命令</p>
     * @param Scripts <p>启动命令</p>
     */
    public void setScripts(String [] Scripts) {
        this.Scripts = Scripts;
    }

    /**
     * Get <p>环境变量列表</p> 
     * @return Envs <p>环境变量列表</p>
     */
    public EnvParam [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>环境变量列表</p>
     * @param Envs <p>环境变量列表</p>
     */
    public void setEnvs(EnvParam [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get <p>存储挂载配置</p> 
     * @return Storages <p>存储挂载配置</p>
     */
    public StorageInfo [] getStorages() {
        return this.Storages;
    }

    /**
     * Set <p>存储挂载配置</p>
     * @param Storages <p>存储挂载配置</p>
     */
    public void setStorages(StorageInfo [] Storages) {
        this.Storages = Storages;
    }

    /**
     * Get <p>探针信息</p> 
     * @return Probe <p>探针信息</p>
     */
    public ProbeInfo getProbe() {
        return this.Probe;
    }

    /**
     * Set <p>探针信息</p>
     * @param Probe <p>探针信息</p>
     */
    public void setProbe(ProbeInfo Probe) {
        this.Probe = Probe;
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
        if (source.Probe != null) {
            this.Probe = new ProbeInfo(source.Probe);
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
        this.setParamObj(map, prefix + "Probe.", this.Probe);

    }
}

