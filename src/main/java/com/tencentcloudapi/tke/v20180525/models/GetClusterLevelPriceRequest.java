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

public class GetClusterLevelPriceRequest extends AbstractModel {

    /**
    * 集群规格，托管集群询价
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
     * Get 集群规格，托管集群询价 
     * @return ClusterLevel 集群规格，托管集群询价
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set 集群规格，托管集群询价
     * @param ClusterLevel 集群规格，托管集群询价
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    public GetClusterLevelPriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetClusterLevelPriceRequest(GetClusterLevelPriceRequest source) {
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);

    }
}

