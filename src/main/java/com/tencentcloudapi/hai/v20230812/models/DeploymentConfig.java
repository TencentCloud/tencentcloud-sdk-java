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
    * <p>容器配置</p>
    */
    @SerializedName("Container")
    @Expose
    private ContainerInfo Container;

    /**
    * <p>容器数量</p>
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
     * Get <p>容器配置</p> 
     * @return Container <p>容器配置</p>
     */
    public ContainerInfo getContainer() {
        return this.Container;
    }

    /**
     * Set <p>容器配置</p>
     * @param Container <p>容器配置</p>
     */
    public void setContainer(ContainerInfo Container) {
        this.Container = Container;
    }

    /**
     * Get <p>容器数量</p> 
     * @return ContainerCount <p>容器数量</p>
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set <p>容器数量</p>
     * @param ContainerCount <p>容器数量</p>
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

