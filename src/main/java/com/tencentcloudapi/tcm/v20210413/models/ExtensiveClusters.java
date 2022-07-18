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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtensiveClusters extends AbstractModel{

    /**
    * 4层集群配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("L4Clusters")
    @Expose
    private ExtensiveCluster [] L4Clusters;

    /**
    * 7层集群配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("L7Clusters")
    @Expose
    private ExtensiveCluster [] L7Clusters;

    /**
     * Get 4层集群配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return L4Clusters 4层集群配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtensiveCluster [] getL4Clusters() {
        return this.L4Clusters;
    }

    /**
     * Set 4层集群配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param L4Clusters 4层集群配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setL4Clusters(ExtensiveCluster [] L4Clusters) {
        this.L4Clusters = L4Clusters;
    }

    /**
     * Get 7层集群配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return L7Clusters 7层集群配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtensiveCluster [] getL7Clusters() {
        return this.L7Clusters;
    }

    /**
     * Set 7层集群配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param L7Clusters 7层集群配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setL7Clusters(ExtensiveCluster [] L7Clusters) {
        this.L7Clusters = L7Clusters;
    }

    public ExtensiveClusters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtensiveClusters(ExtensiveClusters source) {
        if (source.L4Clusters != null) {
            this.L4Clusters = new ExtensiveCluster[source.L4Clusters.length];
            for (int i = 0; i < source.L4Clusters.length; i++) {
                this.L4Clusters[i] = new ExtensiveCluster(source.L4Clusters[i]);
            }
        }
        if (source.L7Clusters != null) {
            this.L7Clusters = new ExtensiveCluster[source.L7Clusters.length];
            for (int i = 0; i < source.L7Clusters.length; i++) {
                this.L7Clusters[i] = new ExtensiveCluster(source.L7Clusters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "L4Clusters.", this.L4Clusters);
        this.setParamArrayObj(map, prefix + "L7Clusters.", this.L7Clusters);

    }
}

