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
    * <p>镜像地址</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>镜像仓库类型：<code>TCR</code>、<code>CCR</code>。</p>
    */
    @SerializedName("ImageRegistryType")
    @Expose
    private String ImageRegistryType;

    /**
    * <p>镜像 Digest</p>
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * <p>启动命令</p>
    */
    @SerializedName("Command")
    @Expose
    private String [] Command;

    /**
    * <p>启动参数</p>
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("Env")
    @Expose
    private EnvVar [] Env;

    /**
    * <p>端口配置</p>
    */
    @SerializedName("Ports")
    @Expose
    private PortConfiguration [] Ports;

    /**
    * <p>资源配置</p>
    */
    @SerializedName("Resources")
    @Expose
    private ResourceConfiguration Resources;

    /**
    * <p>探针配置</p>
    */
    @SerializedName("Probe")
    @Expose
    private ProbeConfiguration Probe;

    /**
    * <p>沙箱 DNS 配置</p>
    */
    @SerializedName("DNSConfig")
    @Expose
    private DNSConfig DNSConfig;

    /**
     * Get <p>镜像地址</p> 
     * @return Image <p>镜像地址</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像地址</p>
     * @param Image <p>镜像地址</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>镜像仓库类型：<code>TCR</code>、<code>CCR</code>。</p> 
     * @return ImageRegistryType <p>镜像仓库类型：<code>TCR</code>、<code>CCR</code>。</p>
     */
    public String getImageRegistryType() {
        return this.ImageRegistryType;
    }

    /**
     * Set <p>镜像仓库类型：<code>TCR</code>、<code>CCR</code>。</p>
     * @param ImageRegistryType <p>镜像仓库类型：<code>TCR</code>、<code>CCR</code>。</p>
     */
    public void setImageRegistryType(String ImageRegistryType) {
        this.ImageRegistryType = ImageRegistryType;
    }

    /**
     * Get <p>镜像 Digest</p> 
     * @return ImageDigest <p>镜像 Digest</p>
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set <p>镜像 Digest</p>
     * @param ImageDigest <p>镜像 Digest</p>
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get <p>启动命令</p> 
     * @return Command <p>启动命令</p>
     */
    public String [] getCommand() {
        return this.Command;
    }

    /**
     * Set <p>启动命令</p>
     * @param Command <p>启动命令</p>
     */
    public void setCommand(String [] Command) {
        this.Command = Command;
    }

    /**
     * Get <p>启动参数</p> 
     * @return Args <p>启动参数</p>
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set <p>启动参数</p>
     * @param Args <p>启动参数</p>
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * Get <p>环境变量</p> 
     * @return Env <p>环境变量</p>
     */
    public EnvVar [] getEnv() {
        return this.Env;
    }

    /**
     * Set <p>环境变量</p>
     * @param Env <p>环境变量</p>
     */
    public void setEnv(EnvVar [] Env) {
        this.Env = Env;
    }

    /**
     * Get <p>端口配置</p> 
     * @return Ports <p>端口配置</p>
     */
    public PortConfiguration [] getPorts() {
        return this.Ports;
    }

    /**
     * Set <p>端口配置</p>
     * @param Ports <p>端口配置</p>
     */
    public void setPorts(PortConfiguration [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get <p>资源配置</p> 
     * @return Resources <p>资源配置</p>
     */
    public ResourceConfiguration getResources() {
        return this.Resources;
    }

    /**
     * Set <p>资源配置</p>
     * @param Resources <p>资源配置</p>
     */
    public void setResources(ResourceConfiguration Resources) {
        this.Resources = Resources;
    }

    /**
     * Get <p>探针配置</p> 
     * @return Probe <p>探针配置</p>
     */
    public ProbeConfiguration getProbe() {
        return this.Probe;
    }

    /**
     * Set <p>探针配置</p>
     * @param Probe <p>探针配置</p>
     */
    public void setProbe(ProbeConfiguration Probe) {
        this.Probe = Probe;
    }

    /**
     * Get <p>沙箱 DNS 配置</p> 
     * @return DNSConfig <p>沙箱 DNS 配置</p>
     */
    public DNSConfig getDNSConfig() {
        return this.DNSConfig;
    }

    /**
     * Set <p>沙箱 DNS 配置</p>
     * @param DNSConfig <p>沙箱 DNS 配置</p>
     */
    public void setDNSConfig(DNSConfig DNSConfig) {
        this.DNSConfig = DNSConfig;
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
        if (source.DNSConfig != null) {
            this.DNSConfig = new DNSConfig(source.DNSConfig);
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
        this.setParamObj(map, prefix + "DNSConfig.", this.DNSConfig);

    }
}

