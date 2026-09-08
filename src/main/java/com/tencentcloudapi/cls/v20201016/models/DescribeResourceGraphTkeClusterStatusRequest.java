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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceGraphTkeClusterStatusRequest extends AbstractModel {

    /**
    * <p>待检测的tke集群id</p>
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
     * Get <p>待检测的tke集群id</p> 
     * @return ClusterIds <p>待检测的tke集群id</p>
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set <p>待检测的tke集群id</p>
     * @param ClusterIds <p>待检测的tke集群id</p>
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    public DescribeResourceGraphTkeClusterStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGraphTkeClusterStatusRequest(DescribeResourceGraphTkeClusterStatusRequest source) {
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
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);

    }
}

