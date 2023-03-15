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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfo extends AbstractModel{

    /**
    * vcluster名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 当前cluster的IP列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeIps")
    @Expose
    private String [] NodeIps;

    /**
     * Get vcluster名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName vcluster名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set vcluster名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName vcluster名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 当前cluster的IP列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeIps 当前cluster的IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNodeIps() {
        return this.NodeIps;
    }

    /**
     * Set 当前cluster的IP列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeIps 当前cluster的IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeIps(String [] NodeIps) {
        this.NodeIps = NodeIps;
    }

    public ClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInfo(ClusterInfo source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.NodeIps != null) {
            this.NodeIps = new String[source.NodeIps.length];
            for (int i = 0; i < source.NodeIps.length; i++) {
                this.NodeIps[i] = new String(source.NodeIps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamArraySimple(map, prefix + "NodeIps.", this.NodeIps);

    }
}

