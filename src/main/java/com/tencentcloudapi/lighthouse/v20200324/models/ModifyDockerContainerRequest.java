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

public class ModifyDockerContainerRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 容器ID。
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

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
    * 容器重启策略，对应docker "--restart"参数。

枚举值:
no: 不自动重启。默认策略。
on-failure[:max-retries]: 当容器退出码非0时重启容器。使用max-retries限制重启次数，比如on-failure:10，限制最多重启10次。
always: 只要容器退出就重启。
unless-stopped: 始终重新启动容器，包括在守护进程启动时，除非容器在 Docker 守护进程停止之前进入停止状态。
    */
    @SerializedName("RestartPolicy")
    @Expose
    private String RestartPolicy;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 容器ID。 
     * @return ContainerId 容器ID。
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器ID。
     * @param ContainerId 容器ID。
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
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

    /**
     * Get 容器重启策略，对应docker "--restart"参数。

枚举值:
no: 不自动重启。默认策略。
on-failure[:max-retries]: 当容器退出码非0时重启容器。使用max-retries限制重启次数，比如on-failure:10，限制最多重启10次。
always: 只要容器退出就重启。
unless-stopped: 始终重新启动容器，包括在守护进程启动时，除非容器在 Docker 守护进程停止之前进入停止状态。 
     * @return RestartPolicy 容器重启策略，对应docker "--restart"参数。

枚举值:
no: 不自动重启。默认策略。
on-failure[:max-retries]: 当容器退出码非0时重启容器。使用max-retries限制重启次数，比如on-failure:10，限制最多重启10次。
always: 只要容器退出就重启。
unless-stopped: 始终重新启动容器，包括在守护进程启动时，除非容器在 Docker 守护进程停止之前进入停止状态。
     */
    public String getRestartPolicy() {
        return this.RestartPolicy;
    }

    /**
     * Set 容器重启策略，对应docker "--restart"参数。

枚举值:
no: 不自动重启。默认策略。
on-failure[:max-retries]: 当容器退出码非0时重启容器。使用max-retries限制重启次数，比如on-failure:10，限制最多重启10次。
always: 只要容器退出就重启。
unless-stopped: 始终重新启动容器，包括在守护进程启动时，除非容器在 Docker 守护进程停止之前进入停止状态。
     * @param RestartPolicy 容器重启策略，对应docker "--restart"参数。

枚举值:
no: 不自动重启。默认策略。
on-failure[:max-retries]: 当容器退出码非0时重启容器。使用max-retries限制重启次数，比如on-failure:10，限制最多重启10次。
always: 只要容器退出就重启。
unless-stopped: 始终重新启动容器，包括在守护进程启动时，除非容器在 Docker 守护进程停止之前进入停止状态。
     */
    public void setRestartPolicy(String RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    public ModifyDockerContainerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDockerContainerRequest(ModifyDockerContainerRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
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
        if (source.RestartPolicy != null) {
            this.RestartPolicy = new String(source.RestartPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "PublishPorts.", this.PublishPorts);
        this.setParamArrayObj(map, prefix + "Volumes.", this.Volumes);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "RestartPolicy", this.RestartPolicy);

    }
}

