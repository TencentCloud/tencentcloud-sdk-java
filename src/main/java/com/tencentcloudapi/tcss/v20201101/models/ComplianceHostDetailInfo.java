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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceHostDetailInfo extends AbstractModel {

    /**
    * 主机上的Docker版本。
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * 主机上的K8S的版本。
    */
    @SerializedName("K8SVersion")
    @Expose
    private String K8SVersion;

    /**
    * 主机上Containerd版本
    */
    @SerializedName("ContainerdVersion")
    @Expose
    private String ContainerdVersion;

    /**
     * Get 主机上的Docker版本。 
     * @return DockerVersion 主机上的Docker版本。
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set 主机上的Docker版本。
     * @param DockerVersion 主机上的Docker版本。
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get 主机上的K8S的版本。 
     * @return K8SVersion 主机上的K8S的版本。
     */
    public String getK8SVersion() {
        return this.K8SVersion;
    }

    /**
     * Set 主机上的K8S的版本。
     * @param K8SVersion 主机上的K8S的版本。
     */
    public void setK8SVersion(String K8SVersion) {
        this.K8SVersion = K8SVersion;
    }

    /**
     * Get 主机上Containerd版本 
     * @return ContainerdVersion 主机上Containerd版本
     */
    public String getContainerdVersion() {
        return this.ContainerdVersion;
    }

    /**
     * Set 主机上Containerd版本
     * @param ContainerdVersion 主机上Containerd版本
     */
    public void setContainerdVersion(String ContainerdVersion) {
        this.ContainerdVersion = ContainerdVersion;
    }

    public ComplianceHostDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceHostDetailInfo(ComplianceHostDetailInfo source) {
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.K8SVersion != null) {
            this.K8SVersion = new String(source.K8SVersion);
        }
        if (source.ContainerdVersion != null) {
            this.ContainerdVersion = new String(source.ContainerdVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "K8SVersion", this.K8SVersion);
        this.setParamSimple(map, prefix + "ContainerdVersion", this.ContainerdVersion);

    }
}

