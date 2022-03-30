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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEKSClusterCredentialResponse extends AbstractModel{

    /**
    * 集群的接入地址信息
    */
    @SerializedName("Addresses")
    @Expose
    private IPAddress [] Addresses;

    /**
    * 集群的认证信息
    */
    @SerializedName("Credential")
    @Expose
    private ClusterCredential Credential;

    /**
    * 集群的公网访问信息
    */
    @SerializedName("PublicLB")
    @Expose
    private ClusterPublicLB PublicLB;

    /**
    * 集群的内网访问信息
    */
    @SerializedName("InternalLB")
    @Expose
    private ClusterInternalLB InternalLB;

    /**
    * 标记是否新的内外网功能
    */
    @SerializedName("ProxyLB")
    @Expose
    private Boolean ProxyLB;

    /**
    * 连接用户集群k8s 的Config
    */
    @SerializedName("Kubeconfig")
    @Expose
    private String Kubeconfig;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群的接入地址信息 
     * @return Addresses 集群的接入地址信息
     */
    public IPAddress [] getAddresses() {
        return this.Addresses;
    }

    /**
     * Set 集群的接入地址信息
     * @param Addresses 集群的接入地址信息
     */
    public void setAddresses(IPAddress [] Addresses) {
        this.Addresses = Addresses;
    }

    /**
     * Get 集群的认证信息 
     * @return Credential 集群的认证信息
     */
    public ClusterCredential getCredential() {
        return this.Credential;
    }

    /**
     * Set 集群的认证信息
     * @param Credential 集群的认证信息
     */
    public void setCredential(ClusterCredential Credential) {
        this.Credential = Credential;
    }

    /**
     * Get 集群的公网访问信息 
     * @return PublicLB 集群的公网访问信息
     */
    public ClusterPublicLB getPublicLB() {
        return this.PublicLB;
    }

    /**
     * Set 集群的公网访问信息
     * @param PublicLB 集群的公网访问信息
     */
    public void setPublicLB(ClusterPublicLB PublicLB) {
        this.PublicLB = PublicLB;
    }

    /**
     * Get 集群的内网访问信息 
     * @return InternalLB 集群的内网访问信息
     */
    public ClusterInternalLB getInternalLB() {
        return this.InternalLB;
    }

    /**
     * Set 集群的内网访问信息
     * @param InternalLB 集群的内网访问信息
     */
    public void setInternalLB(ClusterInternalLB InternalLB) {
        this.InternalLB = InternalLB;
    }

    /**
     * Get 标记是否新的内外网功能 
     * @return ProxyLB 标记是否新的内外网功能
     */
    public Boolean getProxyLB() {
        return this.ProxyLB;
    }

    /**
     * Set 标记是否新的内外网功能
     * @param ProxyLB 标记是否新的内外网功能
     */
    public void setProxyLB(Boolean ProxyLB) {
        this.ProxyLB = ProxyLB;
    }

    /**
     * Get 连接用户集群k8s 的Config 
     * @return Kubeconfig 连接用户集群k8s 的Config
     */
    public String getKubeconfig() {
        return this.Kubeconfig;
    }

    /**
     * Set 连接用户集群k8s 的Config
     * @param Kubeconfig 连接用户集群k8s 的Config
     */
    public void setKubeconfig(String Kubeconfig) {
        this.Kubeconfig = Kubeconfig;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEKSClusterCredentialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEKSClusterCredentialResponse(DescribeEKSClusterCredentialResponse source) {
        if (source.Addresses != null) {
            this.Addresses = new IPAddress[source.Addresses.length];
            for (int i = 0; i < source.Addresses.length; i++) {
                this.Addresses[i] = new IPAddress(source.Addresses[i]);
            }
        }
        if (source.Credential != null) {
            this.Credential = new ClusterCredential(source.Credential);
        }
        if (source.PublicLB != null) {
            this.PublicLB = new ClusterPublicLB(source.PublicLB);
        }
        if (source.InternalLB != null) {
            this.InternalLB = new ClusterInternalLB(source.InternalLB);
        }
        if (source.ProxyLB != null) {
            this.ProxyLB = new Boolean(source.ProxyLB);
        }
        if (source.Kubeconfig != null) {
            this.Kubeconfig = new String(source.Kubeconfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Addresses.", this.Addresses);
        this.setParamObj(map, prefix + "Credential.", this.Credential);
        this.setParamObj(map, prefix + "PublicLB.", this.PublicLB);
        this.setParamObj(map, prefix + "InternalLB.", this.InternalLB);
        this.setParamSimple(map, prefix + "ProxyLB", this.ProxyLB);
        this.setParamSimple(map, prefix + "Kubeconfig", this.Kubeconfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

