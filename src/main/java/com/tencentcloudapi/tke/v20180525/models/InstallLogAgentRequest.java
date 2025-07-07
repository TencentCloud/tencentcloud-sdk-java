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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstallLogAgentRequest extends AbstractModel {

    /**
    * TKE集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * kubelet根目录
    */
    @SerializedName("KubeletRootDir")
    @Expose
    private String KubeletRootDir;

    /**
    * 集群类型 tke/eks，默认tke
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get TKE集群ID 
     * @return ClusterId TKE集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set TKE集群ID
     * @param ClusterId TKE集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get kubelet根目录 
     * @return KubeletRootDir kubelet根目录
     */
    public String getKubeletRootDir() {
        return this.KubeletRootDir;
    }

    /**
     * Set kubelet根目录
     * @param KubeletRootDir kubelet根目录
     */
    public void setKubeletRootDir(String KubeletRootDir) {
        this.KubeletRootDir = KubeletRootDir;
    }

    /**
     * Get 集群类型 tke/eks，默认tke 
     * @return ClusterType 集群类型 tke/eks，默认tke
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型 tke/eks，默认tke
     * @param ClusterType 集群类型 tke/eks，默认tke
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public InstallLogAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallLogAgentRequest(InstallLogAgentRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.KubeletRootDir != null) {
            this.KubeletRootDir = new String(source.KubeletRootDir);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "KubeletRootDir", this.KubeletRootDir);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

