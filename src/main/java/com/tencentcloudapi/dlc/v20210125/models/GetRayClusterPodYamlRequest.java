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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRayClusterPodYamlRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Pod名称</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
     * Get <p>集群ID</p> 
     * @return Id <p>集群ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>集群ID</p>
     * @param Id <p>集群ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Pod名称</p> 
     * @return PodName <p>Pod名称</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod名称</p>
     * @param PodName <p>Pod名称</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    public GetRayClusterPodYamlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRayClusterPodYamlRequest(GetRayClusterPodYamlRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PodName", this.PodName);

    }
}

