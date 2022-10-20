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

public class LinkClusterListRequest extends AbstractModel{

    /**
    * 网格Id
    */
    @SerializedName("MeshId")
    @Expose
    private String MeshId;

    /**
    * 关联集群
    */
    @SerializedName("ClusterList")
    @Expose
    private Cluster [] ClusterList;

    /**
     * Get 网格Id 
     * @return MeshId 网格Id
     */
    public String getMeshId() {
        return this.MeshId;
    }

    /**
     * Set 网格Id
     * @param MeshId 网格Id
     */
    public void setMeshId(String MeshId) {
        this.MeshId = MeshId;
    }

    /**
     * Get 关联集群 
     * @return ClusterList 关联集群
     */
    public Cluster [] getClusterList() {
        return this.ClusterList;
    }

    /**
     * Set 关联集群
     * @param ClusterList 关联集群
     */
    public void setClusterList(Cluster [] ClusterList) {
        this.ClusterList = ClusterList;
    }

    public LinkClusterListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinkClusterListRequest(LinkClusterListRequest source) {
        if (source.MeshId != null) {
            this.MeshId = new String(source.MeshId);
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
        this.setParamArrayObj(map, prefix + "ClusterList.", this.ClusterList);

    }
}

