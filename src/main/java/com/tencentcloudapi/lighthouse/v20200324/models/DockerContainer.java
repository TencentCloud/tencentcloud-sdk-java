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

public class DockerContainer extends AbstractModel{

    /**
    * 容器ID
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 容器镜像地址
    */
    @SerializedName("ContainerImage")
    @Expose
    private String ContainerImage;

    /**
    * 容器Command
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 容器状态描述
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 容器状态，和docker的容器状态保持一致，当前取值有：created, restarting, running, removing, paused, exited, or dead
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 容器端口主机端口映射列表
    */
    @SerializedName("PublishPortSet")
    @Expose
    private DockerContainerPublishPort [] PublishPortSet;

    /**
    * 容器挂载本地卷列表
    */
    @SerializedName("VolumeSet")
    @Expose
    private DockerContainerVolume [] VolumeSet;

    /**
    * 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 容器ID 
     * @return ContainerId 容器ID
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器ID
     * @param ContainerId 容器ID
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
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
     * Get 容器Command 
     * @return Command 容器Command
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 容器Command
     * @param Command 容器Command
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 容器状态描述 
     * @return Status 容器状态描述
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 容器状态描述
     * @param Status 容器状态描述
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 容器状态，和docker的容器状态保持一致，当前取值有：created, restarting, running, removing, paused, exited, or dead 
     * @return State 容器状态，和docker的容器状态保持一致，当前取值有：created, restarting, running, removing, paused, exited, or dead
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 容器状态，和docker的容器状态保持一致，当前取值有：created, restarting, running, removing, paused, exited, or dead
     * @param State 容器状态，和docker的容器状态保持一致，当前取值有：created, restarting, running, removing, paused, exited, or dead
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 容器端口主机端口映射列表 
     * @return PublishPortSet 容器端口主机端口映射列表
     */
    public DockerContainerPublishPort [] getPublishPortSet() {
        return this.PublishPortSet;
    }

    /**
     * Set 容器端口主机端口映射列表
     * @param PublishPortSet 容器端口主机端口映射列表
     */
    public void setPublishPortSet(DockerContainerPublishPort [] PublishPortSet) {
        this.PublishPortSet = PublishPortSet;
    }

    /**
     * Get 容器挂载本地卷列表 
     * @return VolumeSet 容器挂载本地卷列表
     */
    public DockerContainerVolume [] getVolumeSet() {
        return this.VolumeSet;
    }

    /**
     * Set 容器挂载本地卷列表
     * @param VolumeSet 容器挂载本地卷列表
     */
    public void setVolumeSet(DockerContainerVolume [] VolumeSet) {
        this.VolumeSet = VolumeSet;
    }

    /**
     * Get 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
     * @return CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
     * @param CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public DockerContainer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DockerContainer(DockerContainer source) {
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerImage != null) {
            this.ContainerImage = new String(source.ContainerImage);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.PublishPortSet != null) {
            this.PublishPortSet = new DockerContainerPublishPort[source.PublishPortSet.length];
            for (int i = 0; i < source.PublishPortSet.length; i++) {
                this.PublishPortSet[i] = new DockerContainerPublishPort(source.PublishPortSet[i]);
            }
        }
        if (source.VolumeSet != null) {
            this.VolumeSet = new DockerContainerVolume[source.VolumeSet.length];
            for (int i = 0; i < source.VolumeSet.length; i++) {
                this.VolumeSet[i] = new DockerContainerVolume(source.VolumeSet[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerImage", this.ContainerImage);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "PublishPortSet.", this.PublishPortSet);
        this.setParamArrayObj(map, prefix + "VolumeSet.", this.VolumeSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

