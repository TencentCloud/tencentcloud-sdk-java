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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Container extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 镜像名
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像版本
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * 镜像拉取策略(Always|Never|IfNotPresent)
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
    * 卷挂载配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeMounts")
    @Expose
    private VolumeMount [] VolumeMounts;

    /**
    * cpu最低配置
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * cpu最高限制
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 内存最低要求
    */
    @SerializedName("MemoryRequest")
    @Expose
    private String MemoryRequest;

    /**
    * 内存最高要求
    */
    @SerializedName("MemoryLimit")
    @Expose
    private String MemoryLimit;

    /**
    * 内存单位
    */
    @SerializedName("MemoryUnit")
    @Expose
    private String MemoryUnit;

    /**
    * gpu最高限制
    */
    @SerializedName("GpuLimit")
    @Expose
    private String GpuLimit;

    /**
    * 资源配置
    */
    @SerializedName("ResourceMapCloud")
    @Expose
    private KeyValueObj [] ResourceMapCloud;

    /**
    * 环境配置
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * 工作目录
    */
    @SerializedName("WorkingDir")
    @Expose
    private String WorkingDir;

    /**
    * 命令
    */
    @SerializedName("Commands")
    @Expose
    private String [] Commands;

    /**
    * 参数
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * 安全配置
    */
    @SerializedName("SecurityContext")
    @Expose
    private SecurityContext SecurityContext;

    /**
    * 就绪探针配置
    */
    @SerializedName("ReadinessProbe")
    @Expose
    private Probe ReadinessProbe;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 镜像名 
     * @return ImageName 镜像名
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名
     * @param ImageName 镜像名
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像版本 
     * @return ImageVersion 镜像版本
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 镜像版本
     * @param ImageVersion 镜像版本
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get 镜像拉取策略(Always|Never|IfNotPresent) 
     * @return ImagePullPolicy 镜像拉取策略(Always|Never|IfNotPresent)
     */
    public String getImagePullPolicy() {
        return this.ImagePullPolicy;
    }

    /**
     * Set 镜像拉取策略(Always|Never|IfNotPresent)
     * @param ImagePullPolicy 镜像拉取策略(Always|Never|IfNotPresent)
     */
    public void setImagePullPolicy(String ImagePullPolicy) {
        this.ImagePullPolicy = ImagePullPolicy;
    }

    /**
     * Get 卷挂载配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeMounts 卷挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set 卷挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeMounts 卷挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeMounts(VolumeMount [] VolumeMounts) {
        this.VolumeMounts = VolumeMounts;
    }

    /**
     * Get cpu最低配置 
     * @return CpuRequest cpu最低配置
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set cpu最低配置
     * @param CpuRequest cpu最低配置
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get cpu最高限制 
     * @return CpuLimit cpu最高限制
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set cpu最高限制
     * @param CpuLimit cpu最高限制
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 内存最低要求 
     * @return MemoryRequest 内存最低要求
     */
    public String getMemoryRequest() {
        return this.MemoryRequest;
    }

    /**
     * Set 内存最低要求
     * @param MemoryRequest 内存最低要求
     */
    public void setMemoryRequest(String MemoryRequest) {
        this.MemoryRequest = MemoryRequest;
    }

    /**
     * Get 内存最高要求 
     * @return MemoryLimit 内存最高要求
     */
    public String getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set 内存最高要求
     * @param MemoryLimit 内存最高要求
     */
    public void setMemoryLimit(String MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get 内存单位 
     * @return MemoryUnit 内存单位
     */
    public String getMemoryUnit() {
        return this.MemoryUnit;
    }

    /**
     * Set 内存单位
     * @param MemoryUnit 内存单位
     */
    public void setMemoryUnit(String MemoryUnit) {
        this.MemoryUnit = MemoryUnit;
    }

    /**
     * Get gpu最高限制 
     * @return GpuLimit gpu最高限制
     */
    public String getGpuLimit() {
        return this.GpuLimit;
    }

    /**
     * Set gpu最高限制
     * @param GpuLimit gpu最高限制
     */
    public void setGpuLimit(String GpuLimit) {
        this.GpuLimit = GpuLimit;
    }

    /**
     * Get 资源配置 
     * @return ResourceMapCloud 资源配置
     */
    public KeyValueObj [] getResourceMapCloud() {
        return this.ResourceMapCloud;
    }

    /**
     * Set 资源配置
     * @param ResourceMapCloud 资源配置
     */
    public void setResourceMapCloud(KeyValueObj [] ResourceMapCloud) {
        this.ResourceMapCloud = ResourceMapCloud;
    }

    /**
     * Get 环境配置 
     * @return Envs 环境配置
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 环境配置
     * @param Envs 环境配置
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 工作目录 
     * @return WorkingDir 工作目录
     */
    public String getWorkingDir() {
        return this.WorkingDir;
    }

    /**
     * Set 工作目录
     * @param WorkingDir 工作目录
     */
    public void setWorkingDir(String WorkingDir) {
        this.WorkingDir = WorkingDir;
    }

    /**
     * Get 命令 
     * @return Commands 命令
     */
    public String [] getCommands() {
        return this.Commands;
    }

    /**
     * Set 命令
     * @param Commands 命令
     */
    public void setCommands(String [] Commands) {
        this.Commands = Commands;
    }

    /**
     * Get 参数 
     * @return Args 参数
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set 参数
     * @param Args 参数
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * Get 安全配置 
     * @return SecurityContext 安全配置
     */
    public SecurityContext getSecurityContext() {
        return this.SecurityContext;
    }

    /**
     * Set 安全配置
     * @param SecurityContext 安全配置
     */
    public void setSecurityContext(SecurityContext SecurityContext) {
        this.SecurityContext = SecurityContext;
    }

    /**
     * Get 就绪探针配置 
     * @return ReadinessProbe 就绪探针配置
     */
    public Probe getReadinessProbe() {
        return this.ReadinessProbe;
    }

    /**
     * Set 就绪探针配置
     * @param ReadinessProbe 就绪探针配置
     */
    public void setReadinessProbe(Probe ReadinessProbe) {
        this.ReadinessProbe = ReadinessProbe;
    }

    public Container() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Container(Container source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
        if (source.VolumeMounts != null) {
            this.VolumeMounts = new VolumeMount[source.VolumeMounts.length];
            for (int i = 0; i < source.VolumeMounts.length; i++) {
                this.VolumeMounts[i] = new VolumeMount(source.VolumeMounts[i]);
            }
        }
        if (source.CpuRequest != null) {
            this.CpuRequest = new String(source.CpuRequest);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new String(source.CpuLimit);
        }
        if (source.MemoryRequest != null) {
            this.MemoryRequest = new String(source.MemoryRequest);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new String(source.MemoryLimit);
        }
        if (source.MemoryUnit != null) {
            this.MemoryUnit = new String(source.MemoryUnit);
        }
        if (source.GpuLimit != null) {
            this.GpuLimit = new String(source.GpuLimit);
        }
        if (source.ResourceMapCloud != null) {
            this.ResourceMapCloud = new KeyValueObj[source.ResourceMapCloud.length];
            for (int i = 0; i < source.ResourceMapCloud.length; i++) {
                this.ResourceMapCloud[i] = new KeyValueObj(source.ResourceMapCloud[i]);
            }
        }
        if (source.Envs != null) {
            this.Envs = new Env[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new Env(source.Envs[i]);
            }
        }
        if (source.WorkingDir != null) {
            this.WorkingDir = new String(source.WorkingDir);
        }
        if (source.Commands != null) {
            this.Commands = new String[source.Commands.length];
            for (int i = 0; i < source.Commands.length; i++) {
                this.Commands[i] = new String(source.Commands[i]);
            }
        }
        if (source.Args != null) {
            this.Args = new String[source.Args.length];
            for (int i = 0; i < source.Args.length; i++) {
                this.Args[i] = new String(source.Args[i]);
            }
        }
        if (source.SecurityContext != null) {
            this.SecurityContext = new SecurityContext(source.SecurityContext);
        }
        if (source.ReadinessProbe != null) {
            this.ReadinessProbe = new Probe(source.ReadinessProbe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemoryRequest", this.MemoryRequest);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "MemoryUnit", this.MemoryUnit);
        this.setParamSimple(map, prefix + "GpuLimit", this.GpuLimit);
        this.setParamArrayObj(map, prefix + "ResourceMapCloud.", this.ResourceMapCloud);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamSimple(map, prefix + "WorkingDir", this.WorkingDir);
        this.setParamArraySimple(map, prefix + "Commands.", this.Commands);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamObj(map, prefix + "SecurityContext.", this.SecurityContext);
        this.setParamObj(map, prefix + "ReadinessProbe.", this.ReadinessProbe);

    }
}

