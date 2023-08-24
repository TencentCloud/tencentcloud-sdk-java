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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyClusterPasswordComplexityRequest extends AbstractModel{

    /**
    * 复制集群ID数组，例如["cynosdbmysql-bzxxrmtq","cynosdbmysql-qwer"]
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 集群id，例如"cynosdbmysql-bzxxrmtq"
    */
    @SerializedName("SourceClusterId")
    @Expose
    private String SourceClusterId;

    /**
     * Get 复制集群ID数组，例如["cynosdbmysql-bzxxrmtq","cynosdbmysql-qwer"] 
     * @return ClusterIds 复制集群ID数组，例如["cynosdbmysql-bzxxrmtq","cynosdbmysql-qwer"]
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 复制集群ID数组，例如["cynosdbmysql-bzxxrmtq","cynosdbmysql-qwer"]
     * @param ClusterIds 复制集群ID数组，例如["cynosdbmysql-bzxxrmtq","cynosdbmysql-qwer"]
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 集群id，例如"cynosdbmysql-bzxxrmtq" 
     * @return SourceClusterId 集群id，例如"cynosdbmysql-bzxxrmtq"
     */
    public String getSourceClusterId() {
        return this.SourceClusterId;
    }

    /**
     * Set 集群id，例如"cynosdbmysql-bzxxrmtq"
     * @param SourceClusterId 集群id，例如"cynosdbmysql-bzxxrmtq"
     */
    public void setSourceClusterId(String SourceClusterId) {
        this.SourceClusterId = SourceClusterId;
    }

    public CopyClusterPasswordComplexityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyClusterPasswordComplexityRequest(CopyClusterPasswordComplexityRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.SourceClusterId != null) {
            this.SourceClusterId = new String(source.SourceClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "SourceClusterId", this.SourceClusterId);

    }
}

