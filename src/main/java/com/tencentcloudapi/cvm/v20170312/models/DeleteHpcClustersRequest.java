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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteHpcClustersRequest extends AbstractModel{

    /**
    * 高性能计算集群ID列表。
    */
    @SerializedName("HpcClusterIds")
    @Expose
    private String [] HpcClusterIds;

    /**
     * Get 高性能计算集群ID列表。 
     * @return HpcClusterIds 高性能计算集群ID列表。
     */
    public String [] getHpcClusterIds() {
        return this.HpcClusterIds;
    }

    /**
     * Set 高性能计算集群ID列表。
     * @param HpcClusterIds 高性能计算集群ID列表。
     */
    public void setHpcClusterIds(String [] HpcClusterIds) {
        this.HpcClusterIds = HpcClusterIds;
    }

    public DeleteHpcClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteHpcClustersRequest(DeleteHpcClustersRequest source) {
        if (source.HpcClusterIds != null) {
            this.HpcClusterIds = new String[source.HpcClusterIds.length];
            for (int i = 0; i < source.HpcClusterIds.length; i++) {
                this.HpcClusterIds[i] = new String(source.HpcClusterIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HpcClusterIds.", this.HpcClusterIds);

    }
}

