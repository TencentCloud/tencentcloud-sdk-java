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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunSideSpec extends AbstractModel {

    /**
    * 容器镜像
    */
    @SerializedName("ContainerImage")
    @Expose
    private String ContainerImage;

    /**
    * 容器端口
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * 容器的名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * kv的json字符串
    */
    @SerializedName("EnvVar")
    @Expose
    private String EnvVar;

    /**
    * InitialDelaySeconds 延迟多长时间启动健康检查
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * CPU大小
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小（单位：M）
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 安全特性
    */
    @SerializedName("Security")
    @Expose
    private CloudBaseSecurityContext Security;

    /**
    * 挂载信息
    */
    @SerializedName("VolumeMountInfos")
    @Expose
    private CloudBaseRunVolumeMount [] VolumeMountInfos;

    /**
     * Get 容器镜像 
     * @return ContainerImage 容器镜像
     */
    public String getContainerImage() {
        return this.ContainerImage;
    }

    /**
     * Set 容器镜像
     * @param ContainerImage 容器镜像
     */
    public void setContainerImage(String ContainerImage) {
        this.ContainerImage = ContainerImage;
    }

    /**
     * Get 容器端口 
     * @return ContainerPort 容器端口
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 容器端口
     * @param ContainerPort 容器端口
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get 容器的名称 
     * @return ContainerName 容器的名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器的名称
     * @param ContainerName 容器的名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get kv的json字符串 
     * @return EnvVar kv的json字符串
     */
    public String getEnvVar() {
        return this.EnvVar;
    }

    /**
     * Set kv的json字符串
     * @param EnvVar kv的json字符串
     */
    public void setEnvVar(String EnvVar) {
        this.EnvVar = EnvVar;
    }

    /**
     * Get InitialDelaySeconds 延迟多长时间启动健康检查 
     * @return InitialDelaySeconds InitialDelaySeconds 延迟多长时间启动健康检查
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set InitialDelaySeconds 延迟多长时间启动健康检查
     * @param InitialDelaySeconds InitialDelaySeconds 延迟多长时间启动健康检查
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get CPU大小 
     * @return Cpu CPU大小
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU大小
     * @param Cpu CPU大小
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小（单位：M） 
     * @return Mem 内存大小（单位：M）
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存大小（单位：M）
     * @param Mem 内存大小（单位：M）
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 安全特性 
     * @return Security 安全特性
     */
    public CloudBaseSecurityContext getSecurity() {
        return this.Security;
    }

    /**
     * Set 安全特性
     * @param Security 安全特性
     */
    public void setSecurity(CloudBaseSecurityContext Security) {
        this.Security = Security;
    }

    /**
     * Get 挂载信息 
     * @return VolumeMountInfos 挂载信息
     */
    public CloudBaseRunVolumeMount [] getVolumeMountInfos() {
        return this.VolumeMountInfos;
    }

    /**
     * Set 挂载信息
     * @param VolumeMountInfos 挂载信息
     */
    public void setVolumeMountInfos(CloudBaseRunVolumeMount [] VolumeMountInfos) {
        this.VolumeMountInfos = VolumeMountInfos;
    }

    public CloudBaseRunSideSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseRunSideSpec(CloudBaseRunSideSpec source) {
        if (source.ContainerImage != null) {
            this.ContainerImage = new String(source.ContainerImage);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.EnvVar != null) {
            this.EnvVar = new String(source.EnvVar);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Security != null) {
            this.Security = new CloudBaseSecurityContext(source.Security);
        }
        if (source.VolumeMountInfos != null) {
            this.VolumeMountInfos = new CloudBaseRunVolumeMount[source.VolumeMountInfos.length];
            for (int i = 0; i < source.VolumeMountInfos.length; i++) {
                this.VolumeMountInfos[i] = new CloudBaseRunVolumeMount(source.VolumeMountInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerImage", this.ContainerImage);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "EnvVar", this.EnvVar);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamObj(map, prefix + "Security.", this.Security);
        this.setParamArrayObj(map, prefix + "VolumeMountInfos.", this.VolumeMountInfos);

    }
}

