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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterExternalServiceInfo extends AbstractModel{

    /**
    * 依赖关系，0:被其他集群依赖，1:依赖其他集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependType")
    @Expose
    private Long DependType;

    /**
    * 共用组件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 共用集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 共用集群状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
     * Get 依赖关系，0:被其他集群依赖，1:依赖其他集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependType 依赖关系，0:被其他集群依赖，1:依赖其他集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDependType() {
        return this.DependType;
    }

    /**
     * Set 依赖关系，0:被其他集群依赖，1:依赖其他集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependType 依赖关系，0:被其他集群依赖，1:依赖其他集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependType(Long DependType) {
        this.DependType = DependType;
    }

    /**
     * Get 共用组件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service 共用组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 共用组件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service 共用组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 共用集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 共用集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 共用集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 共用集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 共用集群状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterStatus 共用集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 共用集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterStatus 共用集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    public ClusterExternalServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterExternalServiceInfo(ClusterExternalServiceInfo source) {
        if (source.DependType != null) {
            this.DependType = new Long(source.DependType);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DependType", this.DependType);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);

    }
}

