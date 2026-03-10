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

public class DeploymentConfig extends AbstractModel {

    /**
    * 容器配置
    */
    @SerializedName("Container")
    @Expose
    private ContainerInfo Container;

    /**
    * 容器数量
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
     * Get 容器配置 
     * @return Container 容器配置
     */
    public ContainerInfo getContainer() {
        return this.Container;
    }

    /**
     * Set 容器配置
     * @param Container 容器配置
     */
    public void setContainer(ContainerInfo Container) {
        this.Container = Container;
    }

    /**
     * Get 容器数量 
     * @return ContainerCount 容器数量
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set 容器数量
     * @param ContainerCount 容器数量
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    public DeploymentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeploymentConfig(DeploymentConfig source) {
        if (source.Container != null) {
            this.Container = new ContainerInfo(source.Container);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Container.", this.Container);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);

    }
}

