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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputeInfo extends AbstractModel {

    /**
    * 资源类型及数量
    */
    @SerializedName("ComputeResources")
    @Expose
    private ComputeResource [] ComputeResources;

    /**
    * 副本数
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
     * Get 资源类型及数量 
     * @return ComputeResources 资源类型及数量
     */
    public ComputeResource [] getComputeResources() {
        return this.ComputeResources;
    }

    /**
     * Set 资源类型及数量
     * @param ComputeResources 资源类型及数量
     */
    public void setComputeResources(ComputeResource [] ComputeResources) {
        this.ComputeResources = ComputeResources;
    }

    /**
     * Get 副本数 
     * @return Replicas 副本数
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 副本数
     * @param Replicas 副本数
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    public ComputeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComputeInfo(ComputeInfo source) {
        if (source.ComputeResources != null) {
            this.ComputeResources = new ComputeResource[source.ComputeResources.length];
            for (int i = 0; i < source.ComputeResources.length; i++) {
                this.ComputeResources[i] = new ComputeResource(source.ComputeResources[i]);
            }
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ComputeResources.", this.ComputeResources);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);

    }
}

