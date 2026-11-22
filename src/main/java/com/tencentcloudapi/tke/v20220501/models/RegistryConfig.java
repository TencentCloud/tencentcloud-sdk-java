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

public class RegistryConfig extends AbstractModel {

    /**
    * <p>镜像加速站点列表，按 registry 维度渲染独立的 hosts.toml</p>
    */
    @SerializedName("Mirrors")
    @Expose
    private RegistryMirror [] Mirrors;

    /**
    * <p>不安全镜像仓库（跳过证书校验）</p>
    */
    @SerializedName("InsecureRegistries")
    @Expose
    private String [] InsecureRegistries;

    /**
     * Get <p>镜像加速站点列表，按 registry 维度渲染独立的 hosts.toml</p> 
     * @return Mirrors <p>镜像加速站点列表，按 registry 维度渲染独立的 hosts.toml</p>
     */
    public RegistryMirror [] getMirrors() {
        return this.Mirrors;
    }

    /**
     * Set <p>镜像加速站点列表，按 registry 维度渲染独立的 hosts.toml</p>
     * @param Mirrors <p>镜像加速站点列表，按 registry 维度渲染独立的 hosts.toml</p>
     */
    public void setMirrors(RegistryMirror [] Mirrors) {
        this.Mirrors = Mirrors;
    }

    /**
     * Get <p>不安全镜像仓库（跳过证书校验）</p> 
     * @return InsecureRegistries <p>不安全镜像仓库（跳过证书校验）</p>
     */
    public String [] getInsecureRegistries() {
        return this.InsecureRegistries;
    }

    /**
     * Set <p>不安全镜像仓库（跳过证书校验）</p>
     * @param InsecureRegistries <p>不安全镜像仓库（跳过证书校验）</p>
     */
    public void setInsecureRegistries(String [] InsecureRegistries) {
        this.InsecureRegistries = InsecureRegistries;
    }

    public RegistryConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistryConfig(RegistryConfig source) {
        if (source.Mirrors != null) {
            this.Mirrors = new RegistryMirror[source.Mirrors.length];
            for (int i = 0; i < source.Mirrors.length; i++) {
                this.Mirrors[i] = new RegistryMirror(source.Mirrors[i]);
            }
        }
        if (source.InsecureRegistries != null) {
            this.InsecureRegistries = new String[source.InsecureRegistries.length];
            for (int i = 0; i < source.InsecureRegistries.length; i++) {
                this.InsecureRegistries[i] = new String(source.InsecureRegistries[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Mirrors.", this.Mirrors);
        this.setParamArraySimple(map, prefix + "InsecureRegistries.", this.InsecureRegistries);

    }
}

