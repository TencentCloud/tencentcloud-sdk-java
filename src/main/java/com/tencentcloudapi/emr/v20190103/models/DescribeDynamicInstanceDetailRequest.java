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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDynamicInstanceDetailRequest extends AbstractModel {

    /**
    * <p>EMR 集群 id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Ray集群Id</p>
    */
    @SerializedName("RayClusterId")
    @Expose
    private Long RayClusterId;

    /**
     * Get <p>EMR 集群 id</p> 
     * @return InstanceId <p>EMR 集群 id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>EMR 集群 id</p>
     * @param InstanceId <p>EMR 集群 id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Ray集群Id</p> 
     * @return RayClusterId <p>Ray集群Id</p>
     */
    public Long getRayClusterId() {
        return this.RayClusterId;
    }

    /**
     * Set <p>Ray集群Id</p>
     * @param RayClusterId <p>Ray集群Id</p>
     */
    public void setRayClusterId(Long RayClusterId) {
        this.RayClusterId = RayClusterId;
    }

    public DescribeDynamicInstanceDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDynamicInstanceDetailRequest(DescribeDynamicInstanceDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RayClusterId != null) {
            this.RayClusterId = new Long(source.RayClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RayClusterId", this.RayClusterId);

    }
}

