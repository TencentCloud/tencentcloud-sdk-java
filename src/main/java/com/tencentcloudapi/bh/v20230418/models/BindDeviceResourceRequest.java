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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindDeviceResourceRequest extends AbstractModel {

    /**
    * 资产ID集合
    */
    @SerializedName("DeviceIdSet")
    @Expose
    private Long [] DeviceIdSet;

    /**
    * 堡垒机服务ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 网络域ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * K8S集群托管账号维度。1-集群，2-命名空间，3-工作负载
    */
    @SerializedName("ManageDimension")
    @Expose
    private Long ManageDimension;

    /**
    * K8S集群托管账号id
    */
    @SerializedName("ManageAccountId")
    @Expose
    private Long ManageAccountId;

    /**
    * K8S集群托管账号名称
    */
    @SerializedName("ManageAccount")
    @Expose
    private String ManageAccount;

    /**
    * K8S集群托管账号凭证
    */
    @SerializedName("ManageKubeconfig")
    @Expose
    private String ManageKubeconfig;

    /**
    * K8S集群托管的namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * K8S集群托管的workload
    */
    @SerializedName("Workload")
    @Expose
    private String Workload;

    /**
     * Get 资产ID集合 
     * @return DeviceIdSet 资产ID集合
     */
    public Long [] getDeviceIdSet() {
        return this.DeviceIdSet;
    }

    /**
     * Set 资产ID集合
     * @param DeviceIdSet 资产ID集合
     */
    public void setDeviceIdSet(Long [] DeviceIdSet) {
        this.DeviceIdSet = DeviceIdSet;
    }

    /**
     * Get 堡垒机服务ID 
     * @return ResourceId 堡垒机服务ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 堡垒机服务ID
     * @param ResourceId 堡垒机服务ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 网络域ID 
     * @return DomainId 网络域ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 网络域ID
     * @param DomainId 网络域ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get K8S集群托管账号维度。1-集群，2-命名空间，3-工作负载 
     * @return ManageDimension K8S集群托管账号维度。1-集群，2-命名空间，3-工作负载
     */
    public Long getManageDimension() {
        return this.ManageDimension;
    }

    /**
     * Set K8S集群托管账号维度。1-集群，2-命名空间，3-工作负载
     * @param ManageDimension K8S集群托管账号维度。1-集群，2-命名空间，3-工作负载
     */
    public void setManageDimension(Long ManageDimension) {
        this.ManageDimension = ManageDimension;
    }

    /**
     * Get K8S集群托管账号id 
     * @return ManageAccountId K8S集群托管账号id
     */
    public Long getManageAccountId() {
        return this.ManageAccountId;
    }

    /**
     * Set K8S集群托管账号id
     * @param ManageAccountId K8S集群托管账号id
     */
    public void setManageAccountId(Long ManageAccountId) {
        this.ManageAccountId = ManageAccountId;
    }

    /**
     * Get K8S集群托管账号名称 
     * @return ManageAccount K8S集群托管账号名称
     */
    public String getManageAccount() {
        return this.ManageAccount;
    }

    /**
     * Set K8S集群托管账号名称
     * @param ManageAccount K8S集群托管账号名称
     */
    public void setManageAccount(String ManageAccount) {
        this.ManageAccount = ManageAccount;
    }

    /**
     * Get K8S集群托管账号凭证 
     * @return ManageKubeconfig K8S集群托管账号凭证
     */
    public String getManageKubeconfig() {
        return this.ManageKubeconfig;
    }

    /**
     * Set K8S集群托管账号凭证
     * @param ManageKubeconfig K8S集群托管账号凭证
     */
    public void setManageKubeconfig(String ManageKubeconfig) {
        this.ManageKubeconfig = ManageKubeconfig;
    }

    /**
     * Get K8S集群托管的namespace 
     * @return Namespace K8S集群托管的namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set K8S集群托管的namespace
     * @param Namespace K8S集群托管的namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get K8S集群托管的workload 
     * @return Workload K8S集群托管的workload
     */
    public String getWorkload() {
        return this.Workload;
    }

    /**
     * Set K8S集群托管的workload
     * @param Workload K8S集群托管的workload
     */
    public void setWorkload(String Workload) {
        this.Workload = Workload;
    }

    public BindDeviceResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindDeviceResourceRequest(BindDeviceResourceRequest source) {
        if (source.DeviceIdSet != null) {
            this.DeviceIdSet = new Long[source.DeviceIdSet.length];
            for (int i = 0; i < source.DeviceIdSet.length; i++) {
                this.DeviceIdSet[i] = new Long(source.DeviceIdSet[i]);
            }
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.ManageDimension != null) {
            this.ManageDimension = new Long(source.ManageDimension);
        }
        if (source.ManageAccountId != null) {
            this.ManageAccountId = new Long(source.ManageAccountId);
        }
        if (source.ManageAccount != null) {
            this.ManageAccount = new String(source.ManageAccount);
        }
        if (source.ManageKubeconfig != null) {
            this.ManageKubeconfig = new String(source.ManageKubeconfig);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Workload != null) {
            this.Workload = new String(source.Workload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeviceIdSet.", this.DeviceIdSet);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "ManageDimension", this.ManageDimension);
        this.setParamSimple(map, prefix + "ManageAccountId", this.ManageAccountId);
        this.setParamSimple(map, prefix + "ManageAccount", this.ManageAccount);
        this.setParamSimple(map, prefix + "ManageKubeconfig", this.ManageKubeconfig);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Workload", this.Workload);

    }
}

