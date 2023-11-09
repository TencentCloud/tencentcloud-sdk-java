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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupContainerInfo extends AbstractModel {

    /**
    * 镜像版本名称
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 容器名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 镜像名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 仓库类型,tcr，address，personal，默认personal
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * tcr仓库信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcrRepoInfo")
    @Expose
    private TcrRepoInfo TcrRepoInfo;

    /**
    * 镜像server
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 凭证名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * jvm 参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * 容器最大的 CPU 核数，对应 K8S 的 limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 容器分配的 CPU 核数，对应 K8S 的 request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * 容器分配的内存 MiB 数，对应 K8S 的 request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemRequest")
    @Expose
    private String MemRequest;

    /**
    * 容器最大的内存 MiB 数，对应 K8S 的 limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemLimit")
    @Expose
    private String MemLimit;

    /**
    * 健康检查配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * 环境变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * 环境变量,作为入参时不用填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserEnvs")
    @Expose
    private Env [] UserEnvs;

    /**
    * 数据卷挂载点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeMountInfoList")
    @Expose
    private VolumeMountInfo [] VolumeMountInfoList;

    /**
     * Get 镜像版本名称 
     * @return TagName 镜像版本名称
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 镜像版本名称
     * @param TagName 镜像版本名称
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 容器名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName 容器名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName 容器名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 镜像名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoName 镜像名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 镜像名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoName 镜像名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 仓库类型,tcr，address，personal，默认personal
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoType 仓库类型,tcr，address，personal，默认personal
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 仓库类型,tcr，address，personal，默认personal
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoType 仓库类型,tcr，address，personal，默认personal
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get tcr仓库信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcrRepoInfo tcr仓库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TcrRepoInfo getTcrRepoInfo() {
        return this.TcrRepoInfo;
    }

    /**
     * Set tcr仓库信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcrRepoInfo tcr仓库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcrRepoInfo(TcrRepoInfo TcrRepoInfo) {
        this.TcrRepoInfo = TcrRepoInfo;
    }

    /**
     * Get 镜像server
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Server 镜像server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 镜像server
注意：此字段可能返回 null，表示取不到有效值。
     * @param Server 镜像server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 凭证名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretName 凭证名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 凭证名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretName 凭证名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get jvm 参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JvmOpts jvm 参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * Set jvm 参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param JvmOpts jvm 参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
    }

    /**
     * Get 容器最大的 CPU 核数，对应 K8S 的 limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuLimit 容器最大的 CPU 核数，对应 K8S 的 limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set 容器最大的 CPU 核数，对应 K8S 的 limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuLimit 容器最大的 CPU 核数，对应 K8S 的 limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 容器分配的 CPU 核数，对应 K8S 的 request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuRequest 容器分配的 CPU 核数，对应 K8S 的 request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set 容器分配的 CPU 核数，对应 K8S 的 request
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuRequest 容器分配的 CPU 核数，对应 K8S 的 request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get 容器分配的内存 MiB 数，对应 K8S 的 request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemRequest 容器分配的内存 MiB 数，对应 K8S 的 request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemRequest() {
        return this.MemRequest;
    }

    /**
     * Set 容器分配的内存 MiB 数，对应 K8S 的 request
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemRequest 容器分配的内存 MiB 数，对应 K8S 的 request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemRequest(String MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * Get 容器最大的内存 MiB 数，对应 K8S 的 limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemLimit 容器最大的内存 MiB 数，对应 K8S 的 limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set 容器最大的内存 MiB 数，对应 K8S 的 limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemLimit 容器最大的内存 MiB 数，对应 K8S 的 limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemLimit(String MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get 健康检查配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckSettings 健康检查配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set 健康检查配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckSettings 健康检查配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get 环境变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Envs 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Envs 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 环境变量,作为入参时不用填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserEnvs 环境变量,作为入参时不用填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Env [] getUserEnvs() {
        return this.UserEnvs;
    }

    /**
     * Set 环境变量,作为入参时不用填
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserEnvs 环境变量,作为入参时不用填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserEnvs(Env [] UserEnvs) {
        this.UserEnvs = UserEnvs;
    }

    /**
     * Get 数据卷挂载点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeMountInfoList 数据卷挂载点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeMountInfo [] getVolumeMountInfoList() {
        return this.VolumeMountInfoList;
    }

    /**
     * Set 数据卷挂载点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeMountInfoList 数据卷挂载点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeMountInfoList(VolumeMountInfo [] VolumeMountInfoList) {
        this.VolumeMountInfoList = VolumeMountInfoList;
    }

    public GroupContainerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupContainerInfo(GroupContainerInfo source) {
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.RepoType != null) {
            this.RepoType = new String(source.RepoType);
        }
        if (source.TcrRepoInfo != null) {
            this.TcrRepoInfo = new TcrRepoInfo(source.TcrRepoInfo);
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.JvmOpts != null) {
            this.JvmOpts = new String(source.JvmOpts);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new String(source.CpuLimit);
        }
        if (source.CpuRequest != null) {
            this.CpuRequest = new String(source.CpuRequest);
        }
        if (source.MemRequest != null) {
            this.MemRequest = new String(source.MemRequest);
        }
        if (source.MemLimit != null) {
            this.MemLimit = new String(source.MemLimit);
        }
        if (source.HealthCheckSettings != null) {
            this.HealthCheckSettings = new HealthCheckSettings(source.HealthCheckSettings);
        }
        if (source.Envs != null) {
            this.Envs = new Env[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new Env(source.Envs[i]);
            }
        }
        if (source.UserEnvs != null) {
            this.UserEnvs = new Env[source.UserEnvs.length];
            for (int i = 0; i < source.UserEnvs.length; i++) {
                this.UserEnvs[i] = new Env(source.UserEnvs[i]);
            }
        }
        if (source.VolumeMountInfoList != null) {
            this.VolumeMountInfoList = new VolumeMountInfo[source.VolumeMountInfoList.length];
            for (int i = 0; i < source.VolumeMountInfoList.length; i++) {
                this.VolumeMountInfoList[i] = new VolumeMountInfo(source.VolumeMountInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamObj(map, prefix + "TcrRepoInfo.", this.TcrRepoInfo);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "MemRequest", this.MemRequest);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamObj(map, prefix + "HealthCheckSettings.", this.HealthCheckSettings);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "UserEnvs.", this.UserEnvs);
        this.setParamArrayObj(map, prefix + "VolumeMountInfoList.", this.VolumeMountInfoList);

    }
}

