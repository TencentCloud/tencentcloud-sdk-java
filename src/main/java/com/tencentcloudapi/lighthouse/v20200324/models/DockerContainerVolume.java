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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DockerContainerVolume extends AbstractModel {

    /**
    * 容器路径
    */
    @SerializedName("ContainerPath")
    @Expose
    private String ContainerPath;

    /**
    * 主机路径
    */
    @SerializedName("HostPath")
    @Expose
    private String HostPath;

    /**
     * Get 容器路径 
     * @return ContainerPath 容器路径
     */
    public String getContainerPath() {
        return this.ContainerPath;
    }

    /**
     * Set 容器路径
     * @param ContainerPath 容器路径
     */
    public void setContainerPath(String ContainerPath) {
        this.ContainerPath = ContainerPath;
    }

    /**
     * Get 主机路径 
     * @return HostPath 主机路径
     */
    public String getHostPath() {
        return this.HostPath;
    }

    /**
     * Set 主机路径
     * @param HostPath 主机路径
     */
    public void setHostPath(String HostPath) {
        this.HostPath = HostPath;
    }

    public DockerContainerVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DockerContainerVolume(DockerContainerVolume source) {
        if (source.ContainerPath != null) {
            this.ContainerPath = new String(source.ContainerPath);
        }
        if (source.HostPath != null) {
            this.HostPath = new String(source.HostPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerPath", this.ContainerPath);
        this.setParamSimple(map, prefix + "HostPath", this.HostPath);

    }
}

