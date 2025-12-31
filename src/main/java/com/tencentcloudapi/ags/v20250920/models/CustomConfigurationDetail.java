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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomConfigurationDetail extends AbstractModel {

    /**
    * 镜像地址
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 镜像仓库类型：`TCR`、`CCR`。
    */
    @SerializedName("ImageRegistryType")
    @Expose
    private String ImageRegistryType;

    /**
    * 镜像 Digest
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * 启动命令
    */
    @SerializedName("Command")
    @Expose
    private String [] Command;

    /**
    * 启动参数
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * 环境变量
    */
    @SerializedName("Env")
    @Expose
    private EnvVar [] Env;

    /**
    * 端口配置
    */
    @SerializedName("Ports")
    @Expose
    private PortConfiguration [] Ports;

    /**
    * 资源配置
    */
    @SerializedName("Resources")
    @Expose
    private ResourceConfiguration Resources;

    /**
    * 探针配置
    */
    @SerializedName("Probe")
    @Expose
    private ProbeConfiguration Probe;

    /**
     * Get 镜像地址 
     * @return Image 镜像地址
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 镜像地址
     * @param Image 镜像地址
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 镜像仓库类型：`TCR`、`CCR`。 
     * @return ImageRegistryType 镜像仓库类型：`TCR`、`CCR`。
     */
    public String getImageRegistryType() {
        return this.ImageRegistryType;
    }

    /**
     * Set 镜像仓库类型：`TCR`、`CCR`。
     * @param ImageRegistryType 镜像仓库类型：`TCR`、`CCR`。
     */
    public void setImageRegistryType(String ImageRegistryType) {
        this.ImageRegistryType = ImageRegistryType;
    }

    /**
     * Get 镜像 Digest 
     * @return ImageDigest 镜像 Digest
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set 镜像 Digest
     * @param ImageDigest 镜像 Digest
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get 启动命令 
     * @return Command 启动命令
     */
    public String [] getCommand() {
        return this.Command;
    }

    /**
     * Set 启动命令
     * @param Command 启动命令
     */
    public void setCommand(String [] Command) {
        this.Command = Command;
    }

    /**
     * Get 启动参数 
     * @return Args 启动参数
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set 启动参数
     * @param Args 启动参数
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * Get 环境变量 
     * @return Env 环境变量
     */
    public EnvVar [] getEnv() {
        return this.Env;
    }

    /**
     * Set 环境变量
     * @param Env 环境变量
     */
    public void setEnv(EnvVar [] Env) {
        this.Env = Env;
    }

    /**
     * Get 端口配置 
     * @return Ports 端口配置
     */
    public PortConfiguration [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 端口配置
     * @param Ports 端口配置
     */
    public void setPorts(PortConfiguration [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 资源配置 
     * @return Resources 资源配置
     */
    public ResourceConfiguration getResources() {
        return this.Resources;
    }

    /**
     * Set 资源配置
     * @param Resources 资源配置
     */
    public void setResources(ResourceConfiguration Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 探针配置 
     * @return Probe 探针配置
     */
    public ProbeConfiguration getProbe() {
        return this.Probe;
    }

    /**
     * Set 探针配置
     * @param Probe 探针配置
     */
    public void setProbe(ProbeConfiguration Probe) {
        this.Probe = Probe;
    }

    public CustomConfigurationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomConfigurationDetail(CustomConfigurationDetail source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ImageRegistryType != null) {
            this.ImageRegistryType = new String(source.ImageRegistryType);
        }
        if (source.ImageDigest != null) {
            this.ImageDigest = new String(source.ImageDigest);
        }
        if (source.Command != null) {
            this.Command = new String[source.Command.length];
            for (int i = 0; i < source.Command.length; i++) {
                this.Command[i] = new String(source.Command[i]);
            }
        }
        if (source.Args != null) {
            this.Args = new String[source.Args.length];
            for (int i = 0; i < source.Args.length; i++) {
                this.Args[i] = new String(source.Args[i]);
            }
        }
        if (source.Env != null) {
            this.Env = new EnvVar[source.Env.length];
            for (int i = 0; i < source.Env.length; i++) {
                this.Env[i] = new EnvVar(source.Env[i]);
            }
        }
        if (source.Ports != null) {
            this.Ports = new PortConfiguration[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new PortConfiguration(source.Ports[i]);
            }
        }
        if (source.Resources != null) {
            this.Resources = new ResourceConfiguration(source.Resources);
        }
        if (source.Probe != null) {
            this.Probe = new ProbeConfiguration(source.Probe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImageRegistryType", this.ImageRegistryType);
        this.setParamSimple(map, prefix + "ImageDigest", this.ImageDigest);
        this.setParamArraySimple(map, prefix + "Command.", this.Command);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamArrayObj(map, prefix + "Env.", this.Env);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "Probe.", this.Probe);

    }
}

