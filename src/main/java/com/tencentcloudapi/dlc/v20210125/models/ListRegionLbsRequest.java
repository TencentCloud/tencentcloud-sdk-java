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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRegionLbsRequest extends AbstractModel {

    /**
    * <p>TKE 集群 ID，用于查询集群所属 VPC，进而过滤同 VPC 下的独占型 CLB，例如 cls-xxxxxxxx</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>负载均衡实例 ID 列表，最多 20 个；不传则查询同地域全部实例</p>
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * <p>分页偏移量，从 0 开始，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页每页条数，默认 20，最大 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>TKE 集群 ID，用于查询集群所属 VPC，进而过滤同 VPC 下的独占型 CLB，例如 cls-xxxxxxxx</p> 
     * @return ClusterId <p>TKE 集群 ID，用于查询集群所属 VPC，进而过滤同 VPC 下的独占型 CLB，例如 cls-xxxxxxxx</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>TKE 集群 ID，用于查询集群所属 VPC，进而过滤同 VPC 下的独占型 CLB，例如 cls-xxxxxxxx</p>
     * @param ClusterId <p>TKE 集群 ID，用于查询集群所属 VPC，进而过滤同 VPC 下的独占型 CLB，例如 cls-xxxxxxxx</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>负载均衡实例 ID 列表，最多 20 个；不传则查询同地域全部实例</p> 
     * @return LoadBalancerIds <p>负载均衡实例 ID 列表，最多 20 个；不传则查询同地域全部实例</p>
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set <p>负载均衡实例 ID 列表，最多 20 个；不传则查询同地域全部实例</p>
     * @param LoadBalancerIds <p>负载均衡实例 ID 列表，最多 20 个；不传则查询同地域全部实例</p>
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get <p>分页偏移量，从 0 开始，默认 0</p> 
     * @return Offset <p>分页偏移量，从 0 开始，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，从 0 开始，默认 0</p>
     * @param Offset <p>分页偏移量，从 0 开始，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页每页条数，默认 20，最大 100</p> 
     * @return Limit <p>分页每页条数，默认 20，最大 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页每页条数，默认 20，最大 100</p>
     * @param Limit <p>分页每页条数，默认 20，最大 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public ListRegionLbsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRegionLbsRequest(ListRegionLbsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

