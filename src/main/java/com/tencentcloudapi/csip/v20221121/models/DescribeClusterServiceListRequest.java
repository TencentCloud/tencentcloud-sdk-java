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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterServiceListRequest extends AbstractModel {

    /**
    * <p>集群资产 id</p>
    */
    @SerializedName("ClusterAssetId")
    @Expose
    private String ClusterAssetId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>通用过滤条件列表。支持的过滤字段：<br>Name：服务名称，模糊匹配。<br>ServiceType：服务类型，精确匹配。取值：ClusterIP、NodePort、LoadBalancer、ExternalName。<br>Namespace：命名空间，精确匹配。<br>SelectorLabel：Selector 标签，模糊匹配。</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>集群ca证书md5值，集群的唯一标识</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>Pod唯一标识ID</p>
    */
    @SerializedName("PodUniqueID")
    @Expose
    private String PodUniqueID;

    /**
     * Get <p>集群资产 id</p> 
     * @return ClusterAssetId <p>集群资产 id</p>
     * @deprecated
     */
    @Deprecated
    public String getClusterAssetId() {
        return this.ClusterAssetId;
    }

    /**
     * Set <p>集群资产 id</p>
     * @param ClusterAssetId <p>集群资产 id</p>
     * @deprecated
     */
    @Deprecated
    public void setClusterAssetId(String ClusterAssetId) {
        this.ClusterAssetId = ClusterAssetId;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>通用过滤条件列表。支持的过滤字段：<br>Name：服务名称，模糊匹配。<br>ServiceType：服务类型，精确匹配。取值：ClusterIP、NodePort、LoadBalancer、ExternalName。<br>Namespace：命名空间，精确匹配。<br>SelectorLabel：Selector 标签，模糊匹配。</p> 
     * @return Filter <p>通用过滤条件列表。支持的过滤字段：<br>Name：服务名称，模糊匹配。<br>ServiceType：服务类型，精确匹配。取值：ClusterIP、NodePort、LoadBalancer、ExternalName。<br>Namespace：命名空间，精确匹配。<br>SelectorLabel：Selector 标签，模糊匹配。</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>通用过滤条件列表。支持的过滤字段：<br>Name：服务名称，模糊匹配。<br>ServiceType：服务类型，精确匹配。取值：ClusterIP、NodePort、LoadBalancer、ExternalName。<br>Namespace：命名空间，精确匹配。<br>SelectorLabel：Selector 标签，模糊匹配。</p>
     * @param Filter <p>通用过滤条件列表。支持的过滤字段：<br>Name：服务名称，模糊匹配。<br>ServiceType：服务类型，精确匹配。取值：ClusterIP、NodePort、LoadBalancer、ExternalName。<br>Namespace：命名空间，精确匹配。<br>SelectorLabel：Selector 标签，模糊匹配。</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>集群ca证书md5值，集群的唯一标识</p> 
     * @return ClusterCaMD5 <p>集群ca证书md5值，集群的唯一标识</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>集群ca证书md5值，集群的唯一标识</p>
     * @param ClusterCaMD5 <p>集群ca证书md5值，集群的唯一标识</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>Pod唯一标识ID</p> 
     * @return PodUniqueID <p>Pod唯一标识ID</p>
     */
    public String getPodUniqueID() {
        return this.PodUniqueID;
    }

    /**
     * Set <p>Pod唯一标识ID</p>
     * @param PodUniqueID <p>Pod唯一标识ID</p>
     */
    public void setPodUniqueID(String PodUniqueID) {
        this.PodUniqueID = PodUniqueID;
    }

    public DescribeClusterServiceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterServiceListRequest(DescribeClusterServiceListRequest source) {
        if (source.ClusterAssetId != null) {
            this.ClusterAssetId = new String(source.ClusterAssetId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.PodUniqueID != null) {
            this.PodUniqueID = new String(source.PodUniqueID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterAssetId", this.ClusterAssetId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamSimple(map, prefix + "PodUniqueID", this.PodUniqueID);

    }
}

