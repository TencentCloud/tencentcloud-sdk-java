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

public class ModifyClusterAsGroupOptionAttributeRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群弹性伸缩属性
    */
    @SerializedName("ClusterAsGroupOption")
    @Expose
    private ClusterAsGroupOption ClusterAsGroupOption;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群弹性伸缩属性 
     * @return ClusterAsGroupOption 集群弹性伸缩属性
     */
    public ClusterAsGroupOption getClusterAsGroupOption() {
        return this.ClusterAsGroupOption;
    }

    /**
     * Set 集群弹性伸缩属性
     * @param ClusterAsGroupOption 集群弹性伸缩属性
     */
    public void setClusterAsGroupOption(ClusterAsGroupOption ClusterAsGroupOption) {
        this.ClusterAsGroupOption = ClusterAsGroupOption;
    }

    public ModifyClusterAsGroupOptionAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterAsGroupOptionAttributeRequest(ModifyClusterAsGroupOptionAttributeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterAsGroupOption != null) {
            this.ClusterAsGroupOption = new ClusterAsGroupOption(source.ClusterAsGroupOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "ClusterAsGroupOption.", this.ClusterAsGroupOption);

    }
}

