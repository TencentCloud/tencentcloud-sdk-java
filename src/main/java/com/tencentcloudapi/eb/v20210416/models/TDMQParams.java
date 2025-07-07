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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TDMQParams extends AbstractModel {

    /**
    * 集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群支撑网接入点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterEndPoint")
    @Expose
    private String ClusterEndPoint;

    /**
     * Get 集群类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群支撑网接入点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterEndPoint 集群支撑网接入点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterEndPoint() {
        return this.ClusterEndPoint;
    }

    /**
     * Set 集群支撑网接入点
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterEndPoint 集群支撑网接入点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterEndPoint(String ClusterEndPoint) {
        this.ClusterEndPoint = ClusterEndPoint;
    }

    public TDMQParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TDMQParams(TDMQParams source) {
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterEndPoint != null) {
            this.ClusterEndPoint = new String(source.ClusterEndPoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterEndPoint", this.ClusterEndPoint);

    }
}

