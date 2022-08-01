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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdcRegion extends AbstractModel{

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 该地域对应的集群信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Clusters")
    @Expose
    private CdcCluster [] Clusters;

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 该地域对应的集群信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Clusters 该地域对应的集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CdcCluster [] getClusters() {
        return this.Clusters;
    }

    /**
     * Set 该地域对应的集群信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Clusters 该地域对应的集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusters(CdcCluster [] Clusters) {
        this.Clusters = Clusters;
    }

    public CdcRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdcRegion(CdcRegion source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Clusters != null) {
            this.Clusters = new CdcCluster[source.Clusters.length];
            for (int i = 0; i < source.Clusters.length; i++) {
                this.Clusters[i] = new CdcCluster(source.Clusters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Clusters.", this.Clusters);

    }
}

