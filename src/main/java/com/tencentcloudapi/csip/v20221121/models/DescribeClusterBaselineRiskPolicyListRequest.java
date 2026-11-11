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

public class DescribeClusterBaselineRiskPolicyListRequest extends AbstractModel {

    /**
    * <p>集群所属账号的 Appid，用于指定查询基线风险策略的账号。</p>
    */
    @SerializedName("ClusterAppid")
    @Expose
    private Long ClusterAppid;

    /**
    * <p>集群CaMD5</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * 集团账号的成员 ID 列表。
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>集群所属账号的 Appid，用于指定查询基线风险策略的账号。</p> 
     * @return ClusterAppid <p>集群所属账号的 Appid，用于指定查询基线风险策略的账号。</p>
     */
    public Long getClusterAppid() {
        return this.ClusterAppid;
    }

    /**
     * Set <p>集群所属账号的 Appid，用于指定查询基线风险策略的账号。</p>
     * @param ClusterAppid <p>集群所属账号的 Appid，用于指定查询基线风险策略的账号。</p>
     */
    public void setClusterAppid(Long ClusterAppid) {
        this.ClusterAppid = ClusterAppid;
    }

    /**
     * Get <p>集群CaMD5</p> 
     * @return ClusterCaMD5 <p>集群CaMD5</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>集群CaMD5</p>
     * @param ClusterCaMD5 <p>集群CaMD5</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get 集团账号的成员 ID 列表。 
     * @return MemberId 集团账号的成员 ID 列表。
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员 ID 列表。
     * @param MemberId 集团账号的成员 ID 列表。
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeClusterBaselineRiskPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterBaselineRiskPolicyListRequest(DescribeClusterBaselineRiskPolicyListRequest source) {
        if (source.ClusterAppid != null) {
            this.ClusterAppid = new Long(source.ClusterAppid);
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterAppid", this.ClusterAppid);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

