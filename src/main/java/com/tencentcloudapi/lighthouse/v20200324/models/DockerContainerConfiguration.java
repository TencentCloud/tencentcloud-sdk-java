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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DockerContainerConfiguration extends AbstractModel{

    /**
    * 容器镜像地址
    */
    @SerializedName("ContainerImage")
    @Expose
    private String ContainerImage;

    /**
    * 容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 环境变量列表
    */
    @SerializedName("Envs")
    @Expose
    private ContainerEnv [] Envs;

    /**
    * 容器端口主机端口映射列表
    */
    @SerializedName("PublishPorts")
    @Expose
    private DockerContainerPublishPort [] PublishPorts;

    /**
    * 容器加载本地卷列表
    */
    @SerializedName("Volumes")
    @Expose
    private DockerContainerVolume [] Volumes;

    /**
    * 运行的命令
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
     * Get 容器镜像地址 
     * @return ContainerImage 容器镜像地址
     */
    public String getContainerImage() {
        return this.ContainerImage;
    }

    /**
     * Set 容器镜像地址
     * @param ContainerImage 容器镜像地址
     */
    public void setContainerImage(String ContainerImage) {
        this.ContainerImage = ContainerImage;
    }

    /**
     * Get 容器名称 
     * @return ContainerName 容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
     * @param ContainerName 容器名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 环境变量列表 
     * @return Envs 环境变量列表
     */
    public ContainerEnv [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 环境变量列表
     * @param Envs 环境变量列表
     */
    public void setEnvs(ContainerEnv [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 容器端口主机端口映射列表 
     * @return PublishPorts 容器端口主机端口映射列表
     */
    public DockerContainerPublishPort [] getPublishPorts() {
        return this.PublishPorts;
    }

    /**
     * Set 容器端口主机端口映射列表
     * @param PublishPorts 容器端口主机端口映射列表
     */
    public void setPublishPorts(DockerContainerPublishPort [] PublishPorts) {
        this.PublishPorts = PublishPorts;
    }

    /**
     * Get 容器加载本地卷列表 
     * @return Volumes 容器加载本地卷列表
     */
    public DockerContainerVolume [] getVolumes() {
        return this.Volumes;
    }

    /**
     * Set 容器加载本地卷列表
     * @param Volumes 容器加载本地卷列表
     */
    public void setVolumes(DockerContainerVolume [] Volumes) {
        this.Volumes = Volumes;
    }

    /**
     * Get 运行的命令 
     * @return Command 运行的命令
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 运行的命令
     * @param Command 运行的命令
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    public DockerContainerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DockerContainerConfiguration(DockerContainerConfiguration source) {
        if (source.ContainerImage != null) {
            this.ContainerImage = new String(source.ContainerImage);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.Envs != null) {
            this.Envs = new ContainerEnv[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new ContainerEnv(source.Envs[i]);
            }
        }
        if (source.PublishPorts != null) {
            this.PublishPorts = new DockerContainerPublishPort[source.PublishPorts.length];
            for (int i = 0; i < source.PublishPorts.length; i++) {
                this.PublishPorts[i] = new DockerContainerPublishPort(source.PublishPorts[i]);
            }
        }
        if (source.Volumes != null) {
            this.Volumes = new DockerContainerVolume[source.Volumes.length];
            for (int i = 0; i < source.Volumes.length; i++) {
                this.Volumes[i] = new DockerContainerVolume(source.Volumes[i]);
            }
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerImage", this.ContainerImage);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "PublishPorts.", this.PublishPorts);
        this.setParamArrayObj(map, prefix + "Volumes.", this.Volumes);
        this.setParamSimple(map, prefix + "Command", this.Command);

    }
}

