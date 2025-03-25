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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerInvokePara extends AbstractModel {

    /**
    * AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * TKE集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * TKE集群命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * TKE集群工作负载名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * TKE集群工作负载中容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * TKE集群地域数字ID
    */
    @SerializedName("ClusterRegion")
    @Expose
    private Long ClusterRegion;

    /**
     * Get AppId 
     * @return AppId AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId
     * @param AppId AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get TKE集群ID 
     * @return ClusterId TKE集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set TKE集群ID
     * @param ClusterId TKE集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get TKE集群命名空间 
     * @return Namespace TKE集群命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set TKE集群命名空间
     * @param Namespace TKE集群命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get TKE集群工作负载名称 
     * @return ServiceName TKE集群工作负载名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set TKE集群工作负载名称
     * @param ServiceName TKE集群工作负载名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get TKE集群工作负载中容器名称 
     * @return ContainerName TKE集群工作负载中容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set TKE集群工作负载中容器名称
     * @param ContainerName TKE集群工作负载中容器名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get TKE集群地域数字ID 
     * @return ClusterRegion TKE集群地域数字ID
     */
    public Long getClusterRegion() {
        return this.ClusterRegion;
    }

    /**
     * Set TKE集群地域数字ID
     * @param ClusterRegion TKE集群地域数字ID
     */
    public void setClusterRegion(Long ClusterRegion) {
        this.ClusterRegion = ClusterRegion;
    }

    public TriggerInvokePara() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerInvokePara(TriggerInvokePara source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ClusterRegion != null) {
            this.ClusterRegion = new Long(source.ClusterRegion);
        }
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

