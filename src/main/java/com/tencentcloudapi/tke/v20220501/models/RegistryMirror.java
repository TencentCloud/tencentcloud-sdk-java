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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistryMirror extends AbstractModel {

    /**
    * <p>源仓库，例如 docker.io / registry.k8s.io</p>
    */
    @SerializedName("Registry")
    @Expose
    private String Registry;

    /**
    * <p>镜像加速地址列表，按顺序写入 hosts.toml</p>
    */
    @SerializedName("Endpoints")
    @Expose
    private String [] Endpoints;

    /**
    * <p>是否在 hosts.toml 中写入 override_path，为 true 时镜像 endpoints 路径不再追加 namespace 后缀</p>
    */
    @SerializedName("OverridePath")
    @Expose
    private Boolean OverridePath;

    /**
     * Get <p>源仓库，例如 docker.io / registry.k8s.io</p> 
     * @return Registry <p>源仓库，例如 docker.io / registry.k8s.io</p>
     */
    public String getRegistry() {
        return this.Registry;
    }

    /**
     * Set <p>源仓库，例如 docker.io / registry.k8s.io</p>
     * @param Registry <p>源仓库，例如 docker.io / registry.k8s.io</p>
     */
    public void setRegistry(String Registry) {
        this.Registry = Registry;
    }

    /**
     * Get <p>镜像加速地址列表，按顺序写入 hosts.toml</p> 
     * @return Endpoints <p>镜像加速地址列表，按顺序写入 hosts.toml</p>
     */
    public String [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set <p>镜像加速地址列表，按顺序写入 hosts.toml</p>
     * @param Endpoints <p>镜像加速地址列表，按顺序写入 hosts.toml</p>
     */
    public void setEndpoints(String [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get <p>是否在 hosts.toml 中写入 override_path，为 true 时镜像 endpoints 路径不再追加 namespace 后缀</p> 
     * @return OverridePath <p>是否在 hosts.toml 中写入 override_path，为 true 时镜像 endpoints 路径不再追加 namespace 后缀</p>
     */
    public Boolean getOverridePath() {
        return this.OverridePath;
    }

    /**
     * Set <p>是否在 hosts.toml 中写入 override_path，为 true 时镜像 endpoints 路径不再追加 namespace 后缀</p>
     * @param OverridePath <p>是否在 hosts.toml 中写入 override_path，为 true 时镜像 endpoints 路径不再追加 namespace 后缀</p>
     */
    public void setOverridePath(Boolean OverridePath) {
        this.OverridePath = OverridePath;
    }

    public RegistryMirror() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistryMirror(RegistryMirror source) {
        if (source.Registry != null) {
            this.Registry = new String(source.Registry);
        }
        if (source.Endpoints != null) {
            this.Endpoints = new String[source.Endpoints.length];
            for (int i = 0; i < source.Endpoints.length; i++) {
                this.Endpoints[i] = new String(source.Endpoints[i]);
            }
        }
        if (source.OverridePath != null) {
            this.OverridePath = new Boolean(source.OverridePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Registry", this.Registry);
        this.setParamArraySimple(map, prefix + "Endpoints.", this.Endpoints);
        this.setParamSimple(map, prefix + "OverridePath", this.OverridePath);

    }
}

