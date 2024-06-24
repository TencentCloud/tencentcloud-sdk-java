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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RerunDockerContainerRequest extends AbstractModel {

    /**
    * 实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/product/1207/47573)接口返回值中的InstanceId获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 重新创建的容器配置。
    */
    @SerializedName("ContainerConfiguration")
    @Expose
    private DockerContainerConfiguration ContainerConfiguration;

    /**
    * 容器ID。可通过[DescribeDockerContainers](https://cloud.tencent.com/document/product/1207/95473)接口返回值中的ContainerId获取。
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
     * Get 实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/product/1207/47573)接口返回值中的InstanceId获取。 
     * @return InstanceId 实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/product/1207/47573)接口返回值中的InstanceId获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/product/1207/47573)接口返回值中的InstanceId获取。
     * @param InstanceId 实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/product/1207/47573)接口返回值中的InstanceId获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 重新创建的容器配置。 
     * @return ContainerConfiguration 重新创建的容器配置。
     */
    public DockerContainerConfiguration getContainerConfiguration() {
        return this.ContainerConfiguration;
    }

    /**
     * Set 重新创建的容器配置。
     * @param ContainerConfiguration 重新创建的容器配置。
     */
    public void setContainerConfiguration(DockerContainerConfiguration ContainerConfiguration) {
        this.ContainerConfiguration = ContainerConfiguration;
    }

    /**
     * Get 容器ID。可通过[DescribeDockerContainers](https://cloud.tencent.com/document/product/1207/95473)接口返回值中的ContainerId获取。 
     * @return ContainerId 容器ID。可通过[DescribeDockerContainers](https://cloud.tencent.com/document/product/1207/95473)接口返回值中的ContainerId获取。
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器ID。可通过[DescribeDockerContainers](https://cloud.tencent.com/document/product/1207/95473)接口返回值中的ContainerId获取。
     * @param ContainerId 容器ID。可通过[DescribeDockerContainers](https://cloud.tencent.com/document/product/1207/95473)接口返回值中的ContainerId获取。
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    public RerunDockerContainerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerunDockerContainerRequest(RerunDockerContainerRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ContainerConfiguration != null) {
            this.ContainerConfiguration = new DockerContainerConfiguration(source.ContainerConfiguration);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "ContainerConfiguration.", this.ContainerConfiguration);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);

    }
}

