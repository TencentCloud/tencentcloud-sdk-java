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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMeshRequest extends AbstractModel{

    /**
    * 需要修改的网格Id
    */
    @SerializedName("MeshId")
    @Expose
    private String MeshId;

    /**
    * 修改的网格名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 修改的网格配置
    */
    @SerializedName("Config")
    @Expose
    private MeshConfig Config;

    /**
    * 修改的集群配置
    */
    @SerializedName("ClusterList")
    @Expose
    private Cluster [] ClusterList;

    /**
     * Get 需要修改的网格Id 
     * @return MeshId 需要修改的网格Id
     */
    public String getMeshId() {
        return this.MeshId;
    }

    /**
     * Set 需要修改的网格Id
     * @param MeshId 需要修改的网格Id
     */
    public void setMeshId(String MeshId) {
        this.MeshId = MeshId;
    }

    /**
     * Get 修改的网格名称 
     * @return DisplayName 修改的网格名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 修改的网格名称
     * @param DisplayName 修改的网格名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 修改的网格配置 
     * @return Config 修改的网格配置
     */
    public MeshConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 修改的网格配置
     * @param Config 修改的网格配置
     */
    public void setConfig(MeshConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 修改的集群配置 
     * @return ClusterList 修改的集群配置
     */
    public Cluster [] getClusterList() {
        return this.ClusterList;
    }

    /**
     * Set 修改的集群配置
     * @param ClusterList 修改的集群配置
     */
    public void setClusterList(Cluster [] ClusterList) {
        this.ClusterList = ClusterList;
    }

    public ModifyMeshRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMeshRequest(ModifyMeshRequest source) {
        if (source.MeshId != null) {
            this.MeshId = new String(source.MeshId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Config != null) {
            this.Config = new MeshConfig(source.Config);
        }
        if (source.ClusterList != null) {
            this.ClusterList = new Cluster[source.ClusterList.length];
            for (int i = 0; i < source.ClusterList.length; i++) {
                this.ClusterList[i] = new Cluster(source.ClusterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MeshId", this.MeshId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "ClusterList.", this.ClusterList);

    }
}

