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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDedicatedClustersRequest extends AbstractModel{

    /**
    * 要删除的专用集群id
    */
    @SerializedName("DedicatedClusterIds")
    @Expose
    private String [] DedicatedClusterIds;

    /**
     * Get 要删除的专用集群id 
     * @return DedicatedClusterIds 要删除的专用集群id
     */
    public String [] getDedicatedClusterIds() {
        return this.DedicatedClusterIds;
    }

    /**
     * Set 要删除的专用集群id
     * @param DedicatedClusterIds 要删除的专用集群id
     */
    public void setDedicatedClusterIds(String [] DedicatedClusterIds) {
        this.DedicatedClusterIds = DedicatedClusterIds;
    }

    public DeleteDedicatedClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDedicatedClustersRequest(DeleteDedicatedClustersRequest source) {
        if (source.DedicatedClusterIds != null) {
            this.DedicatedClusterIds = new String[source.DedicatedClusterIds.length];
            for (int i = 0; i < source.DedicatedClusterIds.length; i++) {
                this.DedicatedClusterIds[i] = new String(source.DedicatedClusterIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DedicatedClusterIds.", this.DedicatedClusterIds);

    }
}

