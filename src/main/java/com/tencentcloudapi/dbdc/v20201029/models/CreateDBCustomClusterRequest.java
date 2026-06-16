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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBCustomClusterRequest extends AbstractModel {

    /**
    * <p>容器网络，在此集群的所有 POD 与此网络连通</p>
    */
    @SerializedName("ContainerNetwork")
    @Expose
    private ContainerNetwork ContainerNetwork;

    /**
    * <p>集群名称</p><p>入参限制：最长128个字符，只能为中文，英文，下划线。</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群的API Server的网络信息</p><p>入参限制：必须为此账号下拥有的网络地址，可以与容器网络保持一致。</p>
    */
    @SerializedName("ApiServerNetwork")
    @Expose
    private ApiServerNetwork ApiServerNetwork;

    /**
    * <p>集群描述</p>
    */
    @SerializedName("ClusterDescription")
    @Expose
    private String ClusterDescription;

    /**
    * <p>集群标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>客户端Token</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get <p>容器网络，在此集群的所有 POD 与此网络连通</p> 
     * @return ContainerNetwork <p>容器网络，在此集群的所有 POD 与此网络连通</p>
     */
    public ContainerNetwork getContainerNetwork() {
        return this.ContainerNetwork;
    }

    /**
     * Set <p>容器网络，在此集群的所有 POD 与此网络连通</p>
     * @param ContainerNetwork <p>容器网络，在此集群的所有 POD 与此网络连通</p>
     */
    public void setContainerNetwork(ContainerNetwork ContainerNetwork) {
        this.ContainerNetwork = ContainerNetwork;
    }

    /**
     * Get <p>集群名称</p><p>入参限制：最长128个字符，只能为中文，英文，下划线。</p> 
     * @return ClusterName <p>集群名称</p><p>入参限制：最长128个字符，只能为中文，英文，下划线。</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p><p>入参限制：最长128个字符，只能为中文，英文，下划线。</p>
     * @param ClusterName <p>集群名称</p><p>入参限制：最长128个字符，只能为中文，英文，下划线。</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群的API Server的网络信息</p><p>入参限制：必须为此账号下拥有的网络地址，可以与容器网络保持一致。</p> 
     * @return ApiServerNetwork <p>集群的API Server的网络信息</p><p>入参限制：必须为此账号下拥有的网络地址，可以与容器网络保持一致。</p>
     */
    public ApiServerNetwork getApiServerNetwork() {
        return this.ApiServerNetwork;
    }

    /**
     * Set <p>集群的API Server的网络信息</p><p>入参限制：必须为此账号下拥有的网络地址，可以与容器网络保持一致。</p>
     * @param ApiServerNetwork <p>集群的API Server的网络信息</p><p>入参限制：必须为此账号下拥有的网络地址，可以与容器网络保持一致。</p>
     */
    public void setApiServerNetwork(ApiServerNetwork ApiServerNetwork) {
        this.ApiServerNetwork = ApiServerNetwork;
    }

    /**
     * Get <p>集群描述</p> 
     * @return ClusterDescription <p>集群描述</p>
     */
    public String getClusterDescription() {
        return this.ClusterDescription;
    }

    /**
     * Set <p>集群描述</p>
     * @param ClusterDescription <p>集群描述</p>
     */
    public void setClusterDescription(String ClusterDescription) {
        this.ClusterDescription = ClusterDescription;
    }

    /**
     * Get <p>集群标签</p> 
     * @return Tags <p>集群标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>集群标签</p>
     * @param Tags <p>集群标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>客户端Token</p> 
     * @return ClientToken <p>客户端Token</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>客户端Token</p>
     * @param ClientToken <p>客户端Token</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateDBCustomClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBCustomClusterRequest(CreateDBCustomClusterRequest source) {
        if (source.ContainerNetwork != null) {
            this.ContainerNetwork = new ContainerNetwork(source.ContainerNetwork);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ApiServerNetwork != null) {
            this.ApiServerNetwork = new ApiServerNetwork(source.ApiServerNetwork);
        }
        if (source.ClusterDescription != null) {
            this.ClusterDescription = new String(source.ClusterDescription);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ContainerNetwork.", this.ContainerNetwork);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamObj(map, prefix + "ApiServerNetwork.", this.ApiServerNetwork);
        this.setParamSimple(map, prefix + "ClusterDescription", this.ClusterDescription);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

