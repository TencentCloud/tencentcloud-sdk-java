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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterCreateComponentItem extends AbstractModel{

    /**
    * 要安装组件的集群ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 该集群对应的地域
    */
    @SerializedName("ClusterRegion")
    @Expose
    private String ClusterRegion;

    /**
     * Get 要安装组件的集群ID。 
     * @return ClusterId 要安装组件的集群ID。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 要安装组件的集群ID。
     * @param ClusterId 要安装组件的集群ID。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 该集群对应的地域 
     * @return ClusterRegion 该集群对应的地域
     */
    public String getClusterRegion() {
        return this.ClusterRegion;
    }

    /**
     * Set 该集群对应的地域
     * @param ClusterRegion 该集群对应的地域
     */
    public void setClusterRegion(String ClusterRegion) {
        this.ClusterRegion = ClusterRegion;
    }

    public ClusterCreateComponentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterCreateComponentItem(ClusterCreateComponentItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterRegion != null) {
            this.ClusterRegion = new String(source.ClusterRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterRegion", this.ClusterRegion);

    }
}

