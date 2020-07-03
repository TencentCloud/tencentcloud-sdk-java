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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerInvokePara extends AbstractModel{

    /**
    * AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * TKE集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * TKE集群命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * TKE集群工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * TKE集群工作负载中容器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * TKE集群地域数字ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterRegion")
    @Expose
    private Long ClusterRegion;

    /**
     * Get AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get TKE集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId TKE集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set TKE集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId TKE集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get TKE集群命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace TKE集群命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set TKE集群命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace TKE集群命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get TKE集群工作负载名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName TKE集群工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set TKE集群工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName TKE集群工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get TKE集群工作负载中容器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName TKE集群工作负载中容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set TKE集群工作负载中容器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName TKE集群工作负载中容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get TKE集群地域数字ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterRegion TKE集群地域数字ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClusterRegion() {
        return this.ClusterRegion;
    }

    /**
     * Set TKE集群地域数字ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterRegion TKE集群地域数字ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterRegion(Long ClusterRegion) {
        this.ClusterRegion = ClusterRegion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ClusterRegion", this.ClusterRegion);

    }
}

