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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterSummaryResponse extends AbstractModel{

    /**
    * 集群总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 有风险的集群数量
    */
    @SerializedName("RiskClusterCount")
    @Expose
    private Long RiskClusterCount;

    /**
    * 未检查的集群数量
    */
    @SerializedName("UncheckClusterCount")
    @Expose
    private Long UncheckClusterCount;

    /**
    * 托管集群数量
    */
    @SerializedName("ManagedClusterCount")
    @Expose
    private Long ManagedClusterCount;

    /**
    * 独立集群数量
    */
    @SerializedName("IndependentClusterCount")
    @Expose
    private Long IndependentClusterCount;

    /**
    * 无风险的集群数量
    */
    @SerializedName("NoRiskClusterCount")
    @Expose
    private Long NoRiskClusterCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群总数 
     * @return TotalCount 集群总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 集群总数
     * @param TotalCount 集群总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 有风险的集群数量 
     * @return RiskClusterCount 有风险的集群数量
     */
    public Long getRiskClusterCount() {
        return this.RiskClusterCount;
    }

    /**
     * Set 有风险的集群数量
     * @param RiskClusterCount 有风险的集群数量
     */
    public void setRiskClusterCount(Long RiskClusterCount) {
        this.RiskClusterCount = RiskClusterCount;
    }

    /**
     * Get 未检查的集群数量 
     * @return UncheckClusterCount 未检查的集群数量
     */
    public Long getUncheckClusterCount() {
        return this.UncheckClusterCount;
    }

    /**
     * Set 未检查的集群数量
     * @param UncheckClusterCount 未检查的集群数量
     */
    public void setUncheckClusterCount(Long UncheckClusterCount) {
        this.UncheckClusterCount = UncheckClusterCount;
    }

    /**
     * Get 托管集群数量 
     * @return ManagedClusterCount 托管集群数量
     */
    public Long getManagedClusterCount() {
        return this.ManagedClusterCount;
    }

    /**
     * Set 托管集群数量
     * @param ManagedClusterCount 托管集群数量
     */
    public void setManagedClusterCount(Long ManagedClusterCount) {
        this.ManagedClusterCount = ManagedClusterCount;
    }

    /**
     * Get 独立集群数量 
     * @return IndependentClusterCount 独立集群数量
     */
    public Long getIndependentClusterCount() {
        return this.IndependentClusterCount;
    }

    /**
     * Set 独立集群数量
     * @param IndependentClusterCount 独立集群数量
     */
    public void setIndependentClusterCount(Long IndependentClusterCount) {
        this.IndependentClusterCount = IndependentClusterCount;
    }

    /**
     * Get 无风险的集群数量 
     * @return NoRiskClusterCount 无风险的集群数量
     */
    public Long getNoRiskClusterCount() {
        return this.NoRiskClusterCount;
    }

    /**
     * Set 无风险的集群数量
     * @param NoRiskClusterCount 无风险的集群数量
     */
    public void setNoRiskClusterCount(Long NoRiskClusterCount) {
        this.NoRiskClusterCount = NoRiskClusterCount;
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

    public DescribeClusterSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterSummaryResponse(DescribeClusterSummaryResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RiskClusterCount != null) {
            this.RiskClusterCount = new Long(source.RiskClusterCount);
        }
        if (source.UncheckClusterCount != null) {
            this.UncheckClusterCount = new Long(source.UncheckClusterCount);
        }
        if (source.ManagedClusterCount != null) {
            this.ManagedClusterCount = new Long(source.ManagedClusterCount);
        }
        if (source.IndependentClusterCount != null) {
            this.IndependentClusterCount = new Long(source.IndependentClusterCount);
        }
        if (source.NoRiskClusterCount != null) {
            this.NoRiskClusterCount = new Long(source.NoRiskClusterCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RiskClusterCount", this.RiskClusterCount);
        this.setParamSimple(map, prefix + "UncheckClusterCount", this.UncheckClusterCount);
        this.setParamSimple(map, prefix + "ManagedClusterCount", this.ManagedClusterCount);
        this.setParamSimple(map, prefix + "IndependentClusterCount", this.IndependentClusterCount);
        this.setParamSimple(map, prefix + "NoRiskClusterCount", this.NoRiskClusterCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

