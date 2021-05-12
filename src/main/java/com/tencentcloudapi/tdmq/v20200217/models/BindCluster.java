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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindCluster extends AbstractModel{

    /**
    * 物理集群的名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get 物理集群的名称 
     * @return ClusterName 物理集群的名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 物理集群的名称
     * @param ClusterName 物理集群的名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public BindCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindCluster(BindCluster source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

