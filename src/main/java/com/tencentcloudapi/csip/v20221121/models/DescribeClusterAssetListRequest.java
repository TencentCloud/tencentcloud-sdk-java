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

public class DescribeClusterAssetListRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>通用过滤条件列表。支持的过滤字段：<br>ClusterId：集群ID，精确匹配。<br>ClusterName：集群名称，模糊匹配。<br>ClusterType：集群类型，精确匹配。取值：TKE_MANAGED_CLUSTER（腾讯云标准集群）、TKE_INDEPENDENT_CLUSTER（标准集群Master自维护）、TKE_SERVERLESS_CLUSTER（Serverless集群）、TKE_EDGE_CLUSTER（边缘集群）、SELF_BUILT（腾讯云内自建）、SELF_BUILT_OTHER（非腾讯云自建/混合云）。<br>RunStatus：集群运行状态，精确匹配。取值：Running（运行中）、Exception（异常）、Unknown（未知）。<br>AccessedStatus：接入状态，精确匹配。取值：AccessedNone（未接入）、AccessedInstalling（接入中）、AccessedException（接入异常）、AccessedInstalled（已接入）。<br>DefendStatus：防护状态，精确匹配。取值：Enabled（已防护）、Partial（部分防护）、Disabled（未防护）。<br>RiskStatus：风险检查状态，精确匹配。<br>RiskLevel：风险等级，精确匹配。取值：CRITICAL、HIGH、MEDIUM、LOW、NONE（无风险）。<br>HasHighRisk：仅筛选含高危及以上风险的集群，无需填入 value，传入 HasHighRisk 即生效。<br>Region：地域，精确匹配。<br>OwnerName：负责人，模糊匹配。<br>ClusterAssetIds：集群资产ID，精确匹配。<br>ExcludeClusterAssetIds：排除的集群资产ID，精确排除。</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

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
     * Get <p>通用过滤条件列表。支持的过滤字段：<br>ClusterId：集群ID，精确匹配。<br>ClusterName：集群名称，模糊匹配。<br>ClusterType：集群类型，精确匹配。取值：TKE_MANAGED_CLUSTER（腾讯云标准集群）、TKE_INDEPENDENT_CLUSTER（标准集群Master自维护）、TKE_SERVERLESS_CLUSTER（Serverless集群）、TKE_EDGE_CLUSTER（边缘集群）、SELF_BUILT（腾讯云内自建）、SELF_BUILT_OTHER（非腾讯云自建/混合云）。<br>RunStatus：集群运行状态，精确匹配。取值：Running（运行中）、Exception（异常）、Unknown（未知）。<br>AccessedStatus：接入状态，精确匹配。取值：AccessedNone（未接入）、AccessedInstalling（接入中）、AccessedException（接入异常）、AccessedInstalled（已接入）。<br>DefendStatus：防护状态，精确匹配。取值：Enabled（已防护）、Partial（部分防护）、Disabled（未防护）。<br>RiskStatus：风险检查状态，精确匹配。<br>RiskLevel：风险等级，精确匹配。取值：CRITICAL、HIGH、MEDIUM、LOW、NONE（无风险）。<br>HasHighRisk：仅筛选含高危及以上风险的集群，无需填入 value，传入 HasHighRisk 即生效。<br>Region：地域，精确匹配。<br>OwnerName：负责人，模糊匹配。<br>ClusterAssetIds：集群资产ID，精确匹配。<br>ExcludeClusterAssetIds：排除的集群资产ID，精确排除。</p> 
     * @return Filter <p>通用过滤条件列表。支持的过滤字段：<br>ClusterId：集群ID，精确匹配。<br>ClusterName：集群名称，模糊匹配。<br>ClusterType：集群类型，精确匹配。取值：TKE_MANAGED_CLUSTER（腾讯云标准集群）、TKE_INDEPENDENT_CLUSTER（标准集群Master自维护）、TKE_SERVERLESS_CLUSTER（Serverless集群）、TKE_EDGE_CLUSTER（边缘集群）、SELF_BUILT（腾讯云内自建）、SELF_BUILT_OTHER（非腾讯云自建/混合云）。<br>RunStatus：集群运行状态，精确匹配。取值：Running（运行中）、Exception（异常）、Unknown（未知）。<br>AccessedStatus：接入状态，精确匹配。取值：AccessedNone（未接入）、AccessedInstalling（接入中）、AccessedException（接入异常）、AccessedInstalled（已接入）。<br>DefendStatus：防护状态，精确匹配。取值：Enabled（已防护）、Partial（部分防护）、Disabled（未防护）。<br>RiskStatus：风险检查状态，精确匹配。<br>RiskLevel：风险等级，精确匹配。取值：CRITICAL、HIGH、MEDIUM、LOW、NONE（无风险）。<br>HasHighRisk：仅筛选含高危及以上风险的集群，无需填入 value，传入 HasHighRisk 即生效。<br>Region：地域，精确匹配。<br>OwnerName：负责人，模糊匹配。<br>ClusterAssetIds：集群资产ID，精确匹配。<br>ExcludeClusterAssetIds：排除的集群资产ID，精确排除。</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>通用过滤条件列表。支持的过滤字段：<br>ClusterId：集群ID，精确匹配。<br>ClusterName：集群名称，模糊匹配。<br>ClusterType：集群类型，精确匹配。取值：TKE_MANAGED_CLUSTER（腾讯云标准集群）、TKE_INDEPENDENT_CLUSTER（标准集群Master自维护）、TKE_SERVERLESS_CLUSTER（Serverless集群）、TKE_EDGE_CLUSTER（边缘集群）、SELF_BUILT（腾讯云内自建）、SELF_BUILT_OTHER（非腾讯云自建/混合云）。<br>RunStatus：集群运行状态，精确匹配。取值：Running（运行中）、Exception（异常）、Unknown（未知）。<br>AccessedStatus：接入状态，精确匹配。取值：AccessedNone（未接入）、AccessedInstalling（接入中）、AccessedException（接入异常）、AccessedInstalled（已接入）。<br>DefendStatus：防护状态，精确匹配。取值：Enabled（已防护）、Partial（部分防护）、Disabled（未防护）。<br>RiskStatus：风险检查状态，精确匹配。<br>RiskLevel：风险等级，精确匹配。取值：CRITICAL、HIGH、MEDIUM、LOW、NONE（无风险）。<br>HasHighRisk：仅筛选含高危及以上风险的集群，无需填入 value，传入 HasHighRisk 即生效。<br>Region：地域，精确匹配。<br>OwnerName：负责人，模糊匹配。<br>ClusterAssetIds：集群资产ID，精确匹配。<br>ExcludeClusterAssetIds：排除的集群资产ID，精确排除。</p>
     * @param Filter <p>通用过滤条件列表。支持的过滤字段：<br>ClusterId：集群ID，精确匹配。<br>ClusterName：集群名称，模糊匹配。<br>ClusterType：集群类型，精确匹配。取值：TKE_MANAGED_CLUSTER（腾讯云标准集群）、TKE_INDEPENDENT_CLUSTER（标准集群Master自维护）、TKE_SERVERLESS_CLUSTER（Serverless集群）、TKE_EDGE_CLUSTER（边缘集群）、SELF_BUILT（腾讯云内自建）、SELF_BUILT_OTHER（非腾讯云自建/混合云）。<br>RunStatus：集群运行状态，精确匹配。取值：Running（运行中）、Exception（异常）、Unknown（未知）。<br>AccessedStatus：接入状态，精确匹配。取值：AccessedNone（未接入）、AccessedInstalling（接入中）、AccessedException（接入异常）、AccessedInstalled（已接入）。<br>DefendStatus：防护状态，精确匹配。取值：Enabled（已防护）、Partial（部分防护）、Disabled（未防护）。<br>RiskStatus：风险检查状态，精确匹配。<br>RiskLevel：风险等级，精确匹配。取值：CRITICAL、HIGH、MEDIUM、LOW、NONE（无风险）。<br>HasHighRisk：仅筛选含高危及以上风险的集群，无需填入 value，传入 HasHighRisk 即生效。<br>Region：地域，精确匹配。<br>OwnerName：负责人，模糊匹配。<br>ClusterAssetIds：集群资产ID，精确匹配。<br>ExcludeClusterAssetIds：排除的集群资产ID，精确排除。</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeClusterAssetListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterAssetListRequest(DescribeClusterAssetListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

