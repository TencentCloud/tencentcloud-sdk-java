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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEdgeClusterVersionRequest extends AbstractModel{

    /**
    * 集群 Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 需要升级到的版本
    */
    @SerializedName("EdgeVersion")
    @Expose
    private String EdgeVersion;

    /**
    * 自定义边缘组件镜像仓库前缀
    */
    @SerializedName("RegistryPrefix")
    @Expose
    private String RegistryPrefix;

    /**
    * 是否跳过预检查阶段
    */
    @SerializedName("SkipPreCheck")
    @Expose
    private Boolean SkipPreCheck;

    /**
     * Get 集群 Id 
     * @return ClusterId 集群 Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 Id
     * @param ClusterId 集群 Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 需要升级到的版本 
     * @return EdgeVersion 需要升级到的版本
     */
    public String getEdgeVersion() {
        return this.EdgeVersion;
    }

    /**
     * Set 需要升级到的版本
     * @param EdgeVersion 需要升级到的版本
     */
    public void setEdgeVersion(String EdgeVersion) {
        this.EdgeVersion = EdgeVersion;
    }

    /**
     * Get 自定义边缘组件镜像仓库前缀 
     * @return RegistryPrefix 自定义边缘组件镜像仓库前缀
     */
    public String getRegistryPrefix() {
        return this.RegistryPrefix;
    }

    /**
     * Set 自定义边缘组件镜像仓库前缀
     * @param RegistryPrefix 自定义边缘组件镜像仓库前缀
     */
    public void setRegistryPrefix(String RegistryPrefix) {
        this.RegistryPrefix = RegistryPrefix;
    }

    /**
     * Get 是否跳过预检查阶段 
     * @return SkipPreCheck 是否跳过预检查阶段
     */
    public Boolean getSkipPreCheck() {
        return this.SkipPreCheck;
    }

    /**
     * Set 是否跳过预检查阶段
     * @param SkipPreCheck 是否跳过预检查阶段
     */
    public void setSkipPreCheck(Boolean SkipPreCheck) {
        this.SkipPreCheck = SkipPreCheck;
    }

    public UpdateEdgeClusterVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEdgeClusterVersionRequest(UpdateEdgeClusterVersionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EdgeVersion != null) {
            this.EdgeVersion = new String(source.EdgeVersion);
        }
        if (source.RegistryPrefix != null) {
            this.RegistryPrefix = new String(source.RegistryPrefix);
        }
        if (source.SkipPreCheck != null) {
            this.SkipPreCheck = new Boolean(source.SkipPreCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EdgeVersion", this.EdgeVersion);
        this.setParamSimple(map, prefix + "RegistryPrefix", this.RegistryPrefix);
        this.setParamSimple(map, prefix + "SkipPreCheck", this.SkipPreCheck);

    }
}

