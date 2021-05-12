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

public class DescribeAvailableClusterVersionRequest extends AbstractModel{

    /**
    * 集群 Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群 Id 列表
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

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
     * Get 集群 Id 列表 
     * @return ClusterIds 集群 Id 列表
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 集群 Id 列表
     * @param ClusterIds 集群 Id 列表
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    public DescribeAvailableClusterVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableClusterVersionRequest(DescribeAvailableClusterVersionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);

    }
}

